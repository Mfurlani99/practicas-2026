package ejemplos;

import java.util.Arrays;

public class ejemplo1 {

    public static void main(String[] args) {
        Integer n1 = 10;
        Integer n2 = 0;

        try {
            System.out.println("la division es : " + (n1 / n2) );
        } catch (Exception e){
            System.out.println(
               e.toString()
            );
        }

    }

}
