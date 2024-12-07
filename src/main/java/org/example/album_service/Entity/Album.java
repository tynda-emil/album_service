package org.example.album_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "album_id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "is_playlist")
    private Boolean isPlaylist;
    @Column(name="genre")
    private String genre;

    @Column(name="year")
    private int year;

    @OneToMany(mappedBy = "album")
    private Set<PlaylistTrack> playlistTracks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "album")
    private Set<Song> songs = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public Boolean getPlaylist() {
        return isPlaylist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public Set<PlaylistTrack> getPlaylistTracks() {
        return playlistTracks;
    }

    public Set<Song> getSongs() {
        return songs;
    }
}
