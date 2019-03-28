import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class VectorHeapTest {

    @Test
    public void addTest(){
        VectorHeap<Paciente> data = new VectorHeap<Paciente>();
        Paciente nuevo = new Paciente("Sara Zavala","Asma","A");
        data.add(nuevo);
        System.out.println(nuevo.toString());
    }

    @Test
    public void removeTest(){
        VectorHeap<Paciente> data = new VectorHeap<Paciente>();
        Paciente nuevo = new Paciente("Sara Zavala","Asma","C");
        Paciente nuevo1 = new Paciente("Gerardo Pineda","Piel rojita","E");
        Paciente nuevo2 = new Paciente("Juan","corazon roto","A");
        Paciente nuevo3 = new Paciente("Gerardio","lol","D");
        data.add(nuevo);
        data.add(nuevo1);
        data.add(nuevo2);
        data.add(nuevo3);
        System.out.println(data);
        System.out.println("-------------------------------------");
        data.remove();
        System.out.println("-------------------------------------");
        System.out.println(data);

    }

    public void Test3(){

    }

}