package Empleado;

public class Tecnico extends Operario{
    public Tecnico(){
        super();
    }
    
    public Tecnico(String nombre){
        super(nombre);
        
    }
    
    @Override
    public String retornarNombre(){
        return super.retornarNombre() +" ->" + " Tecnico";
    }
    
    
}

