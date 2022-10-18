package breakingTheRecords;

import java.util.ArrayList;
import java.util.List;

public class Result {

    /*
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<Integer>();
    
        int contMax = 0, contMin = 0;
        
        int min = scores.get(0);
        int max = scores.get(0);
        
        for(int i = 1; i < scores.size(); i++) {
            if(scores.get(i) > max) {
                max = scores.get(i);
                contMax++;
            } else if (scores.get(i) < min) {
                min = scores.get(i);
                contMin++;
            } 
        }
        
        result.add(contMax);
        result.add(contMin);
  
        return result;
    }
}