package String;
public class validAnagram {
public static boolean isAnagram(String s, String t){
    int m= s.length();
    int n= t.length();
    if(m!=n){
        return false;
    }
    else{
        int Count[] = new int[26];
        for(int i=0; i<m; i++){
          Count[s.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++){
            Count[t.charAt(i)-'a']--;
        }
        for(int i=0; i<Count.length; i++){
            if(Count[i]!=0){
                return false;
            }
        }
        return true;
    }
} 

    public static void main(String[] args) {
        String s= "anagram";
        String t="nagaram";
        System.out.println(isAnagram(s, t));
    }
}