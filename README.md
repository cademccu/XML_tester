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
cademccumber$ ./run.sh cfg/test_seperate_ENTITY_file.cfg 
 
----------------------------
--- COMPILATION FINISHED ---
----------------------------
 
<FROM STARTING FILE, -, ->
<FROM include_1_seperate_ENTITY_file.cfg, -, ->
<FROM sub_include_B_seperate_ENTITY_file.cfg, -, IN cfg/sub_dir/>
<FROM sub_include_A_seperate_ENTITY_file.cfg, -, IN cfg/>
<FROM sub_include_C_seperate_ENTITY_file.cfg, -, IN cfg/sub_dir/sub_sub_dir/>
~~~

Where the first part of the parameter, or the \<name\> tag, is the filename the output is from. The middle section \<value\> just contains a \-, and the last tag \<access\> will contain the directory path from cfg (Or wherever being run).


### Additional Information

A proof of concept for using a seperate file for ENTITYs is included using the entities.ent file and all .xml/.cfg files following the naming convention of \*\_seperate\_ENTITY\_file.cfg . This example shows how you can standardize the paths in entities, since they only have to relative to entity file. These ENTITYs can be used anywhere in the other included files (being careful not to create a XML reference loop).


