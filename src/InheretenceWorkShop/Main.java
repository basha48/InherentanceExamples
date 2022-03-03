package InheretenceWorkShop;

import java.util.ArrayList;
import java.util.List;

import com.food.items.FoodItem;

public class Main {
	List <FoodItem>list = new ArrayList<>();
	public static void main(String[] args) {
		Main main = new Main(); 
		
		Idly idly = new Idly();
		Puri puri = new Puri();
		Chepathi chepathi = new Chepathi();

		main.add(idly);
		main.add(puri);
		main.add(chepathi);
		
		main.remove(chepathi);
	}

	public void add(FoodItem fooditem) {
		list.add(fooditem);
    }
	
	public void remove(FoodItem fooditem) {
		list.remove(fooditem);
    }
}