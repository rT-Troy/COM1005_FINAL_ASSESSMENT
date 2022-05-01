public class RunEpuzzleSearch {

    public static void main(String[] args) {
        final int[][] GOAL = {{1,2,3},{4,5,6},{7,8,0}};
        EpuzzGen epg = new EpuzzGen(12345);
        int[][] puzzleGen = epg.puzzGen(6);

        EpuzzleSearch searcher = new EpuzzleSearch(puzzleGen,GOAL);
//        System.out.println(searcher.getePuzzleList()[0][0]);
    }
}
