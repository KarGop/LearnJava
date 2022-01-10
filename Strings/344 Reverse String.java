/*
Link: https://leetcode.com/problems/reverse-string/

344. Reverse String

Example 1:

 Input: s = ["h","e","l","l","o"]
 Output: ["o","l","l","e","h"]

/*

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
   int end = s.length-1;
   while (left < end) {
      //swap
      char temp = s[left];
      s[left] = s[end];
      s[end] = temp;
      
      left ++;
      end --;
   }
    }
}
