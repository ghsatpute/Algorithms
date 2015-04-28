package test.TimRoughgarden.Graphs;


import Coursera.TimRoughgarden.Graphs.DFS;
import Coursera.TimRoughgarden.Graphs.GraphNode;
import com.intellij.icons.AllIcons;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/21/2015  12:59 AM
 *
 */
public class testDFS {

    @Test
    public void testDFS()
    {
        /*
            2 - 4
          /   /  \
        1    5    6
         \  /
           3
         */
        List<GraphNode>graph = new ArrayList<GraphNode>();
        GraphNode n1 = new GraphNode();
        n1.data = 1;
        GraphNode n2 = new GraphNode();
        n2.data = 2;
        GraphNode n3 = new GraphNode();
        n3.data = 3;
        GraphNode n4 = new GraphNode();
        n4.data = 4;
        GraphNode n5 = new GraphNode();
        n5.data = 5;
        GraphNode n6 = new GraphNode();
        n6.data = 6;
        List<GraphNode> graphNodeList = new ArrayList<GraphNode>();
        // n1's neighbours
        graphNodeList.add(n2);
        graphNodeList.add(n3);
        n1.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n2's neighbours
        graphNodeList.add(n4);
        graphNodeList.add(n1);
        n2.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n3's neighbours
        graphNodeList.add(n1);
        graphNodeList.add(n5);
        n3.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n4's neighbours
        graphNodeList.add(n2);
        graphNodeList.add(n5);
        graphNodeList.add(n6);
        n4.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n5's neighbours
        graphNodeList.add(n4);
        graphNodeList.add(n3);
        n5.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        // n6's neighbours
        graphNodeList.add(n4);
        n6.neighbours.addAll(graphNodeList);
        graphNodeList.clear();

        graph.add(n1);
        graph.add(n2);
        graph.add(n3);
        graph.add(n4);
        graph.add(n5);
        graph.add(n6);

        DFS dfs = new DFS(graph);
        int i = 0;
    }
}
