package Coursera.TimRoughgarden.Graphs;


import com.intellij.icons.AllIcons;

import java.util.ArrayList;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/21/2015  12:22 AM
 *
 */
public class KosarajuAlgorithm {

    public static void main(String[] args) {
        List<GraphNode> graph = GraphUtils.createDirectedGraph();
        reverseGraph(graph);
    }
    public KosarajuAlgorithm(List<GraphNode> data)
    {
        run(data);
    }

    private List<GraphNode> run(List<GraphNode> graph) {
        List<GraphNode> reverseGraph = reverseGraph(graph);
        return null;
    }

    private static List<GraphNode> reverseGraph(List<GraphNode> graph) {
        List<GraphNode> reverseGraph = new ArrayList<GraphNode>();

        for(GraphNode node : graph) {
            GraphNode newNode = (GraphNode) node.clone();
            newNode.neighbours.clear();
            reverseGraph.add(newNode);
        }
        // For each graph node
        for(int i = 0 ; i < graph.size() ; i++) {
            // For each neighbour
            for(GraphNode neighbour : graph.get(i).neighbours) {
                int index  = graph.indexOf(neighbour);
                reverseGraph.get(index).neighbours.add(reverseGraph.get(i));
            }
        }
        return reverseGraph;
    }
}
