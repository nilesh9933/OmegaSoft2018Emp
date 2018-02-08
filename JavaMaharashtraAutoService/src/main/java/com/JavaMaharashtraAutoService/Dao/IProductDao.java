package com.JavaMaharashtraAutoService.Dao;

import com.JavaMaharashtraAutoService.Model.Products;

public interface IProductDao 
{
	String AddProduct(Products prod);
	String UpdateProduct(Products prod);
	String DeleteProduct();

}
