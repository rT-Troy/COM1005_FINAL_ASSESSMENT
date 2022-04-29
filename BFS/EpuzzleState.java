import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class EpuzzleState extends SearchState{

    private int[] ePuzzleList;

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

//    public int getSerNumber(int[] list, int Index){
//        list = getePuzzleList();
//        int n=-1;
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] == Index){
//                n = i;
//                break;
//            }
//        }
//        return n;
//    }


    @Override
    boolean goalPredicate(Search searcher) {
        EpuzzleSearch esearcher = (EpuzzleSearch) searcher;
        return (Arrays.equals(ePuzzleList,esearcher.getGOAL()));

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
        ArrayList<EpuzzleState> epslist = new ArrayList<EpuzzleState>();
        ArrayList<SearchState> sslist = new ArrayList<SearchState>();



//        for (int i = 0; i < ePuzzleList.length; i++) {
//            if(i == 0){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//            } else if(i == 1){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//            } else if(i == 2){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//            } else if(i == 3){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//            } else if(i == 4){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//            } else if(i == 5){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[8], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[5]}));
//            } else if(i == 6){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//            } else if(i == 7){
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[8]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[8], ((EpuzzleSearch) searcher).getPuzzleList()[7]}));
//            } else if(i == 8) {
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[8], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[7], ((EpuzzleSearch) searcher).getPuzzleList()[5]}));
//                epslist.add(new EpuzzleState(new int[]{((EpuzzleSearch) searcher).getPuzzleList()[0], ((EpuzzleSearch) searcher).getPuzzleList()[1], ((EpuzzleSearch) searcher).getPuzzleList()[2], ((EpuzzleSearch) searcher).getPuzzleList()[3], ((EpuzzleSearch) searcher).getPuzzleList()[4], ((EpuzzleSearch) searcher).getPuzzleList()[5], ((EpuzzleSearch) searcher).getPuzzleList()[6], ((EpuzzleSearch) searcher).getPuzzleList()[8], ((EpuzzleSearch) searcher).getPuzzleList()[7]}));
//            }



        }
//        int num = getIndex(ePuzzleList,);
//        if(num == 0){
//            epslist.add(new EpuzzleState(new int[]{arr[1], arr[0], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[3], arr[1], arr[2], arr[0], arr[4], arr[5], arr[6], arr[7], arr[8]}));
//        } else if(num == 1){
//            epslist.add(new EpuzzleState(new int[]{arr[1], arr[0], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[2], arr[1], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[4], arr[2], arr[3], arr[1], arr[5], arr[6], arr[7], arr[8]}));
//        } else if(num == 2){
//        epslist.add(new EpuzzleState(new int[]{arr[0], arr[2], arr[1], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]}));
//        epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[5], arr[3], arr[4], arr[2], arr[6], arr[7], arr[8]}));
//        } else if(num == 3){
//            epslist.add(new EpuzzleState(new int[]{arr[3], arr[1], arr[2], arr[0], arr[4], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[4], arr[3], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[6], arr[4], arr[5], arr[3], arr[7], arr[8]}));
//        } else if(num == 4){
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[4], arr[2], arr[3], arr[1], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[4], arr[3], arr[5], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[5], arr[4], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[7], arr[5], arr[6], arr[4], arr[8]}));
//        } else if(num == 5){
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[5], arr[3], arr[4], arr[2], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[5], arr[4], arr[6], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[4], arr[8], arr[6], arr[7], arr[5]}));
//        } else if(num == 6){
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[6], arr[4], arr[5], arr[3], arr[7], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[7], arr[6], arr[8]}));
//        } else if(num == 7){
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[7], arr[5], arr[6], arr[4], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[7], arr[6], arr[8]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[8], arr[7]}));
//        } else if(num == 8) {
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[4], arr[8], arr[6], arr[7], arr[5]}));
//            epslist.add(new EpuzzleState(new int[]{arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[8], arr[7]}));
//        }
        for(EpuzzleState es : epslist){
            sslist.add(es);
        }

        return sslist;



