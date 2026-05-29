class Solution {
    public void reverseString(char[] s) {

        int ultimo = s.length - 1 ;
        char temp;

        for(int i = 0 ; i <= (s.length -1)/2 ; i++){

            temp = s[ultimo];
            s[ultimo] = s[i];
            s[i] = temp;

            ultimo--;

        }

        System.out.println(s);
        
    }
}