public class TilingProblem {

    public static int tilingProblem(int n) { //2 * n (flor sixe)
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWaya = fnm1 + fnm2;
        return totWaya;
    }
    public static void main(String args[]) {
        System.out.println(tilingProblem(4));

    }
}
