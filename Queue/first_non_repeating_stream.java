// Problem: First Non-Repeating Character in Stream

import java.util.*;

class StreamProcessor {

    public String process(String stream) {

        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        StringBuilder result = new StringBuilder();

        for (char ch : stream.toCharArray()) {

            freq[ch - 'a']++;
            queue.offer(ch);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                result.append('#');
            } else {
                result.append(queue.peek());
            }
        }

        return result.toString();
    }
}
