package defaultPackage;

public class LowerLevelBook implements FactoryInterface{
    private static final String GOAL = "GOAL";
    private static final String NORMAL = "NORMAL";

    @Override
    public Book createBook(String type) {
        Book book;
        if(type.equals(GOAL))
            book = new GoalBook();
        else if(type.equals(NORMAL))
            book = new NormalBook();
        else
            book = null;
        return book;
    }

    @Override
    public Book loadBook() {
        return null;
    }
}
