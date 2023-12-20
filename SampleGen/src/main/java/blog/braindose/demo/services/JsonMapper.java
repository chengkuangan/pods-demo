package blog.braindose.demo.services;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RegisterForReflection
public class JsonMapper {
    
    private ObjectMapper mapper;

    public JsonMapper(){
        mapper = new ObjectMapper();
    }
    
    public String str(Object o){
        
        String jstr = null;
        //LOGGER.debug("Converting object to JSON String");
        try {
            jstr = mapper.writeValueAsString(o);
            //LOGGER.debug("JSON String: {}", jstr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        
        return jstr;
    }

    public List readCollections(String url,  Class elementClass){
        List obj = null;
        try {
            CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, elementClass);
            obj = mapper.readValue(new URL("file:" + url), listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public List readCollections(File file,  Class elementClass){
        List obj = null;
        try {
            CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, elementClass);
            obj = mapper.readValue(file, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public List readCollections(URL url,  Class elementClass){
        List obj = null;
        try {
            CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, elementClass);
            obj = mapper.readValue(url, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
