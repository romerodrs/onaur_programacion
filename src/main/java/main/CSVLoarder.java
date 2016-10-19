/**
 * 
 */
package main;

import java.io.IOException;

import model.CSVLoader;

/**
 * @author dlrr
 *
 */
public class CSVLoarder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CSVLoader excelModel = new CSVLoader();
		try {
			excelModel.load();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
