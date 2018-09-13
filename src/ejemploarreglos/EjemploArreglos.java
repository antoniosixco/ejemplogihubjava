package ejemploarreglos;

/**
 *
 * @author Antonio
 */
public class EjemploArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] edades = new int[6];
        String grupo[] = new String[4];
         edades[0] = 23;
        edades[1] = 23;
        edades[2] = 54;
        edades[3] = 96;
        edades[4] = 13;
        edades[5] = 17;
    
        
        grupo[0] = "jhon";
        grupo[1] = "Paul";
        grupo[2] = "George";
        grupo[3] = "Ringo";
        
        for(int i=0; i<6; i++){
            System.out.println("edad # " + (i + 1) + " = " + edades[i] + "años");
        }
        
        System.out.println("");
        for(int i=0; i<4; i++){
            System.out.println("Artistas # " + (i + 1) + " = " + grupo[i]);
        }
    }
    
}
