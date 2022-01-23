package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasada Rao on 21/10/21 3:49 PM
 **/
public class GraphRepresentation {

    public static void main(String[] args) {
        final List<List<Pair<Integer, Integer>>> graph = new ArrayList<>();

        graph.add(new ArrayList<>());
        graph.add(List.of(Pair.of(2, 2)));
        graph.add(List.of(Pair.of(1, 2), Pair.of(3, 2), Pair.of(4, 2)));
        graph.add(List.of(Pair.of(2, 2)));
        graph.add(List.of(Pair.of(2, 2), Pair.of(3, 2)));
        graph.add(List.of(Pair.of(1, 2), Pair.of(3, 2)));

        System.out.println(graph);
    }

    private static class Pair<First, Second> {
        private final First first;
        private final Second second;

        public Pair(First first, Second second) {
            this.first = first;
            this.second = second;
        }

        public First getFirst() {
            return first;
        }

        public Second getSecond() {
            return second;
        }

        public static <First, Second> Pair<First, Second> of(First first, Second second) {
            return new Pair<>(first, second);
        }
    }
}
