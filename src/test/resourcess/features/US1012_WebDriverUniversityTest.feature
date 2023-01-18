Feature: US1012 Window testi

  Scenario: TC17 kullanici yeni acilan window'u test edebilmeli

    Given kullanici "wdUrl" anasayfaya gider
    Then login portal elementine kadar asagi iner
    And login portala tiklar
    Then acilan yeni window a gecer
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then webunuversity login butonuna basar
    And popup ta cikan yazinin  validation failf oldugunu test eder
    And OK diyerek popup i kapatir
    Then ilk sayfaya geri döner
    And ilk sayfaya döndügünü test eder
    And acilan tum sayfalari kapatir





