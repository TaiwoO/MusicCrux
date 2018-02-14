package com.Operations;

import com.Models.Album;
import com.PostRequests.DiscogsPostReq;
import com.Services.ArrayAdapterFactory;
import com.Services.CollectionAdapter;
import com.Services.XmlFileReader;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.Cleanup;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Collection;

@Component
@Order(value = 1)
public class CreateAlbumDB implements CommandLineRunner {


    @Override
    public void run(String... arg0) throws Exception {
        try {
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
//            mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
//            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//
//
//            SimpleModule module = new SimpleModule();
//
//            module.addDeserializer(String.class, new StdDeserializer<String>(String.class) {
//                        @Override
//                        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
//                            String result = StringDeserializer.instance.deserialize(p, ctxt);
//                            if (StringUtils.isEmpty(result)) {
//                                return null;
//                            }
//                            return result;
//                        }
//                    });
//
//            mapper.registerModule(module);



            String releaseXmlFileString = arg0[0].toString();
            XmlFileReader xmlFileReader = new XmlFileReader(releaseXmlFileString);

            while (xmlFileReader.hasNext()) {

                String releaseXmlString = xmlFileReader.next();
//                System.out.println(mapper.readValue(releaseXmlString, Album.class));
//                System.out.println(mapper.writeValueAsString(releaseXmlString));
         //                JSONObject xmlJsonObj = XML.toJSONObject(releaseXmlString);
//                JSONObject xmlJsonObj = XML.toJSONObject(mapper.writeValueAsString(releaseXmlString));
//                JSONObject xmlJsonObj = XML.toJSONObject(releaseXmlString);

//                String jsonString = mapper.writeValueAsString(releaseXmlString);
//                System.out.println(xmlJsonObj.toString());
//                System.out.println("Test2");
//                JSONObject xmlJsonObj = XML.toJSONObject(jsonString);
//                System.out.println("Test3");
//                System.out.println(xmlJsonObj.toString());

//
                JSONObject releaseJson = XML.toJSONObject(releaseXmlString).getJSONObject("release");
                System.out.println(releaseJson.toString());
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
                        .registerTypeAdapterFactory(new ArrayAdapterFactory())
                        .setLenient()
                        .create();

                //Prints out the JSON string before being sent to GSON
                Album album = gson.fromJson(releaseJson.toString(), Album.class);

                //Prints out the finished OBJECT
                System.out.println(album.toString());

                //Posts the Album to the Music-Crux REST endpoint
//                DiscogsPostReq albumPost = new DiscogsPostReq();
//                albumPost.postAlbumEntity(album);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
