package packages_examples;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(77, "Shubman Gill");
        employees.put(18, "Virat Kohli");
        employees.put(45, "Rohit Sharma");
        employees.put(31, "Ruturaj Gaikwad");

        System.out.println("Employee ID to Name Mapping:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " -> " + employees.get(id));
        }
    }
}
