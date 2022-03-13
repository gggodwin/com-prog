package test;

public class MergeSort2 {

    public static void merge (int arr[],int left ,int mid, int right){


        int n = arr.length;
        int [] temp = new int[n];
        int i,j,k;
        i = left;
        j = mid + 1;
        k = 0;

        while (i  <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            }
            else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

            while (i <= mid){
                temp[k] = arr[i];
                k++;
                i++;
            }

            while (j <= right){
                temp[k] = arr[j];
                k++;
                j++;
            }


        for(i=right; i >= left; i--)
        {
            arr[i] = temp[--k];  // copying back the sorted list to a[]
        }

    }

    public static void MergeSort (int arr[],int left, int right){

        if (left < right){
         int mid = (left + right)/2;
         MergeSort(arr,left,mid);
         MergeSort(arr,mid+1,right);
         merge(arr,left,mid,right);
        }
    }

    public static void main(String[] args) {

        int [] arr = {23,2,3,34,6,1,5,35};
        int n = arr.length;
        MergeSort(arr,0,n-1);
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

}
