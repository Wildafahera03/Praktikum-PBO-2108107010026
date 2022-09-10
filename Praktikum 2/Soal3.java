import java.util.Scanner;

public class Soal3
{
    public static void main(String arg[]){
        for (int i=5; i>=0; i--)
        {
            for (int j=0; j<i; j++){
            System.out.print('*');
            }
            System.out.println();
        }
    }
} 