import java.util.*;
public class SolutionQ5
{
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<Integer, Integer>();
        mp.put(2,10);
        mp.put(3,5);
        mp.put(1,1);
        mp.put(10,5);
        mp.put(100,50);

        System.out.println(mp);
        List<Integer> list = new ArrayList<>(mp.keySet());
        list.sort((a,b)->mp.get(a)-mp.get(b));

        LinkedHashMap<Integer, Integer> sortedmp = new LinkedHashMap<>();
        for(int key : list){
            sortedmp.put(key,mp.get(key));
        }
        System.out.println(sortedmp);
    }
}
