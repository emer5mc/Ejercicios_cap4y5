import java.util.Scanner;

public class ejercicio{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String nom[]=new String[3];
        int horas[]=new int[3];
        int cuota[]=new int[3];
        int pago[]= new int[3];
        int x=0, z=1;

        for(x=0; x<3; x++ ){
            System.out.print("Ingrese el nombre del empleado "+z+ ": ");
            nom[x]=input.next();

            System.out.print("Ingrese las horas trabajadas del empleado "+z+ ": ");
            horas[x]=input.nextInt();

            System.out.print("Ingrese la cuota del empleado "+z+ ": ");
            cuota[x]=input.nextInt();

            z++;
            
            if (horas[x]>40){
                pago[x]=40*cuota[x]+(horas[x]-40)*(cuota[x]+(cuota[x]/2));
            }else{
                pago[x]=horas[x]*cuota[x];
            }

        }
        for(x=0; x<3; x++ ){
            System.out.println("El pago de "+ nom[x]+ " es de L."+pago[x]);
        }



    }
}
