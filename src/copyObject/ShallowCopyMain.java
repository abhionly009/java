package copyObject;

public class ShallowCopyMain {

    public static void main(String[] args) {

        Product p1 = new Product("mobile","samsung 90",new Category("Electronics"),12,34100);

        Product p2 = p1;

        System.out.println(p1);

        System.out.println("-----------------------------");

        System.out.println(p2);


        p2.setName("laptop");
        p2.setPrice(98000);
        p2.setCategory(new Category("Home Appliance"));
        System.out.println("--------------after update-------------");
        System.out.println(p1);

        System.out.println(p2);

    }
}
