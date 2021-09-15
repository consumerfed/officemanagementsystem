/**
 * 
 */
package net.cfed.oms.daoImpl;

import java.util.List;

import net.cfed.oms.model.BranchModel;


/**
 * @author IT
 *
 */
public interface BranchServiceDaoImpl {
	
	public List<BranchModel> getBranches(int start, int end);
	
	public String createBranchTypes(BranchModel branchTypeModel);

}
