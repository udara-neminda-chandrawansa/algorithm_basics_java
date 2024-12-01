public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort Algorithm Implementation");

        int arr[] = {2,5,3,4,6};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - i - 2); j++) {
                if (arr[j] > arr[j + 1]) {
                    int fvar = arr[j];
                    int svar = arr[j + 1];
                    arr[j] = svar;
                    arr[j + 1] = fvar;
                }
            }
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ") " + arr[i]);
        }
    }
}