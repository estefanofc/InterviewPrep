# Sherlock and the Valid String
Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.
For example, if , it is a valid string because frequencies are . So is  because we can remove one  and have  of each character in the remaining string. If  however, the string is not valid as we can only remove  occurrence of . That would leave character frequencies of .

## Function Description
Complete the isValid function in the editor below. It should return either the string YES or the string NO.
isValid has the following parameter(s):
s: a string
## Input Format
A single string s.
## Constraints
```
1 <= |s| <= 10^5

Each character s[i] is a ascii[a - z]
```
## Output Format
Print YES if string  is valid, otherwise, print NO. 