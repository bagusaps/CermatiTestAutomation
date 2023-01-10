@DaftarAkunCermatiFeature
Feature: Daftar Akun Cermati Feature

  Scenario: Daftar akun cermati
    Given open register cermati page
    Then user in register cermati page
    When user input email 'test123@gmail.com'
    And user input no handphone '081334342023'
    And user input password 'Testing123!!'
    And user input confirm password 'Testing123!!'
    And user input first name 'test'
    And user input last name 'cermati123'
    And user input city 'KOTA JAKARTA PUSAT'
    And user click daftar