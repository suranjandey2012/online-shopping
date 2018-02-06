package net.sd.shoppingbackend.dao;

import java.util.List;

import net.sd.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List <Category> list();
	Category get(int id);
	
	
}
