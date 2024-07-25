package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonReader {
  private final ObjectMapper objectMapper = new ObjectMapper();

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("src/main/resources/MOCK_DATA.json").toAbsolutePath();
    JsonNode jsonNode =  new ObjectMapper().readTree(new File(path.toString()));
    System.out.println(jsonNode.get("data").as);
  }

  public JsonNode readFile(String fileName) throws IOException {
    return objectMapper.readTree(new File(fileName));
  }
}
