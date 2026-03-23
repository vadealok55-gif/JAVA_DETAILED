import java.util.Scanner;

public class BinaryTree {



   public static  class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }

    }
  private Node root;

  public void populate(Scanner sc) {
      System.out.println("enter the root Node");
      int value=sc.nextInt();
      root=new Node(value);
      populate(sc,root);
  }

  private void populate(Scanner sc,Node node){
      System.out.println("Enter your left At"+node.value);
      boolean left= sc.nextBoolean();
      if (left){
          System.out.println("enter the value"+node.value);
          int value=sc.nextInt();
          node.left=new Node(value);
          populate(sc,node.left);
      }
      System.out.println("Enter your right At"+node.value);
      boolean right=sc.nextBoolean();
      if(right){
          System.out.println("enter the value"+node.value);
          int value=sc.nextInt();
          node.right=new Node(value);
          populate(sc,node.right);
      }
  }


   public void display(){
      display(root,"");
  }

  public void display(Node node,String str){
      if(node==null) return;
      System.out.println(str+node.value);

      display(node.left ,str+"\t");
      display(node.right,str+"\t");
  }

  public void preetydisplay(){
      preetydisplay(root,0);
  }

  public void preetydisplay(Node node,int level){

      if(node==null){
          return;
      }

      preetydisplay(node.right,level+1);

      if(level!=0){
          for(int i=0;i<level-1;i++){
              System.out.print("|\t\t");
          }
          System.out.println("|-------->"+node.value);
      }else{
          System.out.println(node.value);
      }


      preetydisplay(node.left,level+1);

  }


    public static void main(String[] args) {
        // two pointers and value in binary tree
        // int value, node - right, left
         Scanner sc =new Scanner(System.in);
         BinaryTree cl=new BinaryTree();
         cl.populate(sc);
         cl.display();

        System.out.println();

        cl.preetydisplay();
    }

}
