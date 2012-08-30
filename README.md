sbtBug
======

ProjectReference bug in sbt 0.12.0

Attempting to start sbt in the runtime project will result in a 
project not found error for the generator project.  If you change 
the sbt.version in the build.properties to 0.11.3 for the runtime
project, everything works as expected.