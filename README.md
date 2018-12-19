# VeteranHuntersHelping - Kmaitland
Independent Project for Enterprise Java


### Problem Statement

Over the summer, I came across a service that was going to work on pairing up players for the upcoming new video game Monster
Hunter World. They asked that users register within a voice chat sever as either a veteran or novice as well as availability 
to play to match up users and have them play together. During its set up, I signed up as a veteran looking forward to teach 
a new player the ins and outs of the game and let them know there are many of players simply looking to have fun hunting large
monsters. Somewhere during its set up the service proceeded to fail and many users ended up with no veteran/novice to play 
with. My goal for this project to create website that will allow users to sign up and manage their own profiles to find a hunter
that matches their own style. I believe this will allow the project to continue in a more manageable way, and hopefully this 
will bring more hunters into the World of the Monster Hunter series!


### Project Technologies/Techniques
* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Admin role: Will have access to admin page to remove users
  * User role: Create and manage an equipment set to display to other hunters
* Database
  * MySQL
  * Store users their equipment and their roles. 
  * Store all data for the equipment and user messages
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services consumed using Java
  * Twitter API
* CSS 
  * Bootstrap and some styling
* Data Validation
  * Explore Hibernate's validation
* Logging
  * Configurable logging using Log4J2
* Unit Testing
  * JUnit tests to achieve code coverage 
* IDE: IntelliJ IDEA