# SegundoParcial
Segundo parcial programación I.

Contexto 4: Reservación de Espacios Recreacionales.

La universidad necesita un sistema para reservar espacios recreativos (como canchas deportivas). Se requiere:

1. Nombre de la app: Reservacion.

2. Clases: 
    - `Reservación`, es la clase principal donde, por medio de arreglos, se crean objetos a los cuales se les ingresan datos para llenar los atributos de las subclases.

    - `EspacioRecreacional`, con atributos como nombre (String); tipo cancha, sala de juegos, (String); capacidad (int); disponibilidad (boolean); horariosDisponibles (String).

    - `GestionRecreacional`,  que permita:
        - Registrar espacios.
        - Verificar la disponibilidad.
        - Cancelar reservas.

    - `Estudiante`, con atributos como nombre e ID.

3. Subclases:

    - `Cancha`, es una extension de la clase padre EspacioRecreacional, la cual obtiene los datos dependiendo de los atributos heredados

    - `SalasDeJuegos`, es una extension de la clase padre EspacioRecreacional, la cual obtiene los datos dependiendo de los atributos heredados.

Cada una con su respectivo constructor.

4. Métodos:

    - `reservar`: Con el parámetro horario, este permite reservar un espacio en un horario específico.

    - `mostrarDisponibilidad()`: Este muestra los horarios disponibles de los espacios recreacionales. Trabaja con un boolean el cual utiliza la variable disponibilidad, si es verdadero (hay disponibilidad) si es falso (no hay disponibilidad).

    - `reservarEspacio`: Con los parámetros EspacioRecreacional y horario, Permite al estudiante reservar un espacio. Este método trabaja con la clase estudiante, los arreglos de los objetos y el metodo mostrar disponibilidad, por medio de este los estudiantes reservan un tipo de espacio recreacional dependiendo de su disponbilidad de horario.
