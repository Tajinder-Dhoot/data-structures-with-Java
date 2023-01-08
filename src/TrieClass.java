public class TrieClass {
    /*
     * Trie Node Class
     */
    static class TrieNode {
        TrieNode[] children;
        boolean eow;

        public TrieNode() {
            this.children = new TrieNode[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            this.eow = false;
        }
    }

    static TrieNode root = new TrieNode();

    public int getCharIndex(char c) {
        char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int position = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (c == alphabets[i]) {
                return position;
            }
            position++;
        }

        return -1;
    }

    /*
     * Time complexity = O(L), L = length od largest string in list of strings
     */
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {

            /*
             * Thewre is another clean way of getting the index of a char within range 0 -
             * 25
             * Check search function for that
             */
            int charIndex = getCharIndex(word.charAt(i));

            if (current.children[charIndex] == null) {
                // create node
                current.children[charIndex] = new TrieNode();
            }
            if (i == word.length() - 1) {
                current.eow = true;
            }

            // move to next level
            current = current.children[charIndex];
        }
    }

    public boolean search(String key) {
        TrieNode current = root;
        for (int i = 0; i < key.length(); i++) {
            int charIndex = key.charAt(i) - 'a';

            if (current.children[charIndex] == null) {
                return false;
            }
            if (i == key.length() - 1 && current.eow) {
                return true;
            }
            current = current.children[charIndex];
        }

        return false;
    }

    public static void main(String args[]) {
        TrieClass trie = new TrieClass();
        System.out.println(trie.getCharIndex('a'));
        String words[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i]);
        }
        System.out.println(trie.search("their"));
        System.out.println(trie.search("afsf"));
        System.out.println(trie.search("ap"));
    }
}
