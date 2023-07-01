<<<<<<< HEAD
![virus](https://share.creavite.co/jF08ZNHwQsVQKEIF.gif)
=======
![Grasscutter](https://socialify.git.ci/Grasscutters/Grasscutter/image?description=1&forks=1&issues=1&language=1&logo=https%3A%2F%2Fs2.loli.net%2F2022%2F04%2F25%2FxOiJn7lCdcT5Mw1.png&name=1&owner=1&pulls=1&stargazers=1&theme=Light)
<div align="center"><img alt="Documentation" src="https://img.shields.io/badge/Wiki-Grasscutter-blue?style=for-the-badge&link=https://github.com/Grasscutters/Grasscutter/wiki&link=https://github.com/Grasscutters/Grasscutter/wiki"> <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/Grasscutters/Grasscutter?logo=java&style=for-the-badge"> <img alt="GitHub" src="https://img.shields.io/github/license/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub Workflow Status" src="https://img.shields.io/github/actions/workflow/status/Grasscutters/Grasscutter/build.yml?branch=development&logo=github&style=for-the-badge"></div>
>>>>>>> 8c2d00fcd330277c26f6e08d51f5a2afc155a8d6




### Quick Start (automatic)

<<<<<<< HEAD
* [Termux](https://f-droid.org/repo/com.termux_118.apk) (F-Droid)

* [GCAndroid](https://github.com/Score-Inc/GCAndroid) - to install java 17 & mongodb (needs termux to work)


=======
- Get Java 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL3.7 (3.7 client can be found here if you don't have it): https://github.com/MAnggiarMustofa/GI-Download-Library/blob/main/GenshinImpact/Client/3.7.0.md)

- Download the [latest Cultivation version](https://github.com/Grasscutters/Cultivation/releases/latest). Use the `.msi` installer.
- After opening Culivation (as admin), press the download button in the upper right corner. 
- Click `Download All-in-One`
- Click the gear in the upper right corner
- Set the game Install path to where your game is located.
- Set the Custom Java Path to `C:\Program Files\Java\jdk-17\bin\java.exe`
- Leave all other settings on default

- Click the small button next to launch.
- Click the launch button.
- Log in with whatever username you want. Password doesn't matter.

### Building

Grasscutter uses Gradle to handle dependencies & building.

**Requirements:**

- [Java SE Development Kits - 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher
- [Git](https://git-scm.com/downloads)

##### Windows

```shell
git clone --recurse-submodules https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
.\gradlew.bat # Setting up environments
.\gradlew jar # Compile
```

##### Linux (GNU)

```bash
git clone --recurse-submodules https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
chmod +x gradlew
./gradlew jar # Compile
```

You can find the output jar in the root of the project folder.

### Troubleshooting 

For a list of common issues and solutions and to ask for help, please join [our Discord server](https://discord.gg/T5vZU6UyeG) and go to the support channel.
>>>>>>> 8c2d00fcd330277c26f6e08d51f5a2afc155a8d6
