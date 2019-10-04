import java.util.Arrays;

public class TwoSumWithoutDuplicates {
//brute force approach
  public static int[] twosum(int[] nums, int target) {
  int [] answer = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[j] == target - nums[i])) {
        answer[0] = i;
        answer[1] = j;
        }
      }

    } return answer;
  }
  public static void main(String[] args) {
    int[] nums = {3,5,2,1};
    int target = 6;

    int[] solution = twosum(nums, target);
    System.out.println(Arrays.toString(solution));
  }
}
