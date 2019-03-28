/*
Sara Zavala 18893
Estructura de Datos
Priority Queue
Sistema de atención de pacientes
29 de Marzo de 2019
*/

//Codigo tomado de Libro de texto utilizado en clase. JavaStructures

//Referencias al final
public interface PriorityQueue<E extends Comparable<E>>
{
    public E getFirst();

    // pre: !isEmpty()
    // post: returns the minimum value   in priority queue

    public E remove();
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue

    public void add(E value);
    // pre: value is non-null comparable
    // post: value is added to priority queue

    public boolean isEmpty();
    // post: returns true iff no elements are in queue

    public int size();
    // post: returns number of elements within queue

    public void clear();
    // post: removes all elements from queue
}
/*
Este codigo fue tomado y modificado de acuerdo a las necesidades de
esta hoja. Fue extraido del libro utilizado en clase. Java Structures
Java Structures, Duane A. Bailey,Williams College (September 2007)
* */