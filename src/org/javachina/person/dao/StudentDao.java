package org.javachina.person.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.javachina.connectionpool.ConnectionPool;
import org.javachina.person.dto.StudentDto;

public class StudentDao {
	public ArrayList<StudentDto> quaryAll(){
		ArrayList<StudentDto> result = new ArrayList<>();
		Connection conn = ConnectionPool.getConnection();
		Statement stat = null;
		ResultSet rs = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select id ,name ,age ,birth from student");
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				Date birth = rs.getDate(4);
				//System.out.println(id+name+age+birth);
				StudentDto dto = new StudentDto();
				dto.setId(id);
				dto.setName(name);
				dto.setAge(age);
				dto.setBirth(birth);
				result.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null){
					rs.close();
				}
				if(stat!=null){
					stat.close();
				}
				if(conn!=null&&!conn.isClosed()){
					ConnectionPool.close(conn);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public int insert(StudentDto  dto){
		int result =0;
		Connection conn = ConnectionPool.getConnection();
		PreparedStatement psmt = null;
		try {
			psmt = conn.prepareStatement("insert into student (id,name,age,birth) values(SEQ_STUDENT_ID.nextval,?,?,?)");
			psmt.setString(1, dto.getName());
			psmt.setInt(2, dto.getAge());
			psmt.setDate(3, dto.getBirth());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(psmt!=null){
					psmt.close();
				}
				if(conn!=null&&!conn.isClosed()){
					ConnectionPool.close(conn);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		System.out.println(dao.quaryAll());
	}
}
