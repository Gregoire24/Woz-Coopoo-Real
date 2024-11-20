PROJECT TITLE: RobotV2
PURPOSE OF PROJECT: Protecting our class
VERSION or DATE: 2021-08
AUTHORS: Patrick GIRARD

SUBJECT
One of the main principles of the Object-Oriented paradigm is object internal state management. 
The internal state of a robot is described by its attribute values. So, a robot should not have 
wrong attribute values. 
For example, the name should not be empty, and coordinates should be included in the robot world 
range, for example 0 to 10, or [-10 .. +10].

When attributes are protected (private status), we can control their values through the attribute 
modifiers. The simplest way to do this is to reject wrong values in modifiers: when the values are 
wrong, the modifiers do nothing.

In this exercise, you must protect your attributes to avoid any wrong internal state:
    - Rule 1: The name of the robot must be composed of at least 3 characters with no leading 
                nor trailing whitespace (see special instructions)
    - Rule 2: The xPosition and yPosition must belong to range -5..+5

We will use shared constant values for these 3 numbers: 3 (MIN_NAME_LENGTH), -5  (MIN_POSITION) 
and +5 (MAX_POSITION). 
Remember: all constant values must be written in capital letters

PREREQUISITE
    - Scenario #1 successful

SPECIAL INSTRUCTIONS
    - Download the BlueJ project for evaluation
    - Copy the Robot class from your first project into this project, and compile it
    - Define 3 constant attributes, such as explained upper – assess your design with the 
        AutomatedEvaluation extension
    - Protect your setName() function to ensure the rule 1 applies – test your solution with 
        the Junit test
            Note: The standard String class offers utility functions that allow high-level 
                    manipulations. You should consider the trim() function that could help…
            Note: the SetNameTest must pass, but other tests must fail…
            Warning: you should use the MIN_NAME_LENGTH attribute to constrain your name. 
                    This is not tested.
    - Protect your other setters to ensure the rule 2 – test your solution with the Junit test

SKILLS
    - Skill 1: Protecting attributes
    - Skill 2: Using class members
    - Skill 3: Using constants
