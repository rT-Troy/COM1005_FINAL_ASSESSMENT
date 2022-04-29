import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class EpuzzleState extends SearchState{

    private int[] ePuzzleList;

    public EpuzzleState(EpuzzleSearch searcher){
        ePuzzleList = searcher.getPuzzleList();
//        for (int i = 0; i < searcher.getPuzzleList().length; i++) {
//            if(searcher.getPuzzleList()[i]==0){
//                ePuzzleList = searcher.getPuzzleList();
//            }
//        }
    }

    public EpuzzleState(int[] epList){
        ePuzzleList = epList;
    }

    public int[] getePuzzleList() {
        return ePuzzleList;
    }


    @Override
    boolean goalPredicate(Search searcher) {
        boolean result = true;
        for (int i = 0; i < ePuzzleList.length-1; i++) {
            if (ePuzzleList[i] != i+1){
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    ArrayList<SearchState> getSuccessors(Search searcher) {
        EpuzzleSearch ssearcher = (EpuzzleSearch) searcher;
        int[] list =ssearcher.getPuzzleList();
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        ArrayList<SearchState> sslist = new ArrayList<SearchState>();


        int ser = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] == 0) {
                ser = i;
                break;
            }
        }
        boolean x = true;
        if (list[ser]==0 && x){
            epslist.add(slide(list,0,1));
            epslist.add(slide(list,0,3));
            x = false;
        }else if (list[ser]==1 && x){
            epslist.add(slide(list,1,0));
            epslist.add(slide(list,1,2));
            epslist.add(slide(list,1,4));
            x = false;
        }else if (list[ser]==2 && x){
            epslist.add(slide(list,2,1));
            epslist.add(slide(list,2,5));
            x = false;
        }else if (list[ser]==3 && x){
            epslist.add(slide(list,3,0));
            epslist.add(slide(list,3,4));
            epslist.add(slide(list,3,6));
            x = false;
        }else if (list[ser]==4 && x){
            epslist.add(slide(list,4,1));
            epslist.add(slide(list,4,3));
            epslist.add(slide(list,4,5));
            epslist.add(slide(list,4,7));
            x = false;
        }else if (list[ser]==5 && x){
            epslist.add(slide(list,5,2));
            epslist.add(slide(list,5,4));
            epslist.add(slide(list,5,8));
            x = false;
        }else if (list[ser]==6 && x){
            epslist.add(slide(list,6,3));
            epslist.add(slide(list,6,7));
            x = false;
        }else if (list[ser]==7 && x){
            epslist.add(slide(list,7,4));
            epslist.add(slide(list,7,6));
            epslist.add(slide(list,7,8));
            x = false;
        }else if (list[ser]==8 && x) {
            epslist.add(slide(list,8,5));
            epslist.add(slide(list,8,7));
            x = false;
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
