PROJECT TITLE: RobotV3
PURPOSE OF PROJECT: A constructor for the class
VERSION or DATE: 2021-08
AUTHORS: Patrick GIRARD

SUBJECT
The previous protection is not enough. It does not prevent a robot from being wrong… With only default 
constructor, a just instantiated robot has wrong values: xPosition and yPosition are set to 0, as each 
int value, but the name is not initialized. It is set to the null value.

However, protecting constructors is more difficult than protecting setters. Just ignoring wrong values 
is not an option. The best solution would be to break the constructor, by using exceptions. We will study 
this way later.
The simplest solution is to define a default value; for example, we will assume that the name of the 
robot will be “iRobot1”, or “iRobot2”, and so on.

To do that, we use a class attribute, which stores the number we can add to the name "iRobot”. 
We choose to create two constructors, one with only one parameter (the name) and one with three parameters 
(the name, and X and y parameters). The behavior of the constructors must be:
    - If the name does not fulfil the rule 1 (last scenario), it is set to “iRobot#” where # is replaced 
        by the number of badly named robots.
    - If the position (x or y) is not correct, it is set to 0

PREREQUISITE
    Scenario #2 successful

SPECIAL INSTRUCTIONS
    1. Download the BlueJ project for evaluation
    2. Copy the Robot class from your previous project into this project, and compile it
    3. Define a class attribute, named numberOfUnnamedRobots – assess your design with the AutomatedEvaluation 
        extension
    4. Define the two requested constructors, with empty bodies – assess your design with the 
        AutomatedEvaluation extension
    5. Write the bodies of the two constructors, and run the Junit tests

SKILLS
    - Skill 1: Writing constructors
    - Skill 2: Protecting constructors
    - Skill 3: Using a class attribute to store an incrementor
