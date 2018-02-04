import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alireza on 2/3/2018.
 */
public class BinaryTree {

    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTree(){
        root = null;
    }

    public int height(Node root){
        if (root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight>rightHeight){
            return leftHeight +1;
        }
        else{
            return  rightHeight +1;
        }
    }

    public ArrayList<Integer> printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        ArrayList<Integer> BFS = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            Node tmp = queue.poll();
            BFS.add(tmp.data);
            if(tmp.left != null){
                queue.add(tmp.left);
            }
            if(tmp.right != null){
                queue.add(tmp.right);
            }
        }
        return BFS;
    }
}
