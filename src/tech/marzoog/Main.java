package tech.marzoog;

public class Main {

    public static void main(String[] args) {
	    BinarySearchTree<Integer> numbers = new BinarySearchTree<>();

	    numbers.addNode(24);
	    numbers.addNode(3);
	    numbers.addNode(7);
	    numbers.addNode(33);
	    numbers.addNode(27);


	    BinarySearchTree<String> names = new BinarySearchTree<>();

	    names.addNode("Marzoog");
	    names.addNode("Ali");
	    names.addNode("Sami");
	    names.addNode("Fahad");

    }
}
