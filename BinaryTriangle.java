public class BinaryTriangle {
    public static void main(String[] args) {
        int num=0;
        int num1=1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                if ((i + j ) % 2== 0) {
                    System.out.print(num1);
                }
                else{
                    System.out.print(num);
                }

            }
            System.out.println();
        }
        
    }
    
}
