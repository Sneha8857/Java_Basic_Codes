class Solution {
    public List<String> stringMatching(String[] words) {
        
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<words.length; i++) {
            
            for(int j=0; j<words.length; j++) {
                
                if(words[i].contains(words[j]) && i!=j)
                    set.add(words[j]);
            }
        }
        
        return new ArrayList<>(set);
    }
}
