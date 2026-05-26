package copyObject;

public class DeepMain {

    public static void main(String[] args) {

        Product p1 = new Product("Go pro 12","This is latest go pro action camera",new Category("Electronics"),143,39999);

        Product p2 = new Product(p1);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("-------------After update-------------------");

        p1.setName("Go Pro 13");
        p1.setPrice(59000);

        p1.setCategory( new Category("Appliance"));
        System.out.println(p1);
        System.out.println("P2 "+p2);
    }
}
