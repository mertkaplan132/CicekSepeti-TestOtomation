package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario4_ProductDescriptionTest extends Base {
    Steps steps= new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Elektronik kategorisine git
    // 5- Beşinci ürünün detay sayfasına git
    // 6- Ürünün Açıklama metnini ekrana bas
    // 7- Çıkış Yap
    @Test
    public void productDescription(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.keysEnterToElementTest("div[id='product-search-2'] input[class='form-control product-search__input js-product-search-input js-illegal-characters']","elektronik");
        steps.productClick("div[class='products__item-img-container ratio-container']",5);
        steps.saveText("h1[class='product__info__title js-product-title js-ellipsize-text']");
        steps.clickElement("a[class='user-menu__log-out']");
    }

}
