package top.withlevi.array;

/**
 * Created by Levi Zhao on 2/13/2023 3:53 PM
 *
 * @Author Levi
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int index = new Solution().Search(nums, 12);
        if (index != -1) {
            System.out.println("index is " + index);
        } else {
            System.out.println("No find");
        }


    }
}

class Solution {
    public int Search(int[] nums, int target) {

        /*Avoid multiple loop operations when target is less
        than nums[0] nums[nums.length - 1]*/

        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }
}
