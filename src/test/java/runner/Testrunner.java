package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
       //features = "src/test/java/feature",
        //features = "src/test/java/feature/test.feature",
         features = "src/test/java/feature/test_buscador.feature",


        glue = {"seleniumgludecode"},
        plugin = {"json:test/report/cucumber_report.json"}
        //plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/ReportCucumber/report.html"}
        //tags ={"@prueba"}

)


public class Testrunner {

    @AfterClass
    public static void finish(){

        try {
            System.out.println("Generando reporte");
            String [] cmd = {"cmd.exe","/c","npm rum report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado Satisfactoriamente");

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
