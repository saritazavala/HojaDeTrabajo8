/*
SaraZavala 18893
Estructura de Datos
Priority Queue
Sistema de atención de pacientes
29 de Marzo de 2019
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        VectorHeap<Paciente> pacienteVectorHeap = new VectorHeap<Paciente>();

        try {
            FileReader fr = new FileReader("pacientes.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = "";

            while((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                String nombreL = parts[0]; // 123
                String enfermedadL= parts[1]; // 654321
                String categoriaL= parts[2];//

                pacienteVectorHeap.add(new Paciente(nombreL,enfermedadL,categoriaL));



            }


            fr.close();
        }
        catch(Exception e) {
            System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
        }
    }
}