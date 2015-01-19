// Check if the user is ready to play!

confirm("Click ok if you are ready to play");
var age;
age = prompt("Enter your age");
if(age < 13)
{
    console.log("you are allowed to play");    
}
else
{
    console.log("Get set Go!")    
}
console.log("You are at a Justin Bieber concert, and you hear this lyric 'Lace my shoes off, start racing.'");
console.log("Suddenly, Bieber stops and says, 'Who wants to race me?'");
var userAnswer = prompt("Do you want to race Beiber on stage?");
if(userAnswer === "yes")
{
    console.log("You and Bieber start racing. It's neck and neck! You win by a shoelace!");    
}
else
{
   console.log("Oh no! Bieber shakes his head and sings 'I set a pace, so I can race without pacing.'"); 
}
var feedback;
feedback = prompt("Feedback: Rate out this game of 10");
if(feedback === 8)
{
    console.log("Thank you! We should race at the next concert!");    
}
else
{
    console.log("I'll keep practicing coding and racing.");    
}