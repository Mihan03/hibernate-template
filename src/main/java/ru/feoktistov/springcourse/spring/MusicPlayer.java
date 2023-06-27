package ru.feoktistov.springcourse.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;

    private List<Music> musicTypes;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }



    private Music music1;
    private Music music2;

//    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer(List<Music> musicTypes) {
        this.musicTypes = musicTypes;
    }

    public String playMusic(TypeMusic typeMusic) {
        int index = randomIndex(3);
        Music playMusic = null;

        switch (typeMusic) {
            case ROCK:
                playMusic = music1;
                break;
            case CLASSICAL:
                playMusic = music2;
                break;
        }

        return ("Playing: " + playMusic.getSong().get(index));
    }

    public String playMusic() {
        Music music = this.musicTypes.get(randomIndex(3));

        return ("Playing: " + music.getSong().get(randomIndex(3)));
    }

    private int randomIndex(int limit) {
        Random random = new Random();
        return random.nextInt(limit);
    }

}
