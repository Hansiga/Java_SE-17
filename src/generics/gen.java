package generics;

public class gen<T> {
    private  T a;
    private  T b;
    gen(T a,T b){
        this.a=a;
        this.b=b;
    }
    public static void main(String []args){
        gen<Integer> obj=new gen<>(21,20);
        System.out.println(obj.a);
    }
}
