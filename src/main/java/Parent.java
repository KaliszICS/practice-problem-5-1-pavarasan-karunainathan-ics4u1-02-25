import java.util.ArrayList;
import java.util.Arrays;

public class Parent extends Person{
    protected Parent spouse;
    protected Child[] children;

    public Parent(String name, int age, Parent spouse){
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[0];
    }

    public Parent(String name, int age){
        super(name, age);
        spouse = null;
        this.children = new Child[0];
    }

    public Parent getSpouse(){return this.spouse;}
    public Child[] getChildren(){return this.children;}
    public void setSpouse(Parent spouse){this.spouse = spouse;}
    public void setChildren(Child[] children){
        this.children = children;
    }

    public void addChild(Child child){
        this.children = Arrays.copyOf(this.children, this.children.length+1);
        this.children[this.children.length-1] = child;
    }
}