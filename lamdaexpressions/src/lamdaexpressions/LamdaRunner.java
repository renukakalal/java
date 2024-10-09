package lamdaexpressions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

import com.sun.org.apache.xpath.internal.functions.Function;

public class LamdaRunner<IntConsumer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//lamda expressions/arrow
		Starter starter=()->{
			System.out.println("running lamda expressions");
		};
		
		FoodApp foodApp=(String item)->
		{
		System.out.println("item:"+ item);
		};
		
		BiConsumer<String,Double> biConsumer=(name,price)->{
			System.out.println("running lamda aexpression"+name);
			System.out.println("running lamda aexpression"+price);
			
		};
			BiFunction<String,Double,Boolean> biFunction=(name,price)->{
				
				
				
				System.out.println("running lamda aexpression"+name);
				System.out.println("running lamda aexpression"+price);
				
			
		};
		BinaryOperator<String> binaryOperator=(num,age)->
		{
			System.out.println("running lamda aexpression");
		};
		BiPredicate<String,Boolean> biPredicate=(name,price)->{
			
		     return true;
		};
		BooleanSupplier booleanSupplier=()->
		{
			return false;
		};
		Consumer<String> consumer=(name)->{
			
		};
		
		
		DoubleBinaryOperator doubleBinaryOperator=(name1,name2)->{
			return 0;
		};
		
		DoubleConsumer doubleConsumer=(double price)->
		{
		
		};
		DoubleFunction<String> doublefunction=(double price)->
		{
			
		};
		DoublePredicate doublePredicate=(double value)->{
			return true;
		};
		DoubleSupplier doubleSupplier=()->
		{
			return 0;
		};
		DoubleToIntFunction doubleToIntFunction=(double num)->
		{
			return 0;
		};
		DoubleToLongFunction doubleToLongFunction=(double num)->
		{
			return 0;
		};
		DoubleUnaryOperator doubleUnaryOperator=(double num)->
		{
			return num;
		};
		
		Function<String,Double>  function=(name)->
		{
		return "";
		};
		IntBinaryOperator intBinaryOperator=(left,right)->
		{
			return 0;
			
		};
		IntConsumer intConsumer=(num)->
		{
			
			
		};
		IntFunction<Integer> intFunction=(num)->{
			
		};
		IntPredicate intPredicate=(res)->{
			return true;
		};
		IntSupplier IntSupplier=()->{
			
		};
		IntToDoubleFunction intToDoubleFunction=(int num)->
		{
			return num;
		};
		IntToLongFunction IntToLongFunction=(int num)->
		{
			return 0;
		};
		IntUnaryOperator IntUnaryOperator=(int no)->
		{
			return 0;
		};
		LongBinaryOperator longBinaryOperator=(num1,num2)->
		{
		return 0;
		};
		LongSupplier longSupplier=()->{
			return 0;
			
		};
		LongConsumer longConsumer=(num)->
		{
			
		};
		LongFunction<String> longFunction=(name)->
		{
			return "";
		};
		LongPredicate longPredicate=(vale)->
		{
			
		};
		LongToDoubleFunction longToDoubleFunction=(value)->
		{
			
		
		};
		LongToIntFunction longToIntFunction=(num)->
		{
			
		};
		LongUnaryOperator longUnaryOperator=(num)->
		{
			
		};
		ObjDoubleConsumer<String> objDoubleConsumer=(num1,name2)->
		{
			
		};
		ObjIntConsumer<String> objIntConsumer=(name1,name2)->
		{
			
		};
		ObjLongConsumer<Long> objLongConsumer=(name,number)->
		{
			
		};
		Predicate<String> predicate=(name)->
		{
			return true;
		};
		Supplier<String> Supplier=()->
		{
			return "";
		};
		ToDoubleBiFunction<String,Integer> ToDoubleBiFunction=(name,price)->
		{
			return 0;
		};
		ToDoubleFunction<Double> ToDoubleFunction=(value)->
		{
			return 0;
		};
		ToIntBiFunction<String,Double> ToIntBiFunction=(name,num)->{
			
			return 0;
		};
		ToIntFunction<String> ToIntFunction=(name)->
		{
			
		};
		ToLongBiFunction<String,Boolean> ToLongBiFunction=(name,num)->
		{
		
		};
		ToLongFunction<String> ToLongFunction=(name)->
		{
			return 0;
		};
		
		UnaryOperator<String> UnaryOperator=(name)->
		{
			
		};
	}}



