package com.api.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> l=new ArrayList<Topic>();
	
	public TopicService() {
	
	l.add(new Topic("java","java desc",101));
	l.add(new Topic("JS","JS DESC",102));
	
	}
	
	
	public List<Topic> getAllTopics()
	{
		return l;
	}
	
	
	public Topic getTopic(String topicName)
	{
		for(Topic t:l) 
		{
			if(t.getTopicName().equals(topicName))
			return t;
		}
		
		return null;
	}


	public void addTopic(Topic t) {
		l.add(t);
	}


	public void updateToppic(String id, Topic t) {
		
		for(int i=0;i<l.size();i++)	
			{
				if(l.get(i).getTopicName().equals(id))
				{
					l.set(i, t);
					i=l.size();
				}
			}
	}


	public void deleteTopic(String id) {
		for(int i=0;i<l.size();i++)	
		{
			if(l.get(i).getTopicName().equals(id))
			{
				l.remove(i);
				i=l.size();

			}
		}
		
	}
			
	

}
