Feature: GoIBIBO Application

#Scenario: Verify the Active Tab is flights
#
#Given User logs into the application
#Then Verify whether the active Tab is "Flights"
#And close the browser
#

Scenario: Navigate to all other tabs and verify whether the same is highlighted

Given User logs into the application
When user selects the "Flights" link
Then verfiy whether the active tab is "Flights"
And close the browser

#Scenario: Verify Swap Link
#
#Given User logs into the application
#When User selects one way and flight details from "BLR" and to "DEL"
#And User swaps the places
#Then places should be swapped
