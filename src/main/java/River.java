import java.util.ArrayList;

public class River {

    ArrayList<Salmon> fish;

    // method name as file and with capital is constructor
    public River(){
        this.fish = new ArrayList<>();
    }

    public int getFishCount() {
        return this.fish.size();
    }

    public void addFish(Salmon salmon) {
        this.fish.add(salmon);
    }

    public Salmon removeFish() {
        return this.fish.remove(0);
    }
}
