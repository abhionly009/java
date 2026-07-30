package aaaaaaaDSA.graph;

import java.util.ArrayList;

public class GraphArrayListDemo {

    public static void main(String[] args) {

        /**
         *          1-----2
         *          |    |
         *          |    |
         *          3----4
         *
         */

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        int vertices = 4;


        for (int i =0;i<=vertices;i++){

            graph.add(new ArrayList<>());

        }

        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(1);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(4);

        graph.get(4).add(2);
        graph.get(4).add(3);

        for (int i =0;i<graph.size();i++){
            System.out.println(i+ " --> " + graph.get(i));
        }

    }
}
