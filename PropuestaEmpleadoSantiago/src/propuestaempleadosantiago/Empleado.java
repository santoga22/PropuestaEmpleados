/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestaempleadosantiago;

/**
 *
 * @author USUARIO
 */
public class Empleado {
 
    public int idEmpleado;
    public String nameEmpleado;
    

    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNameEmpleado() {
        return nameEmpleado;
    }

    public void setNameEmpleado(String nameEmpleado) {
        this.nameEmpleado = nameEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nameEmpleado=" + nameEmpleado + '}';
    }
    
    
}

