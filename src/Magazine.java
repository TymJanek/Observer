import java.util.ArrayList;
import java.util.List;

public class Magazine implements IMagazine{

    public List<Integer> products = new ArrayList<>(10);
    private List<Manufacturer> manufacturers = new ArrayList<>();
    private List<Consumer> consumers = new ArrayList<>();

    public void addManufacturer(Manufacturer manufacturer){
        this.manufacturers.add(manufacturer);
    }

    public void addConsumer(Consumer consumer){
        this.consumers.add(consumer);
    }

    @Override
    public void notifyConsumers() {
        for(Consumer consumer : consumers){
            consumer.consume(this);
        }
    }

    @Override
    public void notifyManufacturers() {
        for(Manufacturer manufacturer : manufacturers){
            manufacturer.manufacture(this);
        }
    }

    public int find(){
        return products.size();
    }
}
