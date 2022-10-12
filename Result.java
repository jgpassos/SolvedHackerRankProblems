package minMaxSum;

import java.util.*;

class Result {

    /*
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        List<Long> sumArray = new ArrayList<>();
        int contPosition = 0;
        
        for(int i = 0; i < arr.size(); i++){
            
            long sum = arr.stream()
            .mapToLong(Integer::longValue)
            .sum();
            
            long sumEveryExcept = (sum - arr.get(contPosition));
            
            sumArray.add(sumEveryExcept);
            contPosition++;
        }
        
        long minimum = Collections.min(sumArray);
        long maximum = Collections.max(sumArray);
        
        System.out.println(minimum + " " + maximum);          
    }
}
