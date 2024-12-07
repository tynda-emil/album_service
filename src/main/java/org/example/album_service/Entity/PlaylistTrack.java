package org.example.album_service.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "playlist_track")
public class PlaylistTrack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="SongOrder", nullable = false)
    private int trackOrder;

    @ManyToOne
    @JoinColumn(name = "album_id", nullable = false)
    private Album album;

    @ManyToOne
    @JoinColumn(name = "song_id", nullable = false)
    private Song song;

    public Long getId() {
        return id;
    }

    public int getTrackOrder() {
        return trackOrder;
    }

    public Album getAlbum() {
        return album;
    }

    public Song getSong() {
        return song;
    }
}