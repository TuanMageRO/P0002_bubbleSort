  
package bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class solveData {
    private static final Scanner sc = new Scanner(System.in);
    
    public int getInteger( String mess, int min, int max) {
        int n;
        while(true) {
            try{
                System.out.println(mess);
                n = Integer.parseInt(sc.nextLine());
                if(n < min || n > max) {
                    System.err.println("Only Integer in range " + min + " to " + max);
                    continue;
                }
                return n;
            }
            catch(NumberFormatException e) {
                System.err.println("Only Integer number.");
            }
        }
    }
    
    public void getRandomInt(int size, int[] arr) {
        Random ran = new Random();
        for(int i = 0; i < size; i++) {
            arr[i] = ran.nextInt(size);
        }
    }
    
    public void displayArray(String mess, int[] arr) {
        int n = arr.length;
        System.out.println(mess);
        System.out.print("[ ");
        for(int i = 0; i < n-1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[n-1]+ " ]");
        System.out.println("");
    }
    
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = n-1; j > i; j--){
                if(arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            } 
        }
    }
    
}
