package testproject.resources;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	public List<HashMap<Object, Object>> getjsondataToMap(String filepath) throws IOException
	{
		//read json to string
	String jsoncontent = 	FileUtils.readFileToString(new File(filepath)
			,StandardCharsets.UTF_8);
	
	//String to Hashmap Jackson Databind
	ObjectMapper mapper = new ObjectMapper();
	List<HashMap<Object, Object>> data = mapper.readValue(jsoncontent, new TypeReference<List<HashMap<Object, Object>>>(){	
	});
	return data;
	
	
	}
	
	
}
