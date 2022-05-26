public class Main {
    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 3, 1 };
        int arr2[] = { 2, 4, 5, 3, 1 };
        int n = arr.length;

        StoogeSort.stoogesort(arr, 0, n - 1);
        CombSort.combsort(arr2);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        for (int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");
    }
}
