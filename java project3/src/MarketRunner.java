import com.xworkz.engineering.data.Marketdata;
import com.xworkz.engineering.runner.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarketStore store=new MarketStore();
		
		Marketdata data1=new Marketdata("dmart","banglore");
		Marketdata data2=new Marketdata("suparmarket","hydrabad");
		Marketdata data3=new Marketdata("mr.mart","kalburgi");
		Marketdata data4=new Marketdata("market","gurumitkal");
		Marketdata data5=new Marketdata("kr market","banglore");
		store.buy(data1);
		store.buy(data2);
		store.buy(data3);
		store.buy(data4);
		store.buy(data5);
		store.show();
	}

}
