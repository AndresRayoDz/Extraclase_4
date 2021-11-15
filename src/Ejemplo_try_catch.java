
import javax.swing.JOptionPane;


  /* En este ejemplo se accede a un fichero pero se utilizara el try catch para capturar el errror
en el caso de que el archivo no se encuentre en la ubicacion dada

 exiten dos errores donde uno se debe capturar que es el IOexception y el runtimexception que no es 
obligatorio capturarlo
    

*/
public class Ejemplo_try_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hilera;
        int resultado;
        hilera=JOptionPane.showInputDialog("Por favor increse el dato String para convertirlo a entero");
       try{ // se lanza la excepcion del metodo y si el dato a convertir no es numerico se captura el error y se ejecuta el catch
        resultado=conversion_entero.conversion(hilera);
        JOptionPane.showMessageDialog(null, resultado );
       }catch(NumberFormatException e){
       System.out.print("el dato no es un numero");
       }
   
    }
    
}

class conversion_entero{

    public static int conversion(String dato) throws NumberFormatException {// se crea un metodo para convertir un dato numerico string a int
    // se crea un mentodo static y se lanza(throws) una excepcion para ser capturada cuando el metodo se llame    
      int resultado=Integer.parseInt(dato);
        return resultado;
    
   }

}




