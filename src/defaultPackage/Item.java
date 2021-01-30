package defaultPackage;

public class Item {
    private static final String cms = "0123456789.";
    private String cat = "";
    private String describe = "";
    private double amount = 0.0;

    public Item(){

    }

    public Item(String cat){
        this.cat = cat;
    }

    public void setCat(String cat){
        this.cat = cat;
    }

    public void setDescribe(String describe){
        this.describe = describe;
    }

    public boolean setAmount(String amount){
        if(convertToDouble(amount)){
            this.amount = Double.parseDouble(amount);
            return true;
        }
        else
            return false;
    }

    public String getCat(){
        return this.cat;
    }

    public String getDescribe(){
        return this.describe;
    }

    public double getAmount(){
        return this.amount;
    }

    private boolean convertToDouble(String amount){
        for(char c : amount.toCharArray()){
            if (!cms.contains(c+""))
                return false;
        }
        return true;
    }
}
