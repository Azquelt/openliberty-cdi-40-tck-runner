This is a project to run the CDI TCK against OpenLiberty

Adapted from the OpenLiberty integration tests at https://github.com/OpenLiberty/open-liberty/

## How to use

* Clone this project
* Extract a developer build of openliberty into the root of the project
* Run `mvn test`

## Configuration

To change which tests are run, edit the tck-suite.xml file.

To change the arquillian container parameters (app deploy timeouts etc.), edit src/test/resources/arquillian.xml.

To run against a different version of the TCK (e.g. a locally built snapshot) edit the pom.xml.

## Known issues

This doesn't include the full setup with required external resources or the porting package. It's useful for running individual tests locally, but not for running the whole suite.
