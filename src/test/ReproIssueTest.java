package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.Driver;

import java.io.IOException;

public class ReproIssueTest {

    @Test
    public void TestBug() throws IOException, InterruptedException {
        // replace with grid url
        Driver.initialize(true,"http://clj-lc-tstdck01:4444/wd/hub");


        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://github.com/lszasz/selenium-test");
        Thread.sleep(320000);

        System.out.print("Clicking element");
        driver.findElement(By.xpath("//*[contains(concat(' ', @class, ' '), ' x-component ') and contains(concat(' ', @class, ' '), ' x-fit-item ') and not(contains(@class, 'x-hidden-offsets'))]//*[contains(concat(' ', @class, ' '), ' x-panel ') and not(contains(@class, 'x-hidden-offsets')) and count(.//*[contains(concat(' ', @class, ' '), ' x-toolbar ') and count(.//h3[contains(concat(' ', @class, ' '), ' x-toolbar-item ') and contains(text(),'Bwb_simple_trapr25164550427.txt')]) > 0]) > 0]//*[contains(concat(' ', @class, ' '), ' x-tab-bar ') and count(.//a[contains(concat(' ', @class, ' '), ' x-tab-active ') and count(*//text()[.='Details']) > 0]) > 0]//following-sibling::*[contains(concat(' ', @class, ' '), ' x-panel-body ')]/*[contains(concat(' ', @class, ' '), ' x-tabpanel-child ') and not(contains(@class, 'x-hidden-offsets'))]//*[contains(concat(' ', @class, ' '), ' x-toolbar ')]//a[contains(concat(' ', @class, ' '), ' x-btn ') and (count(*//text()[contains(.,'Download Package')]) > 0 or count(*//text()[contains(.,'Download Source File')]) > 0 or count(*//text()[contains(.,'Download SDLXLIFF')]) > 0) and count(.//*[contains(concat(' ', @class, ' '), ' fa-download  ')]) > 0]")).click();

    }

}
