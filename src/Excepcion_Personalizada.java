
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia Rayo
 */


/*
creacion de una exception personalizada
en la cual consiste en que si el resultado de la operacion de division es igual a un numero par tirara error





*/
public class Excepcion_Personalizada {
    
    
    public static void main(String[] args){
    int n1,n2;
       
   
    n1=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el valor para realizar la division"));
    n2=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el segundo valor para realizar la division"));
   try{ 
    division(n1,n2);

   }catch(DividirParException e){
       System.out.print("la division da un nuermo par");
   }
    }
    


public static void division(int N1, int N2) throws DividirParException {

    if(N1%N2==0){
        throw new DividirParException("La division es Par");

}
else{
        JOptionPane.showMessageDialog(null,"el resultado es un numero no par");

}
}

}


class DividirParException extends  Exception {// exception personalizada en caso que la division sea par
    public DividirParException(){
    }
    public DividirParException(String dato){
        super(dato);
    
    }

}
