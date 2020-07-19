# Contributing to TAME

## Naming Conventions

The namespace of the project is **`org.modelspartiti`**, which was the original name
of the project; this may change in the future. At the moment we are adopting the following 
naming conventions for plugins:

- **`org.modelspartiti.infrastructure.[component]`** - Components of the core infrastructure of the framework. This is typically something related to the TMDL language itself.
- **`org.modelspartiti.formalisms.[name]`** - Contains the Ecore metamodels of the template-level and instance-level formalism `[name]`.
- **`org.modelspartiti.formalisms.[name].design`** - Contains the graphical editor for models based on formalism `[name]`. 
- **`org.modelspartiti.formalisms.[name].examples`** - Contains example models for formalism `[name]`.
- **`org.modelspartiti.formalisms.[name].concretize`** - Implements the _concretize_ function for formalism `[name]`.
- **`org.modelspartiti.formalisms.[name].gen.[format]`** - Generates output files in `[format]` from models in formalism `[name]`.

## Compilation

We use [Maven](https://maven.apache.org/) to automate the build process.
To build all the plugins you can just run `mvn package` in the _plugins_ directory. 

The resulting _.jar_ files of the plugins will be generated in the _target_ folder of the corresponding project. 
The content of the update site will be generated in the _target/repository_ folder of the _releng-updatesite_ project. 
That is, the folder _plugins/releng-updatesite/target/repository/plugins/_ will contain 
all the _.jar_ packages of the plugins that are configured to be included in the update site.

The Maven configuration of the project uses [Thyco](https://www.eclipse.org/tycho/), which obtains dependency information
from the Eclipse plugins' _MANIFEST.MF_ files, instead of requiring a separate _pom.xml_ file for each plugin.
To include a new Eclipse plugin project to the build process you can just add its folder to _plugins/pom.xml_ file.
More information on this setup can be found [in this tutorial](https://www.vogella.com/tutorials/EclipseTycho/article.html).

## Repository Organization

The repository is organized in two main branches: `master` and `develop`. 
These two branches are _protected_, meaning that you cannot directly commit on top of them.
Please create your own branch and work on that. Once you think that your code is ready, push it to the repsitory and
[create a new pull request](https://github.com/montex/TMDL-Framework/pulls) to have it integrated in the main branches.

You may want to take a look at the [GitFlow branching model](https://nvie.com/posts/a-successful-git-branching-model/) to understand 
what is the idea behind using multiple branches.

Every commit on the `master` and `develop` branches is automatically built and deployed in the update site.

## Suggested Workflow

Eclipse normally stores newly created plugins in a _workspace_ folder. 
However, we recommend to **store the workspace and the code in two separate folders**.
This simplifies the management of plugins in the long run, and avoid user-specific configuration of the workspace to be mixed with code in the repository. **Workspace configuration should not be committed to the repository.**

**Getting Started**

To get started, follow these simple steps:
1. Clone the repository of the project in a directory of choice (`git clone [address]`)
2. Run Eclipse and create a new _workspace_ folder in a directory of choice. You can create it inside the repository folder, but remember that this should not be committed.
3. _Import_ the existing projects in the workspace, using the menu command `File / Import / Existing Projects into Workspace`, and selecting the _plugins_ folder of the repository as source folder. 

You are now ready to work on the existing plugins!

**Adding a New Plugin**

In case you need to create a new plugin, please do the following:

1. When creating the project, **instruct Eclipse not to use the default location**, but instead have it creating the plugin inside the _plugins_ folder of the repository. If you forget to do this, you can always move it later, and import again the plugin in the workspace.
2. Remember that you need to add the plugin folder in the _plugins/pom.xml_ file to have it included in the automated build process. 

**Running the Plugins**

When worksing inside Eclipse you **do not need** to run Maven to compile the plugins:
compilation is handled automatically by Eclipse.

To use or test the plugins being developed, you need to **run a second instance of Eclipse** that has the compiled
plugins installed. 

This can be done with the option `Run As / Eclipse Application`, which runs
a new instance of Eclipse in which all the plugins in the development workspace are installed.
We then talk about the _development workspace_, in which you develop
the plugins, and the _runtime workspace_, the one of the instance in which the plugins are installed.

That said, the are some tasks that can be executed in the development workspace. For example:

- By opening an Ecore metamodel with the _Sample Reflective Ecore Model Editor_, and right-clicking on a metaclass you can select `Create Dynamic Instance` to create a new XMI model conforming to that metamodel.
- Selecting `File / New / Representations File` allows you to create a new Sirius diagram, based on one of the editor definitions that are available either from the installed plugins or from the workspace.

**Installing the Plugins**

You may occasionally want to install the plugins you are developing in a new Eclipse installation.

The easiest way to do that is to [export the plugins "as deployable fragments"](https://help.eclipse.org/2020-06/topic/org.eclipse.pde.doc.user/guide/tools/export_wizards/export_plugins.htm) and then copy them into the _dropins_ folder of your Eclipse installation. On the
next run Eclipse will automatically load the plugins in the environment.

_Note:_ For this method to work, all the required dependencies must be avaialble, either among the installed plugins or among the plugins in the _dropins_ folder.

## Dependencies

It is always better to look at plugins' _MANIFEST.MF_ files to understand the dependencies of each one. 

From a general perspective, to be able to use the framework the following dependencies are needed:
- Eclipse Modeling Framework (EMF)
- Eclipse OCL
- Sirius

All these components can be found in the Eclipse Marketplace (`Help / Eclipse Marketplace`) 
or in the default update site that comes configured in the default installation of Eclipse.

## Useful Resources

**Tutorials**

- [Eclipse Modeling Framework (EMF)](https://www.vogella.com/tutorials/EclipseEMF/article.html)
- [Sirius](https://wiki.eclipse.org/Sirius/Tutorials/StarterTutorial)
- [Eclipse Plug-in Development](https://www.vogella.com/tutorials/EclipsePlugin/article.html)

**Official Websites**

- [Sirius](https://www.eclipse.org/sirius/)











