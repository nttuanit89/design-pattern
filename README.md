# design-pattern

## Design Principles
- Identify the aspects of your application that vary and separate them from what stays the same.
- Program to an interface, not an implementation.
- Favor composition over inheritance.
- Strive for loosely coupled designs between objects that interact.
- Class should be open for extension, but closed for modification.
- Depend upon abstractions. Do not depend upon concrete classes.

## Strategy
Defines family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## Observer
Defines a one-to-many dependency between objects so that when one object change state, all its dependents are notified 
and updated automatically.

## Decorator
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing 
for extending functionally.

## Abstract Factory
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Factory Method
Defines an interface for creating an object, but let subclasses decide which class to instantiate.
Factory method lets a class instantiation to the subclass.

## Singleton
Ensure a class only has one instance and provide a global point of access to it.