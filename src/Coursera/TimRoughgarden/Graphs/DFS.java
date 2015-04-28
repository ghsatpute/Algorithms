package Coursera.TimRoughgarden.Graphs;


import com.intellij.icons.AllIcons;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/21/2015  12:25 AM
 *
 */
public class DFS
{
    public List<GraphNode> graph;
    public DFS(List<GraphNode> graph)
    {
        this.graph = graph;
        Stack<GraphNode> graphNodeStack = new Stack<GraphNode>();
        // Mark initial node as visited node
        GraphNode seedNode = graph.get((int)Math.random() * graph.size());

        graphNodeStack.add(seedNode);

        // Now process all elements in the stack
        while(!graphNodeStack.isEmpty()) {
            GraphNode chosenNode = graphNodeStack.pop();
            // Get each neighbour of chosenNode and add it to stack
            for(GraphNode node : chosenNode.neighbours) {
                if(!node.explored
                        && !graphNodeStack.contains(node))
                    graphNodeStack.add(node);
            }
            chosenNode.explored = true;
            System.out.print("\t"+chosenNode);
        }
        int i = 0;
    }
}
