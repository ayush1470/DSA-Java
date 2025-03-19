public class Main {
    private static int index; // Global index (private as it is a helper variable, and it doesn't need to interact with any external calls.)

    public static void BeautifulArray(int n){
        int[] res = new int[n];
        index = 0; // initialize the index.
        DivideConquer(1,1,res,n);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }

    private static void DivideConquer(int start, int increment, int[] res, int n){
        if(start > n){ // out of bounds condition
            return;
        }
        if(start + increment > n){ /* the necessary condition to divide the array in odd and even
                                   and also check the required condition: 2*res[k] != res[i] + res[j] where i<k<j */
            res[index++] = start;
            return;
        }
        DivideConquer(start, 2*increment, res, n);
        DivideConquer(start+increment, 2*increment, res, n);
    }

    public static void main(String[] args) {
        int n = 5;
        BeautifulArray(n);
    }
}