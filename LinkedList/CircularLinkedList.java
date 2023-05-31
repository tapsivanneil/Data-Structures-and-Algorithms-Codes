package rlv.dcit25.ds;

import java.util.Iterator;

/**
 *
 * @author Russel L. Villacarlos
 */
public class CircularLinkedList<E> implements List<E> {

    private class Node {
        E value;
        Node next;
        Node prev;
    }

    Node head;
    int size;
    Node finger;
    int fingerIndex = 0;

    public CircularLinkedList() {
        this.head = new Node();
        this.head.next = head;
        this.head.prev = head;
        this.finger = head;
        this.size = 0;
    }

    public void add(int index, E value) {
        Node cur = (index == size) ? head : getNodeAt(index);
        Node newNode = new Node();
        newNode.value = value;
        newNode.prev = cur.prev;
        newNode.next = cur;
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        finger = newNode;
        fingerIndex = index;
        this.size++;
    }

    public void add(E value) {
        add(size, value);
    }

    public E remove(int index) {
        Node toRemove = getNodeAt(index);
        toRemove.prev.next = toRemove.next;
        toRemove.next.prev = toRemove.prev;

        if(index == 0){
            this.finger = head;
            finger.value = null;
            fingerIndex = -1;
        }
        
        else{
            this.finger = toRemove.next;
            finger.value = toRemove.prev.value;
            fingerIndex = index -1;
        }

        toRemove.prev = null;
        toRemove.next = null;
        return toRemove.value;
    }

    public boolean remove(E value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    public int indexOf(E value) {
        Node itr = this.head.next;
        int i = 0;
        while (itr != head) {
            if (itr.value.equals(value)) {
                finger = itr;
                fingerIndex = i;
                return i;
            }
    
            itr = itr.next;
            i++;
        }
        return -1;
    }

    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    public E get(int index) {
        finger = getNodeAt(index);
        fingerIndex = index;
        return getNodeAt(index).value;
    }

    public E set(int index, E value) {
        Node cur = getNodeAt(index);
        E oldValue = cur.value;
        cur.value = value;
        finger = cur;
        fingerIndex = index;
        return oldValue;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
        this.head.next = head;
        this.head.prev = head;
        finger = head;
        fingerIndex = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int indexOfBookmark(){
        if(contains(getBookmark())){
            return indexOf(getBookmark());
        }
        else{
           return -1;
        }
    }

    public E getBookmark(){
        
        if(finger.value != null){
            return finger.value;
        }
        else{
           finger.value = null;
           return finger.value;
        }
        
    }
    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder("[");

        for (Node cur = head.next; cur != head; cur = cur.next) {
            tmp.append(cur.value).append(", ");
        }

        if (tmp.length() > 1) {
            tmp = tmp.delete(tmp.length() - 2, tmp.length());
        }

        return tmp.append("]").toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node cur = head;

            @Override
            public boolean hasNext() {
                return cur.next != head;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException();
                }
                cur = cur.next;
                return cur.value;
            }
        };
    }

    private Node getNodeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node itr = this.head;
        for (int i = 0; i <= index; i++) {
            itr = itr.next;
        }

        return itr;
    }
}
