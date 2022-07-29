package org.johnwick182.trie;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        char[] c = word.toCharArray();
        TrieNode currentNode = root;

        for (char myC : c) {
            if (!currentNode.getEdges().containsKey(c)) {
                currentNode.getEdges().put(myC, new TrieNode());
            }
            currentNode = currentNode.getEdges().get(c);
        }
        currentNode.setEndOfWord(true);
    }

    public boolean contains() {
        return true;
    }
}
