package au.com.jradams.springtune.service;

import au.com.jradams.springtune.model.Album;
import au.com.jradams.springtune.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {

    //-------------------------------------------------------------------------
    //  Fields
    //-------------------------------------------------------------------------

    private AlbumRepository albumRepository;

    //-------------------------------------------------------------------------
    //  Constructor(s)
    //-------------------------------------------------------------------------

    @Autowired
    public AlbumService(final AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    //-------------------------------------------------------------------------
    //  Methods
    //-------------------------------------------------------------------------

    public List<Album> getAlbums() {
        return new ArrayList<>(albumRepository.findAll());
    }

    public Album getAlbumById(final String albumId) {
        return albumRepository.findById(albumId).orElse(null);
    }

    public void saveAlbum(final Album album) {
        albumRepository.save(album);
    }
}
