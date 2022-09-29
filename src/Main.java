public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        client.setEdad(18);
        client.setNombre("Verito");
        client.setTelefono(7654321);
        client.setCredito("Vehicular");
        System.out.println("Nombre de cliente: "+client.getNombre());
        System.out.println("Edad: "+client.getEdad());
        System.out.println("Telefono: "+client.getTelefono());
        System.out.println("Credito: "+client.getCredito());
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Eduardo Marino");
        trabajador1.setEdad(33);
        trabajador1.setTelefono(123423422);
        trabajador1.setSalario(800);
        System.out.println("Nombre de Trabajador: "+trabajador1.getNombre());
        System.out.println("Edad: "+trabajador1.getEdad());
        System.out.println("Telefono: "+trabajador1.getTelefono());
        System.out.println("Salario: "+trabajador1.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}

