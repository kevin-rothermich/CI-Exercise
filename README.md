[![Build Status](https://travis-ci.org/cs-worcester-cs-348-sp-2020/CI-Exercise.svg?branch=master)](https://travis-ci.org/cs-worcester-cs-348-sp-2020/CI-Exercise)

*Version 2020-Spring-1.0, Revised 20 April 2020*

### *CS-348 01, 02 &mdash; Spring 2020*

# Continuous Integration Exercise

## Set up your Repository

### Fork the Repository

[https://github.com/cs-worcester-cs-348-sp-2020/CI-Exercise](https://github.com/cs-worcester-cs-348-sp-2020/CI-Exercise)

### 1. Clone the Repository

### 2. Add the original repository as an upstream remote

### 3. Build with Gradle

gradle clean build

### 4. View Travis CI Builds

[https://travis-ci.org/cs-worcester-cs-348-sp-2020/CI-Exercise/](https://travis-ci.org/cs-worcester-cs-348-sp-2020/CI-Exercise)

Be sure to look at the tabs `Current`, `Branches`, `Build History`, and `Pull Requests`.

### 5. Look at the Travis Configuration

Look at the `.travis.yml` file in the CIExercise

### 6. Look at the Git Configuration

Look at the `.gitignore` file in the CIExercise

### 7. Look at the `README.me` File

Look at the HTML source for the badge on the top line.

## Modify the CIExercise to Include your Name

I am *intentionally* not repeating all of the Git and GitHub commands for you here. You should be getting used to what you need to do. If you cannot remember how, do the following steps ***in order***:

1. Look at past in-class exercises and homework assignments.
2. Ask your classmates for help.
3. Ask me for help.

### 1. Create an `add-yourname` branch, and switch to that branch

Replace `yourname` with your own name.

### 2. Edit the code

Based on the last digit of your WSU Student ID, edit the appropriate `EndsWith` class. For example, my ID ends with `6`, so I edited the `EndsWith6.java` file. Look at `EndsWith6.java` as an example for what to do.

### 3. Build and test the code with Gradle

The test will fail because you have not updated the test file for the class you edited.

Go update the test for the code you just wrote and test again.

### 4. Run the JAR File

java -jar build/libs/CS-348-CI-Exercise.jar

(Note: If you get an error that there is a mismatch in Java versions in which the code has been compiled and executed, then execute it straight from the java executable of JDK, instead of that available in JRE, as follows:

From Git Bash prompt:

 "/c/Program Files/Java/jdk-14/bin/java" -jar build/libs/CI-Exercise.jar

From DOS command prompt:

"C:\Program Files\Java\jdk-14\bin\java" -jar build\libs\CI-Exercise.jar    )

### 5. Add your code and commit your changes

### 6. Before pushing your changes, make sure your repository is up-to-date with upstream

Pull recent changes from your classmates

Resolve any conflicts

### 7. Push changes

Make sure you are pushing to your branch.

### 8. Make a pull request to have your change merged into the original repository

Note that you cannot make a pull request until Travis has run your build, and your tests are successful.

See the [branch protection rule](https://github.com/cs-worcester-cs-348-sp-2020/CI-Exercise/settings/branch_protection_rules/15536969) to see how this was done. 

### 9. Go to the original repository and approve someone else's pull request

### 10. Check Travis

# Reference Material

## Git Workflow Reminder

> 1. Add the change
>    
>    > 2. Pull any changes that have ocurred since the last pull, and correct merge conflicts
>    >    
>    >    > > 3. Commit the change, with a message describing the change.
>    >    > >    
>    >    > >    > > > > 4. Push the change
>    >    > >    > > > >    
>    >    > >    > > > >    > > > > > > > > 5. Make a pull request to have the change merged into the original repository

## General Bash  Hints

* To view hidden files (starting with .) in Bash, type `ls -al`

## Copyright and License

#### © 2020 S Nagpal, Worcester State University

Based on an assignment from Karl R. Wurst. Used with permission.

[](http://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png)This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. To view a copy of this license, visit[http://creativecommons.org/licenses/by-sa/4.0/](http://creativecommons.org/licenses/by-sa/4.0/)or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
