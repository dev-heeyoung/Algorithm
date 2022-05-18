class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] stringArr = path.split("/");
        StringBuilder res = new StringBuilder();
        
        for (String s: stringArr) {
            if (!stack.empty() && s.equals("..")) stack.pop();
            else if (!s.equals("") && !s.equals(".") && !s.equals(".."))
                stack.push(s);
        }
        
        if (stack.empty())
            return "/";

        while(!stack.empty()){
            res.insert(0,stack.pop()).insert(0, "/");
        }
        
        return res.toString();        
    }
}
