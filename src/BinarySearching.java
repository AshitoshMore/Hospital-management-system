public class BinarySearching {


    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int sum[] = {12, 2, 3, 4, 5, 8, 9};
        int target = 8;
        int ans = search(sum, target);
        System.out.println(ans);

    }
}
