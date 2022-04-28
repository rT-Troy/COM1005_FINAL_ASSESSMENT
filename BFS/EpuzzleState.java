import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleState extends SearchState{

    private int serValue;
    private int thisValue;

    public EpuzzleState(int sva, int tva){
        serValue = sva;
        thisValue = tva;
    }

    //find the initState position
    public EpuzzleState(HashMap<Integer,Integer> list){
        int num = 0;
        for(int x : list.keySet()){
            if (list.get(x).equals(0)){
                serValue = num;
                thisValue = list.get(num);
            }
            num++;
        }
    }

    public int getSerValue() {
        return serValue;
    }

    public int getThisValue() {
        return thisValue;
    }


    @Override
    boolean goalPredicate(Search searcher) {
        boolean result = true;
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        HashMap<Integer,Integer> searList = esearcher.getEPuzzleList();
        for (int i = 0; i <searList.size()-1; i++) {    //check if every tile match the target order
            if(searList.get(i) != i+1) {
                result = false;
                break;
            }
        }
        return (result);
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        ArrayList<SearchState> slist = new ArrayList<SearchState>();





//        //slide tile 1 and 3 to 0, and every tile follow the rule
//        if (esearcher.getSerNum()==0){
//            epslist.add(new EpuzzleState(0,esearcher.getEPuzzleList().get(1)));
//            epslist.add(new EpuzzleState(0,esearcher.getEPuzzleList().get(3)));
//        }
//        if (esearcher.getSerNum()==1){
//            epslist.add(new EpuzzleState(1,esearcher.getEPuzzleList().get(0)));
//            epslist.add(new EpuzzleState(1,esearcher.getEPuzzleList().get(2)));
//            epslist.add(new EpuzzleState(1,esearcher.getEPuzzleList().get(4)));
//        }
//        if (esearcher.getSerNum()==2){
//            epslist.add(new EpuzzleState(2,esearcher.getEPuzzleList().get(1)));
//            epslist.add(new EpuzzleState(2,esearcher.getEPuzzleList().get(5)));
//        }
//        if (esearcher.getSerNum()==3){
//            epslist.add(new EpuzzleState(3,esearcher.getEPuzzleList().get(0)));
//            epslist.add(new EpuzzleState(3,esearcher.getEPuzzleList().get(4)));
//            epslist.add(new EpuzzleState(3,esearcher.getEPuzzleList().get(6)));
//        }
//        if (esearcher.getSerNum()==4){
//            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(1)));
//            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(3)));
//            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(5)));
//            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(7)));
//        }
//        if (esearcher.getSerNum()==5){
//            epslist.add(new EpuzzleState(5,esearcher.getEPuzzleList().get(2)));
//            epslist.add(new EpuzzleState(5,esearcher.getEPuzzleList().get(4)));
//            epslist.add(new EpuzzleState(5,esearcher.getEPuzzleList().get(8)));
//        }
//        if (esearcher.getSerNum()==6){
//            epslist.add(new EpuzzleState(6,esearcher.getEPuzzleList().get(3)));
//            epslist.add(new EpuzzleState(6,esearcher.getEPuzzleList().get(7)));
//        }
//        if (esearcher.getSerNum()==7){
//            epslist.add(new EpuzzleState(7,esearcher.getEPuzzleList().get(4)));
//            epslist.add(new EpuzzleState(7,esearcher.getEPuzzleList().get(6)));
//            epslist.add(new EpuzzleState(7,esearcher.getEPuzzleList().get(8)));
//        }
//        if (esearcher.getSerNum()==8){
//            epslist.add(new EpuzzleState(8,esearcher.getEPuzzleList().get(5)));
//            epslist.add(new EpuzzleState(8,esearcher.getEPuzzleList().get(7)));
//        }
//
//        for(EpuzzleState es: epslist) {
//            slist.add((SearchState) es);
//        }


        return slist;
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState eps = (EpuzzleState) n2;
        return  (serValue == eps.getSerValue() && thisValue == eps.getThisValue());

    }

    @Override
    public String toString() {

        return "EpuzzleState= " +
                "serValue=" + serValue +
                ", thisValue=" + thisValue +
                '}';
    }
}
