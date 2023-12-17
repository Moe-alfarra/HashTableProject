
/**
 * The class LinkedList implements a singly linked list of strings.
 * The list uses a header (dummy) node.
 *
 * @author Mohammed Alfarra, 6368950, U02
 */
public class LinkedList
{
    /**
     * Implements the node of a singly linked list of string type.
     */
    private class Node
    {
        private String info;
        private Node next;

        public Node()
        {
            info = "<empty>";
            next = null;
        }

        public String getInfo()
        {
            return info;
        }

        public Node getNext()
        {
            return next;
        }

        public void setInfo(String info)
        {
            this.info = info;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }

    private final Node first; //dummy header node

    /**
     * Default constructor. Sets this object as an empty list.
     */
    public LinkedList()
    {
        first = new Node();
    }

    /**
     * Adds given string as the first element of the list.
     *
     * @param str given string
     */
    public void add(String str)
    {
        // From Prog13_01
        Node p = new Node();

        p.setInfo(str);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    /**
     * Determines if linked list is empty.
     *
     * @return true if list contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {
        // From Prog13_01
        return (first.getNext() == null);
    }

    /**
     * Removes given string from the list.
     *
     * @param str string to be removed
     */
    public void remove(String str)
    {
        // From Prog13_01
        Node old = first.getNext(),
                p = first;

        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo().equalsIgnoreCase(str)) {
                found = true;
            }
            else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    /**
     * Determines if given string is in the list.
     *
     * @param str given string
     * @return true if str is in the list, false otherwise
     */
    public boolean search(String str)
    {
        // From Prog13_01
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo().equalsIgnoreCase(str)) {
                return true;
            }
            current =current.getNext();
        }
        return false;
    }

    /**
     * Constructs a String description of the list.
     *
     * @return String containing the list elements.
     */
    public String toString()
    {
        Node current = first.getNext();

        String str = "";
        while (current != null)
        {
            str += "[" + current.getInfo() + "]";
            current = current.getNext();

            if (current != null)
                str += " -> ";
        }

        return str;
    }
}