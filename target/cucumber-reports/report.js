$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "As a user i want to add item in the cart successfully",
  "description": "",
  "id": "as-a-user-i-want-to-add-item-in-the-cart-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 11641380715,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I want to add the item in cart succesfully",
  "description": "",
  "id": "as-a-user-i-want-to-add-item-in-the-cart-successfully;i-want-to-add-the-item-in-cart-succesfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Create your account",
  "rows": [
    {
      "cells": [
        "First Name",
        "Elavarasan"
      ],
      "line": 7
    },
    {
      "cells": [
        "Last Name",
        "Srinivasan"
      ],
      "line": 8
    },
    {
      "cells": [
        "Email Address",
        "elavarasansrinivasan2020@gmail.com"
      ],
      "line": 9
    },
    {
      "cells": [
        "Address",
        "Dugar MME Gold City, Tower 4 ,Flat No 304"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "Password1"
      ],
      "line": 11
    },
    {
      "cells": [
        "City",
        "Chennai"
      ],
      "line": 12
    },
    {
      "cells": [
        "PostalCode",
        "35007"
      ],
      "line": 13
    },
    {
      "cells": [
        "Mobile Phone",
        "9500414365"
      ],
      "line": 14
    },
    {
      "cells": [
        "Address Alias",
        "chidambaram"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Sign out from the application",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Login with valid user name \"elavarasansrinivasan2020@gmail.com\" and password \"Password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Navigate to My Addresses and add a new address",
  "rows": [
    {
      "cells": [
        "First Name",
        "ElavarasanUpdated"
      ],
      "line": 19
    },
    {
      "cells": [
        "Last Name",
        "SrinivasanUpdated"
      ],
      "line": 20
    },
    {
      "cells": [
        "Email Address",
        "elavarasansrinivasan2020@gmail.com"
      ],
      "line": 21
    },
    {
      "cells": [
        "Address",
        "Dugar1 MME Gold City, Tower 4 ,Flat No 304 Updated"
      ],
      "line": 22
    },
    {
      "cells": [
        "Password",
        "Password1"
      ],
      "line": 23
    },
    {
      "cells": [
        "City",
        "ChennaiUpdated"
      ],
      "line": 24
    },
    {
      "cells": [
        "PostalCode",
        "35006"
      ],
      "line": 25
    },
    {
      "cells": [
        "Mobile Phone",
        "9500414364"
      ],
      "line": 26
    },
    {
      "cells": [
        "Address Alias",
        "DallasUpdated"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Navigate to \u0027Women\u0027 --\u003e Summer dresses",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Move to your profile and check order history and details",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Capture screenshot of the order history",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Sign out from the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.validateLoginPage()"
});
formatter.result({
  "duration": 95487918,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.registerAccount(DataTable)"
});
formatter.result({
  "duration": 12485104795,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.signOut()"
});
formatter.result({
  "duration": 28346278389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "elavarasansrinivasan2020@gmail.com",
      "offset": 28
    },
    {
      "val": "Password1",
      "offset": 78
    }
  ],
  "location": "LoginSteps.loginToPage(String,String)"
});
formatter.result({
  "duration": 21305476575,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.addNewAdress(DataTable)"
});
formatter.result({
  "duration": 5973358387,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.navigateToWomwnsSummerDress()"
});
formatter.result({
  "duration": 71621916198,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.checkOrderHistroy()"
});
formatter.result({
  "duration": 7792806292,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.captureScreenShotOrderHistory()"
});
formatter.result({
  "duration": 18931107045,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.signOut()"
});
formatter.result({
  "duration": 5437781244,
  "status": "passed"
});
formatter.after({
  "duration": 1413897033,
  "status": "passed"
});
});