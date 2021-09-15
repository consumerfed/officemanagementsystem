/**
 * 
 */
package net.cfed.oms.serviceImpl;

import java.util.List;

import net.cfed.oms.model.MessageModel;

/**
 * @author nijesh
 *
 */
public interface MessageServiceImpl {
	
	public List<MessageModel> getMessages(int start,int end);

}
