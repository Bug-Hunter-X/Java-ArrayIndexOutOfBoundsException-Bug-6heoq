public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //Print the last valid element
        System.out.println(arr[arr.length -1]); 
    }
}