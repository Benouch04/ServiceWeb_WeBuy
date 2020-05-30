/*package com.example.J2EE_WeBuy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.J2EE_WeBuy.Entity.Shop;
import com.example.J2EE_WeBuy.Dao.ShopRepository;

@Service
public class ShopService {

	@Autowired
	private ShopRepository repository;
	
	public Shop saveShop (Shop shop) { 
		return repository.save(shop);
	}
	public List<Shop> saveShop(List<Shop> shops){
		return repository.saveAll(shops);
	}
	public List<Shop> getShops(){
		return repository.findAll();
	}
	public Shop getShopsById(int id){
		return repository.findById(id).orElse(null);
	}
	public Shop getShopsByNom(String nom){
		return repository.findByNom(nom);
	}
	public Shop getShopByAdresse(String adresse) {
		return repository.findByAdresse(adresse);
	}
	public Shop getShopByLatitude(String latitude) {
		return repository.findByLatitude(latitude);
	}
	public Shop getShopByLongitude(String longitude) {
		return repository.findByLongitude(longitude);
	}
	public Shop getShopByLogo(String logo) {
		return repository.findByLogo(logo);
	}
	public String deleteShop(int id) {
		repository.deleteById(id);
		return "shop removed !!" +id;
	}
	public Shop updateShop(Shop shop) {
		Shop existingShop=repository.findById(shop.getId()).orElse(null);
		existingShop.setNom(shop.getNom());
		return repository.save(existingShop);
		
	}
	
}
*/
