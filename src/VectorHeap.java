/*
SaraZavala 18893
Estructura de Datos
Priority Queue
Sistema de atención de pacientes
29 de Marzo de 2019
*/
//Referencias al final

import java.util.Vector;


/**
 * Clase VectorHeap que utiliza Comparable y PriorityQueue
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>{

    /**
     * Vector generico llamado data
     */
    protected Vector<E> data; // the data, kept in heap order

    /**
     * Constructor del VectorHeap
     */
    public VectorHeap() {
        data = new Vector<E>();
    }

    /**
     * Add method
     * @param value
     */
    public void add(E value)
    // pre: value is non-null comparable
    // post: value is added to priority queue
    {
        data.add(value);
        percolateUp(data.size()-1);
    }


    /**VectorHeap
     * @param v
     */
    public VectorHeap(Vector<E> v)
    // post: constructs a new priority queue from an unordered vector
    {
        int i;
        data = new Vector<E>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++)
        { // add elements to heap
            add(v.get(i));
        }
    }

    /**
     * Int Parent
     * @param i
     * @return
     */
    protected static int parent(int i)
    // pre: 0 <= i < size
    // post: returns parent of node at location i
    {
        return (i-1)/2;
    }

    /**
     * int Left index from the selected
     * @param i
     * @return
     */
    protected static int left(int i)
    // pre: 0 <= i < size
    // post: returns index of left child of node at location i
    {
        return 2*i+1;
    }

    /**
     * Right int: index from child selected
     * @param i
     * @return
     */
    protected static int right(int i)
    // pre: 0 <= i < size
    // post: returns index of right child of node at location i
    {
        return 2*(i+1);
    }

    /**Moves node at index leaf up to appropriate position
     * @param leaf
     */
    protected void percolateUp(int leaf)
// pre: 0 <= leaf < size
// post: moves node at index leaf up to appropriate position
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 &&
                (value.compareTo(data.get(parent)) < 0))
        {
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }

    /**
     * moves node at index root down
     * to appropriate position in subtree
     * @param root
     */
    protected void pushDownRoot(int root)
    // pre: 0 <= root < size
    // post: moves node at index root down
    // to appropriate position in subtree
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos+1)).compareTo
                                (data.get(childpos)) < 0))
                {
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if ((data.get(childpos)).compareTo
                        (value) < 0)
                {
                    data.set(root,data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root,value);
                    return;
                }
            } else { // at a leaf! insert and halt
                data.set(root,value);
                return;
            }
        }
    }


    /**
     * Gets the first object from the vector
     * @return
     */
    @Override
    public E getFirst() {
        return data.get(0);
    }

    /**
     * Convert to a String to show it
     * @return
     */
    @Override
    public String toString() {
        return "VectorHeap{" +
                "data=" + data +
                '}';
    }

    /**
     * Returns true if the vector is empty, else False
     * @return
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Returns the size (quantity) of our vector
     * @return
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Not used
     */
    @Override
    public void clear() {

    }

    /**
     * Take out something from our Vector
     * @return
     */
    public E remove()
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue
    {
        E minVal = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }
}
/*
Este codigo fue tomado y modificado de acuerdo a las necesidades de
esta hoja. Fue extraido del libro utilizado en clase. Java Structures
Java Structures, Duane A. Bailey,Williams College (September 2007)
* */


