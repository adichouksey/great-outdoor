package com.capgemini.go.dao;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
//import java.time.LocalDate;
//import java.time.chrono.ChronoLocalDate;
import java.util.*;

//import org.apache.log4j.Logger;

//import com.capgemini.go.bean.RetailerInventoryBean;
//import com.capgemini.go.controller.App;
//import com.capgemini.go.controller.RetailerInventoryException;
//import com.capgemini.go.data.DataBaseEntry;
import com.capgemini.go.dto.RetailerInventoryDTO;
//import com.capgemini.go.exception.RetailerInventoryException;

public class RetailerInventoryDaoImpl implements RetailerInventoryDao{
	@Override
	public List<RetailerInventoryDTO> getSoldItemsDetails() {
		LocalDate today=LocalDate.now();
		List<RetailerInventoryDTO> ret=new ArrayList<RetailerInventoryDTO>();
		
		for (Iterator iterator = ret.iterator(); iterator.hasNext();) {
			RetailerInventoryDTO re = (RetailerInventoryDTO) iterator.next();
			if(today.isAfter((ChronoLocalDate) re.productSaleTimestamp)){
				ret.add(re);
			}
			
		}
		return ret;
	}

	@Override
	public List<RetailerInventoryDTO> getDeliveredItemsDetails() {
			
			LocalDate today=LocalDate.now();
			List<RetailerInventoryDTO> ret=new ArrayList<RetailerInventoryDTO>();
			
			for (Iterator iterator = ret.iterator(); iterator.hasNext();) {
				RetailerInventoryDTO re = (RetailerInventoryDTO) iterator.next();
				if(today.isAfter((ChronoLocalDate) re.productRecieveTimestamp)){
					ret.add(re);
				}
				
			}
			return ret;
		
	}

	@Override
	public List<RetailerInventoryDTO> getItemListByRetailer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RetailerInventoryDTO> getListOfRetailers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProductRecieveTimeStamp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductSaleTimeStamp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertitemRetailerinventory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteitemRetailerinventory() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}