
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia Rayo
 *///ejemplo donde se realiza la excepcion de la division por cero implementando el throws, el try y el finally
public class Ejemplo_final {
    public static void main(String[] args){
        int n1,n2;
        double resultado;
        n1=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el valor para realizar la division"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el segundo valor para realizar la division"));
        
          try {
              resultado=Operaciones.division(n1,n2);
            
 
            JOptionPane.showMessageDialog(null,resultado);
        } catch (Exception e) {
  
            System.out.println("la aplicacion fallo");
 
        }finally {
            System.out.println("se cierran los recursos");
 
        }
 
        System.out.println("la aplicacion finalizado");
 
    }
    
    
    }
    



class Operaciones {
    
    public static int suma(int N1, int N2){
        return N1+N2;
    }
   public static double division(int N1, int N2) throws Exception{// division por cero se lanza una exception
       return N1/N2;
   
   }
}
