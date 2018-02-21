/** 1. Your Java Development Kit distribution
  * has the source code for much of the JDK in
  * the src.zip file. Unzip and search for case
  * labels (regular expression case [^:]+:).
  * Then look for comments starting with // and
  * containing [Ff]alls? thr to catch comments
  * such as // Falls through or // just fall
  * thru. Assuming the JDK programmers follow
  * the Java code convention, which requires
  * such a comment, what percentage of cases
  * falls through? */

var cf, cc = (0, 0)

val rf = """(?s)case [^:]+:[^:]+?/[/*] [Ff]alls? thr """.r