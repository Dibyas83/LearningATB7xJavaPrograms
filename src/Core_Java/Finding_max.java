package Core_Java;

public class Finding_max {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 98, 33, 27};
        int maxNumber = findMax(numbers);
        System.out.println("The maximum element is: " + maxNumber); // Output: 98
    }
}
