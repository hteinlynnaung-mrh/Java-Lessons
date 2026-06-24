package hteinlynnaung;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
 static int max = 20;
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int[] data = new int[max];
  
  Random rand = new Random();
  Scanner scanObj = new Scanner(System.in);
  
  for(int i = 0; i < max; i++) {
   data[i] = rand.nextInt(100);
   System.out.print(data[i] + " ");
  }
  
  System.out.println("");
  
  Arrays.sort(data);
  
  System.out.print("Enter key to search: ");
  int target = scanObj.nextInt();
  System.out.println("");
  
  int times = searchUsingBinary(data, target);
  if (times > -1) {
   System.out.println("Value is Found and Times to compare is " + times);
  }
  else {
   System.out.println("Value not found");
  }
 }

 public static int searchUsingBinary(int[] numArray, int target) {
  int l = 0;
  int h = numArray.length - 1;
  int count = 0;
  
  while (l <= h) {
   System.out.println("L is " + l + " H is " + h);
   int mid = (l + h)/2;
   count += 1;
   if (numArray[mid] == target) {
    return count;
   }
   else if (numArray[mid] > target) {
    h = mid - 1;
   }
   else {
    l = mid + 1;
   }
  }
  return -1;
 }
}