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

        //Se crean el vectorHeap y el queue para hacer los dos diferentes procesos
        //Ambos contienen pacientes
        VectorHeap<Paciente> pacienteVectorHeap = new VectorHeap<Paciente>();
        PriorityQueue<Paciente> pacientePriorityQueue = new PriorityQueue<Paciente>();

        //Scanner teclado
        Scanner teclado = new Scanner(System.in);

        //Se da a elegir al usuario la manera para priorizar a los pacientes
        System.out.println("Elija una manera de priorizar");
        System.out.println("1. VectorHeap");
        System.out.println("2. Priority Queue");
        String opcion = teclado.nextLine();

        //Opcion 1 Vector Heap
        if (opcion.equals("1")){
            try {
                //Se lee el documento pacientes que se encuentra en el proyecto
                FileReader fr = new FileReader("pacientes.txt");
                BufferedReader br = new BufferedReader(fr);
                //String linea
                String linea = "";
                System.out.println("Los pacientes se atenderan en este orden, debido a su prioridad");
                while((linea = br.readLine()) != null) { //mientras existan lineas
                    String[] parts = linea.split(","); // Se va a crear una lista de Strings y se van a splitear por las comas
                    String nombreL = parts[0]; // La parte 0 decada linea va a ser el nombre de los pacientes
                    String enfermedadL= parts[1]; // La parte 1 de la lista va a ser la enfermedad de cada uno
                    String categoriaL= parts[2];// La parte 2 que s la que nos interesa va a ser la categoria a comparar

                    //Se agrega el paceinte a nuestro VecotrHeap
                    pacienteVectorHeap.add(new Paciente(nombreL,enfermedadL,categoriaL));
                   // System.out.println(pacienteVectorHeap);
                    //System.out.println("=====================================================");
                    //System.out.println("=====================================================");
                }
                while (pacienteVectorHeap.size()>0){
                    //Se va a ir removiendo conforme a prioridad
                    System.out.println(pacienteVectorHeap.remove());

                }
                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
            }
        }

        //OPcion 2: PriorityQueue
        else if (opcion.equals("2")){
            try {
                //Se lee el documento
                FileReader fr = new FileReader("pacientes.txt");
                BufferedReader br = new BufferedReader(fr);

                String linea = "";
                //Mientras exisata algo en cada lina
                while((linea = br.readLine()) != null) {
                    String[] parts = linea.split(",");
                    String nombreL = parts[0]; //
                    String enfermedadL= parts[1]; //
                    String categoriaL= parts[2];//
                    //S
                    //Se va a agregar a nuestro PriorityQueue
                    pacientePriorityQueue.add(new Paciente(nombreL,enfermedadL,categoriaL));

                }
                while (pacientePriorityQueue.size()>0){
                    System.out.println(pacientePriorityQueue.remove());
                    //Imprimir en orden que se elimina
                }

                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
            }

        }
        //Si ingresa opcion invalida
        else{
            System.out.println("Opcion no válida");
        }









    }
}