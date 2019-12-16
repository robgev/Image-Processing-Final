# Convolution

Based on the results I've chose to convolve Gaussian blur with 2px radius with mean blur of 1 px Radius.
## Gaussian Kernel
- Coefficient: 1/273
- Matrix: 
```
1  4  7  4 1
4 16 26 16 4
7 26 41 26 7
4 16 26 16 4
1  4  7  4 1
```
## Mean Kernel
- Coefficient: 1/9
- Matrix:
```
1 1 1
1 1 1
1 1 1
```

## Convolved Kernel
```
0.02352 0.05749 0.09589 0.10633 0.09589 0.05749 0.02352
0.05749 0.14051 0.23433 0.25985 0.23433 0.14051 0.05749
0.09589 0.23433 0.39081 0.43336 0.39081 0.23433 0.09589 
0.10633 0.25985 0.43336 0.48055 0.43336 0.25985 0.10633
0.09589 0.23433 0.39081 0.43336 0.39081 0.23433 0.09589 
0.05749 0.14051 0.23433 0.25985 0.23433 0.14051 0.05749
0.02352 0.05749 0.09589 0.10633 0.09589 0.05749 0.02352
```

# Rotations

## Image 31

### Image 31-4: Binary Layer 0
ORIENTATION   0.039695
ECCENTRICITY   2.060596
### Image 31-11: Binary Layer 0
ORIENTATION   0.008836
ECCENTRICITY   2.013842
### Image 31-11: Binary Layer 2
ORIENTATION   0.000136
ECCENTRICITY   1.782138
### Image 31-12: Binary Layer 0
ORIENTATION   0.013485
ECCENTRICITY   2.022315
### Image 31-12: Binary Layer 2
ORIENTATION  -0.000078
ECCENTRICITY   1.782883

As we can see, the rotation drastically changes the orientation.
In case of the smile, Binary Layer 2 + orientation gives some ideas. 

## Image 32

### Image 32-5: Binary Layer 0
ORIENTATION   0.021030
ECCENTRICITY   1.882626
### Image 32-11: Binary Layer 0
ORIENTATION   0.013042
ECCENTRICITY   1.864504
### Image 32-11: Binary Layer 2
ORIENTATION  -0.000674
ECCENTRICITY   1.783139
### Image 32-12: Binary Layer 0
ORIENTATION   0.012100
ECCENTRICITY   1.862832
### Image 32-12: Binary Layer 2
ORIENTATION  -0.000639
ECCENTRICITY   1.783717

We observe that orientation change is also seen here. As the rotation is slightly less,
the orientation change is also little. Almost nothing changed in case of smile, though.,

## Image 33

### Image 33-7: Binary Layer 0
ORIENTATION   0.032190
ECCENTRICITY   2.089055
### Image 33-11: Binary Layer 0
ORIENTATION   0.013042
ECCENTRICITY   1.864504
### Image 33-11: Binary Layer 2
ORIENTATION  -0.000309
ECCENTRICITY   1.784116
### Image 33-12: Binary Layer 0
ORIENTATION   0.012100
ECCENTRICITY   1.862832
### Image 33-12: Binary Layer 2
ORIENTATION   0.000253
ECCENTRICITY   1.786951

Orientation changes are notable in this case too.

## Image 34

### Image 34-7: Binary Layer 0
ORIENTATION   0.000284
ECCENTRICITY   2.044852
### Image 34-11: Binary Layer 0
ORIENTATION   0.005049
ECCENTRICITY   2.006047
### Image 34-11: Binary Layer 2
ORIENTATION  -0.000006
ECCENTRICITY   1.780318
### Image 34-12: Binary Layer 0
ORIENTATION   0.005948
ECCENTRICITY   2.023106
### Image 34-12: Binary Layer 2
ORIENTATION  -0.000053
ECCENTRICITY   1.779102

Conclusion: Orientation of Binary Layer 2 changes when the person is smiling.
Orientation of Binary Layer 0 changes when the person is rotating.



