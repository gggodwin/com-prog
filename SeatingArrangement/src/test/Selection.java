package test;

public class Selection {

 public static void SelectionSort (int [] arr, int n){

     for (int i = 0; i < n-1; i++) {
         int iNum = i;
         for (int j = i+1; j < n; j++) {
             if (arr[j] < arr[iNum])
                 //finding the lowest
             iNum = j;
         }
         int temp = arr[i];
         arr[i] = arr[iNum];
         arr[iNum] = temp;

         //System.out.println(iNum);
        // System.out.println(arr[iNum]);
     }

 }

    public static void main(String[] args) {
     int [] num = {3, 56, 32, 1, 23, 4};
     SelectionSort(num,6);
        for (int i = 0; i<6; i++){
            System.out.print(num[i] + " ");
        }
    }
}
