public class Pattern1 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
           {
               System.out.print(" ");
           }
            for(int k=5;k>=i;k--)
            {
                System.out.print(""+k);
            }
            System.out.println();
        }
    }
    
}
Output :
     5
    54
   543
  5432
 54321
