import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        ArrayList<Integer> arrayList = tree_level.printLevelOrder();
        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i));
        }
        System.out.println();
        System.out.println(tree_level.height(tree_level.getRoot()));
    }
}
