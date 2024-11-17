package propuestaempleadosantiago;

public class PropuestaEmpleadoSantiago {

    public static void main(String[] args) {
        // Entrada de datos precargados de los empleados
        
        Empleado Id1 = new Empleado();
        Empleado Id2 = new Empleado();
        Empleado Id3 = new Empleado();
        Empleado Id4 = new Empleado();
        Empleado name1 = new Empleado();
        Empleado name2 = new Empleado();
        Empleado name3 = new Empleado();
        Empleado name4 = new Empleado();
        Id1.idEmpleado = 13227182;
        Id2.idEmpleado = 48281034;
        Id3.idEmpleado = 73912042;
        Id4.idEmpleado = 94812023;
        name1.nameEmpleado = "Roberto Gomez";
        name2.nameEmpleado = "Martha Martinez";
        name3.nameEmpleado = "Marco Sanchez";
        name4.nameEmpleado = "Bryan Lopez";
        
        
        System.out.println("Empleado #1; "+ name1.nameEmpleado + " " + Id1.idEmpleado );
        System.out.println("Empleado #2; "+ name2.nameEmpleado +" " + Id2.idEmpleado );
        System.out.println("Empleado #3; "+ name3.nameEmpleado +" " + Id3.idEmpleado );
        System.out.println("Empleado #4; "+ name4.nameEmpleado +" " + Id4.idEmpleado );

    }

}
