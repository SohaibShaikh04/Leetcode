class Solution {
    public int differenceOfSums(int n, int m) {
        int num1;
        int num2;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<=n;i++){
            if(i%m  != 0){
                 sum1 +=i;
            }
        }

        for(int i=0;i<=n;i++){
            if(i%m  == 0){
                 sum2 +=i;
            }
        }
        num1=sum1;
        num2=sum2;

     return num1-num2;
    }
}