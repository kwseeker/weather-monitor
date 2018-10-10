package top.kwseeker.msaweathercityserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.kwseeker.msaweathercityserver.service.CityDataService;
import top.kwseeker.msaweathercityserver.vo.City;

/**
 * 获取城市列表
 */
@RestController
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityDataService cityDataService;
	
	@GetMapping
	public List<City> listCity() throws Exception {
		return cityDataService.listCity();
	}
}
