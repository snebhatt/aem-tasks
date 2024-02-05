package com.adobe.aem.task.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AemPracticeModel {

	@Inject
	private String imagePath;

	@Inject
	private String isBackground;

	@Inject
	@Named("multifield")
	private List<NavigationItemsModel> navList;

	public String getImagePath() {
		return imagePath;
	}

	public boolean isBackground() {
		return Boolean.valueOf(isBackground);
	}

	public List<NavigationItemsModel> getNavList() {
		return navList;
	}

	public boolean isConfigured() {
		return null != navList && !navList.isEmpty();
	}

}
