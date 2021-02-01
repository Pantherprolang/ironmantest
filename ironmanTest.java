#JSGFGrammar V1.0 utf-8 en;

grammar music_playEn;

    music_play = 
        music_playEn;

public <music_play> = 
    

// <unk> could be defined as different options of expressing a wish, want, desire, etc.  Idiomatic phrases could be interchangable at this level.
<unk> =
    [let me hear] |
    [i want to listen to] |
    play me |
    can you |
    put on |
    by;

//The following could be a partial solution to the ambiguity of <unk>, from https://homepages.abdn.ac.uk/k.vdeemter/pages/teaching/NLP/practicals/JSGFGrammar.html#:~:text=The%20Java%20Speech%20Grammar%20Format,Java%20Speech%20API%20(JSAPI)%20.
    <startPolite> <command> <endPolite>;
    <command> = <action> <object>;

        <action> =
            /10/ [can you] (put on | play) |
            /3/ [play me] |
            /2/ [let me] (hear | listen to) |
            /1/ (turn off | stop) ;
    
        <object> = 
            <music_item>;

    <startPolite> = (please | kindly | could you | oh mighty computer);
    <endPolite> = ( please | thanks | thank you );

<music_item> =
    artist |
    song |
    genre |
    album;


<artist> =
    beatles |
    led zeppelin |
    radio head |
    pink floyd |
    cake;

<song> =
    comfortably numb |
    paranoid android |
    let it be |
    hey jude |
    no phone |
    kashmir ;

<genre> =
    jazz |
    classic rock |
    alternative;


<album> =
    physical graffiti |
    ummagumma |
    hey jude |
    ok computer |
    pressure chief;