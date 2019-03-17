package BurgerOrderManagement;

public class PackingReceipt implements IReceiptStrategy {

	
	 public void PrintReceipt(CounterOrder order)
	 {
		 System.out.print("Printing Order Packing Receipt\n\n");
		 System.out.print("Pattie 1\n\n");
		 System.out.print("Order Number :  ");
		 System.out.print(order.orderNo + "\n\n");
		 System.out.print("       FIVE GUYS\n\n");
		 System.out.print(order.quantity + "  " + order.orderName + "\n");
		 
		 for (Toppings item: order.topTopping) {
			    System.out.println(item.name);
			}
		 for (Toppings item: order.middleTopping) {
			    System.out.println(item.name);
			}
		 for (Toppings item: order.bottomTopping) {
			    System.out.println(item.name);
			}
		 
		 System.out.print( "\n\n" + "Register:1" + "        Tran Seq: 54784" + "\n");
	
		 System.out.print(  "\n\n" + "--------------------" );
	 }
	
}
 