package src.collection_3_F;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Lab192 {
    public static void main(String[] args) {

//        Set courseSets = new TreeSet(); //For sort the element
//        courseSets.add("ATB");
//        courseSets.add("MTB");
//        courseSets.add("LAPIT");
//        courseSets.add("SDET Blueprint");
//        courseSets.add("Java for Testers");
//
////System.out.println(courseSets);
//
//        Set courseSets1 = new HashSet(); // Not confirm  for ordered element
//        courseSets.add("ATC");
//        courseSets.add("MTB");
//        courseSets.add("LAPIT");
//        courseSets.add("SDET Blueprint");
//        courseSets.add("Java for Testers");
//
//        //System.out.println(courseSets);

        Set courseSets = new LinkedHashSet(); //Print in ordered
        courseSets.add("ATK");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);
    }
}
