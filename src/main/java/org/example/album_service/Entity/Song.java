package org.example.album_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "song_id", nullable = false)
    private Long id;

    @Column(name = "counter")
    private Integer counter;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "genre", length = 50)
    private String genre;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "album_id")
    private Album album;

    @Column(name = "user_id")
    private Long userId;

    public Long getId() {
        return id;
    }

    public Integer getCounter() {
        return counter;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Album getAlbum() {
        return album;
    }

    public Long getUserId() {
        return userId;
    }
}
