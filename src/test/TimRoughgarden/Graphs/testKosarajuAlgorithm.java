package test.TimRoughgarden.Graphs;


import Coursera.TimRoughgarden.Graphs.DFS;
import Coursera.TimRoughgarden.Graphs.GraphNode;
import Coursera.TimRoughgarden.Graphs.GraphUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/22/2015  11:26 AM
 *
 */
public class testKosarajuAlgorithm {
    @Test
    public void testKosarajuAlgo() {

        List<GraphNode> graph = GraphUtils.createDirectedGraph();
        DFS dfs = new DFS(graph);
        int i = 0;

    }
}
