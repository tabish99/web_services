package web.test.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductCatalog
	{

		
		public List<String> getProductCatalog()
		{
			List<String> list= new ArrayList<String>();
			list.add("shirt");
			list.add("jeans");
			list.add("t shirt");
			return list;
		}
	}
