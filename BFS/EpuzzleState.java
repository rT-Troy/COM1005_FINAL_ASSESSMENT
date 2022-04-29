import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class EpuzzleState extends SearchState{

    private int serValue;
    private int thisValue;
    private HashMap<Integer,Integer> ePuzzleMap;
    private ArrayList<Integer> ePuzzleList;

    public EpuzzleState(int sva, int tva, ArrayList<Integer> list){
        serValue = sva;
        thisValue = tva;
        ePuzzleList = list;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i,list.get(i));
        }
        ePuzzleMap = map;
    }

    //find the initState position
    public EpuzzleState(HashMap<Integer,Integer> map){
        int num = 0;
        for(int x : map.keySet()){
            if (map.get(x).equals(0)){
                serValue = num;
                thisValue = map.get(num);
            }
            num++;
        }
        ePuzzleMap = map;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x : map.keySet()){
            list.add(x);
        }
        ePuzzleList = list;
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

        //slide tile 1 and 3 to 0, and every tile follow the rule
        if (esearcher.getSerNum()==0){
            epslist.add(new EpuzzleState(0,esearcher.getEPuzzleList().get(1),esearcher.transfer(0,1)));
            epslist.add(new EpuzzleState(0,esearcher.getEPuzzleList().get(3),esearcher.transfer(0,3)));
        }
        if (esearcher.getSerNum()==1){
            epslist.add(new EpuzzleState(1,esearcher.getEPuzzleList().get(0),esearcher.transfer(1,0)));
            epslist.add(new EpuzzleState(1,esearcher.getEPuzzleList().get(2),esearcher.transfer(1,2)));
            epslist.add(new EpuzzleState(1,esearcher.getEPuzzleList().get(4),esearcher.transfer(1,4)));
        }
        if (esearcher.getSerNum()==2){
            epslist.add(new EpuzzleState(2,esearcher.getEPuzzleList().get(1),esearcher.transfer(2,1)));
            epslist.add(new EpuzzleState(2,esearcher.getEPuzzleList().get(5),esearcher.transfer(2,5)));
        }
        if (esearcher.getSerNum()==3){
            epslist.add(new EpuzzleState(3,esearcher.getEPuzzleList().get(0),esearcher.transfer(3,0)));
            epslist.add(new EpuzzleState(3,esearcher.getEPuzzleList().get(4),esearcher.transfer(3,4)));
            epslist.add(new EpuzzleState(3,esearcher.getEPuzzleList().get(6),esearcher.transfer(3,6)));
        }
        if (esearcher.getSerNum()==4){
            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(1),esearcher.transfer(4,1)));
            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(3),esearcher.transfer(4,3)));
            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(5),esearcher.transfer(4,5)));
            epslist.add(new EpuzzleState(4,esearcher.getEPuzzleList().get(7),esearcher.transfer(4,7)));
        }
        if (esearcher.getSerNum()==5){
            epslist.add(new EpuzzleState(5,esearcher.getEPuzzleList().get(2),esearcher.transfer(5,2)));
            epslist.add(new EpuzzleState(5,esearcher.getEPuzzleList().get(4),esearcher.transfer(5,4)));
            epslist.add(new EpuzzleState(5,esearcher.getEPuzzleList().get(8),esearcher.transfer(5,8)));
        }
        if (esearcher.getSerNum()==6){
            epslist.add(new EpuzzleState(6,esearcher.getEPuzzleList().get(3),esearcher.transfer(6,3)));
            epslist.add(new EpuzzleState(6,esearcher.getEPuzzleList().get(7),esearcher.transfer(6,7)));
        }
        if (esearcher.getSerNum()==7){
            epslist.add(new EpuzzleState(7,esearcher.getEPuzzleList().get(4),esearcher.transfer(7,4)));
            epslist.add(new EpuzzleState(7,esearcher.getEPuzzleList().get(6),esearcher.transfer(7,6)));
            epslist.add(new EpuzzleState(7,esearcher.getEPuzzleList().get(8),esearcher.transfer(7,8)));
        }
        if (esearcher.getSerNum()==8){
            epslist.add(new EpuzzleState(8,esearcher.getEPuzzleList().get(5),esearcher.transfer(8,5)));
            epslist.add(new EpuzzleState(8,esearcher.getEPuzzleList().get(7),esearcher.transfer(8,7)));
        }

        for(EpuzzleState es: epslist) {
            slist.add((SearchState) es);
        }


        return slist;
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState eps = (EpuzzleState) n2;
        return  (serValue == eps.getSerValue() && thisValue == eps.getThisValue());

    }

    public ArrayList<Integer> toArray(HashMap<Integer,Integer> list){
        ePuzzleMap = list;
        ArrayList<Integer> toArr = new ArrayList<Integer>();
        for (int x : list.keySet()){
            toArr.add(x);
        }


        return toArr;
    }

    @Override
    public String toString() {
        return "EpuzzleState{" +
                "ePuzzleList=" + ePuzzleList +
                '}';
    }
}
