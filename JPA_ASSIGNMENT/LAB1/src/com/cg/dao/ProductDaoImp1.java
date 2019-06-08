package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.beans.Product;
import com.cg.staticdb.ProductDB;

public class ProductDaoImp1 implements IProductDao{
	static HashMap<Integer, Product> ProductIdMap = ProductDB.getProductIdMap();

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> countries = new ArrayList<Product>(ProductIdMap.values());
		return countries;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		ProductIdMap.put(product.getId(), product);
		
		return product;
	}
	
}

