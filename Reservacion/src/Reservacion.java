import java.util.Scanner;

class EspacioRecreacional {
    String nombre;
    String tipo;
    int capacidad;
    boolean disponibilidad;
    String horariosDisponibles;

    public EspacioRecreacional(String nombre, String tipo, int capacidad, String horariosDisponibles) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horariosDisponibles = horariosDisponibles;
    }

    public void reservar(int horario, String horariosDisponibles) {
        switch (horario) {
            case 1:
                this.horariosDisponibles = "";
                System.out.println("Reserva del espacio recreativo realizada.");
                break;

            default:
                break;
        }
    }

    public void mostrarDisponibilidad() {
        if (disponibilidad) {
            System.out.println("Hay disponibilidad");
        } else {
            System.out.println("No hay disponibilidad");
        }
    }

}

class Estudiante {
    String nombreEstudiante;
    int idEstudiante;

    public Estudiante(String nombreEstudiante, int idEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
    }

}

class Cancha extends EspacioRecreacional {

    public Cancha(String nombre, String tipo, int capacidad, String horariosDisponibles) {
        super(nombre, tipo, capacidad, horariosDisponibles);
    }
}

class SalasDeJuegos extends EspacioRecreacional {

    public SalasDeJuegos(String nombre, String tipo, int capacidad, String horariosDisponibles) {
        super(nombre, tipo, capacidad, horariosDisponibles);
    }
}

class GestionRecreacional extends EspacioRecreacional {

    public GestionRecreacional(String nombre, String tipo, int capacidad, String horariosDisponibles) {
        super(nombre, tipo, capacidad, horariosDisponibles);
    }
}

public class Reservacion {
    private static Scanner scanner = new Scanner(System.in);
    private static Cancha[] canchas;
    private static SalasDeJuegos[] salas;

    public static void main(String[] args) throws Exception {

        canchas = new Cancha[] {
                new Cancha("La bombonera", "Cancha", 20, "Lunes 18:00 - 20:00"),

        };
        salas = new SalasDeJuegos[] {
                new SalasDeJuegos("Game Zone", "Salas de Juegos", 20, "Martes 18:00 - 20:00"),

        };
    }

}
