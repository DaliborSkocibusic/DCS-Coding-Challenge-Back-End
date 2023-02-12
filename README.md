# DCS Coding Challenge - Back End APplication

## Requirements

-   `Download the Spring Boot initialiser and create a new project. You can use the link below`
-   `You will need a MySQL database to store the data. Make sure you update the application.properties (or application.yml) file with the correct database credentials`

# My notes

This uses Java and Spring Boot details below

Requirements given:

-   `Use spring initialzr to create your project You'll need: Spring Web, Spring Data JPA, Spring Dev Tools, MySQL Driver`

<!-- Spring Boot Initialiser[Spring boot initialiser](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.2&packaging=jar&jvmVersion=17&groupId=Backend-Application&artifactId=Spring-Backend&name=Spring-Backend&description=Demo%20project%20for%20Spring%20Boot&packageName=Backend-Application.Spring-Backend&dependencies=devtools,web,data-jpa,mysql,sqlserver) -->

Spring Boot Initializer File [LINK HERE](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.2&packaging=jar&jvmVersion=17&groupId=DCS&artifactId=Backend&name=Backend&description=DCS%20Spring%20Boot%20Backend&packageName=DCS.Backend&dependencies=devtools,web,mysql,validation,data-jpa)

### Pages I used as reference

-   `https://www.geeksforgeeks.org/how-to-run-your-first-spring-boot-application-in-eclipse-ide/`

-   `https://www.baeldung.com/spring-boot-failed-to-configure-data-source`

-   `https://github.com/lokeshgupta1981/Spring-Boot-RestTemplate`

-   `https://reflectoring.io/spring-cors/`

## Stuff I have done since

-   `Created Azure SQL database`
-   `Configured it in spring with JDBC`
-   `Doesnt break, but havent confirmed working`
-   `Followed Micforoft os guide to configure spring`

## Todo

## Installation

To get the project up and running, and view components in the browser, complete the following steps:

1. Download and Eclipse
2. Clone this repo: `git@github.com:DaliborSkocibusic/DCS-Coding-Challenge-Back-End.git`
3. Import the project in Eclipse (If starting from Spring Init, not necessary if cloning from git)

## Wakatime - This project

[![wakatime](https://wakatime.com/badge/user/cee95ec9-130e-4f66-8097-0123d00e7dfd/project/9f46b5dd-91b1-4671-ac7d-bd7d18047eab.svg)](https://wakatime.com/badge/user/cee95ec9-130e-4f66-8097-0123d00e7dfd/project/9f46b5dd-91b1-4671-ac7d-bd7d18047eab)

## Repo structure - To Be Updated

```
/
├─ src/
│  ├─ assets/        # Assets
│  │  ├─ icons/      # Favicon and home screen icons
│  │  ├─ images/     # Raster images (used in component examples)
│  │  ├─ scripts/    # JavaScript files
│  │  ├─ styles/     # CSS files
│  │  └─ vectors/    # SVG images, icons and logos
│  │
│  ├─ components/    # Components
│  │  ├─ _partials/  # …that render component previews
│  │  ├─ common/     # …that may appear anywhere
│  │  ├─ global/     # …that appear on every page
│  │  ├─ layouts/    # …that govern macro layout
│  │  ├─ scopes/     # …that style undecorated markup
│  │  ├─ templates/  # …that combine components to render page types
│  │  └─ utilities/  # …that have a single purpose/role
│  │
│  ├─ docs/          # Documentation
│  │  ├─ _partials/  # Partials for rendering documentation
│  │  └─ …           # Documentation files
│  │
│  └─ tokens/        # Design tokens
│
├─ tmp/              # Files required for dynamic builds (ignored by Git)
├─ www/              # Public build (ignored by Git)
│
├─ .editorconfig     # Code style definitions
├─ .gitignore        # List of files and folders not tracked by Git
├─ .eslintrc         # Linting preferences for JavasScript
├─ fractal.configjs  # Configuration for Fractal
├─ gulpfile.js       # Configuration for Gulp tasks
├─ LICENSE           # License information for this project
├─ package.json      # Project manifest
└─ README.md         # This file
```
