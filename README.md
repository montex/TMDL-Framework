# TAME: TemplAte Modeling Environment

## About

This project implements the **TMDL Framework**, an approach to simplify the
specification of complex performability models. For more details on the idea
behind it, please see the related [publications](#publications) at the end of this page.

## Overview

The framework is implemented as a set of plugins for the Eclipse platform.

|Plugin|Description|
|---|---|
|**org.modelspartiti.formalisms.san**|SAN and SAN-T metamodels|
|**org.modelspartiti.formalisms.san.concretize**|SAN-T to SAN transformation|
|**org.modelspartiti.formalisms.san.concretize.ui**|UI controls for SAN-T to SAN transformation|
|**org.modelspartiti.formalisms.san.design**|Sirius editor for the SAN metamodel|
|**org.modelspartiti.formalisms.san.examples**|Examples of SAN and SAN-T models|
|**org.modelspartiti.formalisms.sant.design**|Sirius editor for the SAN-T metamodel|
|**org.modelspartiti.infrastructure**|TMDL metamodel|

The other elements in the _plugins_ folder are used to manage the build and
release process, and to build the update site.

## Contributing

The software in this repository has been create using the Eclipse Modeling
distribution, and it is currently aligned with [version 2020-06](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-modeling-tools).

To be able to use the framework the following dependencies are needed:
- Eclipse Modeling Framework (EMF)
- Eclipse OCL
- Sirius

All of them can be found in the Eclipse Marketplace or in the default update
site that comes configured in the default installation of Eclipse.

For more information see the [CONTRIBUTING](CONTRIBUTING.md) file.

## Installation

There are two ways to install the components of the framework

**Update Site** 

If you need to install the framework as a user, it is recommended to use the project _update site_, which is available both for stable versions (_master_ branch) for development versions (_develop_ branch). Every commit on these two branches is automatically published in the update site.

* `https://tame.montecchi.info/updatesite/master/` (stable)
* `https://tame.montecchi.info/updatesite/develop/` (development)

Just download and install **Eclipse 2020-06** for your platform. Once you run it, 
select the option `Help / Install New Software` from the menu, and add the address above.
Unless you have been instructed otherwise, use the _stable_ version.

**Dropins Folder**

If you want to use a development snapshot that has not been published on the update site
yet, you can install it using the _dropins_ funcitonality of Eclipse.

First, download the artifacts of the commit of interest. This can be done by going to
the [Actions](https://github.com/montex/TMDL-Framework/actions) tab of the GitHub repository,
selecting the commit of interest, and downloading the attached artifacts.
Unpack the files and copy them to the _dropins_ folder of you Eclipse installation. If all
the required dependencies are in place, on the next run Eclipse will automatically load the plugins in the environment. 

For more suggestions on the workflow to be used during development see the [CONTRIBUTING](CONTRIBUTING.md) file.

## Usage

A quick way to start using the framework is to import the plugin(s) with **examples** in their name in a new Eclipse workspace.

## Contributors

- [Leonardo Montecchi](mailto:leonardo@ic.unicamp.br) (UNICAMP) [maintainer]
- Enrico Dolce (UNIFI)
- Federico Moncini (UNIFI)

## Publications

* L. Montecchi, F. Moncini, P. Lollini, K. Keefe. An Eclipse-Based Editor for SAN Templates. In: 12th International Workshop on Software Engineering for Resilient Systems (SERENE 2020). Munich, Germany, September 7-10, 2020.
*  L. Montecchi, P. Lollini, A. Bondavalli. [A Template-Based Methodology for the Specification and Automated Composition of Performability Models](https://ieeexplore.ieee.org/document/8710621). In: IEEE Transactions on Reliability, Vol. 69, Issue 1, pp. 293-309 (March 2020). 
