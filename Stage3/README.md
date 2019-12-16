## Bounding Box
Take the location of the first black pixel in the one of the binary Layers (preferrably Binary Layer 0) and the last black pixel. Make a rectangle with upper left corner of the first pixel and lower right corner of the last black pixel.

## Head Turn

As the empirical research in the stage 1 showed, the rotation of the head brings change in the orientation. We can have a threshold value of change and if the orientation change between the two images is higher than the threshold, then turn happened.

## Head detection
Calculating the eccentricity of the image we can determine if it's a human head or not. We should calculate the eccentricity of the head. If the number is between 1.6 (small, round head) to 2.2 (long, oval head) then it's a person head.

## Lips detection
1. Using the convolved matrix from stage 1, smoothen the regions.
2. Use Binary Layer 3 or 4 to get the initial region.
3. Dilate the image to remove unnecessary small parts
4. Erode the image to make lips more expressive
5. Also can open/close for better result.

## Eye socket detection
We can try to do skin detection and then extract white color regions from the colored image. As the eyes have fairly different color from the rest of the skin, this can be used to estimate the position of eye sockets.

## Eye socket detection 2
We can try to use the illumination/reflection of the light in the eye alongside skin detection to determine some "holes" in the skin. Later, using morphological filters we can make those regions more visible.