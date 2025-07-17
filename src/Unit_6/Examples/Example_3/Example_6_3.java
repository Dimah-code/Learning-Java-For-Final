public class Example_6_3 {
    public static void main(String[] args) {
        int[] nums = {2, 4 , 6, 8};
        System.out.println("Before Calling Method");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        trans(nums[1] , nums[3]);
        System.out.println("After Calling Method");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "\t");
        }
    }
    private static void trans(int a , int b){
        System.out.println("1 and 3 in method: before change: " + a + " " + b);
        a++;
        b++;
        System.out.println("1 and 3 in method: after change: " + a + " " + b);
    }
}
