import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 2, 4, 6, 7, 9, 2, 19));
        List<Integer> B = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 6, 9));
        List<Integer> sortedA = sortArray(A, B);
        System.out.println(sortedA);
    }
    public static List<Integer> sortArray(List<Integer> A, List<Integer> B) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> nonBelements = new ArrayList<>();

        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (!B.contains(num)) {
                nonBelements.add(num);
            }
        }

        nonBelements.sort((a, b) -> b - a);

        for (int num : B) {
            if (countMap.containsKey(num)) {
                for (int i = 0; i < countMap.get(num); i++) {
                    result.add(num);
                }
            }
        }

        result.addAll(nonBelements);
        return result;
    }

}