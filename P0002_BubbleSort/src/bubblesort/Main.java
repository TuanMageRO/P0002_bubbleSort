/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        solveData sD = new solveData();
        int size = sD.getInteger("Enter array size: ", 1, 1024);
        int[] arr = new int[size];
        sD.getRandomInt(size, arr);
        sD.displayArray("The generated array: ",arr);
        sD.bubbleSort(arr);
        sD.displayArray("The sorted array (Ascending order): ", arr);
    }
}
