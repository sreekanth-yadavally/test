$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("topicsSelenium\\ucmHomepage.feature");
formatter.feature({
  "line": 1,
  "name": "UCM WebSite",
  "description": "",
  "id": "ucm-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Ucm home page",
  "description": "",
  "id": "ucm-website;ucm-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am Given",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am when",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am then",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I am in google home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter git",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "It will open Suggestions",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.NavLinks()"
});
formatter.result({
  "duration": 29114304262,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.BlackboardLink()"
});
formatter.result({
  "duration": 94426,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.Success()"
});
formatter.result({
  "duration": 224262,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.openURL()"
});
formatter.result({
  "duration": 5304086749,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.openGit()"
});
formatter.result({
  "duration": 863247999,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.suggestions()"
});
formatter.result({
  "duration": 171403,
  "status": "passed"
});
});