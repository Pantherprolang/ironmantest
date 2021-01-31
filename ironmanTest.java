#JSGV V1.0 UTF-8 en;

grammar music_playEn;

    music_play = 
        music_playEn;

public <music_play> = 
    [can you] (put on | play) (<artist>) | <song>);

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

<unk> =
    music |
    let me hear |
    i want to listen to |
    play me |
    can you |
    put on |
    by |