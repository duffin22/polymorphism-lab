/**
 * Created by matthewtduffin on 23/08/2016.
 */
public class CatOwnerHousehold extends Household {
  public String catName;

  public CatOwnerHousehold(String catName) {
    this.houseName = catName + "'s House";
    this.catName = catName;
  }

  @Override
  public void PayTheTaxman(Household housey) {
    System.out.println(housey.houseName+" just paid $" + (housey.income/5)+" to the taxman.");
  }

  @Override
  public void LookAfterYourPet() {
    System.out.println("The homeowner tries to pet his cat, but got scratched because cats are assholes.");
  }
}
