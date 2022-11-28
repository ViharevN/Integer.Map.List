import java.util.*;

public class ListMap {

    private static final Random RANDOM = new Random();

    private final Map<String, List<Integer>> listMap = new HashMap<>();

    private int value = 5;
    private int count = 3;

    public ListMap() {
        for (int i = 0; i < value; i++) {
            listMap.put(String.valueOf(i), integerList());

        }
    }

    public Set<Map.Entry<String, List<Integer>>> keysAndValues() {
        return listMap.entrySet();
    }

    public Map<String, Integer> convertCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry :listMap.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);

        }
        return result;
    }

    private List<Integer> integerList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(RANDOM.nextInt(1001));

        }
        return list;
    }
}