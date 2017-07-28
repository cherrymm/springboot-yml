//package com.zlf.util;
//
//import java.io.File;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.zlf.model.City;
//import com.zlf.service.CityService;
//
//import net.lingala.zip4j.core.ZipFile;
//import net.lingala.zip4j.exception.ZipException;
//
//public class FileUtil implements IFileUtil {
//
//	@Autowired
//	private CityService cityService;
//
//	public void test() {
//		@SuppressWarnings("unused")
//		List<City> queryCityList = cityService.queryCityList();
//
//	}
//	
//	public static void unzip(File zipFile, String dest, String passwd) throws ZipException {
//		ZipFile zFile = new ZipFile(zipFile); // 首先创建ZipFile指向磁盘上的.zip文件
//		zFile.setFileNameCharset("GBK"); // 设置文件名编码，在GBK系统中需要设置
//		if (!zFile.isValidZipFile()) { // 验证.zip文件是否合法，包括文件是否存在、是否为zip文件、是否被损坏等
//			log.info("压缩文件不合法:\t" + zipFile.getAbsolutePath());
//			throw new ZipException("压缩文件不合法,可能被损坏.");
//		}
//		File destDir = new File(dest); // 解压目录
//		if (destDir.isDirectory() && !destDir.exists()) {
//			destDir.mkdir();
//		}
//		if (zFile.isEncrypted()) {
//			zFile.setPassword(passwd.toCharArray()); // 设置密码
//		}
//		zFile.extractAll(dest); // 将文件抽出到解压目录(解压)
//
//	}
//}
