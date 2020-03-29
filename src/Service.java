import static java.lang.Thread.sleep;

public class Service {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Consumer consumer = new Consumer();
        Manufacturer manufacturer = new Manufacturer();

        magazine.addConsumer(consumer);
        magazine.addManufacturer(manufacturer);

        try{
            while(true){
                if(magazine.find() <= 10){
                    magazine.notifyManufacturers();
                }
                if(magazine.find() != 0){
                    magazine.notifyConsumers();
                }
                sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
