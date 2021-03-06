package com.capgemini.go.wishlistmanagementsystem.dao;

import java.util.*;
import com.capgemini.go.productmanagement.dao.ProductDao;
import com.capgemini.go.productmanagement.dao.ProductStore;
import com.capgemini.go.productmanagement.dto.ProductDTO;
import com.capgemini.go.productmanagement.entites.Product;
import com.capgemini.go.productmanagement.utility.ProductUtil;
import com.capgemini.go.wishlistmanagementsystem.dto.WishlistDTO;
import com.capgemini.go.wishlistmanagementsystem.entities.WishListItem;
import com.capgemini.go.wishlistmanagementsystem.entities.WishlistUtil;
import com.capgemini.go.wishlistmanagementsystem.exception.InvalidArgumentException;

public class WishlistDaoImpl implements WishlistDao {
	// userid,userwishes object
	private List<WishListItem> wishStore = new ArrayList<>();


	public WishlistDaoImpl() {

	}

	@Override
	public boolean addProductToWishlist(WishlistDTO dto) {
		WishListItem wishListItem = WishlistUtil.dtoToWishListItem(dto);
		if (wishStore.contains(wishListItem)) {
			return false;
		}
		wishStore.add(wishListItem);
		return true;
	}

	@Override
	public List<ProductDTO> getViewWishlist(String userId) {
		List<ProductDTO> desired = new ArrayList<ProductDTO>();
		Map<String, Product>  productStore=ProductStore.map;
		for (WishListItem wishListItem : wishStore) {
			if (wishListItem.getUserId().equals(userId)) {
				Product product = productStore.get(wishListItem.getProductId());
				ProductDTO productdto = ProductUtil.convertToProductDto(product);
				desired.add(productdto);
			}
		}
		return desired;
	}
}
