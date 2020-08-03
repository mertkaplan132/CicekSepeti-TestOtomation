package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario1_FrequentlyAskedQuestionsTest extends Base {

    Steps steps =new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Hesabım>Aboneliklerim'e git
    // 5- Sıkça Sorulan Sorulan'dan !.sinin açıklamasını ekrana bas
    // 6- Çıkış Yap
    @Test
    public void frequentlyAskedQuestions(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.getTextControlTest("li[class='user-menu__item user-menu__item--account'] span[class='user-menu__title']","Hesabım");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--account icon-user_2']");
        steps.clickByXpath("//span[text()='Aboneliklerim']");
        steps.productClick("button[class='accordion-toggle js-accordion-collapse js-subs-faq-item']",0);
        steps.saveText("div[class='faq__accordion-inner']");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
