package streamLogical;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterProduct {

    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop",true,32010,"Gadget"));
        products.add(new Product("Samsung Galaxy",true,72010,"Books"));
        products.add(new Product("Sofa",false,90000,"Furniture"));
        products.add(new Product("Ikigai",false,145,"Books"));
        products.add(new Product("Helmet",false,2400,"Safety"));
        products.add(new Product("LG Oled TV",true,65000,"Furniture"));
        products.add(new Product("Samsung Note 24",true,85000,"Gadget"));

        /*
         * Filter the element in given list based on product available in stock and
         * then sort the product based on price
         */
//        Stream<Product> sorted = products.stream().filter(Product::getInStack).sorted(Comparator.comparing(Product::getPrice));

//        sorted.forEach(System.out::println);

        /*
         * Filter the element in given list based on product available in stock and
         * then sort the product based on price in descending order
         */
//       Stream<Product> sortedProducts = products.stream().filter(Product::getInStack).sorted(Comparator.comparing(Product::getPrice).reversed());
//
//       sortedProducts.forEach(System.out::println);

        /*
         * Filter the element in given list based on product available in stock and
         * then sort the product based on price
         */

//        Stream<Product> sorted1 = products.stream()
//                .sorted(Comparator.comparing(Product::getPrice).reversed()
//                        .thenComparing(Product::getName));
//
//
//        sorted1.forEach(System.out::println);

        /*
         * Find the top 3 highest price product
         */

//        List<Product> collect = products.stream()
//                .sorted(Comparator.comparing(Product::getPrice).reversed()).
//                limit(3).toList();
//
//        collect.forEach(System.out::println);


        /*
         * Find the top 3 highest price product which are in stock
         */

//        products.stream().sorted(Comparator.comparing(Product::getInStack)
//                        .thenComparing(Product::getPrice).reversed())
//                .limit(3)
//                .forEach(System.out::println);


        /*
         * count the list of item as per category
         */

//        Map<String, Long> collect = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
//
//
//        collect.entrySet().forEach(System.out::println);


        Map<String, Optional<Product>> collect = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy((Comparator.comparing(Product::getPrice)))));

        Set<Map.Entry<String, Optional<Product>>> entries = collect.entrySet();
        for (  Map.Entry<String, Optional<Product>> entry:entries){
            System.out.println(entry.getKey()  +" ===> " + entry.getValue().get().getName() +" "+ entry.getValue().get().getPrice() );
        }
//        System.out.println(collect);
    }
}
