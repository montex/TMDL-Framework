# TAME: TemplAte Modeling Environment

## About

This project implements the **TMDL Framework**, an approach to simplify the
specification of complex performability models.

## Contributing

The software in this repository has been create using the Eclipse Modeling
distribution, and it is aligned with [version 2020-06](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-modeling-tools).

To be able to use the framework the following dependencies are needed:
- Eclipse Modeling Framework (EMF)
- Eclipse OCL
- Sirius
All of them can be found in the Eclipse Marketplace or in the default update
site that comes configured by default.

## Installation

The easiest way to install the framework is to [export the plugins "as deployable
fragments"](https://help.eclipse.org/2020-06/topic/org.eclipse.pde.doc.user/guide/tools/export_wizards/export_plugins.htm)
and copy them into the _dropins_ folder of your Eclipse installation. On the
next run Eclipse will automatically load the plugins in the environment.

## Contributors

- Leonardo Montecchi [leonardo@ic.unicamp.br](mailto:leonardo@ic.unicamp.br)
- Federico Moncini
