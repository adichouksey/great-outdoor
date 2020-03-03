package com.capgemini.go.cartms.dao;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.dto.OrderProductMapDTO;
import com.capgemini.go.cartms.dto.ProductUINMapDTO;

public interface OrderAndCartDAO {
	
    boolean addItemToCart(CartDTO cartDTO);
	
	boolean deleteOrderProductMapEntity(OrderProductMapDTO orderProductMapDTO);
	
	boolean insertOrderProductMapEntity(OrderProductMapDTO orderProductMapDTO);
	
	boolean registerOrder(OrderDTO orderDTO);
	
	boolean removeItemFromCart(CartDTO cartDTO);
	
	boolean updateItemQuantity(CartDTO cartDTO);
	
	boolean updateProductUinMap(ProductUINMapDTO productUINMapDTO);

}
