package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario3_UpdateInformationTest extends Base {
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Hesabım>Üyelim Bilgilerim'e git
    // 5- Kurum adını "testinium" olarak güncelle
    // 6- Çıkış Yap
    @Test
    public void updateInformation(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--account icon-user_2']");
        steps.clickByXpath("//span[text()='Üyelik Bilgilerim']");
        steps.sendKeysToElementTest("input[class='form-control js-only-letter-with-turkish-characters js-placeholder']","testinium");
        steps.clickByXpath("//button[text()='Güncelle']");
        steps.waitSecond(2);
        steps.clickElement("a[class='user-menu__log-out']");

    }
}
