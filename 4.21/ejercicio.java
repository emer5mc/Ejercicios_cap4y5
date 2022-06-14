import java.util.Scanner;

public class ejercicio{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int n[]=new int[10];
        int nx=0, mayor=0, z=1;

        for (int x=0; x<10; x++){
            System.out.print("Ingrese el entero #"+z+ ": ");
            n[x]=input.nextInt();
            z++;
            if (n[x]>mayor){
                mayor=n[x];
            }
            nx=n[x];
        }

        System.out.println("El entero mayor es "+mayor);
        System.out.print("El ultimo entero que ingreso fue "+nx);
    }
}
