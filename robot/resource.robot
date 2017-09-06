*** Settings ***
Library     Selenium2Library
Library     OperatingSystem

*** Variables ***
${URL}          http://localhost:8080
${EMPTY}        nil

*** Keywords ***
Open Browser to application page
    Open Browser   ${URL}

Check for Hello World in content
    Page Should Contain     Hello testing
