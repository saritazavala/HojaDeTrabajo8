/*
Sara Zavala 18893
Estructura de Datos
Priority Queue
Sistema de atención de pacientes
29 de Marzo de 2019
*/

public class Paciente implements Comparable<Paciente> {

    //Atributos
    String nombre = "";
    String enfermedad = "";
    String categoria = "";

    Paciente(){
        nombre = "";
        enfermedad = "";
        categoria = "";
    }

    public Paciente(String nombre, String enfermedad, String categoria) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.categoria = categoria;
    }

    //Sets y gets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Compare To para comparar el tipo de categoria de nuestros pacientes
    @Override
    public int compareTo(Paciente o) {
        return categoria.compareTo(o.categoria);
    }

    //To String para imprimir todo en orden
    @Override
    public String toString() {
        return "Paciente:" +
                "Nombre'" +'\''+ nombre + '\'' +
                ", Enfermedad'" + enfermedad + '\'' +
                ", Categoria'" + categoria + '\'' ;
    }
}
