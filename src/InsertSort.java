import java.util.LinkedList;

public class InsertSort {
    private LinkedList<Integer> arr=new LinkedList<>();
    private int candidate;

    public InsertSort(int newNum){
        candidate=newNum;
    }

    public void setArr(String strs){
       String[] arr=strs.split(",");
       for (int j=0;j<arr.length;j++){
           this.arr.add(j,Integer.parseInt(arr[j]));
       }
    }

    public void insert(int candidate){
        for (int i=0;i<arr.size();i++){
            if (arr.get(i) >candidate){
                arr.set(i,candidate);
            }else {
                continue;
            }
        }
    }
}

