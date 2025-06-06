public class myPowMain{
    public static double myPow(double x, int n) {
        long N = n;
        if(N<0){
            N = -N;
            x = 1/x;
        }
        return fastPow(x, N);
    }

    public static double fastPow(double x, long N){
        if(N == 0) return 1;
        double half = fastPow(x,N/2);
        if(N % 2 == 0){
            return half * half;
        }
        else{
            return half * half * x;
        }
    }

    public static void main(String[] args){
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x,n));
    }
}