package pages;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class teste {

	public static void main(String[] args) {
		
		int gerador = 0;
		Random ra = new Random();
		
		gerador = ra.nextInt(23);
		
		System.out.println(gerador);
	
		}
	}

//		File file = new File(
//				"C:\\CRIAÇÃO DE MASSAS\\Planilha de criação de massas POS E CONTROLE\\Planilhas de massas POS E CONTROLE.xlsx");
//
//		String CPF = null;
//		try {
//			FileInputStream fileInputStream = new FileInputStream(file);
//			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//			XSSFSheet sheet = workbook.getSheetAt(0);
//
//			int quantidadeLinhas = sheet.getPhysicalNumberOfRows();
//
//			for (int i = 2; i < quantidadeLinhas; i++) {
//				String HabLinha = sheet.getRow(i).getCell(3).getStringCellValue();
//				String cpf = sheet.getRow(i).getCell(0).getStringCellValue();
//
//				if (!HabLinha.equals("ok")) {
//					System.out.println(cpf);
//					CPF = cpf;
//					
//					sheet.getRow(i).getCell(3).setCellValue("ok");
//					System.out.println("deu ok");
//					
//					FileOutputStream teste = new FileOutputStream(file);
//					workbook.write(teste);
//					workbook.close();
//				}
//
//			}
//			
//			
//
//		} catch (Exception e) {
//			System.out.println("Todos estão cadastrados!!!");
//			assertTrue(false);
//		}
//
//	}

//}
