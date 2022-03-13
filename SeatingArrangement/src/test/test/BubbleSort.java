package test;

public class BubbleSort {

    static void bubbleSort(int[] value) {

        int n = value.length;

        for (int i = 0; i < n; i++) {
            int flag = 0; // this is used to lessen the time complexity to O(n)
            for (int j = 0; j < n - i - 1; j++) {
                if (value[j] > value[j + 1]) {
                    int temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                    flag = 1;
                }

            }

        }
    }

    public static void main(String[] args) {

    }
}
