# XML_tester
This repository has been created to test different configuration file options from an XML parsing perspective without having to run the full WEPS program 
and check the configurations created from files to test a single implementation.

### USAGE
To run this program in a \*nix enviroment (with java/javac), you can compile and run it from the shell/terminal with the following:

~~~bash
./run.sh <FILENAME>
~~~
 \<FILENAME\> \- The path and name of file to be used as the main configuration file. This should be relative to the top-level directory that run.sh is in.

For example:
~~~bash
./run.sh cfg/test.cfg
~~~

If permission denied to execute, run this command:
~~~bash 
chmod +x run.sh
~~~
