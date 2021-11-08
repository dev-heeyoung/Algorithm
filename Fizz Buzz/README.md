# Question
Fizz Buzz

# Source
https://leetcode.com/problems/fizz-buzz/

# Solution
I created a new String ArrayList, and it will be the return value. I used ArrayList over an array because using ArrayList is faster than using an array when we add a new value, and we don't need to search any value in the array. The loop continues n times and checks if the index+1(because the index starts with 0) is divided 15, 3, or 5. First, we need to check if the index is divisible by 15 because it has the same meaning as that the index is divisible by 3 and 5. If it is true, add "FizzBuzz" to the String ArrayList. If the index+1 is divisible by 3, add "Fizz", and add "Buzz" if the index+1 is divisible by 5. If index+1 is not divisible by 3, 5, or 15, add i+1 to the String ArrayList. After for loop, returns the String ArrayList, result.