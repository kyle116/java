## AppDelegate.swift source file
Two primary functions:
* It defines your `AppDelegate` class. The app delegate creates the window where your app’s content is drawn and provides a place to respond to state transitions within the app.
* It creates the entry point to your app and a run loop that delivers input events to your app. This work is done by the `UIApplicationMain` attribute (`@UIApplicationMain`), which appears toward the top of the file.

The `AppDelegate` class contains a single property:
```
var window: UIWindow?
```
This property stores a reference to the app’s window. This window represents the root of your app’s view hierarchy. It is where all of your app content is drawn. Note that the window property is an optional, which means it may have no value (be nil) at some point.


## ViewController.swift Source File
This file defines a custom subclass of `UIViewController` named `ViewController`. Right now, this class simply inherits all the behavior defined by `UIViewController`. To override or extend that behavior, you override the methods defined on `UIViewController`.

## Main.storyboard source file
Storyboard is a visual representation of the app’s user interface, showing screens of content and the transitions between them

All view objects in iOS are of type `UIView` or one of its subclasses. Many `UIView` subclasses are highly specialized in appearance and behavior.

## Views
The view hierarchy defines the layout of views relative to other views. Within that hierarchy, views enclosed within a view are called subviews, and the parent view that encloses a view is called its superview. A view can have multiple subviews and only one superview.

All the labels, buttons etc. are all subviews under a superview

Highlight multiple labels, buttons, text fields allows you to stack them together with the bottom right corner button

## Debugging Auto Layout
Debugging Auto Layout, check the Resolve Auto Layout Issues in the bottom right corner

If you are getting warnings about misplaced views, use the Update Frames button

## Connections to UI explained
```
@IBOutlet weak var nameTextField: UITextField!
```
`IBOutlet` attribute tells Xcode that you can connect to the `nameTextField` property from Interface Builder (which is why the attribute has the IB prefix).

`weak` keyword indicates that the reference does not prevent the system from deallocating the referenced object

The rest of the declaration defines an `implicitly unwrapped optional` variable of type `UITextField` named `nameTextField`


## Delegate
A delegate is an object that acts on behalf of, or in coordination with, another object.

```
// Handle the text field’s user input through delegate callbacks.
nameTextField.delegate = self
```
The self refers to the ViewController class, because it’s referenced inside the scope of the ViewController class definition.
You can add your own comments to help you understand what’s happening in your code.
When a ViewController instance is loaded, it sets itself as the delegate of its nameTextField property.

## Removing keyboard after hitting return
```
func textFieldShouldReturn(_ textField: UITextField) -> Bool {
    // Hide the keyboard.
    textField.resignFirstResponder() // textField being the name of the input for typing
    return true
}
```


## Understand the view controller life cycle and its callbacks (for example, viewDidLoad, viewWillAppear and viewDidAppear)
An object of the UIViewController class (and its subclasses) comes with a set of methods that manage its view hierarchy. iOS automatically calls these methods at appropriate times when a view controller transitions between states. When you create a view controller subclass (like the ViewController class you’ve been working with), it inherits the methods defined in UIViewController and lets you add your own custom behavior for each method

**view controller Life Cycle**
![](https://developer.apple.com/library/content/referencelibrary/GettingStarted/DevelopiOSAppsSwift/Art/WWVC_vclife_2x.png?raw=true)


Pass data between view controllers

Dismiss a view controller

Use gesture recognizers to generate events

Anticipate object behavior based on the UIView/UIControl class hierarchy

**Use the asset catalog to add image assets to a project**
In the project navigator, select Assets.xcassets to view the asset catalog.

The asset catalog is a place to store and organize your image assets for an app. In the bottom left, there is a + button to add files to folder

**To display a default image in the image view**

Open your storyboard.

In your storyboard, select the image view.

With the image view selected, open the Attributes inspector image in the utility area.

In the Attributes inspector, find the field labeled Image and select the photo.
