

Feature: US1005 Kullanici bastaki ortak adimlar icin Background kullanir

 Background: Tum scenario'lar icin ortak ilk adim
   Given kullanici amazon anasayfaya gider

  Scenario: TC3 Kullanici parametreli method ile Nutella aratir

    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC04 Kullanici parametreli method ile Java aratir

    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 Kullanici parametreli method ile Samsung aratir

    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir
