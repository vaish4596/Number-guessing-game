---

# 🎯 Number Guessing Game (Java)

A simple **console-based Number Guessing Game** built using **Java**.
In this game, the computer randomly generates a number between **1 and 100**, and the player must guess the correct number within **6 attempts**.

The program also tracks **rounds, wins, losses, attempts, and calculates a score** based on the player's performance.

---

## 📌 Features

* Random number generation between **1 – 100**
* Maximum **6 attempts per round**
* Hints provided:

  * **Too High**
  * **Too Low**
* Tracks game statistics:

  * Total Rounds
  * Total Attempts
  * Wins
  * Losses
  * Average Attempts
* **Score Calculation System**
* Option to **play multiple rounds**

---

## 🛠 Technologies Used

* **Java**
* `java.util.Random`
* `java.util.Scanner`

---

## 📂 Project Structure

```
NumberGuessingGame
│
└── GuessingGame.java
```

---

## ▶ How to Run the Program

### 1️⃣ Compile the Java Program

```bash
javac GuessingGame.java
```

### 2️⃣ Run the Program

```bash
java GuessingGame
```

---

## 🎮 How the Game Works

1. The program generates a **random number between 1 and 100**.
2. The player must guess the number.
3. The player has **6 attempts**.
4. After each guess, the program gives hints:

   * **Too high**
   * **Too low**
5. If the player guesses correctly, they win the round.
6. If all attempts are used, the correct number is revealed.
7. The player can choose to **play again**.

---

## 📊 Score Calculation

The score is calculated using the formula:

```
Score = (Wins / TotalRounds) * 100 - (TotalAttempts / TotalRounds) * 5
```

The score is rounded to **two decimal places**.

---

## 💻 Example Output

```
Number Guessing Game
-------------------------------
Guess a number between 1 and 100: 45
Too low! Try again. Attempts left: 5

Guess a number between 1 and 100: 78
Too high! Try again. Attempts left: 4

Guess a number between 1 and 100: 63
Congratulations! You guessed the number in 3 attempts.

Play again? (y/n): n

Total Rounds: 1
Total Attempts: 3
Wins: 1
Losses: 0
Average Attempts per Round: 3.0
Score: 85.0
```

---

## 📈 Future Improvements

* Add **difficulty levels**
* Implement **GUI version using Java Swing**
* Add **leaderboard system**
* Save scores to a **file or database**

---

## 👩‍💻 Author

**Vaishnavi Shetty**
B.E. Information Science and Engineering

---

