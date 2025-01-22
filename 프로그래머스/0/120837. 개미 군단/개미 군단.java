class Solution {
    public int solution(int hp) {
        // 장군개미 5, 병정개미 3, 일개미 1
        int count = 0;
        
        while(hp > 0){
            int power = hp;
            
            if(hp > 5){
                hp = power%5;
                count += power/5;
            }else if(hp>2 && hp<5){
                hp = power%3;
                count += power/3;
            }else{
                hp = power%1;
                count += power/1;
            }    
        }
        
        return count;
    }
}