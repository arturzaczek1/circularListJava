package org.example;

public class CircularList {
    public Node head = null;

    /**
     * Konstruktor ktory ustawia pierwszy element
     */
    public CircularList() {
//        System.out.println("wywolanie konstruktora i ustawienie noda na siebie samego");
        head = new Node(0, -1, null);
        head.setNext(head);
    }

    /**
     * metoda dodajaca nowy element do listy
     *
     * @param value1 - wspolczynnik
     * @param value2 - wykladnik potegi
     */
    public void add(int value1, int value2) {
        if (head == null) {
            head = new Node(value1, value2, null);
            head.setNext(head);
        }
        Node current = head.getNext();
        if (head.getNext() == head) {
//            System.out.println("lista jest pusta z add()");
        } else {
            while (!(current.getNext() == (head))) {
                current = current.getNext();
            }
        }
//        System.out.println("ostatni node: " + current);
        Node newNode = new Node(value1, value2, head);
        current.setNext(newNode);
    }

    /**
     * usuwa ostatni element listy
     */
    public void deleteLast() {
        if (head == null) {
            System.out.println("lista nieprawidlowo zainicjalizowana");
            return;
        }
        Node last = getLast();
        Node current = head.getNext();
        {
            while (!(current.getNext() == (last))) {
                current = current.getNext();
            }
        }
        current.setNext(head);
    }

    /**
     * wyświetla ostatni element na liscie
     */
    public void displayLast() {
        Node current = head;
        if (head.getNext() == head) {
            System.out.println("lista jest pusta 12");
        } else {
            while (!(current.getNext() == (head))) {
                current = current.getNext();
            }
        }
        System.out.println("ostatni node: " + current);
    }

    /**
     * metoda zwroca ostatni element na liscie
     *
     * @return Node - ostatni w liscie
     */
    public Node getLast() {
        Node current = head;
        if (head.getNext() == head) {
            System.out.println("lista jest pusta");
        } else {
            while (!(current.getNext() == (head))) {
                current = current.getNext();
            }
        }
        return current;
    }

    /**
     * wyświetla liste elemetnow znajdujacych sie w liscie
     */
    public void display() {
        Node current = head;
        System.out.println();
        System.out.println("Nodes of the CircularList: ");
        do {
            System.out.println(current.toString());
            current = current.getNext();
        } while (current != head);
    }

    /**
     * wyświetla ciag wielomianu w czytelnym formacie
     */
    public void displayPolynomial (){
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        do {
            stringBuilder.append(current.generatePolynomial());
            current = current.getNext();
        } while (current != head);
        System.out.println(stringBuilder.toString());
    }
}
