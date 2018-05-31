package cn.jiayou;

import java.util.ArrayList;
import java.util.List;

/*
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: Test1.java
 * Author:   18041949(闫昆朋)
 * Date:     2018年5月29日 下午2:39:57
 * Description: //描述当前类所属模块  
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
/**
 * @author 18041949(闫昆朋):
 * @version 创建时间：2018年5月29日 下午2:39:57
 * 类说明
 */
public class Test12 {
	    public static void main(String[] args) {
	    	List<String>   list=new  ArrayList<String>();
	    	list.add("a");
	    	list.add("b");
	    	list.add("c");
	    	list.add("d");
			System.out.println(list);

	    	List<String>   list2=new  ArrayList<String>();
            System.out.println(list);
            System.out.println(list2);
            list2.add("a");
	    	list2.add("b");
	    	list2.add("c");
	    	list2.add("d");
            List<String>   list3=new  ArrayList<String>();
            System.out.println(list);
		}
}
