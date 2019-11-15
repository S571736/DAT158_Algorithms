# Compulsary 2

## Problem 1

### a)
1-5 = 11
1-2-5 = 4+7 = 11
1-3-5 = 4+7 = 11
1-3-5 = 10 + 3 = 13
1-6-5 = 7 + 6 = 13

### b)

* 1-2 = 4
* 2-4 = 6
* 4-5 = 3
* 5-3 = 6
* 3-6 = 2
* Sum = 21

### c)

**Tree 1**

* finding minimal spanning tree

![Tree1](Tree1.jpg)

* Double the edges

![Tree1D](Tree1D.jpg)

* Eulerian tour

1-2-1-3-6-5-4-5-6-3-1

* Shortcut

1-2-3-3-6-5-4-1

**Tree 2**

* finding minimal spanning tree

![Tree2](Tree2.jpg)

* Double the edges

![Tree2D](Tree2D.jpg)

* Eulerian tour

1-2-1-3-6-3-5-4-5-3-1

* Shortcut

1-2-3-6-5-4-1

**PS I see I have made a mistake here that follow through into task d, I have mixed node 1 and 2 in the drawing, but the text outside of the picture should be correct**

### d)

* minimum matching perfect connectin 2 and 4

![Tree1C](Tree1C.jpg)

* Eulerian tour
1-2-4-5-6-3-1

* minimum matching perfect connecting 2 and 6

![Tree2C](Tree2C.jpg)

* Eulerian tour
1-2-4-5-3-6-3-1

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

x<sub>1</sub> = False

C<sub>1</sub> True = 3 * 3/4

C<sub>1</sub> False = 3 * 1

C<sub>2</sub> True = 2 * 1

C<sub>2</sub> False = 2 * 1/2

C<sub>3</sub> True = 1 * 1

C<sub>3</sub> False = 1 * 3/4

C<sub>4</sub> True = 3 * 1/2

C<sub>4</sub> False = 3 * 1



x<sub>2</sub> = True

C<sub>5</sub> True = 4 * 1

C<sub>5</sub> False = 4 * 1/2

C<sub>6</sub> True = 2 * 1/2

C<sub>6</sub> False = 2 * 1


x<sub>3</sub>=False

C<sub>2</sub> True = 2 * 1/2

C<sub>2</sub> False = 2 * 1

C<sub>7</sub> True = 2 * 1

C<sub>7</sub> False = 2 * 1/2


x<sub>4</sub>=False

C<sub>3</sub> True = 1 * 1

C<sub>3</sub> False = 1 * 1/2

C<sub>7</sub> True = 0

C<sub>7</sub> False = 2 * 1

C<sub>8</sub> True = 3 * 3/4

C<sub>8</sub> False = 3 * 1



x<sub>5</sub>=True

C<sub>3</sub> True = 1 * 0

C<sub>3</sub> False = 1 * 1

C<sub>6</sub> True = 2 * 1

C<sub>6</sub> False = 2 * 0

C<sub>9</sub> True = 5 * 1

C<sub>9</sub> False = 5 * 1/2


## Problem 5

We have the following MAX SAT problem

<p>C<sub>1</sub> = 4(x<sub>1</sub> V &not;x<sub>3</sub>), C<sub>2</sub> = 3(&not;x<sub>1</sub> V x<sub>4</sub>), C<sub>3</sub> = 2(&not; x<sub>2</sub> V x<sub>4</sub>),C<sub>4</sub> = 1(&not;x<sub>2</sub> V &not; x<sub>3</sub> V x<sub>4</sub>)</p>)

### a)

• maximize 4𝑧1 + 3𝑧2 + 2𝑧3 + 𝑧4

• subject to

• 𝑦1 ≥ 𝑧1 → 𝑦1 − 𝑧1 ≥ 0

• 𝑦2 + 1 − 𝑦1 ≥ 𝑧2 → −𝑦1 + 𝑦2 − 𝑧2 ≥ −1

• 𝑦3 + 1 − 𝑦1 ≥ 𝑧3 → −𝑦1 + 𝑦3 − 𝑧3 ≥ −1

• (1 − 𝑦2) + 1 − 𝑦3 ≥ 𝑧4 → −𝑦2 − 𝑦3−𝑧4 ≥ −2

• 𝑦𝑖 ∈ 0,1 , 𝑖 = 1, 2, 3

• 𝑧𝑗 ∈ 0,1 ,𝑗 = 1, … , 4

### b) 

• maximize 4𝑧1 + 3𝑧2 + 2𝑧3 + 𝑧4

• subject to

• −𝑦1 + 𝑦2 − 𝑧2 ≥ −1

• −𝑦1 + 𝑦3 − 𝑧3 ≥ −1

• −𝑦2 − 𝑦3−𝑧4 ≥ −2

• 0 <= 𝑦<sub>𝑖</sub> <= 1 , 𝑖 = 1, 2, 3

• 0 <= 𝑧<sub>𝑗</sub> <= 1 , 𝑗 = 1, … , 4

