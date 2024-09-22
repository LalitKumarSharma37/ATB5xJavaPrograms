package src.collection_3_F;

import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class Lab193 {
    public static void main(String[] args) {

        Set numSet = new LinkedHashSet(); //Store in sequence
        numSet.add("123");
        numSet.add("456");
        numSet.add("789");
        numSet.add("101112");

        System.out.println(numSet);

//        Set numSet = new TreeSet(); //Store in sorted form not in sequence
//        numSet.add("123");
//        numSet.add("456");
//        numSet.add("789");
//        numSet.add("101112");
//
//        System.out.println(numSet);
    }
}
