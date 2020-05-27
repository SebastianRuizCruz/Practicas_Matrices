public class persona {
    
    //atributos
    String nombre;
    String ine;
    String direccion;

    //contructor
    public Persona(String nombre, String ine, String direccion) {
        this.nombre = nombre;
        this.ine = ine;
        this.direccion = direccion;
    }
    
    // Get

    public String getNombre() {
        return nombre;
    }

    public String getIne() {
        return ine;
    }

    public String getDireccion() {
        return direccion;
    }
    //Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Mostrar datos
    
    public void datos(){
        
        System.out.println("Tu nombre es:"+nombre+"\nTu direccion es: "+direccion+"\nTu ine es: "+ine+"");
    }
}
