import java.util.Observable;
import java.util.Observer;

public class Manufacturer implements Observer {

    public Magazine magazine;
    public static int counter = 1;

    public Manufacturer(Magazine magazine){
        this.magazine = magazine;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == this.magazine) {
            magazine.products.add(counter++);
        }
    }
}
