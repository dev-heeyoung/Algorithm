class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            if(!Character.isLetter(s.charAt(left)))
                left++;
            else if(!Character.isLetter(s.charAt(right)))
                right--;
            else {
                arr[left] = s.charAt(right);
                arr[right] = s.charAt(left);
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}