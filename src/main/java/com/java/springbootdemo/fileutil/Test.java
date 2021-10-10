package com.java.springbootdemo.fileutil;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Test {
	/**
	 * 加载csv的内容，如果加载的内容此时刚好不够一行，则截取到上一行的末尾，这样加载出来的数据都是整数倍的行数
	 * 
	 * @param csvPath
	 */
	public static void loadCsvData(String csvPath) {
		try {
			File dataFile = new File(csvPath);
			byte[] lastByte = {};
			Integer length = 94372 * 5;
			Boolean isOver = false;
			FileInputStream input = new FileInputStream(dataFile);
			Map<String, Object> rv = null;
			String content = "";
			String charset = "UTF-8";
			while (!isOver) {

				if (rv != null && rv.containsKey("lastByte")) {
					lastByte = (byte[]) rv.get("lastByte");
				}
				rv = loadContent(length, input, lastByte, charset);
				isOver = (Boolean) rv.get("isOver");
				content = (String) rv.get("content");
				log.info("content:" + content);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 加载inputsteam的数据
	 * 
	 * @param length
	 * @param input
	 * @param charset
	 * @return
	 * @throws IOException
	 */
	private static Map<String, Object> loadContent(Integer length,
			InputStream input, byte[] la, String charset) throws IOException {

		Map<String, Object> rv = new HashMap<String, Object>();
		byte[] buffer = new byte[la.length + length];
		copyToBuffer(buffer, la);
		Integer read = IOUtils.read(input, buffer, la.length, length);
		byte hh = 10;// 换行符
		int lastN = ArrayUtils.lastIndexOf(buffer, hh);
		byte[] conArray = ArrayUtils.subarray(buffer, 0, lastN);
		byte[] lastByte = ArrayUtils.subarray(buffer, lastN, buffer.length);
		String content = new String(conArray, 0, conArray.length, charset);

		rv.put("isOver", read < length);
		rv.put("content", content);
		rv.put("lastByte", lastByte);
		return rv;
	}

	/**
	 * copy byte
	 * 
	 * @param buffer
	 * @param la
	 */
	private static void copyToBuffer(byte[] buffer, byte[] la) {
		for (int i = 0; i < la.length; i++) {
			buffer[i] = la[i];
		}
	}

	public static void main(String[] args) {
		String csvPath = "C:\\Users\\Administrator\\Desktop\\000\\test1.csv";
		loadCsvData(csvPath);
	}

}