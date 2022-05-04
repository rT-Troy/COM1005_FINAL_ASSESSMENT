/** RunEpuzzleAStar.java
 * run the 8-puzzle
 * COM1005 - (Bsc)Computer Science
 * Jun Zhang (jzhang213@sheffield.ac.uk)
 * 4 May 2022 Version
 */
package Astar;

public class RunEpuzzleAStar {

    public static void main(String[] args) {
        final int[][] GOAL = {{1,2,3},{4,5,6},{7,8,0}};
        EpuzzGen epg = new EpuzzGen(12345);
        int[][] puzzleGen = epg.puzzGen(6);

        //could change the method to String "Hamming" or "Manhattan"
        EpuzzleSearch searcher = new EpuzzleSearch(puzzleGen,GOAL, "Manhattan");
        SearchState initState = new EpuzzleState(searcher.getPuzzleList(),0,0);

        String res_astar = searcher.runSearch(initState, "AStar");
        System.out.println(res_astar);

//        String res_bnb = searcher.runSearch(initState, "branchAndBound");
//        System.out.println(res_bnb);

    }
}
