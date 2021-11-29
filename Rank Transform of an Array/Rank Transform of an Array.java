class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(res);
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num: res)
            map.putIfAbsent(num, map.size()+1);
        
        for(int i=0; i<arr.length; i++)
            res[i] = map.get(arr[i]);
        
        return res;
    }
}