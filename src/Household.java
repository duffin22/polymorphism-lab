/**
 * Created by matthewtduffin on 23/08/2016.
 */
public abstract class Household implements Taxpayer {
  public int income = (int) (Math.random()* 1000000);
  public String houseName;

  public void MakeSomeMoney(Household housey) {
    System.out.println(housey.houseName+" just earned $" + housey.income);
  }

  public abstract void LookAfterYourPet();

}
