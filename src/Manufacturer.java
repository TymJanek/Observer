public class Manufacturer implements IManufacturer {

    public static int counter = 1;

    @Override
    public void manufacture(Magazine magazine) {
        magazine.products.add(counter++);
    }
}
