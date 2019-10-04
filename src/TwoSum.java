import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static int[] twosum(int[] nums, int target) {
    int[] answer = new int[2];
    HashMap<Integer, Integer> subtactValue = new HashMap<Integer, Integer>();

    for (int item : nums) {
      subtactValue.put(Integer.valueOf(item),0);
    }


    for(int item : nums){
      int value = target - item;
      if(subtactValue.containsKey(value)){
        answer[0] = item;
        answer[1] = value;
      }
    }
    return answer;
  }




  public static void main(String[] args) {
    int[] nums = {2, 7, 1, 3};
    int target = 5;

    int[] solution = twosum(nums, target);
    System.out.println(Arrays.toString(solution));
  }

}
