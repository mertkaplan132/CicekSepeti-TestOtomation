package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import com.sun.deploy.panel.SpecialTableRenderer;
import org.junit.Test;

public class scenario2_OrderControlTest extends Base {
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Sipariş Takibi sayfasına git
    // 5- Sipariş olup olmadığını kontrol et
    // 6- Çıkış yap
    @Test
    public void orderControl(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("a[class='user-menu__link user-menu__link--order']");
        steps.getTextControlTest("div[class='col-sm-12']","Sipariş bulunamadı. Lütfen bilgilerinizi kontrol ediniz.");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
