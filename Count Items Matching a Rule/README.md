# Question
Count Items Matching a Rule

# Source
https://leetcode.com/problems/count-items-matching-a-rule/

# Solution
 - Initialize int *res* to 0. It will be the return value.
 - First, check if the *ruleKey* is "type", "color", or "name".
 - *type*: check each first element of the list of items. Increase *res* by 1 if the value matches with the *ruleValue*.
 - *color*: check each second element of the list of items. Increase *res* by 1 if the value matches with the *ruleValue*.
 - *name*: check each third element of the list of items. Increase *res* by 1 if the value matches with the *ruleValue*.
 - Return *res*.