package org.velezreyes.quiz.question6;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine{

  private final Map<String, DrinkImpl> products = new HashMap<String, DrinkImpl>();
  private int quarters = 0;

  VendingMachineImpl(){
    products.put("ScottCola",new DrinkImpl("ScottCola",true,3));
    products.put("KarenTea",new DrinkImpl("KarenTea",false,4));
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl() ;
  }

  @Override
  public void insertQuarter() {
    quarters += 1;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    DrinkImpl drink = (DrinkImpl)products.get(name);
    if(drink == null){
      throw new UnknownDrinkException();
    }
    if(drink.getCost() <= quarters){
      quarters -= drink.getCost();
      return drink;
    }
    else{
      throw new NotEnoughMoneyException();
    }
  }
}
