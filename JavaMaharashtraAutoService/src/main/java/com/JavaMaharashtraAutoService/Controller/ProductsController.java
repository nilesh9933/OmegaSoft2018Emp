package com.JavaMaharashtraAutoService.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.JavaMaharashtraAutoService.Dao.Products;
import com.JavaMaharashtraAutoService.Model.ProductType;

@RestController
public class ProductsController {

	                   
	@RequestMapping(value="/GetProductTypes",method=RequestMethod.GET)
	public List<ProductType> GetProductTypes()
	{
		Products obj=new  Products();
		return obj.GetProductTypes();
	}
}
