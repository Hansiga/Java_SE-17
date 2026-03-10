package generics;

public class pair <T,U>{
    private T first;
    private U second;
    pair(T first,U second){
        this.first=first;
        this.second=second;
    }
    private void  getFirst(T first){
        System.out.println(first);
    }
    private void getSecond(U second){
        System.out.println(second);
    }

    public static void main(String[] args){
        pair<Integer, Integer> obj=new pair<>(21,19);
        System.out.println(obj.first);
        System.out.println(obj.second);
    }
}
