package org.example;

import org.example.model.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var products = new Product[] {
                new Product(3128874119L, "Banana", LocalDate.of(2023, 1, 24), 124, 0.55),
                new Product(3128874119L, "Apple", LocalDate.of(2023, 1, 24), 124, 0.55),
                new Product(3128874119L, "Carrot", LocalDate.of(2023, 1, 24), 124, 0.55)
        };
        printProducts(products);
    }

    private static void printProducts(Product[] products){
        if(products != null){
            if(products.length > 0){
                var sortedProducts = Arrays.stream(products)
//                        .sorted(Comparator.comparing(Product::getName));
                        .sorted(Comparator.comparing(p -> p.getName()))
                        .toList();
                var numProducts = sortedProducts.size();
                for(int i = 0; i < numProducts; i++){
                    if((i+1) < numProducts){
                        System.out.printf("%s, \n", sortedProducts.get(i).toJSONString());
                    }else {
                        System.out.println(sortedProducts.get(i).toJSONString());
                    }
                }
            }
        }

    }
}