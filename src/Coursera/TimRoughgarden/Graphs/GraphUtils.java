package Coursera.TimRoughgarden.Graphs;


import com.intellij.icons.AllIcons;

import java.util.ArrayList;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/22/2015  11:46 AM
 *
 */
public class GraphUtils {
    public static List<GraphNode> createDirectedGraph() {
        // Construct Graph

        List<GraphNode> graph = new ArrayList<GraphNode>();
        GraphNode n1 = new GraphNode();
        n1.data = 1;
        n1.label = "1";
        GraphNode n2 = new GraphNode();
        n2.data = 2;
        n2.label = "2";
        GraphNode n3 = new GraphNode();
        n3.data = 3;
        n3.label = "3";
        GraphNode n4 = new GraphNode();
        n4.data = 4;
        n4.label = "4";
        GraphNode n5 = new GraphNode();
        n5.data = 5;
        n5.label = "5";
        GraphNode n6 = new GraphNode();
        n6.data = 6;
        n6.label = "6";
        GraphNode n7 = new GraphNode();
        n7.data = 7;
        n7.label = "7";
        GraphNode n8 = new GraphNode();
        n8.data = 8;
        n8.label = "8";
        GraphNode n9 = new GraphNode();
        n9.data = 9;
        n9.label = "9";

        List<GraphNode> graphNodeList = new ArrayList<GraphNode>();
        // n1's neighbours
        graphNodeList.add(n2);
        n1.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n2's neighbours
        graphNodeList.add(n4);
        graphNodeList.add(n3);
        n2.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n3's neighbours
        graphNodeList.add(n1);
        n3.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n4's neighbours
        graphNodeList.add(n5);
        n4.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n5's neighbours
        graphNodeList.add(n7);
        graphNodeList.add(n6);
        n5.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n6's neighbours
        graphNodeList.add(n4);
        n6.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n7's neighbours
        graphNodeList.add(n8);
        n7.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n8's neighbours
        graphNodeList.add(n9);
        n8.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n9's neighbours
        graphNodeList.add(n7);
        n9.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        graph.add(n1);
        graph.add(n2);
        graph.add(n3);
        graph.add(n4);
        graph.add(n5);
        graph.add(n6);
        graph.add(n7);
        graph.add(n8);
        graph.add(n9);

        return graph;
    }
}
