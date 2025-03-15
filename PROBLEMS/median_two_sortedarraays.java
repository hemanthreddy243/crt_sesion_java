class MedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length, n2 = nums2.length;
        int low = 0, high = n1;

        while (low <= high) {
            int partition1 = (low + high) / 2;
            int partition2 = (n1 + n2 + 1) / 2 - partition1;

            // Edge cases: If partition is out of bounds, use Integer.MIN/MAX
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == n1) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n2) ? Integer.MAX_VALUE : nums2[partition2];

            // ✅ Correct Partition Found
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } 
            // 🔹 Move Left (Reduce High)
            else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } 
            // 🔹 Move Right (Increase Low)
            else {
                low = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted!");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 8};
        int[] nums2 = {7, 9, 10, 11};

        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));
    }
}
