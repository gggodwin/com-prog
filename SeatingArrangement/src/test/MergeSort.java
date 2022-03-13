package test;

public class MergeSort {

    public static void merge (int [] left, int [] right, int [] arr){
        int j,i,k;
        i = 0;
        j = 0;
        k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else{
                arr[k] = right[j];
            j++;
             }
            k++;
        }
        while (i < left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length){
            arr[k] = right[j];
            k++;
            j++;
        }

    }


    public static int[] mergeSort (int[] arr){

        int n = arr.length;

        if (n < 2){
            return arr;
        }

        else {
            int mid = n / 2;

            int[] left = new int[mid];
            int[] right = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }

            for (int i = mid; i < n; i++) {
                right[i - mid] = arr[i];
            }

            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
            return arr;
        }
    }


    public static void main(String[] args) {

        int [] arr = {2,1,4,3,6,5,8,7};

        arr = mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

