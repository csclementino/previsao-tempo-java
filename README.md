
# 🌤️ Previsão do Tempo - Java

Este é um projeto simples e didático em Java que permite ao usuário consultar a **previsão do tempo** para qualquer cidade do mundo, utilizando a **API OpenWeatherMap**. A aplicação coleta o nome da cidade e o país através de uma interface com `JOptionPane` e retorna as informações meteorológicas diretamente no console.

---

## 📌 Funcionalidades

- Busca de clima atual para **qualquer cidade do mundo**
- Exibe:
  - Nome da cidade e país
  - Temperatura atual
  - Temperatura mínima e máxima
  - Umidade
  - Descrição do clima
  - Ícone representativo do tempo (formato textual)

---

## 🧰 Tecnologias utilizadas

- **Java SE** (JDK 8+)
- **JOptionPane** (para interação gráfica com o usuário)
- **OpenWeatherMap API** (para busca de dados meteorológicos)
- **Gson / Jackson (ou outra lib JSON)** – para parseamento do JSON (dependendo da implementação na classe `ClimaService`)
- **Bibliotecas HTTP** como `HttpURLConnection` ou `HttpClient` – para comunicação com a API

---

## 📷 Exemplo de uso

Ao rodar o programa, o usuário verá duas janelas solicitando:

1. A cidade
2. O país (em formato de **código ISO**, por exemplo: `BR`, `US`, `FR`)

A saída será algo como:

```
🌤️ PREVISÃO DO TEMPO 🌤️

📍 Cidade: São Paulo  
🌎 País: BR  
🌡️ Temperatura: 28°C  
📉 Mínima: 24°C  
📈 Máxima: 31°C  
💧 Umidade: 70%  
☁️ Condições do tempo:  
   ➤ CÉU LIMPO ☀️
```


