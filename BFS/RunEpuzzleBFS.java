import java.util.HashMap;

public class RunEpuzzleBFS {

    public static void main(String[] args) {

        EpuzzGen epg = new EpuzzGen(12345);
        int[][] puzzleGen = epg.puzzGen(6);
        EpuzzleSearch searcher = new EpuzzleSearch(puzzleGen);
        //System.out.println(searcher.getHashList());
        SearchState initState = new EpuzzleState();






    }
}
