import java.util.ArrayList;
public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /**

     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for(int i=0; i<words.length-1; i++){
            for(int ii=i+1; ii<words.length; ii++){
                WordPair w = new WordPair(words[i], words[ii]);
                allPairs.add(w);
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches() {
        int matches = 0;
        for(WordPair w : allPairs){
            if(w.getFirst().equals(w.getSecond())) matches++;
        }
        return matches;
    }

    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
}