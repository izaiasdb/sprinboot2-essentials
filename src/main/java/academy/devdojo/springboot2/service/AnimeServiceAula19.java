package academy.devdojo.springboot2.service;

/*
import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.exception.BadRequestException;
import academy.devdojo.springboot2.mapper.AnimeMapper;
import academy.devdojo.springboot2.repository.AnimeRepository;
import academy.devdojo.springboot2.requests.AnimePostRequestBody;
import academy.devdojo.springboot2.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Aula 19
@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return animeRepository.findAll();
    }

    public List<Anime> findByName(String name) {
        return animeRepository.findByName(name);
    }

    public Anime findByIdOrThrowBadRequestException(long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not Found"));
    }
    
    @Transactional
    public Anime save(AnimePostRequestBody animePostRequestBody) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }
    
    // Por padrão ele não dá o rolback para exceções do tipo Exception, nesse caso usar o "rollbackFor = Exception.class"
//    @Transactional(rollbackFor = Exception.class)
//    public Anime save(AnimePostRequestBody animePostRequestBody) throws Exception {
//    	Anime save = animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
//    	
//    	if (true) {
//    		throw new Exception("Bad code");
//    	}
//    	
//    	return save;
//    }

//    @Transactional
//    public Anime save(AnimePostRequestBody animePostRequestBody) {
//    	Anime save = animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
//    	
//    	if (true) {
//    		throw new RuntimeException("Bad code");
//    	}
//    	
//    	return save;
//    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(savedAnime.getId());
        animeRepository.save(anime);
    }
}
*/