package com.mayao.model.adapter;
/**
 * 
 * @Description: TODO(电压转换器练习)
 * @author: mayao
 * @date 2016年9月30日 下午5:14:04
 */
public class AdapterExe extends SS220V implements ShaoShui {

	@Override
	public void shaoShui(int V) {
		System.out.println("初始烧水的电压是："+V+" 伏");
		// TODO Auto-generated method stub
		ShaoShui_220V(V);
	}
	
	
	public static void main(String[] args) {
		new AdapterExe().shaoShui(330);
	}
}

/**
 * 
 * @Description: TODO(220V电压烧水)
 * @author: mayao
 * @date 2016年9月30日 下午5:24:18
 */
class SS220V{
	void ShaoShui_220V(int v){
		v = 220;
		System.out.println("最终烧水的电压为："+v);
	}
}

