package com.example.J2EE_WeBuy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.J2EE_WeBuy.Entity.Shop;
import com.example.J2EE_WeBuy.Service.ShopService;

@RestController

public class ShopController {

@Autowired 
	
	private ShopService shopservice;
	
	
	@PostMapping("/addShop")
	public Shop addShop(Shop shop) {
	    return shopservice.saveShop(shop);
	}
	
	@PostMapping("/addShops")
	public List<Shop> addShops(List<Shop> shops) {
		return shopservice.saveShop(shops);
	}
	
	@GetMapping("/shop_index")
	public List<Shop> findAllProducts(){
		return shopservice.getShops();
	}
	
	@GetMapping("/shop/{id}")
	public Shop findShopById(@PathVariable int id) {
		return shopservice.getShopsById(id);
	}
		
	@PutMapping("/shop/update")
	public Shop updateShop(Shop shop) {
		return shopservice.updateShop(shop);
	}
	
	@DeleteMapping("/shop/delete/{id}")
	public String deleteShop(@PathVariable int id) {
		return shopservice.deleteShop(id);
	}


}
