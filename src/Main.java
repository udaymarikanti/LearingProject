import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int num[] = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Original array:");

            for (int nums : num) {
                System.out.print(nums + "  ");
            }

            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num.length - i - 1; j++) {
                    if (num[j] > num[j + 1]) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                }
                System.out.println();
                for (int nums : num){
                    System.out.print(nums + "  ");
                }
            }

            System.out.println();
            System.out.println("After sorting:");
            for (int nums : num){
                System.out.print(nums + " ");
            }







        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(2);
        numbers.add(6);

        Collections.sort(numbers);
        System.out.println(" soureted by using collections sort" + numbers);

        int min = Collections.min(numbers);
        System.out.println("mine vale in list  " + min);
        int max = Collections.max(numbers);
        System.out.println(" max value of " + max);

        Collections.fill(numbers,7);
        System.out.println( "this is fill the numbers " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();


        Collections.copy(numbers,numbers);
        System.out.println(" it copy the " + numbers);







    }
}












