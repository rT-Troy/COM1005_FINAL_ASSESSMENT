import java.util.HashMap;

public class RunEpuzzleBFS {

    public static void main(String[] args) {

        int[] puzzleArr1 = {1,0,3,4,2,6,7,5,8};
        EpuzzleSearch searcher1 = new EpuzzleSearch(puzzleArr1);
        SearchState initState = (SearchState) new EpuzzleState(searcher1.getEPuzzleList());
        String resb = searcher1.runSearch(initState, "breadthFirst");
        System.out.println(resb);

//        System.out.println(searcher1.getEPuzzleList());
//        System.out.println(initState.getSerValue());
//        System.out.println(initState.getThisValue());

//        String resb = searcher.runSearch(initState, "breadthFirst");
//        String resd = searcher.runSearch(initState, "depthFirst");
//        System.out.println(resb);
    }
}






//        EpuzzGen epg = new EpuzzGen(12345);
//        int[][] puzzleGen = epg.puzzGen(6);
//        EpuzzleSearch searcher = new EpuzzleSearch(puzzleGen);
//        //System.out.println(searcher.getHashList());
//        SearchState initState = new EpuzzleState();