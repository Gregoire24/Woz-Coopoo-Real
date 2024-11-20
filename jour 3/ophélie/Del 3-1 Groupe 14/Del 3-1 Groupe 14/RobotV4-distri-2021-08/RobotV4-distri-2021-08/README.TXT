PROJECT TITLE: RobotV4
PURPOSE OF PROJECT: A graphical robot
VERSION or DATE: 2021-08
AUTHORS: Patrick GIRARD

SUBJECT
We will design a funnier robot. The CanvasRobot class provides you the ability to display
a robot on a square blank window (the “canvas”). The result is quite similar to the 
CanvasTurtle you used previously. 

Nevertheless, the two classes do not work the same way, because of one fundamental reason: 
CanvasTurtle is not a real class, you do not need instantiating objects; drawing the 
turtle is made by a static function. The consequence is that you cannot have more than 
one turtle on the screen at the same time.

On the opposite, CanvasRobot is a real class, which allows instantiating several objects, 
which are displayed on the same canvas. 
Consequently, while the turtle can call a function to show itself at each move, the robots 
need to know their graphical representation as an object. They must be linked to them. 
You should create an attribute, called canvasRobot that shall be instantiated in the 
constructor. The constructors need also to be changed. Then you need to call the 
printRobot() method everywhere it is necessary (every time the robot moves, in fact).

Because we can choose the colour of the body of the robot, we need to manage the colour 
in the robot. You should add a colour attribute, and a setter and a getter for it in your 
robot class. The colour should also be a parameter of the constructors, in order to allow 
robot color personalisation.

Note: you are not allowed to modify either of the three classes Colour, Canvas and 
CanvasRobot.

PREREQUISITE
    Scenario #3 successful

SPECIAL INSTRUCTIONS
    1. Download the BlueJ project
    2. Copy the Robot class from your previous project into this project, and compile it
    3. Create the canvasRobot attribute, and assess your design with 
        the AutomatedEvaluation extension
    4. Create the colourBody attribute, and its associated methods. Assess your design
    5. Run run the Junit tests

SKILLS
    - Skill 1: Relations between classes
    - Skill 2: Using a complex class
