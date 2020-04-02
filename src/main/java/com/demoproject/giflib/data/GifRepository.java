package com.demoproject.giflib.data;

import com.demoproject.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false, 1),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true, 2),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false, 0),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true, 0),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false, 2),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true, 2)
    );
    public Gif findByName(String name) {
        for(Gif gif: ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> searchByName(String q) {
        List<Gif> gifs = new ArrayList<Gif>();
        for(Gif gif: ALL_GIFS) {
            if(gif.getName().contains(q.toLowerCase())) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<Gif>();
        for(Gif gif: ALL_GIFS) {
            if(gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> findFavorites() {
        List<Gif> gifs = new ArrayList<Gif>();
        for(Gif gif: ALL_GIFS) {
            if(gif.isFavorite() == true) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
