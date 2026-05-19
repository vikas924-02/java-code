import java.util.concurrent.*;

class SumTask extends RecursiveTask<Integer> {
    // 1. You must declare these variables first!
    int[] arr;
    int start, end;

    SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 2) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            // 2. This is the "Divide and Conquer" part you were missing
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(arr, start, mid);
            SumTask rightTask = new SumTask(arr, mid, end);

            leftTask.fork(); // Start the first task in parallel
            int rightResult = rightTask.compute(); // Do the second task
            int leftResult = leftTask.join(); // Wait for the first task to finish

            return leftResult + rightResult;
        }
    }
}

// 3. Make sure this class name matches your filename exactly
public class ForkJoinPool { 
    public static void main(String[] args) {
        java.util.concurrent.ForkJoinPool pool = new java.util.concurrent.ForkJoinPool();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        SumTask task = new SumTask(numbers, 0, numbers.length);
        int result = pool.invoke(task);
        
        System.out.println("Total Sum: " + result);
    }
}