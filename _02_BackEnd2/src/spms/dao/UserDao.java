package spms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;
import java.util.*;
import spms.vo.User;

public class UserDao {

	DataSource ds = null;

	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	

	public int Register(User users) throws Exception {
		Connection connection = null;
		int result = 0;
		PreparedStatement stmt = null;
		final String sqlRegister = "INSERT INTO user(id,name,dog_breed,gender,age,medical_history,discovery_place)" + "VALUES(?,?,?,?,?,?,?)";

		try {
			connection = ds.getConnection();
			stmt = connection.prepareStatement(sqlRegister);
			stmt.setInt(1, users.getId());
			stmt.setString(2, users.getName());
			stmt.setString(3, users.getDog_breed());
			stmt.setString(4, users.getGender());
			stmt.setInt(5, users.getAge());
			stmt.setString(6, users.getMedical_history());
			stmt.setString(7, users.getDiscovery_place());
			result = stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}


			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}


	public int update(User users) throws Exception {
		Connection connection = null;
		int result = 0;
		PreparedStatement stmt = null;
		final String sqlUpdate = "UPDATE user SET name=?,dog_breed=?,gender=?,age=?,medical_history=?,discovery_place=?" + " WHERE ID=?"; 
		try {
			// 
			connection = ds.getConnection();
			stmt = connection.prepareStatement(sqlUpdate);
			
			stmt.setString(1, users.getName());
			stmt.setString(2, users.getDog_breed());
			stmt.setString(3, users.getGender());
			stmt.setInt(4, users.getAge());
			stmt.setString(5, users.getMedical_history());
			stmt.setString(6, users.getDiscovery_place());
			
			result = stmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}

			try {
				if(connection != null)
					connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
