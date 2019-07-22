package tech.marzoog;

public class Node<T extends Comparable<T>> {
    T data;
    Node left;
    Node right;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return String.format("%s", data.toString());
    }
}
