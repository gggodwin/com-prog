package test;

import java.util.Random;

public class QuickSort {

    public static int randomPartition (int [] arr, int start, int end){
        //int j = (int) (Math.random() * end) + start;
        Random rand = new Random();
        int j = rand.nextInt(end - start) + start;
        int temp1 = arr[j];
        arr[j] = arr[end];
        arr[end] = temp1;
       return partition(arr,start,end);
    }

    public static void quickSort (int[] arr , int start, int end){

        if (start < end){
            int j = randomPartition(arr,start,end);
            quickSort(arr,start,j-1);
            quickSort(arr,j+1,end);
        }
    }

    public static int partition (int[] arr, int start, int end){

        int pivot = arr[end];
        int j = start; // means this is the index of the pivot

        for ( int i = start; i < end; i++){
           if (pivot >= arr[i]){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              j++;
           }
        }
        int temp = arr[end];// pivot or arr[pivot]
        arr[end] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {

        int [] arr = {23,2,3,34,6,1,15,13};
        quickSort(arr,0,7);
        for (int i = 0; i < 8; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
