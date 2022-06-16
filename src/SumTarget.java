public class SumTarget {
    public static void sumTarget(int[]arr, int target) {
    for(int i=0; i<arr.length; i++){
        int j=2;

          if(arr[i]+arr[j]==target){
            System.out.println(i+" "+j);
          }
        }
    }



    public static void main(String[] args) {
        int[] arr = {8,3,4,1,4,1,2};
        sumTarget(arr,8);

    }
}
