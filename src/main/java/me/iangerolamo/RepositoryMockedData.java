package me.iangerolamo;

import java.util.ArrayList;
import java.util.List;

public class RepositoryMockedData {
    private final List<Repository> repositories;

    private static RepositoryMockedData instance = null;
    public static RepositoryMockedData getInstance(){
        if(instance == null){
            instance = new RepositoryMockedData();
        }
        return instance;
    }

    public RepositoryMockedData(){
        repositories = new ArrayList<Repository>();
    }

    // return all repositories
    public List<Repository> fetchRepositories() {
        return repositories;
    }

    // return repository by id
    public Repository getRepositoryById(int id) {
        for(Repository r: repositories){
            if(r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    // create repository
    public Repository createRepository(int id, String title, String url, String techs) {
        Repository newRepository = new Repository(id, title, url, techs);
        repositories.add(newRepository);
        return newRepository;
    }

    // update repository
    public Repository updateRepository(int id, String title, String url, String techs) {
        for (Repository r: repositories) {
            if(r.getId() == id) {
                int repositoryIndex = repositories.indexOf(r);
                r.setTitle(title);
                r.setUrl(url);
                r.setTechs(techs);
                repositories.set(repositoryIndex, r);
                return r;
            }
        }
        return null;
    }

    // delete repository
    public boolean delete(int id){
        int repositoryIndex = -1;
        for(Repository r: repositories) {
            if(r.getId() == id) {
                repositoryIndex = repositories.indexOf(r);
            }
        }
        if(repositoryIndex > -1){
            repositories.remove(repositoryIndex);
        }
        return true;
    }
}
