public class StoogeSort {
    // Функция для реализации stooge sort
    public static void stoogesort(int arr[], int l, int h)
    {
        if (l >= h)
            return;

        // Если первый элемент меньше последнего,
        // меняем их
        if (arr[l] > arr[h]) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }

        // Если в массиве содержиться более 2 элементов
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;

            // Рекурсивная сортировка первых 2/3 элементов
            stoogesort(arr, l, h - t);

            // Рекурсивная сортировка последних 2/3 элементов
            stoogesort(arr, l + t, h);

            // Рекурсивная сортировка первых 2/3 элементов
            // снова, чтобы подтвердить
            stoogesort(arr, l, h - t);
        }
    }
}
