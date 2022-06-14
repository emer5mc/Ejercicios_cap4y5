import java.util.Scanner;

public class ejercicio{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int n[]=new int[10];
        int mayor1=0, mayor2=0, z=1;

        for (int x=0; x<10; x++){
            System.out.print("Ingrese el entero #"+z+ ": ");
            n[x]=input.nextInt();
            z++;
            if (n[x]>mayor1){
                mayor1=n[x];
            }
        }
         for (int x=0; x<10; x++){
             if (n[x]>mayor2 && n[x]<mayor1){
                mayor2=n[x];
            }
         }

        System.out.println("El entero mayor es "+mayor1);
        System.out.println("El segundo entero mayor es "+mayor2);
    }
}