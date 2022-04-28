import java.util.HashMap;

public class RunEpuzzleBFS {

    public static void main(String[] args) {

        int[] puzzleArr1 = {1,0,3,4,2,6,7,5,8};
        EpuzzleSearch searcher1 = new EpuzzleSearch(puzzleArr1);
        EpuzzleState initState = new EpuzzleState(searcher1.getEPuzzleList());


        System.out.println(searcher1.getEPuzzleList());



    }
}






//        EpuzzGen epg = new EpuzzGen(12345);
//        int[][] puzzleGen = epg.puzzGen(6);
//        EpuzzleSearch searcher = new EpuzzleSearch(puzzleGen);
//        //System.out.println(searcher.getHashList());
//        SearchState initState = new EpuzzleState();