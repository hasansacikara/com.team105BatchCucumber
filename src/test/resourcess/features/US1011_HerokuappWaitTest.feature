Feature: US1012 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario: TC16 kullanici bekleyerek butonlarin gorunur olmasini saglamali

    Given kullanici "herokkuappUrl" anasayfaya gider
    Then  Add Element butonuna basar
    And Delete butonu görürnür oluncaya kadar bekler
    And Delete butonu görürnür oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And  Delete butonunun gorunmedigini test eder










