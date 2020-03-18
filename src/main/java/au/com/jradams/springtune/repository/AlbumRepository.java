package au.com.jradams.springtune.repository;

import au.com.jradams.springtune.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {

    List<Album> findAlbumByTitle(final String title);
}
