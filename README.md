# 🧠 Master Mind

[![Kotlin](https://img.shields.io/badge/Kotlin-1.5.10-blue.svg?style=flat&logo=kotlin&logoColor=white)](http://kotlinlang.org)
[![Java](https://img.shields.io/badge/Java-14-red.svg?style=flat&logo=Java&logoColor=white)](https://adoptopenjdk.net)
[![Gradle](https://img.shields.io/badge/Gradle-7.0.2-08313A.svg?style=flat&logo=Java&logoColor=white)](https://gradle.org)

Base project for a coding kata - for the use in a [coding dojo](https://codingdojo.org).  
It's a medium complex kata, where you have to implement several classes.

## ℹ Info

* Choose your language of joice: Java or Kotlin
* Write test with JUnit Jupiter + (optional) Hamcrest matchers
* Respect the Test Driven Development (TDD)
* Feel free to start from scratch
* Java JDK > 14 is needed

## 💿 Tools

To sync the dev state during the mob programming dojo:
> 👉 install [mob](https://mob.sh).

### Basic Commands

* `start` Start mob session from base branch in wip branch
* `next` Handover changes in wip branch to next person
* `done` Squashes all changes in wip branch to index in base branch

> 👉 More tips for remote programming: [RemoteMobProgramming.org](https://www.remotemobprogramming.org)

## 📑 Task

Write a console application for the Master Mind game. This game where one player, a codemaker, has to choose a secret
combination of colored pegs and then make it guess to someone else, a codebreaker. The codemaker is answering to each
guess attempt of the codebreaker by indicating only the number of well placed colors and the number of correct but
misplaced colors.

> 👉 [Coding Dojo Kata - Mastermind](https://codingdojo.org/kata/Mastermind/)

## 📖 Problem Description

The idea of this Kata is to code an algorithm capable of playing this boring role: answering the number of well placed
and misplaced colors.

Therefore, your function should return, for a secret and a guessing combination:

* The number of well placed colors
* The number of correct but misplaced colors

A combination can contain any number of pegs but you’d better give the same number for the secret and the guessing. You
can use any number of colors.

## 🚀 Run

The game is a console application. Anyway, for this kata you don't need to run it by hand. Just run and test your game
with Unit tests.

```shell
gradle test
```

Just for fun, there is also a `main` function to run the game. You can ignore it for during the dojo.