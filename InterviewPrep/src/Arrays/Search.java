package Arrays;

import java.util.Arrays;

public interface Search {

    static int search(int[] input, int key) {
        return Arrays.binarySearch(input, key);
    }
}
