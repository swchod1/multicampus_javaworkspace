package com.employee;


/*
사원 전체를 보기 위한 TotalPane 클래스와 모델 객체

사원 전체를 보기 위해서는 JTable 클래스 사용 JTable에 출력할 데이터는 모델 객체로 설계함

클래스 명 : EmployModel 로 작성
*/


import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class EmployModel extends AbstractTableModel {
	
	Object[][] data;
	Object[] columnName;
	
	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVo;
	
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	
	public EmployModel() {
		// TODO Auto-generated constructor stub
		
		// 열의 개수와 행의 개수를 알아야 2차원 배열 선언 ??
		// 테이블에서 컬럼이름을 얻어와서 1차원 배열 선언함 ??
		
		title = emDao.getColumnName();
		columnName = title.toArray();
		int columnCount = title.size();
		
		list = emDao.getEmployeetotal();
		
		int rowCount = list.size();
		
		data = new Object[rowCount][columnCount];
		
		for(int index = 0; index < rowCount; index++) {
			
			emVo = list.get(index);
			
			data[index][0] = emVo.getNo();
			data[index][1] = emVo.getName();
			data[index][2] = emVo.getJobGrade();
			data[index][3] = emVo.getDepartment();
			data[index][4] = emVo.getEmail();
		}
				
	}
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		
		return (String)columnName[column];
		
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		
		if(columnName == null) {
			return 0;
		} else {
			return columnName.length;
		}
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		
		if(data == null) {
			return 0;
		} else {
			return data.length;
		}	
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
}
