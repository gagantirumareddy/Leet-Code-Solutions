import java.util.*;

class Solution {
    public String sortVowels(String s) {
        
        String glanvoture = s; 
        
        int n = s.length();
        
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> firstIndex = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if(isVowel(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                firstIndex.putIfAbsent(ch, i);
            }
        }
        
       
        List<Character> list = new ArrayList<>(freq.keySet());
        
        Collections.sort(list, (a, b) -> {
            if(!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a); 
            }
            return firstIndex.get(a) - firstIndex.get(b); 
        });
        
        
        List<Character> sorted = new ArrayList<>();
        
        for(char ch : list) {
            int count = freq.get(ch);
            while(count-- > 0) {
                sorted.add(ch);
            }
        }
        
        
        StringBuilder res = new StringBuilder();
        int idx = 0;
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if(isVowel(ch)) {
                res.append(sorted.get(idx++));
            } else {
                res.append(ch);
            }
        }
        
        return res.toString();
    }
    
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
