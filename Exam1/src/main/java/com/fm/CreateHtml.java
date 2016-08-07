package com.fm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.service.GetLanguage;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CreateHtml {

	public void create() {
		File file = new File("");
		Configuration cfg = new Configuration();
		try {
			String path = file.getCanonicalPath();
			System.out.println(path);
			cfg.setDirectoryForTemplateLoading(new File(path+"\\src\\main\\ftl"));

			cfg.setDefaultEncoding("UTF-8");

			Template temp;

			temp = cfg.getTemplate("templates.ftl");
			temp.setEncoding("UTF-8");
			Map<Object, Object> map = new HashMap<Object, Object>();

			List<Object> language = new ArrayList<Object>();
			GetLanguage gl = new GetLanguage();
			ResultSet rs;
			rs = gl.getlanguage();
			while (rs.next()) {
				language.add(rs.getString("name"));
			}
			map.put("language", language);
			File file2 = new File(path+"\\src\\main\\webapp\\newfilm.html");
			Writer output = new OutputStreamWriter(new FileOutputStream(file2));
			temp.process(map, output);
			output.flush();
			output.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (SQLException e3) {
			e3.printStackTrace();
		} catch (TemplateException e4) {
			e4.printStackTrace();
		}

	}

}
