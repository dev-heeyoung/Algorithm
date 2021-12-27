class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        
        for(int money: bills){
            if (money == 5) {
                five++;
            }
            else if(money == 10){
                five--;
                ten++;
            }
            else {
                if (ten>0) {
                    five--;
                    ten--;
                }
                else
                    five -= 3;
            }
            if(five<0 || ten<0)
                return false;
        }
        return true;
    }
}