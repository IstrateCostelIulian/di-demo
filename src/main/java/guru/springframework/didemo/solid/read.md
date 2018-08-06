# Single Responsibility Principle
    divided the responsibilities of editing text and printing text between two classes. You can notice that, if an error
    occurred, the debugging would be easier, since it wouldn’t be that difficult to recognize where the mistake is.
    Also, there is less risk of accidentally introducing software bugs, since you’re modifying a smaller portion of code
# Open Closed Principle
    Most of the times real closure of a software entity is practically not possible because there is always a chance
    that a change will violate the closure. For example, in our insurance example a change in the business rule to
    process a specific type of claim will require modifying the ClaimApprovalManager class. So, during enterprise
    application development, even if you might not always manage to write code that satisfies the Open Closed Principle
    in every aspect, taking the steps towards it will be beneficial as the application evolves.
# Liskov Substitution Principle
    Object Oriented languages such as Java are very powerful and offer you as a developer a tremendous amount of 
    flexibility. You can misuse or abuse any language. In the Polymorphism post I explained the ‘Is-A’ test. 
    If you’re writing objects which extend classes, but fails the ‘Is-A’ test, you’re likely violating the 
    Liskov Substitution Principle.
# Interface Segregation Principle
    Both the Interface Segregation Principle and Single Responsibility Principle have the same goal: ensuring small, 
    focused, and highly cohesive software components. The difference is that Single Responsibility Principle is 
    concerned with classes, while Interface Segregation Principle is concerned with interfaces. Interface Segregation 
    Principle is easy to understand and simple to follow. But, identifying the distinct interfaces can sometimes be a 
    challenge as careful considerations are required to avoid proliferation of interfaces. Therefore, while writing an 
    interface, consider the possibility of implementation classes having different sets of behaviors, and if so, 
    segregate the interface into multiple interfaces, each having a specific role.
# Dependency Inversion Principle
    Robert Martin equated the Dependency Inversion Principle, as a first-class combination of the Open Closed Principle 
    and the Liskov Substitution Principle, and found it important enough to give its own name. While using the 
    Dependency Inversion Principle comes with the overhead of writing additional code, the advantages that it provides 
    outweigh the extra effort. Therefore, from now whenever you start writing code, consider the possibility of 
    dependencies breaking your code, and if so, add abstractions to make your code resilient to changes.        