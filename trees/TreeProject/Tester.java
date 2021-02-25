public class Tester {
    public static void main(String[] args) {
        // BSTNode<String> a = new BSTNode<String>("apple");
        // BSTNode<String> b = new BSTNode<String>("banana");
        // BSTNode<String> c = new BSTNode<String>("cantalope");
        // BSTNode<String> d = new BSTNode<String>("durian");
        
        // c.setLeft(b);
        // b.setLeft(a);
        // c.setRight(d);
        
        // System.out.println(c.inorder(c));
        // System.out.println(b.countLeaves(b));

        //tree test
        BST<String> tree = new BST<String>();
        tree.insert("durian");
        tree.insert("coconut");
        //tree.insert("banana");

        //duplicate element test
        //tree.insert("coconut");

        //tree.insert("apple");
        tree.insert("orange");
        tree.insert("xylophone");
        tree.insert("elephant");
        tree.insert("yellow");
        tree.insert("zebra");

        System.out.println(tree.countLeaves());
        System.out.println(tree.getRoot().print());
        System.out.println(tree.inorder());

        //find method test
        System.out.println(tree.find("apple"));

        //height method test
        System.out.println(tree.height());

        //perfect method test 
        System.out.println(tree.perfect());

        System.out.println(tree.isBalanced());

        //go through tree2 and make sure its balanced at certain places and not placed in certain places --> ask tmr in class
        BST<Integer> tree2 = new BST<Integer>();
        tree2.insert(9);
        tree2.insert(5);
        tree2.insert(4);
        tree2.insert(7);
        tree2.insert(6);
        tree2.insert(8);
        //tree2.insert(10);
        //tree2.insert(12);
        //tree2.insert(15);
        //tree2.insert(11);
        //tree2.insert(13);

        //balanced tree test
        System.out.println(tree2.isBalanced());

        //deleting node test - WHAT SHOULD I RETURN
        System.out.println(tree2.delete(8));
        System.out.println(tree2.delete(5));
        System.out.println(tree2.inorder());

        //System.out.println(tree.height() +" , " + tree.leftMostDepth(tree.getRoot()));
    }

    
}