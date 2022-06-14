import java.util.Scanner;

public class ejercicio{


    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int cuenta, saldoi, cargos, credito, lim, saldo;
        System.out.print("Ingrese el numero de cuenta: ");
        cuenta=input.nextInt();
        System.out.print("Ingrese el saldo inicial: ");
        saldoi=input.nextInt();
        System.out.print("Ingrese los cargos: ");
        cargos=input.nextInt();
        System.out.print("Ingrese el credito: ");
        credito=input.nextInt();
        System.out.print("Ingrese el limite de credito: ");
        lim=input.nextInt();

        saldo=saldoi+cargos-credito;
        System.out.print("El nuevo saldo es de: L."+saldo);
        if( saldo>lim){
            System.out.printf("%nSe excedio el limite de su credito");
        }


    }
}
