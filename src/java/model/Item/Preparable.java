package java.model.Item;

public interface Preparable {
    public boolean canBeChopped();
    public boolean canBeCooked();
    public boolean canBePlacedOnPlate();
    public void chop();
    public void cook();
}
