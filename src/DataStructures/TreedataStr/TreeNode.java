package DataStructures.TreedataStr;
import java.util.ArrayList;
public class TreeNode {
    public static void main(String[] args) {
        CreateTreeNode drinks = new CreateTreeNode("Drinks");
        CreateTreeNode hot = new CreateTreeNode("Hot");
        CreateTreeNode cold = new CreateTreeNode("Cold");
        CreateTreeNode tea = new CreateTreeNode("Tea");
        CreateTreeNode coffee = new CreateTreeNode("Coffee");
        CreateTreeNode beer = new CreateTreeNode("Beer");
        CreateTreeNode coke = new CreateTreeNode("coke");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(coffee);
        hot.addChild(tea);

        cold.addChild(beer);
        cold.addChild(coke);

        System.out.println(drinks.print(0));
    }
}

class CreateTreeNode{
    String data;
    ArrayList<CreateTreeNode> children;
    public CreateTreeNode(String data){
        this.data = data;
        this.children = new ArrayList<CreateTreeNode>();
    }
    public void addChild(CreateTreeNode node){
        this.children.add(node);
    }
    public String print(int level){
        String ret = "  ".repeat(level)+data+"\n";
        for (CreateTreeNode node : this.children){
            ret += node.print(level+1);
        }
        return ret;
    }

}


