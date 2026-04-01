class Solution {
    class WordInfo{
        String word;int steps;
        WordInfo(String w, int s){
            word=w;steps=s;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<WordInfo> q = new LinkedList<>();
        q.offer(new WordInfo(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            WordInfo w = q.poll();
            String word = w.word;
            int steps = w.steps;
            if(word.equals(endWord)) return steps;
            for(int i=0;i<word.length();i++){
                char[] wordChars = word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    wordChars[i]=ch;
                    String replacedWord = new String(wordChars);
                    if(set.contains(replacedWord)){
                        q.offer(new WordInfo(replacedWord,steps+1));
                        set.remove(replacedWord);
                    }
                }
            }
        }
        return 0;
    }
}