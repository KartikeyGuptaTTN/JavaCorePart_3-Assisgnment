
//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
import java.util.*;

        public class SolutionQ4 {
            public static void main(String[] args) {
                int[] arr = {1,2,2,3,3,4,5,4,5,6,5,6,5,8,7};


                LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
                for (int num : arr) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }


                List<Integer> elements = new ArrayList<>(map.keySet());
                elements.sort((a, b) -> map.get(b) - map.get(a));
                System.out.println(elements);
                for (int num : elements) {
                    int count = map.get(num);
                    for (int i = 0; i < count; i++) {
                        System.out.print(num + " ");
                    }
                }
            }
        }
