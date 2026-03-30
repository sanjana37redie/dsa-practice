// Problem: Generate Binary Numbers from 1 to N

import java.util.*;

class BinaryGenerator {

    public List<String> generate(int n) {

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < n; i++) {

            String current = queue.poll();
            result.add(current);

            queue.offer(current + "0");
            queue.offer(current + "1");
        }

        return result;
    }
}
