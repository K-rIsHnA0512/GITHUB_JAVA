import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        // lets learn further about arrays in java from now on 
        // we have already learned how to declare an array and how to initialize it and one method to print the array via for loop
        // now we will learn some more methods to work with arrays in java
        // first of all lets declare an array
        int[] num={1,2,3,4,5,6,7,8,9,10};
        // method 1 to print an array is via for loop which we have already learned
        System.out.println("Printing array via for loop : ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(); // to move to the next line after printing the array
        
        // lets take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Length Of The Array : ");
        int length=sc.nextInt();
        // first declare an Array 
        int[] NewArray= new int[length];    
        // then lets enter some value in this Array
        for (int i = 0; i <length; i++) {
            System.out.println("Enter The Number For Index "+i+" : ");
            NewArray[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++){
            System.out.println("The Element At Index"+i+" Is : "+NewArray[i]);
        }
        // to convert String into An char Array
        String s = "hello";
        char[] arr = s.toCharArray();
        System.out.println(arr);
        System.out.println(arr[0000000000000000000000]);

    }}