package org.example.album_service.Service;

import lombok.RequiredArgsConstructor;
import org.example.album_service.DTO.AlbumDTO;
import org.example.album_service.DTO.SongDTO;
import org.example.album_service.Entity.Album;
import org.example.album_service.Entity.PlaylistTrack;
import org.example.album_service.Repo.AlbumRepo;
import org.example.album_service.Repo.PlaylistTrackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlbumService {
    @Autowired
    AlbumRepo albumRepo;
    @Autowired
    PlaylistTrackRepo playlistTrackRepo;
    public AlbumDTO getAlbumById(Long id){
        Album album = albumRepo.findById(id).orElseThrow(()->new RuntimeException("album not found"));
        List<PlaylistTrack> playlistTracks = playlistTrackRepo.findByAlbumIdOrderByTrackOrder(id);
        List<SongDTO> songDTOS = playlistTracks.stream()
                .map(pt -> new SongDTO(pt.getSong().getId(), pt.getSong().getTitle(), pt.getSong().getDuration()))
                .collect(Collectors.toList());
        return new AlbumDTO(
                album.getId(),
                album.getTitle(),
                album.getUser().getUsername(),
                album.getGenre(),
                album.getYear(),
                songDTOS);
    }

}
