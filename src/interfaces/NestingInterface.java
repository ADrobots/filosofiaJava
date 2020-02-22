package interfaces;
class A{
    interface B{
        public void f();
    }

    public class BImp implements B{
        public void f(){};
    }
    private class BImp2 implements B{
        public void f(){};
    }

    public interface  C{
        void f();
    }

    class CImp implements C{
        public void f(){};
    }
    private class CImp2 implements C{
        public void f(){};
    }

    private interface D{
        void f();
    }

    private class DImp implements D{
        public void f(){};
    }
    public class DImpl2 implements D{
        public void f(){};
    }
    public D getD(){return new DImpl2();}
    private D dRef;
    public void receiveD(D d){
        dRef=d;
        dRef.f();
    }
}

interface E{
    interface G{void f();}
    public interface H{void f();}//избыточное объявление public
    void g();
    //private interface I{} не может быть private внутри интерфейса
}

public class NestingInterface {
    public class BImp implements A.B{
        public void f() {};
    }
    public class CImp implements A.C{
        public void f(){};
    }
    //class DImp implements A.D{public void f();} нельзя реализовать private-интерфейс, кроме как внутри класса, где он определен;
    class EImp implements E{
        public void g(){};
    }
    class EG implements E.G{
        public void f(){};
    }

    public static void main(String[] args) {
        A a=new A();
       // A.D=a.getD(); нет доступа к A.D так как private
        A.DImpl2 di2= (A.DImpl2) a.getD();
        //a.getD().f(); нельзя получить доступ к членам интерфейса
        A a2=new A();
        a2.receiveD(a.getD());
    }
}
