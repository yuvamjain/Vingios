REGEX
Yuvam Jain
Fri 7/3/2020 3:53 PM
Hi Lurae,

 

Here are the few Regex examples.

Please let me know if you need any help in building any Regex.


1. Bring string into single line

REGEX('4 GitLab Commits'.'Commit Message', NULL, "[^\r\n]+")

 

2. Get mapped value data

TRIM(CONCAT(TOKENIZE(REGEX(column,NULL,"(?<=id: ).*")," )")))

 

3. Get mapped name from mapped column

LEFT('Release Details'.Release, SEARCH("(ID:", 'Release Details'.Release)-1)

 

4. Get sprint names from sprint

REGEX(Issues.Sprint, NULL, "(?<=name=)(.*)(?=goal)")

 

5. Get sprint id from sprint

REGEX(Issues.Sprint, NULL, "(?<=id=)[0-9]+")

 

6. Get Jira id from text

((?<!([A-Za-z]{1,10})-?)[A-Z]+-\d+)

regex(Sprints.Sprint, NULL, "((?<=id:)([0-9][0-9]+))")

 

7. Extract data between two 2 strings

(?<=\[)(.*?)(?=\])


8. Regex to break string using single/more than 1 characters, here using ,"
REGEX('User Templates'.Column3, NULL, '(?=)(.*?)(?=,")')

 

9. Extract data between multiple matching strings
 REGEX(IssuesDetail.'Test Failure Reason', NULL, '(("(testKey)":").*?(")(?=,"))|("messageContent":").*?("})')
 
10. Extract Numeric value from a string
 
TOINT(REGEX('Valid jenkinsfile Files'.'Min Code Coverage from File', NULL, "([0-9]+)"))

11. Regex to find string between a string and a new line
"[ \t]*First Name : [ \t]*([^\n\r]*)"

12. Count of values in multivalued
Entities.Separator = "#CTUDASEP#"
Entities.SeparatorLength = LENGTH(Entities.Separator)
Person Count = LENGTH(CONCAT(REGEX(CONCATENATE(Entities.Person, Entities.Separator), NULL, Entities.Separator)))/Entities.

13. 
