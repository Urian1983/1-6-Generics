package level1.model;

public class GenericMethods <E>{

    private E var1;
    private E var2;
    private E var3;
    private String string;

    public GenericMethods(E var1, E var2, E var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public GenericMethods (E var1, String string, E var2){
        this.var1= var1;
        this.string = string;
        this.var2= var2;
    }

    @Override
    public String toString() {
        return "var1=" + var1 +
                ", var2=" + var2 +
                ", var3=" + var3 +"String? " +string;
    }

    }

