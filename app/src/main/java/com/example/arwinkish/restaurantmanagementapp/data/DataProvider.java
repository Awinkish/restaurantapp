package com.example.arwinkish.restaurantmanagementapp.data;

import java.util.ArrayList;

import com.example.arwinkish.restaurantmanagementapp.restaurant.Table;
import com.example.arwinkish.restaurantmanagementapp.R;

import com.example.arwinkish.restaurantmanagementapp.data.Product.Type;

/**
 * The Class DataProvider.
 */
public class DataProvider {

	public static ArrayList<Table> tables;
	public static ArrayList<Product> products;
	public static ArrayList<ProductCategory> categories;
	/**
	 * Gets the tables in the restaurant.
	 *
	 * @return the tables
	 */
	public static void generateTables()
	{
		tables=new ArrayList<Table>();
		tables.add(new Table(0,3));
		tables.add(new Table(1,4));
		tables.add(new Table(2,4));
		tables.add(new Table(3,2));
		tables.add(new Table(4,6));
		tables.add(new Table(5,8));
		tables.add(new Table(6,4));
		tables.add(new Table(7,2));
		
		tables.get(4).empty=false; tables.get(4).curClients=5;
		tables.get(2).empty=false; tables.get(2).curClients=3;
		
	}
	
	/**
	 * Gets the tables.
	 *
	 * @return the tables
	 */
	public static ArrayList<Table> getTables()
	{
		return tables;
	}
	
	/**
	 * Generate products.
	 */
	public static void generateProducts()
	{
		products=new ArrayList<Product>();
		products.add(new Product("Soup One", 8, R.drawable.soup, Type.Soup));
		products.add(new Product("Soup Two", 8, R.drawable.soup, Type.Soup));
		products.add(new Product("Soup Three", 8.5f, R.drawable.soup, Type.Soup));
		products.add(new Product("Soup Four", 7, R.drawable.soup, Type.Soup));

		products.add(new Product("Dessert One", 6, R.drawable.pancakes, Type.Dessert));
		products.add(new Product("Dessert Two", 12, R.drawable.dessert, Type.Dessert));
		products.add(new Product("Dessert Three", 8, R.drawable.dessert, Type.Dessert));
		products.add(new Product("Dessert Four", 8, R.drawable.dessert, Type.Dessert));
		products.add(new Product("Dessert Five", 10.5f, R.drawable.dessert, Type.Dessert));

		products.add(new Product("MainDish One", 14, R.drawable.main_dish, Type.MainDish));
		products.add(new Product("MainDish Two", 16, R.drawable.main_dish, Type.MainDish));
		products.add(new Product("MainDish Three", 12, R.drawable.main_dish, Type.MainDish));
		products.add(new Product("MainDish Four", 13.5f, R.drawable.main_dish, Type.MainDish));
		products.add(new Product("MainDish Five", 14, R.drawable.main_dish, Type.MainDish));
		products.add(new Product("MainDish Six", 16, R.drawable.pasta, Type.MainDish));
		products.add(new Product("MainDish Seven", 14, R.drawable.pasta, Type.MainDish));
		products.add(new Product("MainDish Eight", 14.5f, R.drawable.pasta, Type.MainDish));
		products.add(new Product("MainDish Nine", 13, R.drawable.pasta, Type.MainDish));
		products.add(new Product("MainDish Ten", 23, R.drawable.main_dish, Type.MainDish));
		products.add(new Product("MainDish Eleven", 25, R.drawable.main_dish, Type.MainDish));

		products.add(new Product("Alcoholic One", 7, R.drawable.alcohol, Type.Alcoholic));
		products.add(new Product("Alcoholic Two", 4.5f, R.drawable.alcohol, Type.Alcoholic));
		products.add(new Product("Alcoholic Three", 5, R.drawable.alcohol, Type.Alcoholic));
		products.add(new Product("Alcoholic Four", 5, R.drawable.alcohol, Type.Alcoholic));
		products.add(new Product("Alcoholic Five", 14, R.drawable.alcohol, Type.Alcoholic));

		products.add(new Product("NonAlcoholic One", 4, R.drawable.soda_cans, Type.NonAlcoholic));
		products.add(new Product("NonAlcoholic Two", 4, R.drawable.soda_cans, Type.NonAlcoholic));
		products.add(new Product("NonAlcoholic Three", 4, R.drawable.soda_cans, Type.NonAlcoholic));
		products.add(new Product("NonAlcoholic Four", 5, R.drawable.non_alcoholic, Type.NonAlcoholic));
		products.add(new Product("NonAlcoholic Five", 8, R.drawable.non_alcoholic, Type.NonAlcoholic));

		products.add(new Product("Other One", 4, R.drawable.other, Type.Other));
		products.add(new Product("Other Two", 6.5f, R.drawable.other, Type.Other));
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	public static ArrayList<Product> getProducts()
	{
		return products;
	}
	
	/**
	 * Generates the product categories.
	 */
	public static void generateProductCategories()
	{
		categories=new ArrayList<ProductCategory>();
		categories.add(new ProductCategory("Alcohol", Type.Alcoholic, R.drawable.alcohol));
		categories.add(new ProductCategory("Non alcoholic", Type.NonAlcoholic, R.drawable.non_alcoholic));
		categories.add(new ProductCategory("Main dish", Type.MainDish, R.drawable.main_dish));
		categories.add(new ProductCategory("Soup",Type.Soup, R.drawable.soup));
		categories.add(new ProductCategory("Dessert", Type.Dessert, R.drawable.dessert));
		categories.add(new ProductCategory("Other", Type.Other, R.drawable.other));
	}
	
	/**
	 * Gets the product categories.
	 *
	 * @return the product categories
	 */
	public static ArrayList<ProductCategory> getProductCategories()
	{
		return categories;
	}
	
	/**
	 * Gets the products from a given category (of a given type).
	 *
	 * @param category the category
	 * @return the products from category
	 */
	public static ArrayList<Product> getProductsFromCategory(Type category)
	{
		ArrayList<Product> retProds=new ArrayList<Product>();
		for(Product p:products)
			if(p.type == category)
				retProds.add(p);
		return retProds;
	}
	
	/**
	 * Gets a table with the given id.
	 *
	 * @param id the id
	 * @return the table
	 */
	public static Table getTable(int id)
	{
		for(Table t: tables)
			if( t.id==id)
				return t;
		return null;
	}
	
	/**
	 * Gets an order with a given id.
	 *
	 * @param tableID the table id
	 * @param orderID the order id
	 * @return the table
	 */
	public static Order getOrder(int tableID, int orderID)
	{
		for(Order o: tables.get(tableID).tableOrder.orders)
			if(o.id==orderID)
				return o;
		return null;
	}
	
	/**
	 * Gets an order product from a given order.
	 *
	 * @param order the order
	 * @param product the product
	 * @return the table
	 */
	public static OrderProduct getOrder(Order order, Product product)
	{
		for(OrderProduct o: order.products)
			if(o.product==product)
				return o;
		return null;
	}
}
