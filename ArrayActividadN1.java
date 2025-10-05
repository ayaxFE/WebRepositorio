
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayActividadN1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random ramdom = new Random();

        for (int i = 1; i < 10; i++){
            lista.add(ramdom.nextInt(1000) + 1); 
        }    
        
        
        for(int i = 0; i < lista.size(); i++){
             System.out.println( "El número: " +  lista.get(i) + " esta en la posicion : " + i);
        }
        
        int max = lista.get(0);
        int min = lista.get(0);
        int posicionMax = 0;
        int posicionMin = 0;
        
        for(int i = 1; i < lista.size(); i++){
          int valor = lista.get(i);
          
          if (valor > max) {
                max = valor;
                posicionMax = i;
            }
            if (valor < min) {
                min = valor;
                posicionMin = i;
            }
        }

        System.out.println(" ");
        
        System.out.println("El número más alto: " + max + " en la posición: " + posicionMax);
        System.out.println("El número más bajo: " + min + " en la posición: " + posicionMin);

    }
}