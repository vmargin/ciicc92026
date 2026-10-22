# Java Coursework / CIICC 2026

**Original chapter exercises, task sheets, and practice attempts from Java training.**

This repository records learning work associated with Java Programming NC III training at CIICC in 2026. It is a collection of individual examples rather than one deployable application. The exercises preserve learning attempts; they are not a production library or a claim of certification.

## Repository map

| Folder | Contents |
| --- | --- |
| `chapter1/` | Primitives, references, constructors, initialization, and object examples. |
| `chapter2/` | Operators, equality, branching, and loops. |
| `chapter3/` | Arrays, ArrayList, strings, and date/time examples. |
| `chapter4/` | Access, encapsulation, overloads, return values, varargs, and lambdas. |
| `Tasks/` | Numbered task sheets and related vehicle examples. |
| `TasksTest/` | Practice attempts; the folder name does not imply a JUnit test suite. |
| `experiment/`, `otherFolder/` | Small experiments and package/access examples. |

## Run an individual example

Use a JDK such as JDK 21, from the repository root. This example asks for an integer on standard input:

```powershell
javac -d out chapter2/LoopsLesson.java
java -cp out chapter2.LoopsLesson
```

Compile the files required by the selected example together and use its declared package in the Java command. There is no Maven/Gradle project or repository-wide test command. Some files represent incomplete or exploratory work and are not expected to build as one application.

## Related projects

- [Java desktop banking](https://github.com/vmargin/banking-app): the separate Swing/JDBC simulator.
- [CASH-G Web](https://github.com/vmargin/cashg.onrender.com): its separate Spring Boot/Thymeleaf evolution.
- [Current portfolio](https://vmargin.github.io/): selected projects and contribution details.

---

[More projects](https://github.com/vmargin) · [Portfolio](https://vmargin.github.io/) · [LinkedIn](https://www.linkedin.com/in/vmargin/)
