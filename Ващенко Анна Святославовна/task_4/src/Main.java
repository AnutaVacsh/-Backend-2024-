import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 6, 8, 10, 12, 30);
        int target = 10;
        int index = binarySearch(numbers, target, 0, numbers.size() - 1);
        System.out.println(index);
    }
    public static int binarySearch(List<Integer> sortedList, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (sortedList.get(mid) == target) {
            return mid;
        } else if (sortedList.get(mid) < target) {
            return binarySearch(sortedList, target, mid + 1, right);
        } else {
            return binarySearch(sortedList, target, left, mid - 1);
        }
    }
}