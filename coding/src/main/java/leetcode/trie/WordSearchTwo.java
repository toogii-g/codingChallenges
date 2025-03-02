package leetcode.trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchTwo {

    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = buildTrie(words);
        Set<String> res = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, trie, res, i, j);
            }
        }

        return new ArrayList<>(res);
    }

    private void dfs(char[][] board, Trie node, Set<String> res, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                board[i][j] == '#' || node.next[board[i][j] - 'a'] == null) {
            return;
        }

        if (node.next[board[i][j] - 'a'].word != null) {
            res.add(node.next[board[i][j] - 'a'].word);
        }

        node = node.next[board[i][j] - 'a'];
        char c = board[i][j];
        board[i][j] = '#';
        dfs(board, node, res, i - 1, j);
        dfs(board, node, res, i + 1, j);
        dfs(board, node, res, i, j - 1);
        dfs(board, node, res, i, j + 1);
        board[i][j] = c;
    }

    public Trie buildTrie(String[] words) {
        Trie root = new Trie();
        for (String s : words) {
            Trie curr = root;
            for (char c : s.toCharArray()) {
                if (curr.next[c - 'a'] == null) {
                    curr.next[c - 'a'] = new Trie();
                }
                curr = curr.next[c - 'a'];
            }
            curr.word = s;
        }

        return root;
    }

    private class Trie {
        Trie[] next = new Trie[26];
        String word = null;
    }
}
