package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		showProduct(list);
		
		//list.forEach(new PriceUpdate());
		list.forEach(Product::staticPriceUpdate);
		showProduct(list);
	}
	public static void showProduct(List<Product> list) {
		list.sort((p1,p2)-> p1.getPrice().compareTo(p2.getPrice()));
		list.forEach(System.out::println);
		System.out.println();
	}
}
