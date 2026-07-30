package aaaaaaaDSA.graph;

public class GraphMatrix {

    public static void main(String[] args) {


        /**
         *
         *
         *          A
         *         / \
         *        B---C
         */

        int vertices = 3;


        int matrix [][] = new int[vertices][vertices];

        // A-B
        matrix[0][1] =1;
        matrix[1][0] = 1;

        // A-C

        matrix[0][2] =1;
        matrix[2][0] =1;

        // B-C

        matrix[1][2] =1;
        matrix[2][1] =1;

        printGraph(matrix);
    }


    public static void  printGraph(int graph [][]){


        for (int i = 0; i < graph.length; i++) {

            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }

            System.out.println();
        }

    }

}
