import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 4, 1, 8);
        int maxSum = findMaxSum(numbers);
        System.out.println(maxSum);
    }
    public static int findMaxSum(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("Список должен содержать хотябы два числа");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 + max2;
    }
}