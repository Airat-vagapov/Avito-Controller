package tech.itpark.crud.controler;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.itpark.crud.manager.FlatManager;
import tech.itpark.crud.model.Flat;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flats")


public class FlatControler {
    private FlatManager manager = new FlatManager();

    @RequestMapping
    public List<Flat> getAll() {
        return manager.getAll();
    }

    @RequestMapping("/{id}")
    public Flat getById(@PathVariable int id) {
        return manager.getById(id);
    }

    @RequestMapping("/{id}/remove")
    public void removeById(@PathVariable int id) {
        manager.removeById(id);
    }

    @RequestMapping("/{id}/save")
    public Flat save(
            @PathVariable int id,
            @RequestParam String name,
            @RequestParam ArrayList<String> station,
            @RequestParam ArrayList<String> district,
            @RequestParam int price,
            @RequestParam int floor,
            @RequestParam int rooms
    ) {
        return manager.save(new Flat(id,
                name,
                station,
                district,
                price,
                floor,
                rooms));
    }

    @RequestMapping("/filter")
    public ArrayList<Flat> filter(
            @RequestParam ArrayList<String> station,
            @RequestParam ArrayList<String> district,
            @RequestParam int maxPrice,
            @RequestParam int minPrice,
            @RequestParam int maxFloor,
            @RequestParam int minFloor,
            @RequestParam int rooms
    ) {
        return manager.filter(
                station,
                district,
                maxPrice,
                minPrice,
                maxFloor,
                minFloor,
                rooms);

    }

    @RequestMapping("/search")
    public ArrayList<Flat> search(@RequestParam String text) {
        return manager.search(text);
    }
}
