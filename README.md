# Currency Converter

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Summary

- [About](#about)
- [Technologies](#technologies)
- [How to Run the Project](#how-to-run-the-project)
- [Contribution](#contribution)
- [Contact](#contact)

## About
This project was developed as part of the Oracle One Class 6 challenge in partnership with Alura. It provides a text-based interface (via console) for users to convert currencies. The conversion rates are dynamically obtained from the Exchange Rate API, ensuring accurate and real-time data for a more updated and effective experience.

-  **Features:**
    - Dynamic fetching of currency exchange rates from the [Exchange Rate API](https://www.exchangerate-api.com/)
    - Text-based user interface
    - At least 6 different currency conversion options
    - Real-time data for accurate conversions

## Technologies

- [Java 21](https://www.oracle.com/java/technologies/downloads/)
- [Gson 2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson)
- [Exchange Rate API](https://www.exchangerate-api.com/)
- [Visual Studio Code (VSCode)](https://code.visualstudio.com/)
- [Git](https://git-scm.com/downloads)

## How to Run the Project

**Step 1: Clone the Repository:**
  - Clone the repository using the following Git command:
  
    ```bash
    git clone https://github.com/vicentejluz/currency-converter.git
    ```

**Step 2: Navigate to the Project Directory:**
  - Navigate to the directory where the cloned repository is located:
    
    ```bash
    cd currency-converter
    ```

**Step 3: Configure and Start the Application:**  
  - Create a `lib` folder in the root directory of your project

    ```bash
    mkdir lib
    ```

  - Download the Gson JAR file:
    - Download Gson JAR file directly from [Maven Central repository](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.11.0/gson-2.11.0.jar).
  
  - Move the JAR file to the `lib` folder:
    - After downloading, move (or copy) the JAR file to the `lib` folder you just created.
    
      ```markdown
      lib/gson-2.11.0.jar
      ```

  - Create a `.env` file in the root directory of your project:
  
    ```markdown
    API_KEY=`<API Key>`
    ```

  - ***Command Line***:
    - **Windows**:
      - Compile:

        ```bash
        javac -cp "lib/gson-2.11.0.jar" -d bin src/model/dto/*.java src/service/exception/*.java src/utils/exception/*.java src/utils/*.java src/*.java
        ```

      - Run:

        ```bash
        java -cp "bin;lib/gson-2.11.0.jar" Main
        ```

    - **Linux**:
      - Compile:

        ```bash
        javac -cp "lib/gson-2.11.0.jar" -d bin **/*.java
        ```

      - Run:

        ```bash
        java -cp "bin:lib/gson-2.11.0.jar" Main
        ```

    - **VSCode**:
      - Open the Project in VSCode:

        ```bash
        code .
        ```

      - Configure the Environment:
        -  Ensure you have the necessary Java extensions installed. You can install the `Extension Pack for Java` from the VSCode marketplace.


      - Configure the Build and Run the Project:
        - In VSCode, navigate to the main Java file `Main.java` located in the `src` directory of your project.

      - Execute the Project:
        - Once the extensions are activated and the Main.java file is open, please wait a moment for the extensions to initialize in your project. Then, you can run your project by pressing `F5` or clicking the ▶️ (Run) button in the top bar of VSCode.

## Contribution

Contributions are welcome! If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

## Contact

<div align="center">
    <a href="https://github.com/vicentejluz" target="blank"><img align="center" src="https://github.com/rahuldkjain/github-profile-readme-generator/blob/master/src/images/icons/Social/github.svg" alt="GitHub-vicentejluz" height="30" width="40" />
    </a>
    <a href="https://www.linkedin.com/in/vicentejluz" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="Linkedin-vicentejluz" height="30" width="40" />
    </a>  
    <a href="https://www.beecrowd.com.br/judge/pt/profile/374484" target="blank"><img align="center" src="https://www.beecrowd.com.br/judge/favicon.ico?1635097036" alt="Beecrowd-Vicente-Luz" height="40" width="40" />
    </a>
  <br>
</div>