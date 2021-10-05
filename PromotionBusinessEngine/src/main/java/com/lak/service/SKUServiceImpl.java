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
	public void GetPrice(SKUModel cart) {

		switch (cart.getId()) {
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
	}

	/**
	 * get the total price
	 */
	@Override
	public Integer GetTotalPrice(List<SKUModel> cartData) {
		int promotionOfA = 0;
		int priceOfA = 50;
		int promotionOfB = 0;
		int priceOfB = 30;
		int promotionOfC = 0;
		int priceOfC = 20;
		int promotionOfD = 0;
		int priceOfD = 15;

		for (SKUModel skuModel : cartData) {

			switch (skuModel.getId()) {
			case "A":
			case "a":
				promotionOfA += 1;
				break;
			case "B":
			case "b":
				promotionOfB += 1;
				break;
			case "C":
			case "c":
				promotionOfC += 1;
				break;
			case "D":
			case "d":
				promotionOfD += 1;
				break;
			}
		}
		int totalPriceOfA = (promotionOfA / 3) * 130 + (promotionOfA % 3 * priceOfA);
		int totalPriceOfB = (promotionOfB / 2) * 45 + (promotionOfB % 2 * priceOfB);
		int totalPriceOfC = (promotionOfC * priceOfC);
		int totalPriceOfD = (promotionOfD * priceOfD);
		return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;

	}

}
