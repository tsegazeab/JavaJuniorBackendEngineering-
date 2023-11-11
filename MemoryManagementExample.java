import java.util.ArrayList;
import java.util.List;

public class MemoryManagementExample {
    public static void main(String[] args) {
        // Memory allocation: stack vs. heap
        int stackVariable = 10;
        System.out.println("Stack Variable: " + stackVariable);

        List<Integer> heapList = new ArrayList<>();
        heapList.add(20);
        heapList.add(30);
        System.out.println("Heap List: " + heapList);

        // Garbage collection and memory optimization
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            String str = "String " + i;
            stringList.add(str);
        }

        // Let's remove some objects from the list
        for (int i = 0; i < 500000; i++) {
            stringList.remove(0);
        }

        // Run garbage collector to reclaim memory
        System.gc();

        // Memory optimization: object pooling
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            String str = getStringFromPool("String " + i);
            stringBuilder.append(str);
        }
    }

    private static String getStringFromPool(String str) {
        // Object pooling logic goes here
        return str.intern();
    }
}
