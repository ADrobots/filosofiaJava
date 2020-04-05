package generics;

public class FiveTuple<A,B,C,D,E> extends FourTuple{
    public final E five;
    public FiveTuple(A a,B b,C c,D d,E e){
        super(a,b,c,d);
        this.five=e;
    }

    public String toString(){
        return "("+first+", "+second+", "+third+", "+four+", "+five+")";
    }
}
