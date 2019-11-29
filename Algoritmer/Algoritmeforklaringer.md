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
Features in binary trees are usually the difference "categories" one example is level of glucose, BMI and age. In the 
example from last lecture some features are worst radius, worst concave points, texture error and smoothness error.  

The class is somewhat of a result. There are classes in each node, but the class is first assigned in a leaf node. 
## Say you have an instance with "worst radius" 17, "texture error" 0.5 and "worst concavity" 0.2. What will be the predicted class? What probability will the model assign the instance
False, False, False. This means the predicted class is cancer, but the gini of the class is just 0.48 which is very high.

The probability for not cancer is 2/5 and cancer is 3/5 

## What is a random forest?
The negative side about binary trees is that it heavily overfits, if not regularly. They are also extremely sensitive 
to small variations in the data. This is where random trees comes in. We ensemble multiple trees into one model, where 
one of these is called random forests. Random forest also performs much better. Random forest is related to the concept
of wisdom of the crowd where a crowd of non-expert that combine their predictions outperform individual experts. 

So to summarize, an ensamble of binary threes which outperforms, is less sensitive and generalizes more than binary 
threes. 

## How are predictions from a random forest produced?
This depends on whether it's regression or classification,

* **Regression**: Let each tree make a predicition and then average them.

* **Classification**: Let each tree make a prediction, and use a soft voting strategy to combine them. As we saw in the 
decision trees notebook, each tree provides a probability for its prediction. Average these probabilities and predict 
the class that has the highest average probability

## What is the idea behind gradient descent
First off gradient descent is a very generic optimization algorithm capable of finding optimal solutions to a wide range
of problems. The general idea of Gradient Descent is to tweak parameters iteratively in order to minimize a cost 
function.

## Can you name some variants of gradient descent? What are their respective strengths and weaknesses?
* **Batch Gradient Descent**:
The parameters are update once after all the training examples have been passed through the network. example: 100 Training 
examples then the parameters of the neural network are updated once after all examples are determined. **Pros**: Batch 
is good at producing a more stable gradient descent convergence and stable error gradient than stochastic gradient 
descent. **Cons**: Sometimes a stable error gradient can lead to a local minima. The entire training set can be too 
large to process in the memory. It takes too long for processing all the training samples as a batch.
 
* **Stochastic Gradient Descent**: One training sample is passed through te neural network at a time. parameters(weights)
of each layer are updated with the computed gradient. **Pros**: It is easier to fit into memory due to a single training sample
being processed by the network. It can converge faster because it updates to the parameters more frequently. Help 
getting out of local minimums of the loss function. **Cons**: Due to frequent updates the steps taken towards the minima 
are very noisy. This can lead the gradient descent into other directions. Longer achievement.


* **Mini-Batch Gradient Descent**: This is a mixture of both stochastic and batch GD. 100 samples, examines 10, 20, 30,...
at a time. Find the balance between BDG and SDG. A batch of samples are updated each iteration. **Pros**: Easily fits in 
the memory. It is computationally efficient. If stuck in local minimums, some noisy steps can lead the way out of them.


## What are neural networks? Name some ingredients


## Can you explain a bit about how neural networks are trained
