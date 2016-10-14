package com.mayao.model.adapter;

import org.junit.Test;

/**
 * 
 * @Description: TODO(继承+实现的体现方式)
 * @author: mayao
 * @date 2016年9月30日 下午5:11:07
 */
public class Adapter2 extends ReaderXmlImpl implements XmlReader  {//先继承 ，后实现

	@Override
	public void read() {
		// TODO Auto-generated method stub
		readerXml();
	}

	@Test
	public void test(){
		new Adapter2().read();
	}
	
}
