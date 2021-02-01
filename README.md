# ironmantest
* This is a project using Java Speech API Grammar Format for the Cerence company defining a localized grammar model * for on board music in cars.

Scaling up:
    The NLTK (natural language toolkit) handbook rightly assesses that the underspecification of a handle like <unk> would be "very hard", (chapter 8, sec. 5.2) especially to scale up by hand.  One of the difficulties indicated is spreading the work across several linguists working together. However, there are examples of "impressive results" that provide hope and guidance for attempting such a task. We are certainly further along than 30 years ago with early developments of natural language processing on the first hard drives. Much work has been done but by hobbyists, linguists, open-source communities, academic communities and for profit companies such as Cerence. A set of best practices across these end users makes it not only possible but excitingly probable to turn the corner and usher in the next generation of AI projects.
    For example, specifying more general classes of terms that can function interchangeably, as was mentioned in the prompt 
        "can you play"
        "play me"
        "I want to listen to"
    
While theoretically the possibilities are limitless, the actual usage of common idioms has a limited range. These can be captured through web scraping and surveys on social media.


Treebank models can sub-categorize these utterances into more managable groups. 

Aberdeen University developed a JSGF class that uses a "grammar graph" to display what the parts should look like. This was quite helpful. They used the following template:
    public <basicCmd> = <startPolite> <command> <endPolite>;
  
        <command> = <action> <object>;
        <action> = /10/ open |/2/ close |/1/ delete |/1/ move;
        <object> = [the | a] (window | file | menu);
  
        <startPolite> = (please | kindly | could you | oh mighty computer) *;
        <endPolite> = [ please | thanks | thank you ];

I thought the "politeness" parameters were cute. Depending on culture, this would be part of the idiomatic phrases.

The "command" is made up of the "action" to play, listen, turn on, etc.The "command" would be the java way of expressing wishes or desires. In this template, the actions are numbered, which may help later in shorthand for calling these functions.

Aberdeen conceptualized the grammar in the following figures:

<img src="https://www.dropbox.com/s/hbxc96c6uxdjdnh/abdn_gram_pic.png?dl=0"/>

The object which we are defining in our particular application is the "music_item". 