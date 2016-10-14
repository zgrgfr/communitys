package dto;

import entity.Community;
import entity.ResourceShare;

/**
 * 资源共享的dto
 * @author guofr  
 *
 */
public class ResourceShareDto {
	// 资源共享
	private ResourceShare resourceShare;
	
	// 社团
	private Community community;

	public ResourceShare getResourceShare() {
		return resourceShare;
	}

	public void setResourceShare(ResourceShare resourceShare) {
		this.resourceShare = resourceShare;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}
	
}
