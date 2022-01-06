package org.home.maxdrv.sort;

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
