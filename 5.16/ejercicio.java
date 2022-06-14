import java.util.Scanner;

public class ejercicio{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int n[]=new int[5];
        int p=1;

        for(int x=0; x<5; x++ ){
                System.out.print("Ingrese un entero: ");
                n[x]=input.nextInt();
        }

         for(int y=0; y<5; y++ ){
             System.out.print(n[y]+": ");
            for( int z=1; z<=n[y]; z++ ){
                System.out.print("*");
            } 
            System.out.println("");   
        }

    }
}