package tech.marzoog;

public class BinarySearchTree <T extends Comparable<T>> {
     Node root;

    public boolean addNode(T date){
        if(root == null){
            Node<T> node = new Node<>(date);
            root = node;
            return true;
        }
        else{
           return addNode(root, date);
        }
    }

    private boolean addNode(Node root, T data){
        if(root.data.compareTo(data) > 0){
            if(root.left == null){
                Node<T> node= new Node<>(data);
                root.left = node;
                return true;
            }
            addNode(root.left, data);
        }
        else if(root.data.compareTo(data) < 0){
            if(root.right == null){
                Node<T> node = new Node<>(data);
                root.right = node;
                return true;
            }
            addNode(root.right, data);
        }
        return false;
    }

    public Node search(T data){
        return search(root, data);
    }

    private Node search(Node root, T data){
        if(root == null){
            System.out.printf("%s is not found.%n", data.toString());
            return null;
        }
        else if(root.data.compareTo(data) == 0)
            return root;
        else if(root.data.compareTo(data) < 0)
            return search(root.left, data);
        else
            return search(root.right, data);
    }

}


