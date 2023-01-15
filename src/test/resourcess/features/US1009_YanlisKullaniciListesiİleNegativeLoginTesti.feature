Feature: US1009 _ Yanlis kullanici adi ve password listesiile negatif login testi
@wip
  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUsername">
    And password kutusuna manuel olarak "<yanlispassword>" yazar
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir


    Examples:
      |yanlisUsername |yanlisPassword
      |ilker          |ilker@a.com   |
      |mehmet         |mehmet@b.com  |
      |yasar          |yasar@c.com   |
      |adem           |adem@d.com    |
      |ozgur          |ozgur@.com    |




