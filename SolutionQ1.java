import java.util.*;
public class SolutionQ1 {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();
        list.add(1.11222f);
        list.add(3.7575f);
        list.add(6.5f);
        list.add(4.95f);
        Iterator<Float> it = list.iterator();
        float sum = 0;
        while(it.hasNext()){
            sum+=it.next();
        }
        System.out.println(sum);
    }
}