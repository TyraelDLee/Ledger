package defaultPackage;

import java.util.ArrayList;

public class GoalBook extends Book{
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public void setType(String type) {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public void setAmount(double amount) {

    }

    @Override
    public void setUnit(String unit) {

    }

    @Override
    public void getType() {

    }

    @Override
    public void getTitle() {

    }

    @Override
    public void getItem() {

    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public void analysis() {

    }
}
