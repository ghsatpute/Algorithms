package coursera.timroughgarden.graphs;


import java.util.ArrayList;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/15/2015  11:02 PM
 *
 */
public class GraphNode {
    public int data;
    public String label = "";
    public boolean explored;
    public List<GraphNode> neighbours = new ArrayList<GraphNode>();

    @Override
    public String toString() {
        return data + "";
    }

    @Override
    public Object clone() {
        GraphNode newNode = new GraphNode();
        newNode.neighbours = new ArrayList<GraphNode>();
        newNode.neighbours.addAll(neighbours);
        newNode.label = this.label;
        newNode.data = this.data;
        newNode.explored = this.explored;
        return newNode;
    }
    @Override
    public boolean equals(Object node)
    {
        return (data == ((GraphNode)node).data && label.equals(((GraphNode)node).label));
    }

    @Override
    public int hashCode()
    {
        return data;
    }
}
