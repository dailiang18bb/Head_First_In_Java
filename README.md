# Head_First_In_Java
Pounding it


### Reference
* a **class** is like the blueprint for a house. Using this blueprint, you can build as many houses as you like.
* each house you build (or instantiate, in OO lingo) is an **object**, also known as an **instance**.
* each house also has an address, of course. If you want to tell someone where the house is, you give them a card with the address written on it. That card is the object's **reference**.
* If you want to visit the house, you look at the address written on the card. This is called **dereferencing**.

The compiler decides whether you can call a method based on the reference type, not the actual object type.


### Abstract class vs abstract method
* An abstract class means the class must be **extended**.
* An abstract methodd means the method must be **overridden**.

### Casting

		if (o instanceof Dog) {			Dog d = (Dog) o;		}