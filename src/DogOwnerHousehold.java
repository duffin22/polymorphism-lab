/**
 * Created by matthewtduffin on 23/08/2016.
 */
public class DogOwnerHousehold extends Household {
  public String dogName;

  public DogOwnerHousehold(String dogName) {
    this.houseName = dogName + "'s House";
    this.dogName = dogName;
  }

  @Override
  public void PayTheTaxman(Household housey) {
    System.out.println(housey.houseName+" just paid $" + (housey.income/5)+" to the taxman.");
  }

  @Override
  public void LookAfterYourPet() {
    System.out.println("The homeowner looks after his dog and the dog appreciates it because dogs are cool.");
  }
}