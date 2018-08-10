package com.sumslack.dubbo.api.fenci;

import java.util.List;

import com.sumslack.dubbo.api.fenci.bean.TermBean;

public interface TokenerService {
	public List<TermBean> standard(String text);
	
	//�ؼ�����ȡ
	public List<String> pickerKeyword(String text,int num);
	//ժҪ��ȡ
	public List<String> pickerDigest(String text,int num);
	//������ȡ
	public List<String> pickerPhrase(String text,int num);
	
	public boolean addDict(String word);
	public boolean addDict(String word,String nature);
	
	public boolean removeDict(String word);
	
	public boolean config(boolean enableNameRecognize,boolean enableTranslatedNameRecognize,
			boolean enableJapaneseNameRecognize,boolean enablePlaceRecognize,
			boolean enableOrganizationRecognize);
}
