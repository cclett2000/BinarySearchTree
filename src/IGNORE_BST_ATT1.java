///*
// * Charles Lett Jr.
// * November 9, 2021
// * Desc: this program creates a binary search tree (BST)
// */
//
//
//public class IGNORE_BST_ATT1 {
//    // print selected node (if not null)
//    void printNode(Integer sel_node){
//        if (sel_node != null){
//            printNode(sel_node.right);
//            System.out.println(sel_node);
//            printNode(sel_node.left);
//
//        }
//    }
//
//    // search type 1
//    int Search(Integer sel_root, Integer key){
//        if (sel_root == null || key = sel_root.key){
//            return sel_root;
//        }
//        if (key < sel_root.key){
//            return Search(sel_root.left, key);
//        }
//        else{
//            return Search(sel_root.right, key);
//        }
//    }
//
//    // search type 2 - iterative
//    int IterativeSearch(Integer sel_node, int k){
//        while (sel_node != null && k != sel_node.key){
//            if (k < sel_node.key){
//                sel_node = sel_node.left;
//            }
//            else {
//                sel_node = sel_node.right;
//            }
//        }
//        return sel_node;
//    }
//
//    // get min child (always left)
//    int getMin(Integer sel_node){
//        while (sel_node.left != null){
//            sel_node = sel_node.left;
//        }
//        return sel_node;
//    }
//
//    // get max child (always right)
//    int getMax(Integer sel_node){
//        while(sel_node.right != null){
//            sel_node = sel_node.right;
//        }
//        return sel_node;
//    }
//
//    // get node following the selected one?
//    int getSuccessor(Integer sel_node){
//        if (sel_node.right != null){
//            return getMin(sel_node.right);
//        }
//        int y = sel_node.parent;
//
//        while(y != -1 && sel_node == y.right){
//            sel_node = y;
//            y = y.parent;
//        }
//        return y;
//    }
//
//    // insert values into BST
//    void insert(sel_tree, z){
//        Integer y = null;
//        Integer x = sel_tree.root;
//
//        while (x != null){
//            y = x;
//            if (z.key < x.key){
//                x = x.left;
//            }
//            else{
//                x = x.right;
//            }
//        }
//        z.parent = y;
//
//        if (y == null){
//            T.root = z;
//        }
//        else if (z.key < y.key){
//            y.left = z;
//        }
//        else{
//            y.right = z;
//        }
//    }
//
//    // replace subtree of parent with another subtree?
//    void transplant(sel_tree, u, v){
//        if (u.parent == null){
//            sel_tree.root = v;
//        }
//        else if (u == u.p.left){
//            u.p.left = v;
//        }
//        else{
//            u.p.right = v;
//        }
//
//        i (v != -1){
//            v.p = u.p;
//        }
//    }
//
//    void deleteNode(tree, node){
//        if(z.left == null){
//            transplant(sel_tree, z, z.right);
//        }
//        else if(z.right == null){
//            transplant(sel_tree, z, z.left);
//        }
//        else{
//            y = getMin(z.right);
//        }
//
//        if(y.p != z){
//            transplant(sel_tree, z, z.right);
//        }
//
//    }
//}
