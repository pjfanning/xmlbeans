# xmlbeans

[![Build Status](https://travis-ci.org/pjfanning/xmlbeans.svg?branch=trunk)](https://travis-ci.org/pjfanning/xmlbeans)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.pjfanning/xmlbeans/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.pjfanning/xmlbeans)

Latest source from ```https://svn.apache.org/repos/asf/xmlbeans/trunk/```. Some changes have been made to get the build working.

The core use case is to help users of Apache POI, which depends on the no longer maintained Apache XMLBeans library.

* Release 2.6.5 is the latest release
* Release 2.6.1 includes a fix for an issue where Unicode Surrogate chars were replaced with `?` chars ?when outputting files -  https://bz.apache.org/bugzilla/show_bug.cgi?id=54084
* includes a fix for an issue affecting usage on Android: https://issues.apache.org/jira/browse/XMLBEANS-499
* Release 2.7.0-beta1 is based on work that has been abandoned (a move to change the package name of the classes in xmlbeans)
* The Apache POI team are working on an official Apache XMLBeans release

## Sample

https://github.com/pjfanning/poi-xmlbeans-patch-test

## Build
```
./xbeanenv.sh
ant
ant checkintest
```

Output jar is found at ```build/lib/xbean.jar```
