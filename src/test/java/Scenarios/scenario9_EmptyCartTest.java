package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario9_EmptyCartTest extends Base {
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Sepete Git
    // 5- Sepetteki ürünü sil
    // 6- Sepetin boş olduğunu kontrol et
    // 7- Çıkış Yap
    @Test
    public void emptyCart(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--cart icon-cart-2 js-product-id-list']");
        steps.clickElement("a[class='cart__item-delete icon-close js-main-product-delete--basket']");
        steps.clickElement("button[class='agree-button btn btn-primary']");
        steps.clickElement("span[class='user-menu__icon user-menu__icon--cart icon-cart-2 js-product-id-list']");
        steps.getTextControlTest("h1[class='cart__empty-title']","Sepetinizde ürün bulunmamaktadır.");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
