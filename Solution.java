class Solution {
    public static int arraySum(int[] arr) {

        int result = java.util.Arrays.stream(arr).reduce(0, (a, b) -> a + b);

        return result;
    }
}