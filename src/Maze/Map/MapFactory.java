package Maze.Map;

import Maze.Main_Maze.MazeNode;

public class MapFactory {

    public static MazeNode createMazeLinkedList() {

        // Maze 1
        Map m1 = new Map(
            new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 4, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 4, 0, 0, 0, 4, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
            new int[]{1, 1},
            new int[]{7, 1},   
            new int[]{5, 8}    
        );

        // Maze 2
        Map m2 = new Map(
            new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 4, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 4, 0, 0, 0, 4, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
            new int[] {1, 1},   
            new int[] {7, 8},   
            new int[] {1, 8}    
        );

        // Maze 3
        Map m3 = new Map(
            new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 4, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 4, 0, 0, 0, 4, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
            new int[] {1, 1}, 
            new int[] {7, 8}, 
            new int[] {1, 8}  
        );

        // Maze 4
        Map m4 = new Map(
            new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 4, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 4, 0, 0, 0, 4, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
            new int[] {1, 1},   
            new int[] {7, 8},   
            new int[] {1, 8}    
        );

        MazeNode.mappingNode(m1.node, m2.node);
        MazeNode.mappingNode(m2.node, m3.node);
        MazeNode.mappingNode(m3.node, m4.node);

        return m1.node;
    }
}