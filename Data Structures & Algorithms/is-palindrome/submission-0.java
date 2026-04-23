class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String alphanum = "";
        for(char x:s.toCharArray()){
            if((x>=65 && x<=90) || (x>=97 && x<=122) || (x>=48 && x<=57)){
                alphanum += x;
            }
        }
        String rev = "";
        for(int i = alphanum.length()-1; i>=0; i--){
            rev += alphanum.charAt(i);
        }
        if(rev.equals(alphanum)){
            return true;
        }
        return false;
    }
}