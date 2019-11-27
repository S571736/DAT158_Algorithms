# Algoritmeoppgaver som kan komme på eksamen

## Pattern matching
### Brute Force
### Boyer-Moore
### Knuth-Morris-Pratt
## Tries
## Huffman coding
## Traveling salesperson
### Double Tree Algorithm
### Christofides' Algorithm
## Minimizing the Sum of Completion Times on a single machine (Chapter 4.1)
## MAX SAT
### Randomized Algorithm
### Derandomization
## Formulate ILP, LP and Dual given an instance of
### Set cover
#### Linear Programming
* Plays a central role in design and analysis of approximation algorithms
* Important Terms
    * **Decision variables**: represent some sort of decisions that need to be made
    * **Constraints**: Variables are constrained by a number of linear inequalities  
    * **Feasible solutions**: Any assignment of real numbers to the variables such that the constraints are satisfied
* Exists efficient algorithms to solve LP 
* Example
![Linear programming](res/LPex.png)
#### Integer Programming

* Integer linear programming
    * Exclude fractional solutions
* Zero-One linear programming
    * Allow only 1 and 0 as values for decision variables
* Integer Programming as NP-Hard 
### Vertex cover

## Coloring Graphs(vertices)

### 2 coloring algorithm

### (delta+1) coloring algorithm

### the O(sqrt(n)) given Chapter 6.5 (and also in Compulsory 2)

# Eksempelspørsmål ML From slide

## Why do a train-val-test split
In  ML we're building a model to predict something for new measurements. To simulate having new measurement we need to 
leave out  a set of data when constructing the model. We use this test to test the model and is therefor called a test set.

The rest of the set is train set. This is what we train the model on. The bigger the better for training our model. 
If it's bigger we get bigger deviation and the model can therefor generalize a bit more. If we use the entire data set 
the model can typically "remember" the data and cannot predict new data as successfully.
 

## What can go wrong if you tune hyperparameters based on test-set performance
The test set is usually a small set and this would cause a lack in generalization. The model would then probably miss a 
lot on new data.

## What is "generalization" in machine learning
Generalization is the ability to predict new data coming in. Data has some general deviation and an overfitted or 
overtrained model. Or a model trained on a to small set will fail at generalizing new data coming in and miss on it.
 
## What is cross-validation
This is achieved by splitting the training set into several parts called folds. Say K folds. Then we will train the 
model 3 times. Each time we use a different fold for evaluation and training on the remaining K-1 folds. The average 
score for the K runs is used to estimate the model's performance. This means that each set is part of the training set 
K-1 and part of the evaluation set once. An important advantage of this approach over the one above(splitting into two 
separate sets) is that it doesn't waste as much training data. Unless you have plenty of data, cross validation is the 
preferred method for estimating model performance.

Cross validatoin also provides a more thorough test than splitting the data into a training set and a test set. The 
```train_test_split``` procedure sets aside a fixed random subset of the data as a test set. If we're unlucky, all the 
difficult examples end up in the training set, while the test set contains only easy ones.

NOTE: the special case of cross-validation where K is set to the number of data points in the training set is called 
leave-one-out. Each fold is then a single sample.

The result of this K-fold cross validation procedure is an array of K evaluation scores.    

## Explain concept of "underfitting", "Overfitting" and "generalization" in machine learning
underfitting is when the model is not trained enough and will not hit accurately enough because of purely missing or 
over generalizing. Overfitting is when the model is trained to much on the selected model and will therefor hit the 
dataset it's trained on more or less perfectly but will miss on new data. 

## What is precision? What is recall?
The recall of a binary classifier is the proportion of actual positives that were correctly identified. In other words, 
recall = true positive/all actual positives = TP/P = TP/(TP+FN)

The precision of a binary classifier is the proportion of te positive predictions that were actually correct. In other 
words, precision = true positives/positive prediction = TP/(TP+FP)

## What is the so-called precision-recall tradeoff?
It's typically impossible to achieve both high precision and high recall simultaneously. They are typically competing, 
when one is high the other is low and vice versa.

Are false negatives very bad(like in medical diagnosis)? select a low threshold to get a high recall and OK precision. 
Are false positives especially costly(like in spam detection)? Go for a threshold that gives you high precision and OK recall. 

"If someone says "Let's reach 90% precision", you should ask, "at what recall?""

## Name some features. What are the classes? binary trees


## Say you have an instance with "worst radius" 17, "texture error" 0.5 and "worst concavity" 0.2. What will be the predicted class? What probability will the model assign the instance


## What is a random forest?


## How are predictions from a random forest produced?


## What is the behind gradient descent


## Can you name some variants of gradient descent? What are their respective strengths and weaknesses?


## What are neural networks? Name some ingredients


## Can you explain a bit about how neural networks are trained
