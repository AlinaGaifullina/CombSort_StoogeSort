import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestSorts {
    private static final long SEED = 123123L;
    private static final long MAX_VAL = Long.MAX_VALUE;
    private static final Random RAND = new Random(SEED);
    private static long start;

    private static long rand(long max) {
        return RAND.nextLong();
    }

    @Test
    void testCombSort30000(){
        int n = 30000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 1 - 30000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
    @Test
    void testCombSort100000(){
        int n = 100000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 2 - 100000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
    @Test
    void testCombSort500000(){
        int n = 500000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 3 - 500000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testCombSort1000000(){
        int n = 1000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 4 - 1000000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testCombSort3000000(){
        int n = 3000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 5 - 3000000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testCombSort5000000(){
        int n = 5000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 6 - 5000000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testCombSort8000000(){
        int n = 8000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 7 - 8000000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testCombSort10000000(){
        int n = 10000000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 8 - 10000000 elements");
        start = System.currentTimeMillis();
        CombSort.combsort(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testStoogeSort1000(){
        int n = 1000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 9 - 1000 elements");
        start = System.currentTimeMillis();
        StoogeSort.stoogesort(arr, 0, n-1);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testStoogeSort3000(){
        int n = 3000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 10 - 3000 elements");
        start = System.currentTimeMillis();
        StoogeSort.stoogesort(arr, 0, n-1);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testStoogeSort5000(){
        int n = 5000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 11 - 5000 elements");
        start = System.currentTimeMillis();
        StoogeSort.stoogesort(arr, 0, n-1);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testStoogeSort8000(){
        int n = 8000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 12 - 8000 elements");
        start = System.currentTimeMillis();
        StoogeSort.stoogesort(arr, 0, n-1);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    void testStoogeSort10000(){
        int n = 10000;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = (int) rand(MAX_VAL); }
        System.out.println("Test 13 - 10000 elements");
        start = System.currentTimeMillis();
        StoogeSort.stoogesort(arr, 0, n-1);
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
}
