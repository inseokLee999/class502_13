package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40};
        //int[] nums= new int[]{10,20,30,40};

        //int[] nums;
        //nums = new int[] {10,20,30,40};
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=nums[i];
        }
        System.out.println(result);
    }
}
