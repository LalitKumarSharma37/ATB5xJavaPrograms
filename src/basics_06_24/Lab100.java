package src.basics_06_24;

public class Lab100 {
    public static void main(String[] args) {

    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {1,2,3,4,5};

    System.out.println(arr1 == arr2);
    //False Because reference and memory allocation of variable is different

    int[] arr3 = arr1;
    System.out.println(arr3 == arr1);
    //True because arr3 can point to arr1 because of no memory allocation in arr3
    System.out.println(arr1.equals(arr2));
    //In case of String -> True because we can compare value
    //In case of Arrays -> False because we don't compare the value
    //Because Ref - Not equal

    arr3[0] = 24;
    System.out.println(arr1[0]); //Here value is 24 because of replacing the value
    System.out.println(arr3[0]);
    }
}
