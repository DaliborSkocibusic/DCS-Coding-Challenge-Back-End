# Bits, the front-end component library for 24 ways

## Requirements

Bits is built upon [Fractal](https://github.com/frctl/fractal), a tool that enables the rapid development of components, templates and pages. Fractal uses a number of ES6 features, so this project requires [Node.js](https://nodejs.org/) v4.0+ to be installed locally. A global install of Gulp is also recommended.

# My notes

This uses java and spring details below

Use spring initialzr to create your project
You'll need: Spring Web, Spring Data JPA, Spring Dev Tools, MySQL Driver

Spring Boot Initialiser[Spring boot initialiser](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.2&packaging=jar&jvmVersion=17&groupId=Backend-Application&artifactId=Spring-Backend&name=Spring-Backend&description=Demo%20project%20for%20Spring%20Boot&packageName=Backend-Application.Spring-Backend&dependencies=devtools,web,data-jpa,mysql,sqlserver)



https://www.geeksforgeeks.org/how-to-run-your-first-spring-boot-application-in-eclipse-ide/

https://www.baeldung.com/spring-boot-failed-to-configure-data-source

add dependenxy to pom
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

## Installation

To get the project up and running, and view components in the browser, complete the following steps:

1. Download and install Node: <https://nodejs.org/>
2. Clone this repo: `git clone git@github.com:24ways/frontend.git` (SSH) or `git clone https://github.com/24ways/frontend.git` (HTTPS)
3. [Optional] Install Gulp globally: `npm install gulp -g`
4. [Optional] Install Fractal globally: `npm install fractal -g`
5. Install project dependancies: `npm install`
6. Start the development environment: `npm start`
7. Open your browser and visit <http://localhost:3000>

## Development

When developing components, you may want assets automatically compiled and the browser to refresh automatically. To do this, run the following task:

npm i -g npm@latest
npm install -D typescript
npm create vite@latest DCS-Coding-Challenge-React --template react-ts
cd DCS-Coding-Challenge-React

-   `npm install`
-   `npm run dev`

npm install @mui/material @emotion/react @emotion/styled

## Wakatime - This project

<a href="https://wakatime.com/badge/user/cee95ec9-130e-4f66-8097-0123d00e7dfd/project/e8e685f0-0dd8-436f-8b62-34c90b87562e"><img src="https://wakatime.com/badge/user/cee95ec9-130e-4f66-8097-0123d00e7dfd/project/e8e685f0-0dd8-436f-8b62-34c90b87562e.svg" alt="wakatime"></a>

## Source

https://github.com/microsoft/TypeScript-Node-Starter/blob/master/.gitignore

## Creating a static build

To create a static instance of this project, run the following task:

-   `npm run build`

This will create a folder called `www`, into which the required files will be created.

## Deployment

To make this project publicly accessible, you can deploy a static instance by running the following task:

-   `npm run publish`

This will publish the contents of `public` to your `gh-pages` branch.

## Repo structure

Sometimes it’s helpful to know what all these different files are for…

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
