As part of the management team in a large, community project based on the video game Baldur's Gate 3, I created a Java project to assign cards to creatives. 
There are 78 cards in the deck featuring different characters from the game, then 26 writers and 78 card artists.
This code was written during the summer before my data structures and algorithms course.

Code Considerations:
The card assignment process had to be random, for fairness, but my code also had to ensure that no creative received a card/character that was on their 'opt-out' list from a survey we sent out to them beforehand. 
Each creative got a maximum of five characters to opt out of working on a card for, but did not need to use all five opt-outs. 
Lastly, my code had to ensure that everyone was assigned to the appropriate amount of cards; 3 for writers, 1 for artists. 
There were some creatives who were both a card artist and writer, so those people received 4 card assignments. 

For anonymity, I replaced all of the creatives names in the Java WriterDeck and ArtistDeck files with generic placeholders. 
If downloaded, this project would run and print to the console a list of randomized card assignments following the constraints and considerations above.
