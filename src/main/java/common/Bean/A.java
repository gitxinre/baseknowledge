package common.Bean;

public class A {
    private String id = "A";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected String getIdValue(){

        return this.id;

    }

    public static void main(String[] args) {
        A a = new A();

        String idValue = a.getIdValue();
        System.out.println("idValue = " + idValue);
    }
}
