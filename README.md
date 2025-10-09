# Java_Enum
## 🟢 Java Enum Exploration — Days & Civilite

## 📘 Overview
This project is a simple Java application created to **explore and practice the fundamentals of Java Enumerations (`enum`)**.  
It focuses on defining enums with attributes and constructors, understanding **`ordinal()`**, **`compareTo()`**, and comparing enums to static object patterns.

Through this project, I practiced **enum creation, encapsulation, constructors, methods, static constants, and comparison logic**.

---

## 🧩 Features and Components

### 🔹 Enum: `Days`
Represents the **days of the week in French**, each with:
- A numeric value (`NumJouralgerie`)  
- A name (`nomJour`)  

**Main methods:**
- `GetnumeJour()` → returns the numeric day value.  
- `GetnomJour()` → returns the day’s French name.  
- `ordinal()` → returns the position of the enum constant.  
- `compareTo()` → compares two enum constants by their order.  

**Concepts:**
- Enum fields and constructors  
- Custom methods inside an enum  
- Enum ordering and comparison  

---

### 🔹 Class: `Civilite`
A class demonstrating **static instances** such as `mme`, `mr`, and `mlle`, used to highlight the difference between:
- Static constant objects  
- True enumeration types (`enum`)  

**Concepts:**
- Static object creation  
- Comparison to enum efficiency and type-safety  

---

### 🔹 Class: `Test`
Used to test the behavior of the `Days` enum and display data through getter methods.  
It also demonstrates:
- Enum attribute access  
- The use of `ordinal()` and `compareTo()`  
- Simple output of values from different enum constants  

---

## ⚙️ Enum Methods Overview
- **`ordinal()`** → returns the position (index) of the enum constant (starting from 0).  
- **`compareTo()`** → compares enum constants based on declaration order.  

---

## 🚀 How to Run

1. **Compile:**
   ```bash
   javac Days.java Civilite.java Test.java
