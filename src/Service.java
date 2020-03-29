import static java.lang.Thread.sleep;

public class Service {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Consumer consumer = new Consumer(magazine);
        Manufacturer manufacturer = new Manufacturer(magazine);

        magazine.addConsumer(consumer);
        magazine.addManufacturer(manufacturer);

        try{
            while(true){
                if(magazine.find() <= 10){
                    manufacturer.update(magazine, manufacturer);
                }
                if(magazine.find() != 0){
                    consumer.update(magazine, consumer);
                }
                sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
