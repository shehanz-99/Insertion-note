/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author sheha
 */
public class InsertionSort {

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) { 
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) { 
                int temp = arr[j]; 
                arr[j] = arr[j - 1]; 
                arr[j - 1] = temp; 
                j--; 
            } 
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
    
    public static void insertSortDesc(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int num = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < num){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
    
    public static void insertionSortOptimized(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int num = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = num;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
    
    

    public static void main(String[] args) {
        int arr[] = {8, 3, 10, 2 ,0};
        System.out.println("ascending order: ");
        insertionSort(arr);   
        
        System.out.println("\nReplaced method: ");        
        insertionSortOptimized(arr);
        
        System.out.println("\nDescending array: ");        
        insertSortDesc(arr);        
        System.out.println("");
    }
}

