package BurgerOrderManagement;

public class StrategyContext {

	   private IReceiptStrategy receiptStrategy;

	   public StrategyContext(IReceiptStrategy selectedStrategy){
	      this.receiptStrategy = selectedStrategy;
	   }

	   public void executeStrategy(CounterOrder value){
	      receiptStrategy.PrintReceipt(value);
	   }
}
