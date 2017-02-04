package com.prueba;

import java.sql.SQLException;
import java.util.List;

public class HolaMundo {

	public static void main(String[] args){
		System.out.println("hola");
		System.out.println("mundo");
		try {
			throw new SQLException();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

}

