import java.util.Scanner;

public class ejercicio{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        int x=0, z=0, km=0, l=0, tkm=0, tl=0;
        float calculo;

         while (x==0){
             z++;
            System.out.print("Ingrese los kilometros del viaje N."+z+" : ");
            km=input.nextInt();

            System.out.print("Ingrese los litros consumidos del viaje N."+z+" : ");
            l=input.nextInt();

            tkm=tkm+km;
            tl=tl+l;

            System.out.print("Desea continuar ingresando viajes?  Si(0) | No(1): ");
            x=input.nextInt();
         }

         calculo=tkm/tl;
         System.out.print("En promedio se recorren "+ calculo+ " kilometros por cada litro de combustible");

    }

}
