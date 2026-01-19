public abstract class Shape implements Measurable {
    // Fields
    protected String name;

    //constructor
    public Shape (String name){
        this.name = name;
    }

    //concrete Method
    public String getName(){
        return name;
    }

    //abstract methods
    //no need. they already exists in Measurable Interface
}
