package Implimentation.DataStructures;

public class Trie {
    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;

    private TrieNode root;
     
    // trie node
    private class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
      
        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord = false;
         
        TrieNode(){
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };

    public void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        TrieNode pCrawl = this.root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();
      
            pCrawl = pCrawl.children[index];
        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    public boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = this.root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return false;
      
            pCrawl = pCrawl.children[index];
        }
      
        return (pCrawl.isEndOfWord);
    }


      
}
