# JavaMavenTemplate

A template project based on java and maven, so as to start a new project quickly.



## Dependencies

- `maven` > 3.0
- `java` > 8.0




## TODO

- [x] Use `Junit` to test.
- [x] Use `checkstyle` to checkstyle.
- [x] Use `maven-compiler-plugin` to set source and target version of java.
- [x] Use `maven-shade-plugin` to set mainClass of project.
- [x] Use `git hoook ` to checkstyle before commit.
- [x] Use `travis` to build after push to GitHub.

## Usages

```shell
# copy pre-commit to ./.git/hooks
$ bash install.sh
# install dependencies
$ mvn install

# test
$ mvn test

# clean ./target
$ mvn clean

# package source code to ./target/project-name.jar
$ mvn package

# run the jar package. 
# First argument is old file.
# Seoncd argument is new file.
$ java -jar target/<project-name>.jar
```