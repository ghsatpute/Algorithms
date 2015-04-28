package Coursera.TimRoughgarden.Assignments;


import Coursera.TimRoughgarden.Graphs.AdjacencyListGraph;
import Coursera.TimRoughgarden.Graphs.GraphNode;

import java.util.*;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/15/2015  11:07 PM
 *
 */
public class ProgrammingQuestion3 {

    public static void main(String[] args) {
        List<List<Integer>> rawData = IO.readSpaceSeparatedMatrix("data\\kargerMinCut.txt");
        AdjacencyListGraph graph = constructGraph(rawData);
        minCut(graph);
    }

    // First value in each sub-list is node data, latter values are adjacent nodes
    public static AdjacencyListGraph constructGraph(List<List<Integer>> adjacencyList) {
        List<GraphNode> listNodes = new ArrayList<GraphNode>();
        AdjacencyListGraph adjacencyGraph = new AdjacencyListGraph();
        // Take first node of each adjacency list and construct a graph node
        for(List<Integer> adjList : adjacencyList) {
            GraphNode node = new GraphNode();
            node.data = adjList.get(0);
            listNodes.add(node);
        }
        int i = 0;
        for(GraphNode node : listNodes) {
            List<GraphNode> listNeighbours = getListOfNodes(adjacencyList.get(i), listNodes);
            node.neighbours = listNeighbours;
            //System.out.println(Arrays.toString(listNeighbours.toArray()));
            adjacencyGraph.graphNodes.add(node);
            i++;
        }
        return adjacencyGraph;
    }

    private static List<GraphNode> getListOfNodes(List<Integer> neighbours, List<GraphNode> listNodes) {
        List<GraphNode> listGraphNode = new ArrayList<GraphNode>();
        // We should improve it somehow
        // Currently it is squared complexity we need to make linear.
        neighbours.remove(0); // As first is the node itself
        for(Integer nodeValue : neighbours) {
            // Find graph node with matching value
            // Assumption all nodes have unique values
            for(GraphNode node : listNodes) {
                if(node.data == nodeValue) {
                    listGraphNode.add(node);
                    break;
                }
            }
        }
        return listGraphNode;
    }

    public static void minCut (AdjacencyListGraph graph)
    {
        GraphNode graphNode = new GraphNode();
        graphNode.data = 5;

        while(graph.graphNodes.size() > 2) {
            // Find the node to contract
            int nodeToContract = randInt(0, graph.graphNodes.size() - 1);
            // Find the chosen node's edge i.e neighbour
            int secondNodeData = randInt(0, graph.graphNodes.get(nodeToContract).neighbours.size() - 1);
            //if(secondNodeData != 0)
            // secondNodeData--;
            int SecondNodeToContract = (int) graph.findIndexForNodeWithData(graph.graphNodes.get(nodeToContract).neighbours.get(secondNodeData).data);
            // If we remove the less valued node it'll mess the index
            // Which can't be allowed at this time
            if(nodeToContract > SecondNodeToContract)
            {
                int temp  = nodeToContract;
                nodeToContract = SecondNodeToContract;
                SecondNodeToContract = temp;
            }

            GraphNode removedNode = contractGraph(graph, nodeToContract, SecondNodeToContract);

        }
        int i = 0;
    }

    private static GraphNode contractGraph(AdjacencyListGraph graph, int nodeToContract, int secondNodeToContract) {
        GraphNode graphNodeToContract = graph.graphNodes.get(nodeToContract);
        GraphNode removedNode = graph.graphNodes.remove(secondNodeToContract);

        graphNodeToContract.neighbours.remove(removedNode);
        removedNode.neighbours.remove(graphNodeToContract);
        graphNodeToContract.neighbours.addAll(removedNode.neighbours);

        for ( GraphNode node : graph.graphNodes) {
                if(node.neighbours.contains(removedNode)) {
                    System.out.print("Removing");
                    node.neighbours.remove(removedNode);
                    node.neighbours.add(graphNodeToContract);
                }
        }

        // Remove self loops
        while(graphNodeToContract.neighbours.contains(graphNodeToContract))
            graphNodeToContract.neighbours.remove(graphNodeToContract);

        return removedNode;
    }

    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}
