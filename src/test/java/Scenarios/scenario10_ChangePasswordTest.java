package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario10_ChangePasswordTest extends Base {
    Steps steps =new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Hesabım>Şifre Değiştir'e git
    // 5- Şifreyi güncelle
    // 6- Şifrenin güncellendiğini kontrol et
    // 7- Çıkış Yap
    @Test
    public void changePassword(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--account icon-user_2']");
        steps.clickByXpath("//span[text()='Şifre Değiştir']");
        steps.sendKeysToElementTest("input[id='OldPassword']", "19961996m");
        steps.sendKeysToElementTest("input[id='NewPassword']", "1q2w3easd12345");
        steps.sendKeysToElementTest("input[id='NewPasswordConfirm']", "1q2w3easd12345");
        steps.clickByXpath("//button[text()='Güncelle']");
        steps.getTextControlTest("div[class='alert alert-success']","Şifreniz başarıyla değiştirilmiştir.");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
