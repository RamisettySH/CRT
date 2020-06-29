package com.api.topic;

public class Topic {
	
	private String topicName;
	
	private String topicDescription;
	
	private int topicId;
	
	
	public Topic() {
		
	}
	
	

	public Topic(String topicName, String topicDescription, int topicId) {
		super();
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	
	

}
