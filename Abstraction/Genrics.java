package Abstraction;

public class Genrics {
public static void  main(String[]args) {
	Integer[]arr= {10,20,30,40,50};
	Display(arr);
	String []arr1= {"Ram","Raj","Rahul","Priya","Pankaj"};
	Display(arr1);
}
//public static void Display(Integer[]arr) {
public static <T>void Display(T[]arr){	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("*********");
}
}
