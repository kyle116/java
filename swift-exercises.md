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
