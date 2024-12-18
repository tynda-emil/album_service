package org.example.album_service;

import lombok.RequiredArgsConstructor;
import org.example.album_service.DTO.AlbumDTO;
import org.example.album_service.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/album")
@RequiredArgsConstructor
public class Controller {
    @Autowired
    AlbumService albumService;
    @GetMapping("/{id}")
    public AlbumDTO getAlbum(@PathVariable Long id) {
        return albumService.getAlbumById(id);
    }
}
