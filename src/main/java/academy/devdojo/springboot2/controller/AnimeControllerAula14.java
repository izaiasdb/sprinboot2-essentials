package academy.devdojo.springboot2.controller;


/*
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.requests.AnimePostRequestBody;
import academy.devdojo.springboot2.requests.AnimePutRequestBody;
import academy.devdojo.springboot2.service.AnimeService;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

// Aula 14
@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }
    
    // Aula 14
    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id) {
        return ResponseEntity.ok(animeService.findByIdOrThrowBadRequestException(id));
    }    
    
//    @GetMapping(path = "/{id}")
//    public ResponseEntity<Anime> findById(@PathVariable long id){
//        return ResponseEntity.ok(animeService.findById(id));
//    }
    
    // Aula 09
//    @PostMapping
//    // @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<Anime> save(@RequestBody Anime anime){
//        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
//    }
    
    // Aula 14    
    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody AnimePostRequestBody animePostRequestBody) {
        return new ResponseEntity<>(animeService.save(animePostRequestBody), HttpStatus.CREATED);
    }
    
    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody AnimePutRequestBody animePutRequestBody) {
        animeService.replace(animePutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }    

    // Aula 10
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Aula 11    
//    @PutMapping
//    public ResponseEntity<Void> replace(@RequestBody Anime anime) {
//        animeService.replace(anime);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT); //OK?
//    }    
//    
//    @GetMapping
//    public ResponseEntity<List<Anime>> list(){
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
//        return new ResponseEntity(animeService.listAll(), HttpStatus.OK);
//    }
    
//    @GetMapping
//    public List<Anime> list(){
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
//        return animeService.listAll(); //Aula 07
//    }
    
    // Aula 07
    //@GetMapping(path = "list") // Aula 06
//    @GetMapping
//    public List<Anime> list(){
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
//        return List.of(new Anime("Boku No Hero"), new Anime("Berserk"));
//    }

}
*/