class Solution {

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int unique = 0;

        for(int num : arr) {
            unique ^= num;
        }

        System.out.println("Unique Number: " + unique);
    }
}