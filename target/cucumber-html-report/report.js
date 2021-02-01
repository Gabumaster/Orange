$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LonginOrange.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Login sistema OrangeHRM",
  "description": "Eu como usuário\r\nQuero reralizar login no sistema",
  "id": "login-sistema-orangehrm",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 2393297200,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "acessar o sistema",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que acesso a URL \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/index.php/auth/login",
      "offset": 18
    }
  ],
  "location": "LonginOrangeSteps.que_acesso_a_URL(String)"
});
formatter.result({
  "duration": 4343696500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "CT-01 - Login com sucesso",
  "description": "",
  "id": "login-sistema-orangehrm;ct-01---login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@CT-01"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "digitado \"admin\" no campo usuario, \"admin123\" no campo senha corretos",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clicar no botão \"LOGIN\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "a pagina realiza o login",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 10
    },
    {
      "val": "admin123",
      "offset": 36
    }
  ],
  "location": "LonginOrangeSteps.digitado_no_campo_usuario_no_campo_senha_corretos(String,String)"
});
formatter.result({
  "duration": 115824000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOGIN",
      "offset": 17
    }
  ],
  "location": "LonginOrangeSteps.clicar_no_botão(String)"
});
formatter.result({
  "duration": 2694876800,
  "status": "passed"
});
formatter.match({
  "location": "LonginOrangeSteps.a_pagina_realiza_o_login()"
});
formatter.result({
  "duration": 1354500,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat LonginOrange.LonginOrangeSteps.a_pagina_realiza_o_login(LonginOrangeSteps.java:40)\r\n\tat ✽.Entao a pagina realiza o login(LonginOrange.feature:13)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 683989300,
  "status": "passed"
});
});