//        int ser = 0;
//        for (int i = 0; i < LIST.length; i++) {
//            if(LIST[i] == 0) {
//                ser = i;
//                break;
//            }
//        }
//        if (ssearcher.getPuzzSerNum(0)==0){
//            epslist.add(slide(ssearcher.getPuzzleList(),0,1));
//            epslist.add(slide(ssearcher.getPuzzleList(),0,3));
//        }else if (ssearcher.getPuzzSerNum(0)==1){
//            epslist.add(slide(ssearcher.getPuzzleList(),1,0));
//            epslist.add(slide(ssearcher.getPuzzleList(),1,2));
//            epslist.add(slide(ssearcher.getPuzzleList(),1,4));
//        }else if (ssearcher.getPuzzSerNum(0)==2){
//            epslist.add(slide(ssearcher.getPuzzleList(),2,1));
//            epslist.add(slide(ssearcher.getPuzzleList(),2,5));
//        }else if (ssearcher.getPuzzSerNum(0)==3){
//            epslist.add(slide(ssearcher.getPuzzleList(),3,0));
//            epslist.add(slide(ssearcher.getPuzzleList(),3,4));
//            epslist.add(slide(ssearcher.getPuzzleList(),3,6));
//        }else if (ssearcher.getPuzzSerNum(0)==4){
//            epslist.add(slide(ssearcher.getPuzzleList(),4,1));
//            epslist.add(slide(ssearcher.getPuzzleList(),4,3));
//            epslist.add(slide(ssearcher.getPuzzleList(),4,5));
//            epslist.add(slide(ssearcher.getPuzzleList(),4,7));
//        }else if (ssearcher.getPuzzSerNum(0)==5){
//            epslist.add(slide(ssearcher.getPuzzleList(),5,2));
//            epslist.add(slide(ssearcher.getPuzzleList(),5,4));
//            epslist.add(slide(ssearcher.getPuzzleList(),5,8));
//        }else if (ssearcher.getPuzzSerNum(0)==6){
//            epslist.add(slide(ssearcher.getPuzzleList(),6,3));
//            epslist.add(slide(ssearcher.getPuzzleList(),6,7));
//        }else if (ssearcher.getPuzzSerNum(0)==7){
//            epslist.add(slide(ssearcher.getPuzzleList(),7,4));
//            epslist.add(slide(ssearcher.getPuzzleList(),7,6));
//            epslist.add(slide(ssearcher.getPuzzleList(),7,8));
//        }else if (ssearcher.getPuzzSerNum(0)==8) {
//            epslist.add(slide(ssearcher.getPuzzleList(),8,5));
//            epslist.add(slide(ssearcher.getPuzzleList(),8,7));
//        }
//        for(EpuzzleState es : epslist){
//            sslist.add((SearchState) es);
//        }

//        return sslist;
    }

    @Override
    boolean sameState(SearchState n2) {
        EpuzzleState eqs = (EpuzzleState) n2;
        return Arrays.equals(ePuzzleList,eqs.getePuzzleList());
    }


//    public EpuzzleState slide(int[] pzList, int serNum, int sucSerNum){
//        int[] li = pzList;
//        for (int i = 0; i < li.length; i++) {
//            int x = li[serNum];
//            int y = li[sucSerNum];
//            li[serNum] = y;
//            li[sucSerNum] = x;
//        }
//        return new EpuzzleState(new EpuzzleSearch(li));


//        EpuzzleSearch theSearch = new EpuzzleSearch(pzList);
//        EpuzzleState theState = new EpuzzleState(theSearch);

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

//    }



    @Override
    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        sb.append("\r\n");
//        for (int i = 0; i < 9; i++) {
//            sb.append(getePuzzleList()[i]);
//        }
//        String st = sb.toString();
//        return st;

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
