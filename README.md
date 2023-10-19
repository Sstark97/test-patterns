# Test Patterns 🧪

## Test-Specific Subclass 👶🏻
This pattern is used as a security mechanism. When we want to test a specific method, but we know that this method may 
have calls to other methods that produce side effects, we create a specific subclass of the class to be tested 
(Inheritance) and override the method that generates those unwanted changes.
We could even turn this subclass into a spy and record that the undesired method has been called.

Sometimes, this pattern is often used for convenience and performance rather than for security, such as to avoid 
expensive calculations.

### Example
Xray is class that has a method called `align()` that change the direction of the object. This method calls another
method called `turnOn()` that turns on the Xray. We want to test the `align()` method, but we don't want to turn on the
Xray. So we create a subclass of Xray called SafeXray and override the `turnOn()` method to do nothing.

[Xray](src/main/java/org/example/Xray.java)<br>
[SafeXray](src/main/java/org/example/test_specific_subclass/SafeXray.java)<br>
[SafeXrayTest](src/test/java/org/example/test_specific_subclass/XrayTest.java)

## Self-Shunt  🧬
It's a variation of the Test-Specific Subclass pattern, but in this case, it's the test class that overrides the 
undesired behavior (the one that inherits from the class being tested).

However, we need to consider the testing framework to be used since it can construct test classes at different times, 
so care must be taken to ensure that all spy variables are properly reset.

### Example
The same example as the Test-Specific Subclass pattern, but in this case, we override the `turnOn()` method in the test.

[Xray](src/main/java/org/example/Xray.java)<br>
[XraySelfShuntTest](src/test/java/org/example/self_shunt/XraySelfShuntTest.java)<br>

## Humble Object 😛
It is used to separate the code that is difficult to test from the code that is easy to test. We delegate that code, 
which is difficult to test, to another class that is so small that we don't need to test it. This is generally done with
the boundary we interact with, code over which we have no control, such as functions/methods of a framework. It's not 
even necessary for us to know what it does; we simply delegate it to another class and inject it into our class through 
a constructor.

### Example
We have a class called `Calculator` that has a method called `calculateSquareRoot()` that calculates the square root of 
a number.
This method uses the `Math.sqrt()` method, which is a static method of the Math class. We want to test the `sqrt()`
method, but we don't want to test the `Math.sqrt()` method. So we create a class called `MathHelper` that has a method
called `sqrt()` that calls the `Math.sqrt()` method. We inject the `MathHelper` class into the `Calculator` class.

[Calculator](src/main/java/org/example/humble_object/Calculator.java)<br>
[MathHelper](src/main/java/org/example/humble_object/MathHelper.java)<br>
[CalculatorTest](src/test/java/org/example/humble_object/CalculatorTest.java)<br>