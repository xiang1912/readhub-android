package com.bihe0832.readhub.module.readhub.topic;import com.bihe0832.readhub.libware.util.TextUtils;import java.util.ArrayList;/** * 主UI展示的项目的结构体 * @author hardyshi * */public class TopicInfo {	public String mId = "";	public String mTitle = "";	public String mSummary = "";	public ArrayList<TopicInfoDetail> mNewsArrayList = new ArrayList();	public String mPublishDate = "";	public long mOrder = 0;	public TopicInfo(){	}	public String getmTitle() {		return mTitle;	}	public String getmSummary() {		if(TextUtils.ckIsEmpty(mSummary)){			return "";		}else{			return mSummary;		}	}}