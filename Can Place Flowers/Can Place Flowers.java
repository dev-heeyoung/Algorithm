class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        int count=1, total=0;
        
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){
                count++;
            }
            else {
                total += (count-1)/2;
                count=0;
            }
        }
        if(count!=0) 
            total += count/2;
        
        return total >= n;
    }
}
