//Solution 1)
public class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!set.contains(arr[left])) {
                left++;
            } else if (!set.contains(arr[right])) {
                right--;
            } else {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}

//Solution 2)
class Solution {
    public String reverseVowels(String s) {
        char[] charArr = new char[s.length()];
        Stack<Character> stack = new Stack<Character>();
        Set<Character> set = new HashSet<Character>();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        for(char c: s.toCharArray())
            if(set.contains(c))
                stack.push(c);
        
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i)))
                charArr[i] = stack.pop();
            else 
                charArr[i] = s.charAt(i);
        }
        
        return String.valueOf(charArr);
                
    }
}