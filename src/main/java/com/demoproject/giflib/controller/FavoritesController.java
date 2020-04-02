package com.demoproject.giflib.controller;

import com.demoproject.giflib.data.CategoryRepository;
import com.demoproject.giflib.data.GifRepository;
import com.demoproject.giflib.model.Category;
import com.demoproject.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoritesController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String favorites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.findFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
