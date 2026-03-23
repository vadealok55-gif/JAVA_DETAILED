class BST {
 // height difference should be always less than equal 1
    /*
           15
      10         20
    5    12   17    25

     compare only a value in level and does operation so O(log n)--height,remove,search

   public class Node {
    int value;
    Node right;
    Node left;
    int height;
    }

     */

   public class Node {
       int value;
       int height;
       Node left;
       Node right;

       public Node(int value) {
           this.value = value;
       }

       public int getValue() {
           return value;
       }
   }
       private Node root;



       public int height(Node node){
           if(node==null)
             return -1;

           return node.value;
       }

       public boolean isEmpty(){
           return root==null;
       }

       public void insert(int value){

       }
       public Node insert(int value,Node node){
           if(node==null){
               node=new Node(value);
               return node;
           }

           if(value<node.value){
               node.left= insert(value,node.left);
           }
           if(value>node.value){
               node.right=insert(value,node.right);
           }

           node.height=Math.max(height(node.left),height(node.right))+1;

           return node;
       }
       public boolean balanced(){
           return balanced(root);
       }

       public boolean balanced(Node node){
           if(node==null) return true;

           return Math.abs(height(node.left)-height(node.right))<=1  && balanced(node.left) && balanced(node.right);


       }


       public void display()
       {
           display(root);
       }

       public void display(Node node){
           display(root,"Root_Node: ");
       }
       public void display(Node node,String str){
           if(node==null) return ;

           System.out.println(str + node.getValue());

           display(node.left,"left_child of"+node.getValue()+" : ");
           display(node.right,"right_child of"+node.getValue()+" : ");
       }







}
