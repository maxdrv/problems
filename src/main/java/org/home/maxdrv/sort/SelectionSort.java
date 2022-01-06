package org.home.maxdrv.sort;

/**
 * move over array of N elements
 *
 * on each move find the lowest element from elements
 * place the lowest element on first position and element from first position to position of lowest element
 *
 * repeat over N elements
 * sub step to find the lowest element requires N, N-1, N-2, ... , 1 iterations
 * so N, N-1, N-2, ... , 1 = (N + 1) / 2
 *
 * O(N * (N + 1) / 2)
 *
 * or just O(N^2)
 *
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] numbers) {
        if (numbers.length == 0 || numbers.length == 1) {
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            int lowest = numbers[i];
            int position = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < lowest) {
                    lowest = numbers[j];
                    position = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = lowest;
            numbers[position] = temp;
         }
    }
}
