package com.mayao.model.adapter;
/**
 * 
 * @Description: TODO(适配器模式)
 * @author: mayao
 * @date 2016年9月30日 下午4:54:56
 */
public class Adapter implements XmlReader {
	
	private ReaderXmlImpl reader = new ReaderXmlImpl();//其中的一种体现
	
	@Override
	public void read() {//这个方法是接口需要实现
		// TODO Auto-generated method stub
		reader.readerXml();
	}
	
	
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.read();
	}
	
}
