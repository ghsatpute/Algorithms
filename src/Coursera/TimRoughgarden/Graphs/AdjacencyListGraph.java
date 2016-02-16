package coursera.timroughgarden.graphs;


import java.util.ArrayList;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/15/2015  10:56 PM
 *
 */
public class AdjacencyListGraph {
    public List<GraphNode> graphNodes = new ArrayList<GraphNode>();

    public int findIndexForNodeWithData(int data)
    {
        int i = 0;
        for(GraphNode node : graphNodes) {
            if(node.data == data)
                return i;
            i++;
        }
        System.err.println("Does not contain element with data : " + data);
        return  -1;
    }
}
