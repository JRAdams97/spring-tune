package au.com.jradams.springtune.controller;

import au.com.jradams.springtune.model.Album;
import au.com.jradams.springtune.repository.AlbumRepository;
import au.com.jradams.springtune.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    //-------------------------------------------------------------------------
    //  Fields
    //-------------------------------------------------------------------------

    private AlbumService albumService;

    //-------------------------------------------------------------------------
    //  Constructor(s)
    //-------------------------------------------------------------------------

    @Autowired
    public IndexController(final AlbumService albumService) {
        this.albumService = albumService;
    }

    //-------------------------------------------------------------------------
    //  Methods
    //-------------------------------------------------------------------------

    @ModelAttribute("albums")
    public List<Album> getAlbums() {
        return albumService.getAlbums();
    }

    @GetMapping("/")
    public String indexHandler() {
        return "index";
    }

    @GetMapping("/album/{albumId}")
    public ResponseEntity<Album> getAlbum(@PathVariable final String id) {
        return new ResponseEntity<>(albumService.getAlbumById(id), HttpStatus.OK);
    }

    @GetMapping("/album")
    public ResponseEntity<List<Album>> getAlbumList() {
        return new ResponseEntity<>(albumService.getAlbums(), HttpStatus.OK);
    }

    @PostMapping("/album")
    public ResponseEntity<String> saveAlbum(@RequestBody final Album album) {
        albumService.saveAlbum(album);

        return new ResponseEntity<>("New album successfully created!", HttpStatus.OK);
    }
}
