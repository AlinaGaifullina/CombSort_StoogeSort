public class CombSort {

    // Ищем разрыв между элементами:
    static int getNextGap(int gap)
    {
        // Усадочный разрыв по коэффициенту разрыва
        // Коэффициент равен примерно 1.3
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }

    // Функция для сортировки массива:
    static void combsort(int arr[])
    {
        int n = arr.length;

        // Инициализируем разрыв:
        int gap = n;

        // Инициализируем swapped как true, чтобы убедиться, что
        // цикл выполняется

        boolean swapped = true;

        // Продолжаем работать, пока разрыв больше 1 и последняя
        // итерация привела к замене
        while (gap != 1 || swapped == true)
        {
            // Находим следующий разрыв:
            gap = getNextGap(gap);

            // Инициализируем swapped как false,
            // чтобы мы могли проверить, произошла ли замена или нет
            swapped = false;

            // Сравниваем все элементы с текущим разрывом:

            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    // Меняем arr[i] и arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    // Замена произошла, поэтому
                    // инициализируем swapped как true
                    swapped = true;
                }
            }
        }
    }
}
