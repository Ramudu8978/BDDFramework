package Day2;

import java.util.HashMap;
import java.util.Map;

public class NestedHashMapExample {
    public static void main(String[] args) {
        // Inner HashMap for key "G"
        Map<String, Integer> innerMap = new HashMap<>();
        innerMap.put("E", 10);
        innerMap.put("B", 20);

        // Outer HashMap
        Map<String, Object> outerMap = new HashMap<>();
        outerMap.put("A", 5);
        outerMap.put("G", innerMap); // Nested HashMap
        outerMap.put("F", 100);
        outerMap.put("S", 90);

        // Example access:
        System.out.println("Value of A: " + outerMap.get("A"));

        // Access nested map
        Map<String, Integer> nested = (Map<String, Integer>) outerMap.get("G");
        System.out.println("Value of E inside G: " + nested.get("E"));
    }
}