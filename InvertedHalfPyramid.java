public class InvertedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        
    }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(7);
    }
}
