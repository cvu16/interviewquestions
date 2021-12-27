The max area is calculated by the following formula:

    S = (j - i) * min(ai, aj)

We should choose (i, j) so that S is max. Note that ```i, j``` go through the range ```(1, n)``` and ```j > i```. That's it.

The simple way is to take all possibilities of ```(i, j)``` and compare all obtained ```S```. The time complexity is ```n * (n-1) / 2```

What we gonna do is to choose all possibilities of ```(i, j``` in a wise way. I noticed that many submitted solutions here can't explain why when :

  ```ai < aj``` we will check the next 
  ```(i+1, j)``` (or move i to the right)
  ```ai >= aj``` we will check the next 
  ```(i, j-1)``` (or move j to the left)
 
Here is the explaination for that:

When ``ai < aj`` , we don't need to calculate all ```(i, j-1), (i, j-2), ....``` Why? because these max areas are smaller than our ```S``` at ```(i, j)```
Proof: Assume at ```(i, j-1)``` we have ``` S'= (j-1-i) * min(ai, aj-1)```
```S'< (j-1-i) * ai < (j-i) * ai = S``` , and when ```S'<S``` , we don't need to calculate
Similar at ```(i, j-2), (i, j-3), etc.```

So, that's why when ```ai < aj``` we should check the next at ```(i+1, j)``` (or move i to the right)

When ```ai >= aj```, the same thing, all ```(i+1, j), (i+2, j), ....``` are not needed to calculate.
We should check the next at ```(i, j-1)``` (or move j to the left)
