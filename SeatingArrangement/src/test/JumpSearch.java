package test;

public class JumpSearch {

    public static int jumpSearch (int[] values, int target){

        int len = values.length;
        int i = 0;
        int m = (int)Math.floor(Math.sqrt(len));

        while (target != values[i] || target > values[i]){
            i = m;
            m+=(int)Math.floor(Math.sqrt(len));
            if (m > len -1){
                return -1;
            }

            for (int x = i; x < m; x++){
                if (values[x] == target){
                    return x;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] arr = {1,1,2,2,3,3,4,4,5,5,75,80,90,100,125,210};
        int target = 80;
        int result = jumpSearch(arr,target);

        if (result >= 0){
            System.out.println("found it at: " + result);
        }
        else
            System.out.println();

    }

}
