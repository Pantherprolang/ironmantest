#JSGFGrammar V1.0 utf-8 pt-pt;

grammar music_play_pt;

public <music_play_pt> = 
  
    <startPolite_pt> <command_pt> <endPolite_pt>;
        <command_pt> = <action_pt> <object_pt>;

        <action_pt> =
            /10/ (pode tocar | toque) |
            /3/ (quero | estou a precisar) |
            /2/ ([permite | deixa] ouvir | escutar) |
            /1/ (para | cesse) ;

        <object_pt> = 
            <music_item_pt>;

    <startPolite_pt> = (faz favor | da licença);

    <endPolite_pt> = ([não es ] nada | obrigado);

<music_item_pt> =
    artista |
    canção |
    género_musical |
    álbum;


    <artista> =
        beatles |
        led zeppelin |
        radio head |
        pink floyd |
        cake;

    <canção> =
        comfortably numb |
        paranoid android |
        let it be |
        hey jude |
        no phone |
        kashmir ;

    <género_musical> =
        jazz |
        música rock |
        música alternativa;


    <álbum> =
        physical graffiti |
        ummagumma |
        hey jude |
        ok computer |
        pressure chief;