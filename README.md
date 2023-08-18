# Lemonade
An interactive app that lets you juice lemons when you tap the image on screen until you have a glass of lemonade. 

This app was built to practice app interactivity using clicks,`remember` composable to store objects in a Composition to memory, and `mutableStateOf()` function to make an observable.

1. When the user first launches the app, they see a lemon tree. There's a label that prompts them to tap the lemon tree image to "select" a lemon from the tree.

2. After they tap the lemon tree, the user sees a lemon. They are prompted to tap the lemon to "squeeze" it to make lemonade. They need to tap the lemon several times to squeeze it. The number of taps required to squeeze the lemon is different each time and is a randomly generated number between 2 to 4 (inclusive).
   
3. After they've tapped the lemon the required number of times, they see a refreshing glass of lemonade! They are asked to tap the glass to "drink" the lemonade.
   
4.  After they tap the lemonade glass, they see an empty glass. They are asked to tap the empty glass to start again.
  
5.   After they tap the empty glass, they see the lemon tree and can begin the process again. More lemonade please!

