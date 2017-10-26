package com.projeto.danilosetubal.minhacotac.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.projeto.danilosetubal.minhacotac.models.Moeda;

import java.lang.reflect.Type;

/**
 * Created by danilosetubal on 25/10/17.
 */

public class MoedaDeserializer implements JsonDeserializer<Moeda> {

    @Override
    public Moeda deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();

        return new Moeda(
                jsonObject.get("nome").getAsString(),
                jsonObject.get("sigla").getAsString(),
                jsonObject.get("valor").getAsString()
        );
    }
}
