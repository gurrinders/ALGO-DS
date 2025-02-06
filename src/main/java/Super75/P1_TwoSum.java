package Super75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class P1_TwoSum {

    public static int[][] findSum(int arr[], int sum){
       Map<Integer,Integer> values = new HashMap();
       int[][] res = new int[1][2];
       int r=0, c=0;

       for(int i =0; i<arr.length;i++){
           int check = sum-arr[i];
           if (values.get(check) != null){
              res[r][0] = i;
              res[r][1] = values.get(sum-arr[i]);
              r++;
           }
           values.put(arr[i], i);

       }
       return res;
    }

    public static void main(String[] args) {
        //case 1
        int arr[] = {1,2,3,4,5};
        int sum = 9 ;
        int sol[][] = findSum(arr,sum);
        Arrays.stream(sol)
                .flatMapToInt(arr2 -> Arrays.stream(arr2))
                .forEach(System.out::print);
        System.out.println();
        Arrays.stream(sol).forEach( row -> {
            String r = Arrays.stream(row)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(","));
            System.out.println(r);

        });
        System.out.print("Done");
    }
}