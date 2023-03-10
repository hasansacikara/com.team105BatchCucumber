
Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli

  Scenario: TC09 Gecerli kullanici adi ve sifre ile pozitif Login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna basar
    And basarili gitis yapildigini test eder
    Then sayfayi kapatir
