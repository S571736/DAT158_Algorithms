# Compulsary 2

## Problem 2

### a)

A(1) = {(0,0), (3,5)}

A(2) = {(0,0), (3,5), (2,3), (5,8)}

A(3) = {(0,0), (3,5), (2,3), (5,8), ~~(2,2)~~, ~~(5,7)~~, ~~(4,5)~~, (7,10)}

A(3) = {(0,0), (3,5), (2,3), (5,8), (7,10)}

A(4) = {(0,0), (3,5), (2,3), (5,8), (7,10), ~~(4, 5)~~, ~~(7, 10)~~, ~~(6, 8)~~, (9, 13)}

A(4) = {(0,0), (3,5), (2,3), (5,8), (7,10), (9, 13)}

A(5) = {(0,0), (3,5), (2,3), (5,8), (7,10), (9, 13), ~~(3, 4)~~, (6, 9), ~~(5, 7)~~, (8, 12), (10, 14)}

A(5) = {(0,0), (3,5), (2,3), (5,8), (7,10), (9, 13), (6, 9), (8, 12), (10, 14)}

A(6) = {(0,0), (3,5), (2,3), (5,8), ~~(7,10)~~, ~~(9, 13)~~, ~~(6, 9)~~, (8, 12), ~~(10, 14)~~, (1, 2), (4, 7), ~~(3, 5)~~, (6, 10), ~~(8, 12)~~, (10, 15), (7, 11), (9, 14)}

A(6) = {(0,0), (3,5), (2,3), (5,8), (8, 12), (1, 2), (4, 7), (6, 10), (10, 15), (7, 11), (9, 14)}

### b)

The maximum number of elements would be B+1, if there would be more there would be sets worth less that has not been removed.

### c)

The maximum of elements in this case would usually be <p>v<sub>max</sub> + v<sub>max-1</sub></p>

## Problem 3

NB: This is preemptive and the task is preemptive
Job 4 + Job 3 + Job 6 + Job 2 + Job 5 + Job 1 + Job 7 = 3 + 5 + 7 + 11 + 15 + 21 + 23 = 85

Job 2 + Job 4 + Job 6 + Job 3 + Job 5 + Job 1 + Job 7 = 5 + 6 + 8 + 11 + 15 + 21 + 23 = 89

## Problem 4

### a) 
Implement the randomized algorithm for MAX SAT where we set each X<sub>i</sub> to true independently with probability 1/2 (it is very simple)

se java fil i src
### b)

x<sub>1</sub>=False

x<sub>2</sub>=True

x<sub>3</sub>=False

x<sub>4</sub>=False

x<sub>5</sub>=True

## Problem 5

We have the following MAX SAT problem

<p>C<sub>1</sub> = 4(x<sub>1</sub> V &not;x<sub>3</sub>), C<sub>2</sub> = 3(&not;x<sub>1</sub> V x<sub>4</sub>), C<sub>3</sub> = 2(&not; x<sub>2</sub> V x<sub>4</sub>),C<sub>4</sub> = 1(&not;x<sub>2</sub> V &not; x<sub>3</sub> V x<sub>4</sub>)</p>)

### a)

• maximize 4𝑧1 + 3𝑧2 + 2𝑧3 + 𝑧4

• subject to

• 𝑦1 ≥ 𝑧1 → 𝑦1 − 𝑧1 ≥ 0

• 𝑦2 + 1 − 𝑦1 ≥ 𝑧2 → −𝑦1 + 𝑦2 − 𝑧2 ≥ −1

• 𝑦3 + 1 − 𝑦1 ≥ 𝑧3 → −𝑦1 + 𝑦3 − 𝑧3 ≥ −1

• (1 − 𝑦2) + 1 − 𝑦3 ≥ 𝑧4 → −𝑦2 − 𝑦3−𝑧4≥ −2

• 𝑦𝑖 ∈ 0,1 , 𝑖 = 1, 2, 3

• 𝑧𝑗 ∈ 0,1 ,𝑗 = 1, … , 4



to be finished: Exercise 1, 4-7

