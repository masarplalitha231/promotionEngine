package com.lak.service;

import java.util.List;

import com.lak.model.SKUModel;

/**
 * 
 * @author VLalitha
 *
 */
public class SKUServiceImpl implements ISKUService {

	/**
	 * get the price
	 */
	@Override
	public SKUModel getCartData(String type) throws Exception {

		SKUModel cart = new SKUModel();
		try {
			type = type.toUpperCase();
			cart.setId(type);
			switch (type) {
			case "A":
				cart.setUnit(50);
				break;
			case "B":
				cart.setUnit(30);
				break;
			case "C":
				cart.setUnit(20);
			case "D":
				cart.setUnit(15);

			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		return cart;
	}

	/**
	 * get the total price
	 * 
	 * @throws Exception
	 */
	@Override
	public Integer getTotalPrice(List<SKUModel> cartData) throws Exception {

		int promotionOfA = 0, promotionOfB = 0, promotionOfC = 0, promotionOfD = 0;
		int totalPriceOfA = 0, totalPriceOfB = 0, totalPriceOfC = 0, totalPriceOfD = 0;
		int priceOfA = 50;
		int priceOfB = 30;
		int priceOfC = 20;
		int priceOfD = 15;
		try {

			for (SKUModel skuModel : cartData) {

				String type = skuModel.getId().toUpperCase();
				switch (type) {
				case "A":
					promotionOfA += 1;
					break;
				case "B":
					promotionOfB += 1;
					break;
				case "C":
					promotionOfC += 1;
					break;
				case "D":
					promotionOfD += 1;
					break;
				}
			}
			totalPriceOfA = (promotionOfA / 3) * 130 + (promotionOfA % 3 * priceOfA);
			totalPriceOfB = (promotionOfB / 2) * 45 + (promotionOfB % 2 * priceOfB);
			totalPriceOfC = (promotionOfC * priceOfC);
			totalPriceOfD = (promotionOfD * priceOfD);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;

	}

}
