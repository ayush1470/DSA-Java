public class TilingProblemMain{
    public static int tilingProblem(int n) {
        if(n==1 || n==0){ // base case
            return 1;
        }
        int fmn1 = tilingProblem(n-1);
        int fmn2 = tilingProblem(n-2);
        return fmn1 + fmn2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}

/* Key Logic: - This solution solves the "Tiling Problem" using recursion.
              - Problem: Given a 2 x n board, count how many ways we can tile it using 2 x 1 tiles.
              - Each tile can be placed either:
                  - Vertically (occupying 1 column): this reduces the problem to size (n - 1)
                  - Horizontally (occupying 2 columns): this reduces the problem to size (n - 2)
              - So, the total number of ways to tile a 2 x n board is:
                  ways(n) = ways(n - 1) + ways(n - 2)

              - Base Cases:
                  - n == 0 → 1 way (empty board)
                  - n == 1 → 1 way (one vertical tile)

              - This is identical in structure to computing the nth Fibonacci number. */
