import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class BST {
    // root node? init variable?
    Node root;

    // constructor, init empty tree
    BST(){
        root = null; // defaults root to null?
    }

    class Node {
        int key; // init key, pos sel?
        Node left, right; // init L/R nodes

        // method to dist nodes?
        public Node(int data){
            key = data; // ?
            left = right = null; // read into this
        }
    }

/////////////////////////////////////////////////////////////////////
// DELETE

    // delete node from BST
    void deleteKey(int key){
        root = recursiveDelete(root, key);
    }

        // method to find min value
        int minVal(Node root){
            int min = root.key; //min starts as root

            // find min
            while (root.left != null){
                min = root.left.key; // whats the key?
                root = root.left;
            }

            return min;
        }
        Node recursiveDelete(Node root, int key) {
            // empty tree
            if (root == null) return root; // single line if; I like it

            // go through tree
            if (key < root.key){
                // left sub-tree
                root.left = recursiveDelete(root.left, key);
            }
            else if (key > root.key){
                // right sub-tree
                root.right = recursiveDelete(root.right, key);
            }
            else{
                //if only one child
                if (root.left == null)
                    return root.right; // don't need brackets? Neat
                else if (root.right == null)
                    return root.left;

                // node == 2 child
                // get inorder successor? (min val; R subtree)
                // remove inorder successor
                root.key = minVal(root.right);
                root.right = recursiveDelete(root.right, root.key);
            }

            return root;
        }

/////////////////////////////////////////////////////////////////////
// INSERT

    void insert(int key){
        root = recursiveInsert(root, key);
    }

        Node recursiveInsert(Node root, int key){
            // empty tree
            if (root == null){
                // create new root?
                root = new Node(key);
                return root;
            }

            // traverse tree
            if (key < root.key)
                // left subtree insert
                root.left = recursiveInsert(root.left, key);
            else if (key > root.key)
                // right subtree insert
                root.right = recursiveInsert(root.right, key);

            // pointer?
            return root;
        }

/////////////////////////////////////////////////////////////////////
// INORDER TRAVERSAL

    void inorder(){
        recursiveInorder(root);
    }

        void recursiveInorder(Node root){
            // traverse BST? print nodes?
            if(root != null){
                recursiveInorder(root.left);
                System.out.print(root.key + " ");
                recursiveInorder(root.right);
            }
    }

/////////////////////////////////////////////////////////////////////
// SEARCH

    boolean search(int key){
        // search BST? using key
        root = recursiveSearch(root, key);
        if (root != null)
            return true;
        else
            return false;
    }

        // searching algorithm
        Node recursiveSearch(Node root, int key){
            //base case: root=null or key is at root
            if (root == null || root.key == key)
                return root;

            // val > key
            if (root.key > key)
                return recursiveSearch(root.left, key);

            // val < key
            return recursiveSearch(root.right, key);
        }

/////////////////////////////////////////////////////////////////////
//
    void EE() throws IOException {
        String EE_PATH = "C:\\Users\\cclet\\Desktop\\EasterEggs\\01_SuperSaiyen2.txt";
        String line;

        BufferedReader reader = Files.newBufferedReader(Paths.get(EE_PATH));
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }

}
