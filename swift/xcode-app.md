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

**Use gesture recognizers to generate events**
Go to the object library and type in `tap gesture` then drag and place over the object you want with a tap gesture

On the scene dock, top of the storyboard, you will see it appear. Control drag from here to your code to create connection.

Need to add `UIImagePickerControllerDelegate` and `UINavigationControllerDelegate` to the `ViewController` class
```
class ViewController: UIViewController, UITextFieldDelegate, UIImagePickerControllerDelegate, UINavigationControllerDelegate {
```
Setting up the function in our code should look like this:
```
@IBAction func selectImageFromPhotoLibrary(_ sender: UITapGestureRecognizer) {

    // Hide the keyboard. This code ensures that if the user taps the image view while typing in the text field, the keyboard is dismissed properly.
    nameTextField.resignFirstResponder()

    // UIImagePickerController is a view controller that lets a user pick media from their photo library.
    let imagePickerController = UIImagePickerController()

    // Only allow photos to be picked, not taken. The type of imagePickerController.sourceType is known to be UIImagePickerControllerSourceType, which is an enumeration. This means you can write its value as the abbreviated form .photoLibrary instead of UIImagePickerControllerSourceType.photoLibrary. Recall that you can use the abbreviated form anytime the enumeration value’s type is already known.
    imagePickerController.sourceType = .photoLibrary

    // Make sure ViewController is notified when the user picks an image.
    imagePickerController.delegate = self
    present(imagePickerController, animated: true, completion: nil)
}
```

To select or cancel image selection from camera roll
```
func imagePickerController(_ picker: UIImagePickerController, didFinishPickingMediaWithInfo info: [String : Any]) {

    // The info dictionary may contain multiple representations of the image. You want to use the original.
    guard let selectedImage = info[UIImagePickerControllerOriginalImage] as? UIImage else {
        fatalError("Expected a dictionary containing an image, but was provided the following: \(info)")
    }

    // Set photoImageView to display the selected image.
    photoImageView.image = selectedImage

    // Dismiss the picker.
    dismiss(animated: true, completion: nil)
}
```
Then you have to go to the `Info.plist` file and add in `Privacy - Photo Library Usage Description`. `Type` is set to `String`. Then, double-click on the `Value` section and enter `Allows you to add photos to your meals`


**Use the asset catalog to add image assets to a project**
In the project navigator, select Assets.xcassets to view the asset catalog.

The asset catalog is a place to store and organize your image assets for an app. In the bottom left, there is a + button to add files to folder

**To display a default image in the image view**

Open your storyboard.

In your storyboard, select the image view.

With the image view selected, open the Attributes inspector image in the utility area.

In the Attributes inspector, find the field labeled Image and select the photo.

## To create a subclass of UIStackView
This is when you want a custom view

1. Choose File > New > File (or press Command-N).

2. At the top of the dialog that appears, select iOS.

3. Select Cocoa Touch Class, and click Next.

4. In the Class field, type RatingControl.

5. In the “Subclass of” field, select UIStackView.

6. Make sure the Language option is set to Swift.

7. Click Next.

The save location defaults to your project directory.

The Group option defaults to your app name, FoodTracker.

In the Targets section, your app is selected and the tests for your app are unselected.

8. Leave these defaults as they are, and click Create.

Xcode creates a file that defines the RatingControl class: RatingControl.swift. RatingControl is a custom view subclass of UIView.

9. If necessary, in the Project navigator, drag the RatingControl.swift file so that it’s positioned under the other Swift files.

10. In `RatingControl.swift`, delete the comments that come with the template implementation so you can start working with a blank slate.


## To display the view

1. Open your storyboard.

2. In your storyboard, use the Object library to find a Horizontal Stack View object, and drag one into your storyboard scene so that it’s in the stack view below the image view.

3. With the horizontal stack view selected, open the Identity inspector image.

Recall that the Identity inspector lets you edit properties of an object in your storyboard related to that object’s identity, such as what class the object belongs to.

4. In the Identity inspector, find the field labeled Class and select RatingControl.


## Data Models

### Creating data models
1. Choose File > New > File (or press Command-N).

2. At the top of the dialog that appears, select iOS.

3. Select Swift File, and click Next.

You’re using a different process to create this class than the RatingControl class you created earlier (iOS > Source > Cocoa Touch Class), because you’re defining a base class for your data model, which means it doesn’t need to inherit from any other classes.

4. In the Save As field, type Meal.

5. The save location defaults to your project directory.

The Group option defaults to your app name, FoodTracker.

In the Targets section, your app is selected and the tests for your app are unselected.

6. Leave these defaults as they are, and click Create.

Example of class:
```
import UIKit
class Meal {

    //MARK: Properties

    var name: String
    var photo: UIImage?
    var rating: Int

    init?(name: String, photo: UIImage?, rating: Int) {

      // Initialization should fail if there is no name or if the rating is negative.
      if name.isEmpty || rating < 0  {
          return nil
      }

      // Initialize stored properties.
      self.name = name
      self.photo = photo
      self.rating = rating

    }  
}
```

## Writing tests
Navigate to the tests file in the tests folder generated

Deleting the template functions in the file, and adding your own tests:
```
func testMealInitializationSucceeds() {
  // Zero rating
  let zeroRatingMeal = Meal.init(name: "Zero", photo: nil, rating: 0)
  XCTAssertNotNil(zeroRatingMeal)

  // Highest positive rating
  let positiveRatingMeal = Meal.init(name: "Positive", photo: nil, rating: 5)
  XCTAssertNotNil(positiveRatingMeal)
}
```
