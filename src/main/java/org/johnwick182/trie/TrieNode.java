package org.johnwick182.trie;

import java.util.HashMap;
import java.util.Map;

// https://interviews.school/trie

public class TrieNode {
    private  Map<Character, TrieNode> edges;
    private boolean endOfWord;

    public TrieNode() {
        this.edges = new HashMap<>();
        this.endOfWord = false;
    }

    public Map<Character, TrieNode> getEdges() {
        return edges;
    }

    public void setEdges(Map<Character, TrieNode> edges) {
        this.edges = edges;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
