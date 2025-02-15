import java.util.*;

public class RotatedSortedArray{

    public static boolean pairSum2(ArrayList<Integer> list, int tar){
        int bp = -1; int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp !=rp){
            if(list.get(lp)+list.get(rp)==tar){
                return true;
            }
            if(list.get(lp)+list.get(rp)<tar){
                lp = (lp+1)%n;
            }
            else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(11);
        array.add(15);
        array.add(6);
        array.add(8);
        array.add(9);
        array.add(10);

        int target = 16;

        boolean b = pairSum2(array, target);

        System.out.println(b);
        
    }
}