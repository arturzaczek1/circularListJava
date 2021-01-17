package org.example;

import java.util.Objects;

public class Node {

    private int value1;
    private int value2;
    private Node next;

    /**
     * Konstruktor przyjmujacy wszystkie argumenty
     * @param value1 wspolczynnik
     * @param value2 wykladnik potegi
     * @param next nastepny element w liscie
     */
    public Node(int value1, int value2, Node next){
        this.value1 = value1;
        this.value2 = value2;
        this.next = next;
    }

    public void setNext (Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    /**
     * metoda generuje stringa reprezentujacego mian-element wielomianu w czytelnym formacie
     * @return string w formacie +value1 X:pow value2
     */
    public String generatePolynomial() {
        String znak = value2 == 0 ? "" : "X";
        String result = "";

        result = value1 + " ";
        if (!znak.isEmpty()) {
            result = value1 + znak + ":pow" + value2 + " ";
        }
        if (value1 > 0) {
            result = "+" + result;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return value1 == node.value1 &&
                value2 == node.value2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
