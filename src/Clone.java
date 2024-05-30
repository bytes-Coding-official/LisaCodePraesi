public class Clone implements Cloneable {

    private Compare compareItem;

    public Compare getCompareItem() {
        return compareItem;
    }

    public void setCompareItem(Compare compareItem) {
        this.compareItem = compareItem;
    }

    @Override
    public Compare clone() throws CloneNotSupportedException {
        return (Compare) super.clone();
    }
}
