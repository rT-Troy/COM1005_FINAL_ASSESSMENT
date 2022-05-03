/** RunEpuzzleBFS.java
 * run the 8-puzzle
 * COM1005 - (Bsc)Computer Science
 * Jun Zhang (jzhang213@sheffield.ac.uk)
 * 4 May 2022 Version
 */

public class RunEpuzzleBFS {

    public static void main(String[] args) {

        int[] puzzleArr1 = {1,0,3,4,2,6,7,5,8};
        int[] puzzleArr2 = {4,1,3,7,2,5,0,8,6};
        int[] puzzleArr3 = {2,3,6,1,5,8,4,7,0};
        final int[] TARGET = {1,2,3,4,5,6,7,8,0};

        EpuzzleSearch searcher = new EpuzzleSearch(puzzleArr1,TARGET);
        SearchState initState = new EpuzzleState(searcher.getPuzzleList());

        String run = searcher.runSearch(initState, "breadthFirst");
        System.out.println(run);

    }
}