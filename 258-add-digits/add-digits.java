class Solution {
    public int addDigits(int num) {
        while(num>=10){
        int d=0;
        while(num>0){
            int r=num%10;
            d=d+r;
            num=num/10;
        }
        num=d;
    }
    return num;
}
}