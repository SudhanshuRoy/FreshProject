package com.masai.usecases;
import java.util.List;
import java.util.Scanner;

import com.masai.dao.EngineerDao;
import com.masai.dao.EngineerDaoImpl;
import com.masai.exception.EngineerException;
import com.masai.model.Complaint;

public class GetAllProblems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your engid : ");
		int engid=sc.nextInt();
		EngineerDao dao=new EngineerDaoImpl();
		try {
			List<Complaint> complaints=dao.getAllProblems(engid);
			complaints.forEach(c->System.out.println(c));
		} catch (EngineerException e) {
			
			e.printStackTrace();
			
		}
		

	}

}
