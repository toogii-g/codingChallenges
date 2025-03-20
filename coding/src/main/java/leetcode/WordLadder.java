package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        q.add(null);

        HashSet<String> dict = new HashSet<>(wordList);

        HashSet<String> v = new HashSet<>();
        v.add(beginWord);

        if (!dict.contains(endWord))
            return 0;

        int level = 1;

        while (!q.isEmpty()) {
            String s = q.poll();
            if (s != null) {
                for (int i = 0; i < s.length(); i++) {
                    char[] chars = s.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String word = new String(chars);
                        if (word.equals(endWord))
                            return level + 1;
                        if (dict.contains(word) && !v.contains(word)) {
                            q.add(word);
                            v.add(word);
                        }
                    }
                }
            } else {
                level++;
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }
        }
        return 0;
    }
}