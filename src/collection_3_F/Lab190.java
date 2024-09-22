package src.collection_3_F;

import java.util.HashSet;
import java .util.Set;

public class Lab190 {

    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Water Melon");
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
    }
}
