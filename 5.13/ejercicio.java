public class ejercicio{


    public static void main(String[] args){

        Long n=0L;

        System.out.println("1!= 1");
        for(int x=2; x<=20; x++ ){
            System.out.print(x+"!= ");
            n=Long.valueOf(x);
            for(int y=x-1; y>=1; y-- ){
                n=n*Long.valueOf(y);
            }
            System.out.println(n);
        }
    }
}
