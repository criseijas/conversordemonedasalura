# 💱 Conversor de Monedas

Este es un proyecto en Java que implementa un conversor de monedas utilizando la API gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real.

## 🚀 Funcionalidades

- Conversión entre distintas monedas:
  - USD ↔ ARS (Peso argentino)
  - USD ↔ BRL (Real brasileño)
  - USD ↔ COP (Peso colombiano)
  - EUR (y otras monedas soportadas por la API)
  
- Consulta de tasas actualizadas desde ExchangeRate-API.
- Validación de entrada de usuario.
- Menú interactivo en consola.
- Historial opcional de conversiones (se puede activar).
- Guardado opcional de conversiones en archivo JSON.

## 🛠 Tecnologías utilizadas

- **Java 17+**
- **API ExchangeRate-API**
- **Gson** → Para parsear datos JSON a objetos Java.
- **HttpClient** → Para realizar solicitudes HTTP a la API.
- **Scanner** → Para lectura interactiva desde consola.

## ⚙️ Cómo usarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas.git
   cd conversor-monedas

## 📂 Estructura del proyecto   
src/
├── Principal.java
├── Menu.java
├── ConsultaMoneda.java
├── Conversor.java
├── Conversion.java (opcional, si guardás historial)
└── GeneradorDeArchivo.java (opcional, si guardás JSON)

## 📜 Licencia
Este proyecto es de uso libre con fines educativos.
