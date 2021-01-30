package defaultPackage;

public abstract class Book {
    abstract public void setType(String type);
    abstract public void setTitle(String title);
    abstract public void addItem(Item item);
    abstract public void setAmount(double amount);
    abstract public void setUnit(String unit);

    abstract public void getType();
    abstract public void getTitle();
    abstract public void getItem();
    abstract public double getAmount();

    abstract public void analysis();

}
