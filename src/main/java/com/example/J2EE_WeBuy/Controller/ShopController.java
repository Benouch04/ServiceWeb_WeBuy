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
	public Shop addShop(@RequestBody Shop shop) {
	    return shopservice.saveShop(shop);
	}
	
	@PostMapping("/addShops")
	public List<Shop> addShops(@RequestBody List<Shop> shops) {
		return shopservice.saveShop(shops);
	}
	
	@GetMapping("/list_shop")
	public List<Shop> findAllProducts(){
		return shopservice.getShops();
	}
	
	@GetMapping("/shop/{id}")
	public Shop findShopById(@PathVariable int id) {
		return shopservice.getShopsById(id);
	}
	
	@GetMapping("/shop/{nom}")
	public Shop findShopByNom(@PathVariable String nom) {
		return shopservice.getShopsByNom(nom);
	}

	@GetMapping("/shop/{adresse}")
	public Shop findShopByAdresse(@PathVariable String adresse) {
		return shopservice.getShopByAdresse(adresse);
	}
	
	@GetMapping("/shop/{latitude}")
	public Shop findShopByLatitude(@PathVariable String latitude) {
		return shopservice.getShopByLatitude(latitude);
	}
	
	@GetMapping("/shop/{longitude}")
	public Shop findShopByLongitude(@PathVariable String longitude) {
		return shopservice.getShopByLongitude(longitude);
	}
	
	@GetMapping("/shop/{logo}")
	public Shop findShopBLogo(@PathVariable String logo) {
		return shopservice.getShopByLogo(logo);
	}
	
	@PutMapping("/update")
	public Shop updateShop(@RequestBody Shop shop) {
		return shopservice.updateShop(shop);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteShop(@PathVariable int id) {
		return shopservice.deleteShop(id);
	}


}
