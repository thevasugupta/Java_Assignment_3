package packages_examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <=10; i++){
            numbers.add((int)(Math.random()*100));
        }

        //Sort
        Collections.sort(numbers);

        System.out.println("Sorted list : " + numbers);
    }
}
