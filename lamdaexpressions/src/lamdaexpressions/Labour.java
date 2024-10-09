package lamdaexpressions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;

public class Labour {
	
	public void startMotors(Starter starter)
	{
		if(starter!=null)
		{
			System.out.println("start is not null");
			starter.on();
		}
		else
		{
			System.out.println("starter is running");
		}
	}
	public void orderFood(FoodApp foodApp)
	{
		if(foodApp!=null)
		{
			foodApp.order("idli");
		}
		else
		{
			System.out.println("starter is running");
		}
		}
	public void biConsumer(BiConsumer biConsumer) {
		// TODO Auto-generated method stub
		
	}
	public void biFunction(BiFunction biFunction) {
		// TODO Auto-generated method stub
		
	}
	public void binaryOperator(BinaryOperator binaryOperator) {
		// TODO Auto-generated method stub
		
	}
	public boolean upplier(BooleanSupplier booleanSupplier) {
		// TODO Auto-generated method stub
		return false;
	}
	
	}
	


