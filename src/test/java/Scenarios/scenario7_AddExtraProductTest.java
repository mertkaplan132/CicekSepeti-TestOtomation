package Scenarios;

import BaseTest.Base;
import Utils.Steps;
import org.junit.Test;

public class scenario7_AddExtraProductTest extends Base {
    Steps steps=new Steps();
    //TEST ADIMLARI
    // 1- Giriş Yap
    // 2- Giriş Yapıldığının kontrolünü yap
    // 3- Bilgilendirme pop-up ını kapat
    // 4- Arama çubuğa "çiçek" yaz ve o sayfaya git
    // 5- Random bir eleman seç ve ürün detay sayfasına git
    // 6- Adres, gün ve saat bilgileri doldur
    // 7- Ekstra yan ürünlerden 5.sini sepete ekle
    // 8- Ödeme sayfasına kadar ilerle
    // 9- Anasayfaya dön
    // 10- Çıkış Yap
    @Test
    public void addExtraProduct(){
        steps.sendKeysToElementTest("input[id='EmailLogin']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='Password']", "19961996m");
        steps.clickByXpath("//button[text()='Giriş']");
        steps.clickElement("span[class='icon-close']");
        steps.keysEnterToElementTest("div[id='product-search-2'] input[class='form-control product-search__input js-product-search-input js-illegal-characters']","çiçek");
        steps.randomClick("div[class='products__item-img-container ratio-container']");
        steps.sendKeysToElementTest("input[placeholder='Göndereceğiniz mahalleyi, Okul, Hastane vb. seçin']","haseki hastanesi");
        steps.clickElement("div[data-value='0']");
        steps.productClick("div[class='product__dates-col']",1);
        steps.clickElement("select[class='select-green']");
        steps.clickElement("option[value='2000092']");
        steps.clickElement("span[class='product__action-button-text']");
        steps.waitSecond(3);
        steps.sendKeysToElementTest("input[id='GroupDeliveryAddressList_0__Address_AddressName']","Mert KAPLAN");
        steps.keysEnterToElementTest("input[id='GroupDeliveryAddressList_0__Address_Phone_Phone']","5555555555");
        steps.keysEnterToElementTest("textarea[id='GroupDeliveryAddressList_0__Address_AddressLine']","Haseki hastanesi");
        steps.clickElement("span[class='icon-right-arrow order-next-button__icon']");
        steps.productClick("button[class='btn btn-warning products__add-button js-add-extra-product']",5);
        steps.clickElement("button[class='btn btn-lg btn-primary order-next-button order-next-button--before-summary js-submit-form']");
        steps.clickElement("button[class='btn btn-lg btn-primary order-next-button js-submit-form']");
        steps.clickElement("a[class='site-logo-responsive__image']");
        steps.clickElement("a[class='user-menu__log-out']");



    }

}
