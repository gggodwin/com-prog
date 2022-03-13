package test;

public class SampleOnly {

    public static void main(String[] args) {

        int[] arr = {23, 2, 3, 34, 6, 1, 5, 35};

        int n = arr.length;
        int left = 0;
        int right = n-1;
        int mid = (left + right)/2;


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
            System.out.println(arr[i]);
        }


    }
}





