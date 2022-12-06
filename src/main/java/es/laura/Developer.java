package es.laura;

import java.util.List;

//to seal
public class Developer extends Person{

    private List<String> languages;

    public Developer(String name, String surname, List<String> languages){
        super(name, surname);
        this.languages = languages;
    }

    public void setLanguages(List<String> languages){
        this.languages = languages;
    }

    public List<String> getLanguages(){
        return this.languages;
    }

    public void addLanguage(String language){
        this.languages.add(language);
    }

}
