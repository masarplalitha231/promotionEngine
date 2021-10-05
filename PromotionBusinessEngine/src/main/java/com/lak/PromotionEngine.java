package com.lak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lak.model.SKUModel;
import com.lak.service.ISKUService;
import com.lak.service.SKUServiceImpl;

/**
 * Promotion Engine
 * @author VLalitha
 *
 */
public class PromotionEngine {

	public static void main(String[] args) throws Exception {
		
		ISKUService service = new SKUServiceImpl();
		List<SKUModel> cartData = new ArrayList<SKUModel>();
		System.out.println("How many promotion Engines needed for Checkout process ?");
		Scanner sc = new Scanner(System.in);
		int noOfEngines = sc.nextInt();
		for (int i = 0; i < noOfEngines; i++) {
			System.out.println("Select the type of SKU Id -  A or B or C or D");
			cartData.add(service.getCartData(sc.next()));
		}

		int totalPrice = service.getTotalPrice(cartData);
		System.out.println("total Price = " + totalPrice);
	}
}
