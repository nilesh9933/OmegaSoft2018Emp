package com.JavaMaharashtraAutoService.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaMaharashtraAutoService.Model.Products;
import com.JavaMaharashtraAutoService.Util.MySQLConnection;

public class ProductDao implements IProductDao
{
	Connection con;
	
	public ProductDao() 
	{
		con = MySQLConnection.GetConnection();
	}



	@Override
	public String AddProduct(Products prod)
	{
		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement("insert into product(proId,proName,proDes,proPurDate,proPurRate,proSaleRate,proManDate,proExpDate,proManComp,proWarrPeriod,proTypeId,delInd,updateUser,updateDate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pre.setInt(1, prod.getProId());
			pre.setString(2, prod.getProName());
			pre.setString(3, prod.getProDes());
			pre.setDate(4, prod.getProPurDate());
			pre.setFloat(5, prod.getProPurRate());
			pre.setFloat(6,prod.getProSaleRate());
			pre.setDate(7, prod.getProManDate());
			pre.setDate(8, prod.getProExpDate());
			pre.setString(9, prod.getProManComp());
			pre.setString(10, prod.getProWarrPeriod());
			pre.setInt(11, prod.getProTypeId());
			pre.setString(12, "N");
			pre.setString(13, prod.getUpdateUser());
			pre.setDate(14, prod.getUpdateDate());
			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}


	
	
	@Override
	public String UpdateProduct(Products prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
