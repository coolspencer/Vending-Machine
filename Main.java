import vendingState.State;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        VendingMachine vendingMachine = new VendingMachine();
        try {

            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.FIFTEY);
            vendingState.insertCoin(vendingMachine, Coin.HUNDRED);
            // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);

        } catch (Exception e) {
            displayInventory(vendingMachine);
        }

    }

    private static void fillUpInventory(VendingMachine vendingMachine) throws Exception {
        Inventory inventory = vendingMachine.getInventory();

        for (int i = 0; i < 10; i++) {
            Item newItem = new Item();
            if (i >= 0 && i < 3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i >= 7 && i < 10) {
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            inventory.addItem(100 + i, newItem);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {

        Inventory list = vendingMachine.getInventory();
        for (int i = 0; i < 10; i++) {

            System.out.println("CodeNumber: " + list.inventory.get(i).getCode() +
                    " Item: " + list.inventory.get(i).getItem().getType().name() +
                    " Price: " + list.inventory.get(i).getItem().getPrice() +
                    " isAvailable: " + list.inventory.get(i).isSoldOut());
        }
    }
}
