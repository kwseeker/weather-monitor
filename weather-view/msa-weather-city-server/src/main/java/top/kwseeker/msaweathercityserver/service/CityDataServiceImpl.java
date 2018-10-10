package top.kwseeker.msaweathercityserver.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import top.kwseeker.msaweathercityserver.util.XmlBuilder;
import top.kwseeker.msaweathercityserver.vo.City;
import top.kwseeker.msaweathercityserver.vo.CityList;


/**
 * City Data Service.
 */
@Service
public class CityDataServiceImpl implements CityDataService {

	/**
	 * 获取城市列表并存储到xml文件中（因为城市数据基本不会变），没必要放到数据库中
	 */
	@Override
	public List<City> listCity() throws Exception {
		// 读取XML文件
		Resource resource = new ClassPathResource("citylist.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
		StringBuffer buffer = new StringBuffer();
		String line = "";
		
		while ((line = br.readLine()) !=null) {
			buffer.append(line);
		}
		
		br.close();
		
		// XML转为Java对象
		CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());
		return cityList.getCityList();
	}

}
