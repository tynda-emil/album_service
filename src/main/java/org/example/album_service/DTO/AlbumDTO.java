package org.example.album_service.DTO;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class AlbumDTO {
    private Long id;
    private String title;
    private String artist;
    private String genre;
    private int year;
    private List<SongDTO> tracks;

    public AlbumDTO(Long id, String title, String artist, String genre, int year, List<SongDTO> tracks) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.tracks = tracks;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public List<SongDTO> getTracks() {
        return tracks;
    }
}

