package test;

public class binarySearch {

    public static int BinarySearch (int [] values, int target ){

        int end = values.length -1;// to get the last element you need -1
        int start = 0;
        int middle;
        int step = 0;

        while (start <= end){

            middle = (end + start)/2;


            if (values[middle] == target){
                step++;
                System.out.println("number of steps: " + step );
                return middle;
            }

            else if (target > values[middle]){
                start = (middle + 1);

            }
            else {
                end = (middle -1);

            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12};
        int search = 8;
        int result = BinarySearch(arr,search);

        if (result == -1){
            System.out.println("Sorry");
        }
        else
            System.out.println("Its here "+result);
    }
}
