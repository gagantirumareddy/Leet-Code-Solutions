class Solution {
    public int numberOfSpecialChars(String word) {
        int z=0;
        Set<Character>a=new HashSet<>();
        Set<Character>b=new HashSet<>();
        for(char c:word.toCharArray())
           if(Character.isLowerCase(c)) a.add(c);
           else b.add(Character.toLowerCase(c));
        for(char c:a)
          if(b.contains(c)) z++;
        return z;
    }
}
