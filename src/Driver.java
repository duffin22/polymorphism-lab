/**
 * Created by matthewtduffin on 23/08/2016.
 */
public class Driver {

  public static void main(String[] args) {
    //Create households and add to list or array
    Household house1 = new CatOwnerHousehold("Fluffy");
    doHomelyThings(house1);

    Household house2 = new DogOwnerHousehold("Rusty");
    doHomelyThings(house2);

    //iterate through list or array and perform required actions
  }

  public static void doHomelyThings(Household housey) {
    housey.MakeSomeMoney(housey);
    housey.PayTheTaxman(housey);
    housey.LookAfterYourPet();
  }

}
