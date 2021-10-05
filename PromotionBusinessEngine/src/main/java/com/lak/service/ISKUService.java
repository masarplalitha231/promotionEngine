package com.lak.service;

import java.util.List;

import com.lak.model.SKUModel;

/**
 * @author VLalitha
 *
 */
public interface ISKUService {

	/**
	 * 
	 * @param cart
	 * @return
	 */
	SKUModel getCartData(String type) throws Exception;
	
	/**
	 * 
	 * @param cartData
	 * @return
	 * @throws Exception 
	 */
    Integer getTotalPrice(List<SKUModel> cartData) throws Exception;
}
