
# Current Features
- has a linter for the google-java-style

# Useful Commands

## Linting/CodeStyle

### We have configured this to check the linting with checkstyle
mvn validate

## Dependency Management 


[you can exclude versions if needed](https://www.baeldung.com/maven-dependency-latest-version#filtering-out-unwanted-dependencies)

### update the version of our application throughout the multi modules
mvn versions:set -DnewVersion=0.0.2-SNAPSHOT

### shows if there are any deps that need updating (list only)
mvn versions:display-dependency-updates

### roll back a change to the POM
mvn versions:revert

### commit the changes to the POM
mvn versions:commit

### upgrade from -SNAPSHOT to a release version (updates POM too)
mvn versions:use-releases

### upgrade releases to the next one (ie 2.2.1 -> 2.2.2)
mvn versions:use-next-releases

### upgrade to the latest release (ie 2.2.1 -> 4.3.5)
mvn versions:use-latest-releases

# Learning Notes

TODO: 
- create tag for the multi module code check
  - can this be used for other projects?
- try to use the spotless plugin.
  - can I make a vscode plugin for it?
  - is it and vscode good enough?
- mvn git hooks
- ansible setup
  - can I test this on Docker contiainer?

Questions:
- Commit signing 

Notes:
- move as much out of maven as possible to reduce build/recompile times, want it as its own thing.
  - can this be done with the different lifecyles?

Code Style:
- no versions specified in the deps, move them to the props tag
- nothing in the POM that is not used
- if it is used, put it in the POM
- @SLF4J over logger.getLogger


Snippets:
