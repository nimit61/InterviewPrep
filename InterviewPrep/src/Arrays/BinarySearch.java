package Arrays;

public class BinarySearch implements Search {

    public static int search(int[] input, int key) {

        if (input == null || input.length == 0) {
            return -1;
        }

        return search(input, 0, input.length - 1, key);
    }

    private static int search(int[] input, int low, int high, int key) {
        int length = input.length;
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low)/2;

        if (key == input[mid]) {
            return mid;
        } else if (key > mid) {
            return search(input, mid + 1, high, key);
        } else {
            return search(input, low, mid - 1, key);
        }
    }
}
