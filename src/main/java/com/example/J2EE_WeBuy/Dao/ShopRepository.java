package com.example.J2EE_WeBuy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.J2EE_WeBuy.Entity.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer>{

	Shop findByNom(String nom);

	Shop findByAdresse(String adresse);

	Shop findByLatitude(String latitude);

	Shop findByLogo(String logo);

	Shop findByLongitude(String longitude);

}
