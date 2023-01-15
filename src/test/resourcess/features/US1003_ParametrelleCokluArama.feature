
Feature: US1003 Kullanici parametre olarak girilen degeri aratir


  Scenario: TC3 Kullanici parametreli method ile Nutella aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


    Scenario: TC04 Kullanici parametreli method ile Java aratir
      Given kullanici amazon anasayfaya gider
      Then amazon arama kutusuna "Java" yazip aratir
      And arama sonuclarinin "Java" icerdigini test eder
      And sayfayi kapatir


  Scenario: TC05 Kullanici parametreli method ile Samsung aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir
