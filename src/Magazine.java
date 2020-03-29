import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Magazine extends Observable {

    public List<Integer> products = new ArrayList<>(10);
    private List<Manufacturer> manufacturers = new ArrayList<>();
    private List<Consumer> consumers = new ArrayList<>();

    public Magazine() {
    }

    public void addManufacturer(Manufacturer manufacturer){
        this.manufacturers.add(manufacturer);
    }

    public void addConsumer(Consumer consumer){
        this.consumers.add(consumer);
    }

    public int find(){
        return products.size();
    }
}
