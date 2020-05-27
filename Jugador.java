public class jugador {
    
    public jugador(String nombre, String ine, String direccion) {
        super(nombre, ine, direccion);
    }
    
    String puesto;

    public Jugador(String puesto, String nombre, String ine, String direccion) {
        super(nombre, ine, direccion);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void mostrardatos(){
        System.out.println("Tu nombre es:"+nombre+"\nTu direccion es: "+direccion+"\nTu ine es: "+ine+"\nTu puesto es: "+puesto);
    }
}
