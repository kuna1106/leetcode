package array.introduction;

public class FindNumbersWithEvenNumber {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenNumber(findDigitsOfNumber(nums[i])) == true){
                count++;
            }
        }
        
        return count;
    }

    public static int findDigitsOfNumber(int n){
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean isEvenNumber(int n){
        if (n % 2 == 0){
            return true;
        } else
            return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
