package com.JavaMaharashtraAutoService.Controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaMaharashtraAutoService.Dao.Products;
import com.JavaMaharashtraAutoService.Model.ProductType;

@RestController
public class ProductsController {

	@CrossOrigin
	@RequestMapping(value = "/GetProductTypes", method = RequestMethod.GET)
	public List<ProductType> GetProductTypes() {
		Products obj = new Products();
		return obj.GetProductTypes();
	}

	@RequestMapping(value = "/AddProductTypes", method = RequestMethod.POST)
	@ResponseBody
	public String AddProductTypes(@ModelAttribute ("ProductType") ProductType prodType) {

		Products obj=new Products();
		return obj.AddProductTypes(prodType);
	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/AddProducts", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody JsonResponse AddProducts(@RequestBody com.JavaMaharashtraAutoService.Model.Products prod) {

		Products obj=new Products();
	
		JsonResponse json=new JsonResponse();
		json.setJsonString(obj.AddProducts(prod));
		
		return json;
	}
}
class JsonResponse
{
	private String jsonString;

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	
}

