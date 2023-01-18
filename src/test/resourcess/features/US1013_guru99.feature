@wip
Feature: US1013 Kullanici Web tablosundan istedigi degeri test eder

Scenario: TC18 Kullanici tablodan deger test edebilmeli

  Given kullanici "guru99Url" anasayfaya gider
  And  guru99 cookies kabul eder
  Then Company listesini consola yazdirir
  And DCB Bank'in listede oldugunu test eder



