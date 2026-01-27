class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0.0;
        if(x==1 || n==0) return 1.0;
        if(n<0){
            x = 1/x;
            n= - n;
            return  x* myPow(x,n-1);
        }
        double hw = myPow(x,n/2);

        if(n%2 == 0){
            return hw * hw;
        }
        else{
            return x * hw * hw;
        }
    }
}