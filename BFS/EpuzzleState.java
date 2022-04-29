import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class EpuzzleState extends SearchState{

    private int[] ePuzzleList;
    private final int[] GOAL = {1,2,3,4,5,6,7,0};

    public EpuzzleState(int[] epList){
        ePuzzleList = epList;
    }
    public EpuzzleState(EpuzzleSearch searcher){
        ePuzzleList = searcher.getPuzzleList();
//        for (int i = 0; i < searcher.getPuzzleList().length; i++) {
//            if(searcher.getPuzzleList()[i]==0){
//                ePuzzleList = searcher.getPuzzleList();
//            }
//        }
    }

    public int[] getePuzzleList() {
        return ePuzzleList;
    }


    @Override
    boolean goalPredicate(Search searcher) {

        return (Arrays.equals(getePuzzleList(),GOAL));

//        boolean result = true;
//        for (int i = 0; i < ePuzzleList.length-1; i++) {
//            if (ePuzzleList[i] != i+1){
//                result = false;
//                break;
//            }
//        }
//        return result;
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        EpuzzleSearch ssearcher = (EpuzzleSearch) searcher;
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        ArrayList<SearchState> sslist = new ArrayList<SearchState>();

//        int ser = 0;
//        for (int i = 0; i < LIST.length; i++) {
//            if(LIST[i] == 0) {
//                ser = i;
//                break;
//            }
//        }
        if (ssearcher.getPuzzSerNum(0)==0){
            epslist.add(slide(ssearcher.getPuzzleList(),0,1));
            epslist.add(slide(ssearcher.getPuzzleList(),0,3));
        }else if (ssearcher.getPuzzSerNum(0)==1){
            epslist.add(slide(ssearcher.getPuzzleList(),1,0));
            epslist.add(slide(ssearcher.getPuzzleList(),1,2));
            epslist.add(slide(ssearcher.getPuzzleList(),1,4));
        }else if (ssearcher.getPuzzSerNum(0)==2){
            epslist.add(slide(ssearcher.getPuzzleList(),2,1));
            epslist.add(slide(ssearcher.getPuzzleList(),2,5));
        }else if (ssearcher.getPuzzSerNum(0)==3){
            epslist.add(slide(ssearcher.getPuzzleList(),3,0));
            epslist.add(slide(ssearcher.getPuzzleList(),3,4));
            epslist.add(slide(ssearcher.getPuzzleList(),3,6));
        }else if (ssearcher.getPuzzSerNum(0)==4){
            epslist.add(slide(ssearcher.getPuzzleList(),4,1));
            epslist.add(slide(ssearcher.getPuzzleList(),4,3));
            epslist.add(slide(ssearcher.getPuzzleList(),4,5));
            epslist.add(slide(ssearcher.getPuzzleList(),4,7));
        }else if (ssearcher.getPuzzSerNum(0)==5){
            epslist.add(slide(ssearcher.getPuzzleList(),5,2));
            epslist.add(slide(ssearcher.getPuzzleList(),5,4));
            epslist.add(slide(ssearcher.getPuzzleList(),5,8));
        }else if (ssearcher.getPuzzSerNum(0)==6){
            epslist.add(slide(ssearcher.getPuzzleList(),6,3));
            epslist.add(slide(ssearcher.getPuzzleList(),6,7));
        }else if (ssearcher.getPuzzSerNum(0)==7){
            epslist.add(slide(ssearcher.getPuzzleList(),7,4));
            epslist.add(slide(ssearcher.getPuzzleList(),7,6));
            epslist.add(slide(ssearcher.getPuzzleList(),7,8));
        }else if (ssearcher.getPuzzSerNum(0)==8) {
            epslist.add(slide(ssearcher.getPuzzleList(),8,5));
            epslist.add(slide(ssearcher.getPuzzleList(),8,7));
        }

        for(EpuzzleState es : epslist){
            sslist.add((SearchState) es);
        }

        return sslist;
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState eqs = (EpuzzleState) n2;
        return (Arrays.equals(ePuzzleList,eqs.getePuzzleList()));
    }


    public EpuzzleState slide(int[] pzList, int serNum, int sucSerNum){
        int[] li = pzList;
        for (int i = 0; i < li.length; i++) {
            int x = li[serNum];
            int y = li[sucSerNum];
            li[serNum] = y;
            li[sucSerNum] = x;
        }
//        EpuzzleSearch theSearch = new EpuzzleSearch(pzList);
//        EpuzzleState theState = new EpuzzleState(theSearch);
        return new EpuzzleState(new EpuzzleSearch(li));
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for (int i = 0; i < pzList.length; i++) {
//            map.put(i,pzList[i]);
//            if (i==serNum || i==sucSerNum){
//                map.put(serNum,pzList[sucSerNum]);
//                map.put(sucSerNum,pzList[serNum]);
//            } else{
//                map.put
//            }
//        }
//        map.replace(serNum,map.get(sucSerNum));
//        map.replace(sucSerNum,map.get(serNum));
//        int[] l = new int[16];
//        for (int i = 0; i < l.length; i++) {
//            l[i] = map.get(i);
//        }
//        setePuzzleList(l);
//
//        return new EpuzzleState(l);

    }



    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\r\n");
        for (int i = 0; i < 9; i++) {
            sb.append(getePuzzleList()[i]);
            if ((i+1)%3==0){
                sb.append("\r\n");
            }
        }
        String st = sb.toString();
        return st;
    }
}
