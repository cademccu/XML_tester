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

You can test various scenarios usings the included files and the templates and test directories. By setting the includes in your main test file, you can test how the paths have to be set up, and where the files and includes are being read from.

### OUTPUT

Upon running the program, an example output looks like this:

~~~
./run.sh cfg/test.cfg 
<FROM STARTING FILE, -, ->
<FROM include_1.cfg, -, ->
<FROM sub_include_A.cfg, -, IN cfg/>
~~~

Where the first part of the parameter, or the \<name\> tag, is the filename the output is from. The middle section \<value\> just contains a \-, and the last tag \<access\> will contain the directory path from cfg (Or wherever being run).
