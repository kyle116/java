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
