### Change string
Make a function return a string like:
```
accum("abcd") // -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") // -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") // -> "C-Ww-Aaa-Tttt"
```

Solution:
```
func accum(_ s: String) -> String {
  var strBuilder: String = ""
  var arr = Array(s.lowercased())
  // for loop to go over the str
  for i in 0..<arr.count {
      for j in 0..<(i+1) {
        if j == 0 {
            strBuilder.append(String(arr[i]).uppercased())
        } else {
            strBuilder.append(String(arr[i]))
        }

      }
      if i == arr.count - 1 {
          break
      }
      strBuilder.append("-")
  }
    return strBuilder
}
```

Things learned:\n
`var str = "string"`
String to array: `Array(str)`
Upper and lower case: `str.lowercased()` or `str.uppercased()`
Add to a string:
```
str.append("s")
print(str)
// output is strings
```
Convert character to string: `String(character)`
Get character at index of string:
```
let str = "Hello, world!"
let index = str.index(str.startIndex, offsetBy: 4)
str[index] // returns Character 'o'
```


### Factorial
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it (e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 and the input will always be an integer.
```
func FirstFactorial(_ num: Int) -> Int {
  var sum: Int = 1
  for i in 1...num {
      sum *= i
  }
  return sum
}
```
Recursion solution:
```
func FirstFactorial(_ num: Int) -> Int {
  guard num > 1 else { return 1 }

  return num * FirstFactorial(num - 1)

}
```

Things learned:
`guard` to see if the num is still greater than 1, if not return 1 and stop the function


### Reverse String
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. For example: if the input string is "Hello World and Coders" then your program should return the string "sredoC dna dlroW olleH".
```
func FirstReverse(_ str: String) -> String {
  var s: String = ""
  for i in (str).reversed() {
      s = s + String(i)
  }
  return s

}
```
Things learned:
`for i in (str).reversed()` to loop through reversed or decreasing
`String(i)` to convert `String.element (Character)` to `String` and allow it to be concatenated to the string
