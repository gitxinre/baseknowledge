package common.Bean;

public class B extends A {




    public String getIdValue(String abc){
        this.setId(abc);
        return super.getIdValue();
    }

    public static void main(String[] args) {

        B b = new B();
        String mfl = b.getIdValue("mfl");


        System.out.println("mfl = " + mfl);


    }
}
