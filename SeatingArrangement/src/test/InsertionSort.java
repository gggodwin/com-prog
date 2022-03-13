package test;

public class InsertionSort {

    public static void insertion (int [] arr, int n){

        for (int i = 1; i < n; i++){

            int key = arr[i];
            int j = i;
            while ( j > 0 && arr[j-1] > key){
            //while ( j > 0 && arr[j-1] > arr[j]){
                //int key = arr[j];
                arr[j] = arr[j-1];
                //j = j-1;
                //arr[j-1] = key;
                j--;
            }
            arr[j] = key;
        }
        for (int j = 0; j < n; j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {

        int [] arr = {23,2,3,34,6};
        insertion(arr,5);
    }
}
