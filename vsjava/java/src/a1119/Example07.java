package a1119;

public class Example07 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};

        int max = array[0];
        int min = array[0];
        for(int num : array) {
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        System.out.println("최댓값:" + max);
        System.out.println("최솟값:" + min);

    }
}
