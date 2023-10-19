# Test Patterns

## Test-Specific Subclass
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

[Xray](src/main/java/org/example/test_specific_subclass/Xray.java)<br>
[SafeXray](src/main/java/org/example/test_specific_subclass/SafeXray.java)<br>
[SafeXrayTest](src/test/java/org/example/test_specific_subclass/XrayTest.java)