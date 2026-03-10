
package generics;

public class max<T>{
    private T a;
    private T b;
    private T c;
    int maxi;
    max(T a,T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private void  maximum(T a,T b,T c){
        if((a>b) && (a>c)){
            maxi=a;
        }
        else if((b>a) && (b>c)){
            maxi=  b;
        }
        else {
            maxi =c;
        }
    }


    public static void main(String[] args){
        max<Integer> obj=new max<>(10,20,30);
        System.out.println(obj.maxi);
    }
}
