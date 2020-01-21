package baseSteps;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeitorExcel {

	public static String lerPlanilhaExcel() {

		File file = new File(
				"C:\\CRIAÇÃO DE MASSAS\\Planilha de criação de massas POS E CONTROLE\\Planilhas de massas POS E CONTROLE.xlsx");

		String CPF = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);

			int quantidadeLinhas = sheet.getPhysicalNumberOfRows();

			for (int i = 2; i < quantidadeLinhas; i++) {
				String HabLinha = sheet.getRow(i).getCell(3).getStringCellValue();
				String cpf = sheet.getRow(i).getCell(0).getStringCellValue();

				if (!HabLinha.equals("ok")) {
					System.out.println(cpf);
					CPF = cpf;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Todos estão cadastrados!!!");
			assertTrue(false);
		}
		return CPF;

	}

	public static void escreverPlanilhaExcel() {

		File file = new File(
				"C:\\CRIAÇÃO DE MASSAS\\Planilha de criação de massas POS E CONTROLE\\Planilhas de massas POS E CONTROLE.xlsx");

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);

			int quantidadeLinhas = sheet.getPhysicalNumberOfRows();

			for (int i = 2; i < quantidadeLinhas; i++) {
				String HabLinha = sheet.getRow(i).getCell(3).getStringCellValue();
				String cpf = sheet.getRow(i).getCell(0).getStringCellValue();

				if (!HabLinha.equals("ok")) {
					System.out.println(cpf);
					sheet.getRow(i).getCell(3).setCellValue("ok");
					System.out.println("deu ok");

					FileOutputStream teste = new FileOutputStream(file);
					workbook.write(teste);
					workbook.close();
					System.out.println("Gravou na planilha!!!");
				}
			}
		} catch (Exception e) {
			System.out.println("Todos estão cadastrados!!!");
			assertTrue(false);
		}
	}
	
	public static String tel() {
		File file = new File(
				"C:\\CRIAÇÃO DE MASSAS\\Planilha de criação de massas POS E CONTROLE\\Planilhas de massas POS E CONTROLE.xlsx");

		String tel = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);

			int quantidadeLinhas = sheet.getPhysicalNumberOfRows();

			for (int i = 2; i < quantidadeLinhas; i++) {
				String HabLinha = sheet.getRow(i).getCell(3).getStringCellValue();
				String TEL = sheet.getRow(i).getCell(1).getStringCellValue();

				if (!HabLinha.equals("ok")) {
					System.out.println(TEL);
					tel = TEL;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Todos estão cadastrados!!!");
			assertTrue(false);
		}
		return tel;
	}
	
}