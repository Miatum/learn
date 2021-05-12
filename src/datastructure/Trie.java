package datastructure;

/**
 * @Description Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 * 请你实现 Trie 类：
 * Trie() 初始化前缀树对象。
 * void insert(String word) 向前缀树中插入字符串 word 。
 * boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
 * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
 * 其核心是使用「边」来代表有无字符，使用「点」来记录是否为「单词结尾」以及「其后续字符串的字符是什么」。
 * @ClassName DictionaryTree
 * @Author Miatum
 * @date 2021.04.14 14:07
 */
public class Trie {
    private boolean isEnd;
    private Trie[] children;
    /** data structure */
    public Trie() {
        this.isEnd = false;
        this.children = new Trie[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            int index = w - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = this;
        boolean contain = true;
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            int index = w - 'a';
            if (node.children[index] == null) {
                contain = false;
                break;
            }
            node = node.children[index];
        }
        if (node.isEnd != true) {
            contain = false;
        }
        return contain;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = this;
        boolean contain = true;
        for (int i = 0; i < prefix.length(); i++) {
            char w = prefix.charAt(i);
            int index = w - 'a';
            if (node.children[index] == null) {
                contain = false;
                break;
            }
            node = node.children[index];
        }
        return contain;
    }
}
