import java.util.*;

public class Inventory {
    List<ItemShelf> inventory;

    Inventory() {
        inventory = new ArrayList<>();
    }

    public void addItem(int code, Item item) throws Exception {
        for (ItemShelf it : inventory)
            if (it.getCode() == code) {
                throw new Exception("Item is already there");
            }
        inventory.add(new ItemShelf(false, item, code));
    }

    public ItemShelf getItem(int code) throws Exception {
        ItemShelf curr = null;
        for (ItemShelf it : inventory)
            if (it.getCode() == code && it.isSoldOut()) {
                throw new Exception("Item is already Sold out");
            } else if (it.getCode() == code)
                curr = it;
        return curr;
    }

    public void updateSoldItem(int code) throws Exception {
        for (ItemShelf it : inventory)
            if (it.getCode() == code && it.isSoldOut()) {
                throw new Exception("Item is already Sold out");
            } else if (it.getCode() == code)
                it.setSoldOut(true);
    }
}
