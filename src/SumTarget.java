import java.util.HashMap;
import java.util.Map;

public class SumTarget {
    //creating a method which returns array of the indexes of the numbers that adds to be the target int

        public static int[] sumTarget(int[] nums, int target) {
            //storing both the indexes in the map
            Map<Integer, Integer> map = new HashMap<>();

            // but first lets have a loop traverse through the array
            for (int i = 0; i < nums.length; i++) {
                // as the loop travels the complement element changes wrt the target
                int complement = target - nums[i];
                //and if my map has the number,
                // then it will return me the index of the complement and i(where the first element is)
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                //apart from it loop will continue ot put the values of array in hashmap
                //and then continues to verify the above condition until matches
                map.put(nums[i], i);
            }//here i could return null too, but i dont know why in the video explainer threw this exception
            throw new IllegalArgumentException("no");

        }
        public static void printArr(int[] nums){
            for(int i=0; i<nums.length; i++){
                System.out.println(nums[i]+" ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
        int [] nums = {2,7,11,15};

           printArr(sumTarget(nums, 9));





    }

}