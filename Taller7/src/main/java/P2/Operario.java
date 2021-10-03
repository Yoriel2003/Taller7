
package Empleado;

public class Operario extends Empleado {
    
    public Operario(){
        super();
    }
  
    public Operario(String nombre){
        super(nombre);
    }

 
    
    @Override
   
    public String retornarNombre(){
        return super.retornarNombre() + " ->" + " Operario" ;
    }


    
}
