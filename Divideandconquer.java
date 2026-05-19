public class Divideandconquer {

    static int findSum(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;

        return findSum(arr, left, mid) 
             + findSum(arr, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(findSum(arr, 0, arr.length - 1));
    }
}