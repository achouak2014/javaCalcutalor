import java.util.Scanner ; 
public class Calculator {
    public static int add(int x,int y){
        return x+y ; 
    }
    public static int sub(int x,int y){
        return x-y ; 
    }
    public static int mul(int x,int y){
        return x*y ; 
    }
    public static float div(int x,int y){
       if(y !=0){
           return x/y ; 
       }
        return 0 ; 
    }
   
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Entrer le premier nombre ");
        int nbr1 = scan.nextInt();
        System.out.println("Entrer le deuxieme nombre ");
        int nbr2 = scan.nextInt();
        System.out.println("la somme : " +add(nbr1,nbr2));
        System.out.println("la soustraction : " +sub(nbr1,nbr2));
        System.out.println("la multiplication : " +mul(nbr1,nbr2));
        System.out.println("la division : " +div(nbr1,nbr2));

     }

   
}

