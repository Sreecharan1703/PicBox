# PicBox: Google Drive & AI Image Gallery

**Preview the application:** [Watch the working preview on YouTube](https://www.google.com/search?q={ytlink})

## Overview

PicBox is a Spring Boot web application that integrates Google Drive storage with Google GenAI capabilities. Users can authenticate securely via Google, upload pictures to a dedicated "PicBox" folder in their Drive, browse their gallery, and utilize AI for advanced semantic searching and interactive visual quizzes.

## Key Features

* **Secure Authentication:** User login and session management powered by Google OAuth2.
* **Google Drive Integration:** Upload, view, search, and download files directly from a dedicated Google Drive folder.
* **AI-Powered Search:** Utilizes Gemini Ai to find images using broad semantic matching (e.g., searching "bird" retrieves images named "peacock" or "eagle").
* **Interactive Image Quizzes:** Generates unique quiz questions based on the visual content of selected images, allowing users to adjust the question difficulty level from 1 to 100.
* **Modern UI:** A clean, responsive frontend built using Thymeleaf templates.

## Tech Stack

* **Backend:** Java 17, Spring Boot 3.5.0
* **Security:** Spring Boot Starter Security, OAuth2 Client
* **AI Integration:** Spring AI (Google GenAI Starter)
* **Cloud API:** Google Drive API v3, Google Auth Library
* **Frontend:** Thymeleaf
* **Build Tool:** Maven

## How to run it on your device? ->

### Prerequisites

* Java 17 installed on your machine.
* A Google Cloud Project with the Google Drive API enabled and OAuth credentials configured.
* A Gemini API Key.

### Setup & Installation

1. **Configure Environment Variables:** The application requires a `secrets.env` file to manage sensitive credentials securely. Create this file in the root directory and add your keys:
```env
CLIENT_ID=your_google_client_id_here
CLIENT_SECRET=your_google_client_secret_here
GENAI_API_KEY=your_gemini_api_key_here

```


2. **Build the Project:** Use the provided Maven wrapper to build the application.
```bash
./mvnw clean install

```


3. **Run the Application:** Start the Spring Boot server.
```bash
./mvnw spring-boot:run

```


4. **Access the App:** Open your web browser and navigate to the application. You will be prompted to log in via Google to access the main dashboard.
