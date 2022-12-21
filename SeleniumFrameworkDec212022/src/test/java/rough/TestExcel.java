package rough;

import utilities.ExcelReader;

public class TestExcel {

	public static void main(String[] args) {
		String path = "./TestData/TestData.xlsx";
		System.out.println("Path: " + path);
		ExcelReader excel = new ExcelReader(path);
		int rows = excel.getRowCount("Sheet1");
		int columns = excel.getColumnCount("Sheet1");
		System.out.println("Total Rows: " + rows);
		System.out.println("Total columns: " + columns);

	}

}
