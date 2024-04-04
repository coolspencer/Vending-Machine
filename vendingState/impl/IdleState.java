package vendingState.impl;

import java.util.ArrayList;
import java.util.List;

import vendingState.State;

public class IdleState implements State {
    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("Machine is in idle State Please click on Insert Coin Button");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        machine.setVendingMachineState(new HashMoneyState());
        System.out.println("Please add Coin");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("Machine is in idle State Please click on Insert Coin Button");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("Machine is in idle State Please click on Insert Coin Button");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("Machine is in idle State Please click on Insert Coin Button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("Machine is in idle State Please click on Insert Coin Button");
        return;

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("Machine is in idle State Please click on Insert Coin Button");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.inventory.addItem(item, codeNumber);
        return;
    }

}
