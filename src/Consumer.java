import java.util.Observable;
import java.util.Observer;

public class Consumer implements Observer {

    public Magazine magazine;

    public Consumer (Magazine magazine){
        this.magazine = magazine;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == this.magazine){
            this.magazine.products.forEach(System.out::println);
            System.out.println("Consuming...");
            this.magazine.products.clear();
        }
    }


}
