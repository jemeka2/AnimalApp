
public class Snake extends Animal {

    public Snake() {
        super();
        System.out.println("A Snake is born!");
    }

    @Override
    public String sleep() {
        return "A snake sleeps...";
    }

    @Override
    public String eat() {
        return "A snake eats...";
    }

    public String hss() {
        return "hssss...\n";
    }

}