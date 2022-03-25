This is a project to run the CDI TCK against OpenLiberty

Adapted from the OpenLiberty integration tests at https://github.com/OpenLiberty/open-liberty/

## How to use

* Clone and `mvn install` the current branch of the [CDI TCK](https://github.com/eclipse-ee4j/cdi-tck)
* Clone this project
* Extract a developer build of openliberty into the root of the project
  * remove any arquillian-liberty* files from wlp/lib and wlp/lib/features which may be present
* Run `mvn verify`

## Configuration

To change which tests are run, edit the `tck-suite.xml` file.

To change the arquillian container parameters (app deploy timeouts etc.), edit `src/test/resources/arquillian.xml`.

To run against a different version of the TCK edit the pom.xml.

## Debugging

To debug the liberty server, uncomment the lines in `jvm.options`, increase the timeouts in arquillian.xml if necessary, run `mvn test` and attach your debugger to port 8000 when the server starts.

## Known issues

This doesn't include the full setup with required external resources or the porting package. It's useful for running individual tests locally, but not for running the whole suite.
