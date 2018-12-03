/**
 * @author 王少刚
 * @create 2018-12-03 22:10
 */
package com.example.springmvc.conversion;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 实现Converter接口，作为转换器
// 泛型，前者是被转换的类型，后者是要转换成的类型
public class DateConverter implements Converter<String, Date> {
	@Override
	public Date convert(String s) {
		try {
			if (s != null) {
				DateFormat df = new SimpleDateFormat("yyyy/MM-dd HH:mm::ss");
				return df.parse(s);
			}
		} catch (ParseException e) { }
		return null;
	}
}
