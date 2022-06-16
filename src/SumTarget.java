public class SumTarget {
    public static void sumTarget(int[]arr, int target) {
    for(int i=0; i<arr.length; i++){
        int j=0;

          if(arr[i]+arr[j]==target){
            System.out.println(i+" "+j);
          }
        }
    }



    public static void main(String[] args) {
        int[] arr = {8};
        sumTarget(arr,8);

    }
}
