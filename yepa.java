public class Perrera {
    private String nombre;
    private String localizacion;
    private Jaula[] jaulas;

    // Constructor de Perrera
    public Perrera(String nombre, String localizacion, Jaula[] jaulas) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.jaulas = jaulas;
    }

    // Métodos adicionales pueden agregarse aquí
}

public class Jaula {
    private int codigoJaula; 
    private String tamaño;
    private Perro perroEnJaula; 

    // Constructor de Jaula
    public Jaula(int codigoJaula, String tamaño, Perro perroEnJaula) {
        this.codigoJaula = codigoJaula;
        this.tamaño = tamaño;
        this.perroEnJaula = perroEnJaula;
    }

    // Constructor vacío
    public Jaula() {
        this.codigoJaula = 0;
        this.tamaño = "Desconocido";
        this.perroEnJaula = null;
    }

    // Métodos adicionales pueden agregarse aquí
}

public class Perro {
    private String nombre;
    private String raza;
    private String tamaño;

    // Constructor de Perro
    public Perro(String nombre, String tamaño, String raza) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.raza = raza;
    }

    // Métodos adicionales pueden agregarse aquí
}

public class Galgo extends Perro {
    // Constructor de Galgo
    public Galgo(String nombre, String tamaño) {
        super(nombre, tamaño, "Galgo");
    }
}

// Clase principal para instanciar los objetos
public class Main {
    public static void main(String[] args) {
        // Crear un Galgo
        Galgo galgo1 = new Galgo("Franco", "Grande");

        // Crear jaulas
        Jaula jaula1 = new Jaula(121, "Grande", galgo1);
        Jaula jaula2 = new Jaula();
        Jaula jaula3 = new Jaula();
        Jaula jaula4 = new Jaula();
        Jaula jaula5 = new Jaula();

        // Crear un arreglo de jaulas
        Jaula[] jaulas = {jaula1, jaula2, jaula3, jaula4, jaula5};

        // Crear una Perrera
        Perrera perrera1 = new Perrera("Perrera Central", "Madrid", jaulas);

        // Mensaje de éxito
        System.out.println("Perrera creada exitosamente.");
    }
}