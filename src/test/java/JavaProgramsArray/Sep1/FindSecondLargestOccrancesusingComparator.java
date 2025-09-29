package JavaProgramsArray.Sep1;

import java.util.*;

public class FindSecondLargestOccrancesusingComparator {

    public static void main(String[] args) {
        {
            int arr[] = {4, 2, 7, 4, 4, 9, 1, 7,7,7};
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());
            Comparator<Map.Entry<Integer,Integer>> obj = (e1,e2) -> e2.getValue() - e1.getValue();
            Collections.sort(entries,obj);
            System.out.println("Second Largest occurance "+ entries.get(1).getKey() +":"+ entries.get(1).getValue());
            }
        }
    }

