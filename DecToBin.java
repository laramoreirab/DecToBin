import java.util.Scanner;
public class DecToBin
{
    public static void main (String [] args)
    {
        long D, resto;
        Scanner scan = new Scanner (System.in);
        D = scan.nextLong();
        if (D==0){
            System.out.print("0\n");
        }
        else if (D == 1){
            System.out.print("1\n");
        }
        else if (D == -1){
            System.out.print("-1\n");
        }
        else if (D>0){
            StringBuilder binaryString = new StringBuilder();
            while (D>=1){
                resto = D%2;
                binaryString.append(resto);
                D=D/2;
            }
            System.out.println(binaryString.reverse().toString());
        }
        else if (D<0){
            D = -1 * D;
            StringBuilder binaryString = new StringBuilder();
            while (D>=1){
                resto = D%2;
                binaryString.append(resto);
                D=D/2;
            }
            System.out.println("-" + binaryString.reverse().toString());
        }
    }
}