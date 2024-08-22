package firstcode;

public class main {
    public static void main(String[] args) {
        int n = 5;
        int[] foo = { 0, 1, 2, 3, 4 };

        int m = 100;
        int[] bar;
        bar = new int [m];

        for(int i = 0; i < m; i++) {
            bar[i] = i;
        }

        System.out.println("The total number of even numbers in foo is: " + countEvenNum(foo,n));
        System.out.println("The total number of even numbers in bar is: " + countEvenNum(bar, m));

    }

    public static int countEvenNum(int[] arr, int size) {
        int count = 0;

        for(int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
            else{
                // do nothing
            }
        }

        return count;
    }
}
