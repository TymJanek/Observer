public class Consumer implements IConsumer {

    @Override
    public void consume(Magazine magazine) {
        magazine.products.forEach(System.out::println);
        System.out.println("Consuming...");
        magazine.products.clear();
    }
}
