import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class LCDTester {
    
    public static void main(String[] args) {

        // Establece los segmentos de cada numero
        List<String> listaComando = new ArrayList<>();
        String comando;
        int espacioDig;
        Scanner lector = new Scanner(System.in);
        try {

             
              
                do
                {
                    
                    System.out.print("Entrada: ");
                    comando = lector.next();
                    if(ImpresorLCD.isNumeric(comando)){
                    if(!comando.equalsIgnoreCase("0,0"))
                    {
                        listaComando.add(comando);
                    }
                    }else{
                        {
                    throw new IllegalArgumentException("Cadena " + comando
                            + " no es un entero");
                }
                    }
                }while (!comando.equalsIgnoreCase("0,0")); 
            

            ImpresorLCD impresorLCD = new ImpresorLCD();

            Iterator<String> iterator = listaComando.iterator();
            while (iterator.hasNext()) 
            {
                try 
                {
                    impresorLCD.procesar(iterator.next(), 1);
                } catch (Exception ex) 
                {
                    System.out.println("Error: "+ex.getMessage());
                }
            }
        } catch (Exception ex) 
        {
            System.out.println("Error: "+ex.getMessage());
        }

    }

}
