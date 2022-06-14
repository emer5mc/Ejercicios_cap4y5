public class ejercicio{


    public static void main(String[] args){
        double pi=0, y=0;
        int n=2;

        for(int x=1; x<400000; x++ ){

            y=(double) x;
            if (x==1){
                pi=4;
            }else if (x==2){
                pi=pi-(4/x);
            }else{
                if (y%2 !=0){
                    pi=pi+(4/x);
                }

                if(pi!=3.14159){
                    n++;
                }
                }

       }
        System.out.println(" El valor aprox. de Pi es "+ pi+ " en el termino "+n); 


    }

}