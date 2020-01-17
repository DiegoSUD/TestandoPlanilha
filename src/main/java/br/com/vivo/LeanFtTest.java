package br.com.vivo;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import unittesting.UnitTestClassBase;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.hp.lft.cucumberv4.CucumberReporter" },glue ="baseSteps", features = "C:\\PROJS\\Teste\\src\\main\\java\\br\\com\\vivo\\LeanFtFeature.feature")
public class LeanFtTest extends UnitTestClassBase {

	public LeanFtTest() {
		// Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

}