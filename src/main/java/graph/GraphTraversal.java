package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasada Rao on 22/10/21 5:26 PM
 **/
public class GraphTraversal {

    private static void bfs() {
        final List<List<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>());
        graph.add(List.of(2, 4));
        graph.add(List.of(1, 3, 5, 7, 8));
        graph.add(List.of(2, 4, 9, 10));
        graph.add(List.of(1, 3));
        graph.add(List.of(2, 6, 7, 8));
        graph.add(List.of(5));
        graph.add(List.of(2, 5, 8));
        graph.add(List.of(2, 5, 7));
        graph.add(List.of(3));
        int n = 10;
        for (int i = 1; i <= n; i++) {

        }
    }

}
