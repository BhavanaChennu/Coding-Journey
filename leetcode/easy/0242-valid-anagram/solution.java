class Solution {
    public boolean isAnagram(String s, String t) {
        int[] str = new int[26];
        if(s.length() != t.length()) return false;
        else{
        for(int i = 0 ; i < s.length() ; i++){
             char ch = s.charAt(i); 
             str[ch - 'a']++;
             str[t.charAt(i) -'a']--;
        }
        }
        for(int i = 0 ; i < str.length; i++)
        {
            if(str[i] != 0)  return false;
        }  
        return true; 
    }
}