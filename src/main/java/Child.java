import java.util.ArrayList;
import java.util.Arrays;

public class Child extends Person{
    protected Parent parent1;
    protected Parent parent2;
    protected Child[] siblings;

    public Child(String name, int age, Parent parent1, Parent parent2){
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        siblings = new Child[0];
    }

    public Parent getParent1(){return this.parent1;}
    public Parent getParent2(){return this.parent2;}
    public Child[] getSiblings(){return this.siblings;}
    public void setSiblings(Child[] siblings){
        this.siblings = siblings;
    }

    public void addSibling(Child child){
        this.siblings = Arrays.copyOf(this.siblings, this.siblings.length+1);
        this.siblings[this.siblings.length-1] = child;
    }
}