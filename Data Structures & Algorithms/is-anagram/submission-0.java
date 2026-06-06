class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        for(char x: s.toCharArray()){
            a[(int)x -97]++;
        }
        for(char x: t.toCharArray()){
            b[(int)x -97]++;
        }
        for(int i = 0; i < 26; i++){
            if(a[i]!=b[i]) return false;

        }
        return true;
        

    }
}
