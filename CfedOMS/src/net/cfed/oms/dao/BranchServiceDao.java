/**
 * 
 */
package net.cfed.oms.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.cfed.oms.daoImpl.BranchServiceDaoImpl;
import net.cfed.oms.model.BranchModel;


/**
 * @author IT
 *
 */
public class BranchServiceDao implements BranchServiceDaoImpl {

	@Override
	public List<BranchModel> getBranches(int start, int end) {
		List<BranchModel> branchLists = new ArrayList<BranchModel>();
		Connection con=Connector.connections();
		try {
			PreparedStatement preparedStatement= con.prepareStatement("SELECT branchId,branchName,branchCode,branchCategory,constituency,address,district,openingDate,closedDate,latitude,longitude,website,status FROM tbl_branches;");
			ResultSet resultSet = preparedStatement.executeQuery();
			//System.out.println(preparedStatement.executeQuery());
			
			while (resultSet.next()) {
				BranchModel branch = new BranchModel();
				branch.setBranchName(resultSet.getString("branchName"));
				branch.setBranchCode(resultSet.getInt("branchCode"));
				branch.setAddress(resultSet.getString("address"));
				branch.setCategory(resultSet.getString("branchCategory"));
				branch.setConstituency(resultSet.getString("constituency"));
				branch.setDistrict(resultSet.getString("district"));
				branch.setOpeningDate(resultSet.getDate("openingDate"));
				branch.setLat(resultSet.getLong("latitude"));
				branch.setLon(resultSet.getLong("longitude"));
		
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return branchLists;
	}
	
	public static void main(String[] args) {
		BranchServiceDao b = new BranchServiceDao();
		//b.getBranches(1, 1);
		System.out.println(b.createBranchTypes(new BranchModel()));
	}

	//p_create_unitTypes`(in i_unitName char(20),in i_reportOffice char(22),in i_hirerachyLevel int(5),in i_status char(10),in i_desc char(11))
	@Override
	public String createBranchTypes(BranchModel branchTypeModel) {
		String status = "successfully inserted";
		CallableStatement statement = null;
		Connection con=Connector.connections();
		String sqlQuery = "{call p_create_unitTypes(?,?,?,?,?)}";
		 try {
			statement = con.prepareCall(sqlQuery);
	        statement.setString(1, branchTypeModel.getBranchTypeName());
	        statement.setString(2, branchTypeModel.getBranchReportingOffice());
	        statement.setInt(3, branchTypeModel.getBranchTypeHirerachy());
	        statement.setString(4, branchTypeModel.getBranchTypeStatus());
	        statement.setString(5, branchTypeModel.getBranchTypeDesc());
	        statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			status = e.getMessage();
		}finally{
			try {
				statement.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				status = e.getMessage();
			}
			
		}

         
         //statement.registerOutParameter(3, java.sql.Types.VARCHAR);
		return status;
	}
}
