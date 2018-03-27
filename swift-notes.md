# Swift Notes

## Assignment and Casting:
`let twoThousand: UInt16 = 2_000`

## Tuples:
Examples:

`let http404Error = (404, "Not Found")`


`let http200Status = (statusCode: 200, description: "OK")`
```
print("The status code is \(http200Status.statusCode)")
// Prints "The status code is 200"
print("The status message is \(http200Status.description)")
// Prints "The status message is OK"
```

```
let (x, y) = (1, 2)
// x is equal to 1, and y is equal to 2
```

## Optionals
```
var surveyAnswer: String?
// surveyAnswer is automatically set to nil
```

## Optional binding
```
if let actualNumber = Int(possibleNumber) {
    print("\"\(possibleNumber)\" has an integer value of \(actualNumber)")
} else {
    print("\"\(possibleNumber)\" could not be converted to an integer")
}
// Prints ""123" has an integer value of 123"
```

## Nil-Coalescing Operator
The double question mark (double ??) Operator.
The nil-coalescing operator (a ?? b) unwraps an optional a if it contains a value, or returns a default value b if a is nil. The expression a is always of an optional type. The expression b must match the type that is stored inside a.
`(a ?? b)` is the same as `a != nil ? a! : b`


## Strings
String values can be constructed by passing an array of Character values as an argument to its initializer. (looks to work like `join()` from JavaScript):
```
let catCharacters: [Character] = ["C", "a", "t", "!", "🐱"]
let catString = String(catCharacters)
print(catString)
// Prints "Cat!🐱"
```

## Using indexes
```
let greeting = "Guten Tag!"
print(greeting[greeting.startIndex])
// G
print(greeting[greeting.index(before: greeting.endIndex)])
// !
print(greeting[greeting.index(after: greeting.startIndex)])
// u
let index = greeting.index(greeting.startIndex, offsetBy: 7)
greeting[index]
// a
```
```
for index in greeting.indices {
    print("\(greeting[index]) ", terminator: "")
}
// Prints "G u t e n   T a g ! "
```

## Add and remove from Strings
```
// using .insert()
var welcome = "hello"
welcome.insert("!", at: welcome.endIndex)
// welcome now equals "hello!"

welcome.insert(contentsOf: " there", at: welcome.index(before: welcome.endIndex))
// welcome now equals "hello there!"

// using .remove()
welcome.remove(at: welcome.index(before: welcome.endIndex))
// welcome now equals "hello there"

let range = welcome.index(welcome.endIndex, offsetBy: -6)..<welcome.endIndex
welcome.removeSubrange(range)
// welcome now equals "hello"
```

## Substrings
When you get a substring from a string—for example, using a subscript or a method like prefix(_ :)—the result is an instance of Substring, not another string. Substrings in Swift have most of the same methods as strings, which means you can work with substrings the same way you work with strings. However, unlike strings, you use substrings for only a short amount of time while performing actions on a string. When you’re ready to store the result for a longer time, you convert the substring to an instance of String. For example:
```
let greeting = "Hello, world!"
let index = greeting.index(of: ",") ?? greeting.endIndex
let beginning = greeting[..<index]
// beginning is "Hello"

// Convert the result to a String for long-term storage.
let newString = String(beginning)
```

Like strings, each substring has a region of memory where the characters that make up the substring are stored. The difference between strings and substrings is that, as a performance optimization, a substring can reuse part of the memory that’s used to store the original string, or part of the memory that’s used to store another substring. (Strings have a similar optimization, but if two strings share memory, they are equal.) This performance optimization means you don’t have to pay the performance cost of copying memory until you modify either the string or substring. As mentioned above, substrings aren’t suitable for long-term storage—because they reuse the storage of the original string, the entire original string must be kept in memory as long as any of its substrings are being used.

In the example above, `greeting` is a string, which means it has a region of memory where the characters that make up the string are stored. Because `beginning` is a substring of `greeting`, it reuses the memory that `greeting` uses. In contrast, `newString` is a string—when it’s created from the substring, it has its own storage. The figure below shows these relationships:

## Collection Types
Swift provides three primary collection types, known as arrays, sets, and dictionaries

### Creating Arrays
Creating an Empty Array

You can create an empty array of a certain type using initializer syntax:
```
var someInts = [Int]()
print("someInts is of type [Int] with \(someInts.count) items.")
// Prints "someInts is of type [Int] with 0 items."
```

### Concatenating Arrays
Creating an Array by Adding Two Arrays Together - You can create a new array by adding together two existing arrays with compatible types with the addition operator (+). The new array’s type is inferred from the type of the two arrays you add together:
```
var anotherThreeDoubles = Array(repeating: 2.5, count: 3)
// anotherThreeDoubles is of type [Double], and equals [2.5, 2.5, 2.5]

var sixDoubles = threeDoubles + anotherThreeDoubles
// sixDoubles is inferred as [Double], and equals [0.0, 0.0, 0.0, 2.5, 2.5, 2.5]
```

## Array Methods
Use `.append()` to put something at the end of the array. like `.push()`

Alternatively, append an array of one or more compatible items with the addition assignment operator (+=):
```
shoppingList += ["Baking Powder"]
// shoppingList now contains 4 items
shoppingList += ["Chocolate Spread", "Cheese", "Butter"]
// shoppingList now contains 7 items
```

To insert an item into the array at a specified index:
```shoppingList.insert("Maple Syrup", at: 0)
// shoppingList now contains 7 items
// "Maple Syrup" is now the first item in the list
```
