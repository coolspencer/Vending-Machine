public class ItemShelf {
    private boolean soldOut;
    private Item item;
    private int code;

    public ItemShelf(boolean soldOut, Item item, int code) {
        this.soldOut = soldOut;
        this.item = item;
        this.code = code;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
