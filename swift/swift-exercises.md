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

Things learned:

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

### Letter Changes
Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
```
Input:"hello*3"
Output:"Ifmmp*3"

Input:"fun times!"
Output:"gvO Ujnft!"
```
```
Incorrect
func LetterChanges(_ str: String) -> String {

  // code goes here   
  // Note: feel free to modify the return type of this function
  var retStr = ""
  let vowels = ["a", "e", "i", "o", "u"]
  for i in str {
      if i == " " {
        retStr = retStr + " "
      } else if i == "z" {
        retStr = retStr + String("A")
      } else {
        retStr = retStr + (vowels.contains(String(UnicodeScalar(UInt8(UnicodeScalar(String(i).lowercased())!.value + 1)))) ? String(UnicodeScalar(UInt8(UnicodeScalar(String(i).lowercased())!.value + 1))).uppercased() : String(UnicodeScalar(UInt8(UnicodeScalar(String(i).lowercased())!.value + 1))))
      }
  }
  print(str)
  return retStr

}
```

```
func LetterChanges(_ str: String) -> String {
    let arrChars = str.map { c -> Character in
        if let t = c.unicodeScalars.first?.value {
            var nextIndex: UInt32
            if (t > 64 && t < 90) || (t > 96 && t < 122) {
                nextIndex = t + 1
            } else {
                if t == 90 || t == 122 {
                    nextIndex = t - 25 // Z->A, z->a
                } else {
                    nextIndex = t
                }
            }

            switch nextIndex {
            case 97, 101, 105, 111, 117: // a,e,i,o,u
                return Character(UnicodeScalar(nextIndex - 32)!) // uppercase
            default:
                return Character(UnicodeScalar(nextIndex)!)
            }
        } else {
            return c
        }
    }

    return String(arrChars)

}
```

### Functional Addition
Create a function add(n)/Add(n) which returns a function that always adds n to any number
```
func add(_ n: Int) -> ((Int) -> Int) {
  return { return $0 + n }
}
// Or
func add(_ n: Int) -> ((Int) -> Int) {
  func retAdd(_ a: Int) -> Int {
    return n + a
  }
  return retAdd
}
```
Things learned:

`$0` Dollar sign followed by number is short hand to refer to which argument so `$0` will refer to the first argument

Returning a function can be returned by returning the name of the function or returning code enclosed in `{}` brackets
