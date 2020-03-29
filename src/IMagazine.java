public interface IMagazine {

    void notifyConsumers();

    void notifyManufacturers();

    void addConsumer(Consumer consumer);

    void addManufacturer(Manufacturer manufacturer);
}
