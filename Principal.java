public class principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int opc;
        System.out.println("¿Que eres? \n1.una persona \n2.jugador");
        opc=entrada.nextInt();
        
        switch(opc){
        
            case 1:
                entrada.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre= entrada.nextLine();
        
        System.out.println("Ingrese su direccion: ");
        String direccion= entrada.nextLine();
        
        System.out.println("Ingrese su ine: ");
        String ine = entrada.nextLine();
        
        Persona datos = new Persona(nombre, ine, direccion);
        datos.datos();
        break;
        
        case 2: 
        
         entrada.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su direccion: ");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese su ine: ");
        ine = entrada.nextLine();
        
            System.out.println("Hay varios puestos"
                    + "1.Base"
                    + "2.Escolta"
                    + "3.Alero"
                    + "4.Ala-pivot"
                    + "5.pivot");
        System.out.println("Ingrese su puesto: ");
        String puesto = entrada.nextLine();
        
        Jugador datos2 = new Jugador(puesto, nombre, ine, direccion);
        datos2.mostrardatos();
        
        break;
        }
    }
    
}
