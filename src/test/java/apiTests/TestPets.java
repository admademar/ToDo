package apiTests;


import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestPets {

    // Padão
    // Given = Dado
    // .When = Quando
    // .Then = Então

    // Funções para Apoio
    // Precisamos Pegar/Ler o Arquivo/Json (jsonBody)
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }


    @Test       // Create - Post
    public void incluirPet() throws IOException {
        String jsonBody = lerJson("src/test/resources/data/pet.json");


        given()                                  // - Dado
                .contentType("application/json")  // - Tipo do Conteúdo neste Caso
                               // "application/json" para web services assincronos
                .log().all()                     // - Resgistrar esse Envio
                .body(jsonBody)

        .when()                                  // - Quando
                                                 // Cadastrar um Novo Pet
                .post("https://petstore.swagger.io/v2/pet")
                                                 // Comando + endpoint

                                                 // - Então
        .then()
                .log().all()                     // Preciso Registrar o que volta
                .statusCode(200)  // Valida o Status Code nativo
                //.body("code", is(200))         // Valida o estado no Json/
                .body("id", is(2099))  // Validar o ID do Pet
                .body("name", is("nynna"))
                .body("category.name", is("dog"))  //Validar a categoria do Pet
                .body("tags.name", contains("Animal vermifugado e com todas as vacinas em dia")) // Validar o "vermifugado"
                //.body("tags.name", contains("vacinas em dia"))

        ;

    }
    @Test
    public void consultarPet(){
        String petId = "2099"; // Id do Pet

        given()
                .contentType("application/json")
                .log().all()
        .when()
                .get("https://petstore.swagger.io/v2/pet/" +petId)// Get == Consultar
        .then()
                .log().all()
                .statusCode(200)
                .body("name", is("nynna"))
                .body("status", is("available"))
        ;

    }

}
