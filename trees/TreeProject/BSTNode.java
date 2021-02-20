public class BSTNode<E extends Comparable<E>> {
    private E value;
    private BSTNode<E> left;
    private BSTNode<E> right;
    
    public BSTNode (E v) {
        value = v;
        left = right = null;
    }
    
    public E getValue(){
        return value;
    }
    
    public BSTNode<E> getLeft(){
        return left;
    }
    
    public BSTNode<E> getRight(){
        return right;
    }
    
    public void setValue(E n){
        value = n;
    }
    
    public void setLeft(BSTNode<E> n){
        left = n;
    }
    
    public void setRight(BSTNode<E> n){
        right = n;
    }

    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }

    public String print(){
        return "value --> " + value + " , left --> " + left + " , right --> " + right;
    }
}
