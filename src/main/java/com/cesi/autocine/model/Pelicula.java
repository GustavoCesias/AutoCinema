package com.cesi.autocine.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "clasificacion", nullable = false)
    private String clasificacion;

    @Column(name = "sinopsis", nullable = false)
    private String sinopsis;

    @Column(name = "director", nullable = false)
    private String director;

    @Column(name = "fecha_estreno", nullable = false)
    private Date fecha_estreno;

    @Column(name = "duracion", nullable = false)
    private int duracion;

    @Column(name = "youtubeTrailer", nullable = false)
    private String youtubeTrailer;

    @Column(name = "poster", nullable = false)
    private String poster;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Funcion> funciones = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(Date fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getYoutubeTrailer() {
        return youtubeTrailer;
    }

    public void setYoutubeTrailer(String youtubeTrailer) {
        this.youtubeTrailer = youtubeTrailer;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Set<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(Set<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Pelicula(Long id, String titulo, String genero, String clasificacion, String sinopsis, String director, Date fecha_estreno, int duracion, String youtubeTrailer, String poster, Set<Funcion> funciones) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.director = director;
        this.fecha_estreno = fecha_estreno;
        this.duracion = duracion;
        this.youtubeTrailer = youtubeTrailer;
        this.poster = poster;
        this.funciones = funciones;
    }

    public Pelicula() {
        super();
    }
}
