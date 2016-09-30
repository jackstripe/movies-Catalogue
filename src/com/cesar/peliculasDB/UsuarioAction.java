package com.cesar.peliculasDB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String nombre;
	private String apePat;
	private String apeMat;
	private String ret;
	
	public String execute() {
		this.ret = ERROR;
		Connection conn = connDB();
		System.out.println(this.getInsertValues());
		if(conn != null){
			System.out.println("DATABSE GUD");
		}
		try{
			String sql = "INSERT INTO usuarios (nomUsuario, password,"
					+ "nombre, apePat,apeMat)"
	         		+ "VALUES(?,?,?,?,?);";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1,this.username);
	         ps.setString(2,this.password);
	         ps.setString(3,this.nombre);
	         ps.setString(4,this.apePat);
	         ps.setString(5,this.apeMat);
	         System.out.println(ps.toString() + "Hoña");
	         //int c= ;
//	         System.out.println(Integer.toBinaryString(c)+"ASHDOOASDASPDASDADSDDDSSDDSSDDS");
	         if(ps.executeUpdate() > 0){this.ret = SUCCESS;}
		}catch(Exception e){
			
		} finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
		}
		return this.ret;
	}
	
	//Crear una interface para la conexión a la BD de datos
	private Connection connDB(){
		Connection conn = null;
		try {
	         String URL = "jdbc:mysql://localhost:3306/peliculasDB";
	         Class.forName("com.mysql.jdbc.Driver").newInstance();
	         conn = DriverManager.getConnection(URL,"root","");	         
	      } catch (Exception e) {
	         this.ret = ERROR;
	      }
		return conn;
	}

	public String getInsertValues(){
		return "('" + this.username +"'," 
				+ "'" + this.password + "','" + this.nombre+"','"
				+this.apePat+"','"+this.apeMat+"');";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}	
}
