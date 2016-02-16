package test.coursera.timroughgarden.graphs;


import coursera.timroughgarden.graphs.DFS;
import coursera.timroughgarden.graphs.GraphNode;
import coursera.timroughgarden.graphs.GraphUtils;
import org.junit.Test;

import java.util.List;

/*
 *  @author : Ganesh Satpute
 *  @date   : 2/22/2015  11:26 AM
 *
 */
public class TestKosarajuAlgorithm {
    @Test
    public void testKosarajuAlgo() {

        List<GraphNode> graph = GraphUtils.createDirectedGraph();
        DFS dfs = new DFS(graph);
        int i = 0;

    }
}
