public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort Algorithm Implementation");

        int[] arr = {5,3,7,1,9,2};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j] > key)) {
                int fvar = arr[j];
                //int svar = arr[j + 1];
                arr[j + 1] = fvar;
                //arr[j] = svar;
                j--;
            }
            arr[j+1] = key;
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ") " + arr[i]);
        }
    }
}
