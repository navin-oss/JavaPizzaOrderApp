
public class Pizza {
	private int price;
	private boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingPrice=150;
	private int backPack=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingAdded=false;
	private boolean isOptedforTakeAway=false;
	
	public Pizza(boolean veg) {
		super();
		this.veg = veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
      
	
   public void addExtracheese() {
//	   System.out.println("Extra Cheese :");/
	   isExtraCheeseAdded=true;
	 
	   this.price += extraCheesePrice;
   }
public void addExtraToppings() {
	isExtraToppingAdded=true;

	   this.price += extraToppingPrice;
	   
   }
public void takeAway() {
	isOptedforTakeAway=true;

	   this.price += backPack;
	   
}
public void getBill() {
//	   System.out.println(this.price);
	String bill=" ";
	System.out.println("Base Pizza :"+basePizzaPrice);
	if(isExtraCheeseAdded) {
		bill += "Extra Cheese added :"+extraCheesePrice+ "\n";
	}
	if(isExtraToppingAdded) {
		bill += "Extra Topping added :"+extraToppingPrice + "\n";
	}
	if(isOptedforTakeAway) {
		bill += "Take Away :"+backPack + "\n";
	}
	  bill += "Bill: "+this.price+ "\n";
	System.out.println(bill);
}
}
