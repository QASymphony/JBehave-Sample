Narrative:
In order to quickly find out the multi of those two numbers
As a user
I want to use a calculator to multi two numbers




Scenario:  1
Given I have a calculator
When I multi <number5> and <number6>
Then the multi outcome should <multiresult>

Examples:
|number5|number6|multiresult|
|20|10|200|

Scenario:  2
Given I have first calculator
When I multi <number5_1> and <number6_1>
Then the multi outcome should <multiresult_1>

Examples:
|number5_1|number6_1|multiresult_1|
|20|10|2000|

Scenario:  3
Given I have second calculator
When I multi <number5_2> and <number6_2>
Then the multi outcome should <multiresult_2>

Examples:
|number5_2|number6_2|multiresult_2|
|20|20|400|
