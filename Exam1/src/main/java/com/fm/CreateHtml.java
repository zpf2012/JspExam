package com.fm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CreateHtml {

	public void create(String title, String desc,String language) {
		File file = new File("");
		Configuration cfg = new Configuration();
		try {
			String path = file.getCanonicalPath();
//			System.out.println(path);
			cfg.setDirectoryForTemplateLoading(new File(path+"\\src\\main\\ftl"));

			cfg.setDefaultEncoding("UTF-8");

			Template temp;

			temp = cfg.getTemplate("templates.ftl");
			temp.setEncoding("UTF-8");
			Map<Object, Object> map = new HashMap<Object, Object>();

			map.put("title", title);
			map.put("desc", desc);
			map.put("language", language);
						
			File file2 = new File(path+"\\src\\main\\webapp\\Update.html");
			Writer output = new OutputStreamWriter(new FileOutputStream(file2));
			temp.process(map, output);
			output.flush();
			output.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (TemplateException e3) {
			e3.printStackTrace();
		}

	}

}
