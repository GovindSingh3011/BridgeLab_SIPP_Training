public class 14_RandomNumbersStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 9000 + 1000);
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new double[]{sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(numbers);
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}