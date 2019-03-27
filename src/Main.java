/*
SaraZavala 18893
Estructura de Datos
Priority Queue
Sistema de atención de pacientes
29 de Marzo de 2019
*/

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {

        VectorHeap<Paciente> pacienteVectorHeap = new VectorHeap<Paciente>();
        PriorityQueue<Paciente> pacientePriorityQueue = new PriorityQueue<Paciente>();


        Scanner teclado = new Scanner(System.in);


        System.out.println("Elija una manera de priorizar");
        System.out.println("1. VectorHeap");
        System.out.println("2. Priority Queue");
        String opcion = teclado.nextLine();

        if (opcion.equals("1")){
            try {
                FileReader fr = new FileReader("pacientes.txt");
                BufferedReader br = new BufferedReader(fr);

                String linea = "";
                System.out.println("Los pacientes se atenderan en este orden, debido a su prioridad");
                while((linea = br.readLine()) != null) {
                    String[] parts = linea.split(",");
                    String nombreL = parts[0]; // 123
                    String enfermedadL= parts[1]; // 654321
                    String categoriaL= parts[2];//

                    pacienteVectorHeap.add(new Paciente(nombreL,enfermedadL,categoriaL));
                   // System.out.println(pacienteVectorHeap);
                    //System.out.println("=====================================================");
                    //System.out.println("=====================================================");
                }
                while (pacienteVectorHeap.size()>0){

                    System.out.println(pacienteVectorHeap.remove());
                }
                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
            }
        }

        else if (opcion.equals("2")){
            try {
                FileReader fr = new FileReader("pacientes.txt");
                BufferedReader br = new BufferedReader(fr);

                String linea = "";

                while((linea = br.readLine()) != null) {
                    String[] parts = linea.split(",");
                    String nombreL = parts[0]; //
                    String enfermedadL= parts[1]; //
                    String categoriaL= parts[2];//
                    //S

                    pacientePriorityQueue.add(new Paciente(nombreL,enfermedadL,categoriaL));

                    while (pacientePriorityQueue.size()>0){

                        System.out.println(pacientePriorityQueue.remove());
                    }



                }

                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
            }

        }









    }
}