
Feature: Consult economic tickets
  As a frequent user
  I want to see economic tickets
  to travel the world

  Scenario: find economic tickets
    Given Sandra needs to check the availability of flights
    When she search for economic tickets from Medellín, Antioquia, Colombia to Cartagena de Indias, Bolívar, Colombia departing on 01/09/2018 and returning on 29/09/2018
    Then she should see the list of available flights
  
