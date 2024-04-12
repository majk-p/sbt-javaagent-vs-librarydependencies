# libraryDependencies vs sbt-javaagent

This is repository is a reproduction example of how assigning a list of `libraryDependencies` breaks `sbt-javaagent`.

To fix the example replace `libraryDependencies :=` with `libraryDependencies ++=`.
