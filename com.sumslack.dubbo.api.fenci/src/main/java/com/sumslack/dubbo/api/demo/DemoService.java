package com.sumslack.dubbo.api.demo;

import com.sumslack.common.anno.IDubboService;
/*
 * �������д����API��Controller���񣬱���̳�IDubboService�ӿ�
 */
public interface DemoService extends IDubboService{
	public String hello(String name);
}
