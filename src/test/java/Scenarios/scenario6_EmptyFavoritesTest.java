package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario6_EmptyFavoritesTest extends Base {
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Favorilere Git
    // 5- Favorilere eklenmiş ürünü kaldır
    // 6- Favorilerin boş olduğunu kontrol et
    // 7- Çıkış Yap
    @Test
    public void emptyFavorites(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--favorite icon-favorite-border']");
        steps.clickElement("span[class='icon-favorite-border']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--favorite icon-favorite-border']");
        steps.getTextControlTest("a[class='btn btn-lg btn-primary favorite__not-btn']","Alışverişe Başla");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
