package net.cfed.oms.daoImpl;

import java.util.List;

import net.cfed.oms.model.MessageModel;

public interface MessageServiceDaoImpl {
	
	public List<MessageModel> getMessages(int start,int end);

}
