package com.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import javax.annotation.Nonnull;


public class ArrayAdapter<T> extends TypeAdapter<List<T>> {
    private Class<T> adapterclass;

    public ArrayAdapter(Class<T> adapterclass) {
        this.adapterclass = adapterclass;
    }

    @Override
    @Nonnull
    @SuppressWarnings("EnumSwitchStatementWhichMissesCases")
    public List<T> read(JsonReader reader) throws IOException {

        List<T> list = new ArrayList<T>();

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new ArrayAdapterFactory())
                .setLenient()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        try {
            JsonToken token = reader.peek();
            switch(token){
                case NULL:
                    reader.skipValue();
                case STRING:
                    reader.skipValue();
                case BEGIN_ARRAY:
                    reader.beginArray();
                    while (reader.hasNext()) {
                        T inning = (T) gson.fromJson(reader, adapterclass);
                        list.add(inning);
                    }
                    reader.endArray();
                case BEGIN_OBJECT:
                    T inning = (T) gson.fromJson(reader, adapterclass);

                    list.add(inning);
                default:
                    reader.skipValue();
            }
        }catch (IllegalStateException | JsonSyntaxException e){
           //Possible Log entries, or outputs for debugging purposes
//            System.out.println(e.getCause());
        }
        return list;
    }

    @Override
    public void write(JsonWriter writer, List<T> value) throws IOException {

    }

}