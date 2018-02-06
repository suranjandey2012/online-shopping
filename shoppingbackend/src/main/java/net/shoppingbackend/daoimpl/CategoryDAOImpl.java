package net.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sd.shoppingbackend.dao.CategoryDAO;
import net.sd.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	private static List<Category> categories=new ArrayList<>();
	
	
	static{
		
		//Adding First Category
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("LED TV");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		
		//Second Category
				category=new Category();
				category.setId(2);
				category.setName("Mobile");
				category.setDescription("Android Phones");
				category.setImageURL("CAT_2.png");
				
				categories.add(category);
		
		
		//Third Category
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Hp Laptops");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public List <Category> list()
	{
		return categories;
	}









	@Override
	public Category get(int id) {
		
		
		//  enhanced for loop
		
		for(Category category:categories){
		
			if(category.getId()== id) return category;
			
		}
		return null;
	}
}
