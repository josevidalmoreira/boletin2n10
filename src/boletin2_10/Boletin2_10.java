
package boletin2_10;
import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        float sf,k,d,v,sb,sl;
        System.out.println("teclea sueldo fijo:");
        sf=sc.nextFloat();
          System.out.println("teclea kilometros:");
            k=sc.nextFloat();
          System.out.println("teclea dias:");
        d=sc.nextFloat();
          System.out.println("teclea ventas:");
        v=sc.nextFloat();
        sb=sf+2*k+30*d+(v*5/100);
        sl=sb-(18*sb/100)-36;
        System.out.println("tu sueldo bruto es de "+sb+" euros y tu sueldo liquido e de  "+sl+" euros700");
    }
    
}
