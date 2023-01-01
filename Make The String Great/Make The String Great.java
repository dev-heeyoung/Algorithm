// Solution 1) Recursion
class Solution {
    public String makeGood(String s) {
        for (int i=0; i< s.length()-1; i++) {
            if ( Math.abs(s.charAt(i) - s.charAt(i+1)) == 32 )
                return makeGood(s.substring(0, i) + s.substring(i+2));
        }
        return s;
    }
}

// Solution 2) Stack
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char cur: s.toCharArray()) {
            if (!stack.empty() && Math.abs(cur - stack.lastElement()) == 32)
                stack.pop();
            else
                stack.push(cur);
        }

        StringBuilder sb = new StringBuilder();
        for (char cur: stack) {
            sb.append(cur);
        }
        return sb.toString();
    }
}