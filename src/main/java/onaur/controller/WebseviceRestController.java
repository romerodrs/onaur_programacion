package onaur.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import onaur.model.CSVLoader;


@RestController
public class WebseviceRestController {

	@RequestMapping("/loadCSV")
	@ResponseBody
	public String loadCSV() {
			CSVLoader csvLoader = new CSVLoader();
			try {
				csvLoader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return "Done";
	}
}
