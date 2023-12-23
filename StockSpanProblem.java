import java.util.*;
public class StockSpanProblem {

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);


        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevvHigh = s.peek();
                span[i] = i - prevvHigh;
            }

            s.push(i);
        }
    }
    public static void main(String args[]) {
        int Stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[Stocks.length];
        stockSpan(Stocks, span);

        for(int i=0; i<span.length; i++) {
            System.out.println(span[i]+" ");
        }
    }
}
