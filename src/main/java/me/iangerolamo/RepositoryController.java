package me.iangerolamo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class RepositoryController {

    RepositoryMockedData repositoryMockedData = RepositoryMockedData.getInstance();

    @GetMapping("/repositories")
    public List<Repository> index() {
        return repositoryMockedData.fetchRepositories();
    }

    @GetMapping("/repositories/{id}")
    public Repository show(@PathVariable String id){
        int repositoryId = Integer.parseInt(id);
        return repositoryMockedData.getRepositoryById(repositoryId);
    }

    @PostMapping("/repositories")
    public Repository create(@RequestBody Map<String, String> body){
        int id = Integer.parseInt(body.get("id"));
        String title = body.get("title");
        String url = body.get("url");
        String techs = body.get("techs");
        return repositoryMockedData.createRepository(id, title, url, techs);
    }

    @PutMapping("/repositories/{id}")
    public Repository update(@PathVariable String id, @RequestBody Map<String, String> body) {
        int repositoryId = Integer.parseInt(id);
        String title = body.get("title");
        String url = body.get("url");
        String techs = body.get("techs");
        return repositoryMockedData.updateRepository(repositoryId, title, url, techs);
    }

    @DeleteMapping("/repositories/{id}")
    public boolean delete(@PathVariable String id) {
        int repositoryId = Integer.parseInt(id);
        return repositoryMockedData.delete(repositoryId);
    }
}

