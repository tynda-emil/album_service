package org.example.album_service.Repo;

import org.example.album_service.Entity.PlaylistTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistTrackRepo extends JpaRepository<PlaylistTrack, Long> {
    List<PlaylistTrack> findByAlbumIdOrderByTrackOrder(Long albumId);
}

