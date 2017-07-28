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
//		ZipFile zFile = new ZipFile(zipFile); // ���ȴ���ZipFileָ������ϵ�.zip�ļ�
//		zFile.setFileNameCharset("GBK"); // �����ļ������룬��GBKϵͳ����Ҫ����
//		if (!zFile.isValidZipFile()) { // ��֤.zip�ļ��Ƿ�Ϸ��������ļ��Ƿ���ڡ��Ƿ�Ϊzip�ļ����Ƿ��𻵵�
//			log.info("ѹ���ļ����Ϸ�:\t" + zipFile.getAbsolutePath());
//			throw new ZipException("ѹ���ļ����Ϸ�,���ܱ���.");
//		}
//		File destDir = new File(dest); // ��ѹĿ¼
//		if (destDir.isDirectory() && !destDir.exists()) {
//			destDir.mkdir();
//		}
//		if (zFile.isEncrypted()) {
//			zFile.setPassword(passwd.toCharArray()); // ��������
//		}
//		zFile.extractAll(dest); // ���ļ��������ѹĿ¼(��ѹ)
//
//	}
//}
