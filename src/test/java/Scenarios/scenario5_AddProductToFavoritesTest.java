package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario5_AddProductToFavoritesTest extends Base {
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- "Çikolata" ürününü arat
    // 5- Random bir ürünün detay sayfasına git
    // 6- Ürünü favorilere ekle
    // 7- Çıkış Yap
    @Test
    public void addProductToFavorites(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.keysEnterToElementTest("div[id='product-search-2'] input[class='form-control product-search__input js-product-search-input js-illegal-characters']","çikolata");
        steps.randomClick("div[class='products__item-img-container ratio-container']");
        steps.clickElement("i[class='icon-favorite favorite__icon']");
        steps.clickElement("a[class='user-menu__log-out']");
    }
}
