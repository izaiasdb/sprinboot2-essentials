package academy.devdojo.springboot2.service;

/*
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import academy.devdojo.springboot2.domain.Anime;

// Aula ?
@Service
public class AnimeServiceOld {
    // private final AnimeRepository animeRepository;

	// Aula 09
    private static List<Anime> animes;
    
    static {
        animes = new ArrayList<>(List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk")));
    }    

    // Aula 07?
    //private List<Anime> animes = List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk"));

    // Aula 08    
    public List<Anime> listAll() {
    	return animes;
        // Aula 07    	
//        return List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk"));
    }

    // Aula 08?
    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    // Aula 09
    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 100000));
        animes.add(anime);
        return anime;
    }

    // Aula 10
    public void delete(long id) {
        animes.remove(findById(id));
    }
    
    // Aula 11
    public void replace(Anime anime) {
        delete(anime.getId());
        animes.add(anime);
    }        
}*/