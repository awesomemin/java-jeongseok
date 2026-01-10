public class Shuffle {
    public static void main(String[] args) {
        for(int j = 0; j < 10; j++) {

            int[] lotteryNumbers = new int[]{0,1,2,3,4,5,6,7,8,9};
            for(int i = 0; i < 100; i++) {
                int n = (int)(Math.random() * 9) + 1;
                int temp = lotteryNumbers[0];
                lotteryNumbers[0] = lotteryNumbers[n];
                lotteryNumbers[n] = temp;
            }
            for(var num: lotteryNumbers) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
