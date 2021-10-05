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
	 */
	void GetPrice(SKUModel cart);
	
	/**
	 * 
	 * @param cartData
	 * @return
	 */
    Integer GetTotalPrice(List<SKUModel> cartData);
}
