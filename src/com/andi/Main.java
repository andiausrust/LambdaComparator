package com.andi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Trees", 20));
        list.add(new Product(2, "Car", 2000));
        list.add(new Product(3, "House", 40));

        Collections.sort(list, Comparator.comparing(p -> p.name));
        list.forEach(p-> System.out.println(p.id + " " + p.name + " " + p.price));

        System.out.println();

        Collections.sort(list, Comparator.comparing(p -> p.price));
        list.forEach(p->System.out.println(p.id + " " + p.name + " " + p.price));

        System.out.println();

        Collections.sort(list, Comparator.comparing(p -> p.id));
        list.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));
    }
}
