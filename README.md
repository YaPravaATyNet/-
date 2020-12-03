# Homework for "Object-oriented programming" course
## Lab 2
Implement a Music Catalog.

There are Artists, they release Albums that contain Songs (or tracks). There are also musical genres. Genres have sub-genres (for example, Hard Rock is
subgenre of Rock)
In addition to albums, the catalog contains Collections - the collections contain tracks from different artists, possibly of different genres.

Design and implement the class model of such a Catalog, and make in it small search engine. For example, so that you can find all albums and collections, 
containing tracks of the Rock genre, released in 2017 (while there should also be albums
hard rock genre as a subgenre of Rock). The engine should be able to search for 
* artists 
* albums and collections 
* songs according to a set of criteria (determine the criteria yourself)

## Lab3
Create a tool for processing the configuration INI file.

Describe and implement the necessary classes that will allow processing
config file, which is a text file divided into
SECTIONS that contain pairs of NAME, VALUE.

All parameter and section names are strings without spaces, consisting of characters
Latin alphabet, numbers and underscores.
Section names are enclosed in square brackets, no spaces.
Parameter values are separated from parameter names by = (equality
Parameter values can be of one of the following types:
* integer,
* real,
* string: no spaces, but unlike the parameter name, it can also contain 'dot' 

The file may contain comments. Anything after
semicolon. Comments, like the semicolon itself, should be
ignored.

You should implemente methods like “get a value of a certain type with such and such
name from such and such section "(for example, get the whole ListenTcpPort from the section
LEGACY_XML)

Errors should be handled:
* File subsystem error (for example, if the file is not found)
* File format error (if the file is not in the correct format)
* Invalid parameter type (error during type casting)
* The specified pair SECTION PARAMETER is not in the configuration file

hm
