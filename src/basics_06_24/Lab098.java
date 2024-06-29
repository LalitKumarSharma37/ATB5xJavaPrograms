package src.basics_06_24;

public class Lab098 {
    public static void main(String[] args) {

        //Arrays - Java
        //Collection of Data
        //Collection of Similar type of Data

        //Students - Praveen,Nandani,Alok,Pramod
        //Collection of Students Names
       //int[] a=10;/int a[] = 10; ->Both are same
        // {"Amit","Pramod"."Alok"}
        //Store - 10th Marks -> 96,90,87,88,56(English)

        int a = 10; //It is not a array,it's a single element or primitive data type
        //Store the value of 10 into "a"
        //With integer type of container with ref name a
        int[] marks_10 = {96, 90, 87, 88, 56}; //Possible because of similar type of Data
//        int[] marks_11 = {true,90,87,88,56};//Not Possible because boolean and int are different data type
//        int marks_12[] = {96,90.67f,87,88,56};//Not Possible because two different data type
        //[] -> Collection of Items
        String[] items = {"milk", "bread", "butter", "candies", "coke"};
        System.out.println(items[0]); //Index array starts from 0
        System.out.println(items.length); //Length starts from 1
        System.out.println(items[3]);
        System.out.println(items[6]); //Exception in thread because we have only 5 items
//Index - 0 to 4
//length - 1 to 5
    }
}
