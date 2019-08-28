package Package1;

import java.util.Arrays;

public class MyArray {
	
	private int arr[];
	private static int index;
	
	static {
		index=0;
	}
	 public void sortArray(int arr[]) {
		 this.arr= arr;
		 Arrays.sort(arr);
		 for(int a:arr) {
			 
		 
		 System.out.println(a+"");
		 } 
	 }

 public boolean findElement(int item) {
	 int i=Arrays.binarySearch(arr, item);
	 if(i>=0) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 
 public int add(int...var)
 {
	 int result =0;
	 for(int i: var)
 }
 public void push(int item, int arr[]) {
	 int arr[index]= item;
	 index++ ;
	 for(int a : arr) {
		 System.out.println(a+ "");
	 }
	
 }
 
 public int pop(int arr)
{
	 int n = array
	 }
}