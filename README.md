
# 🎯 Random Destination Picker (Android App)

An Android application that picks a **random travel destination** with one click and instantly opens its **location on Google Maps** — designed to inspire **spontaneous adventures** and **exploration**!

## ✨ Features

- 🎲 **Pick a random destination** from a curated list  
- 🏞️ Displays **name & description** (e.g., “Famous for: Iconic landmark”)  
- 🗺️ **Opens exact location on Google Maps** using latitude & longitude  
- 📱 Clean & simple UI with just **two main buttons**

## 🚀 How It Works

| Screen | Action | Result |
|--------|--------|--------|
| Main Screen | Tap **Pick Destination** | Random place is displayed |
| Main Screen | Tap **Visit** | Opens Google Maps with that location |

## 📁 Project Structure

```
📦 RandomDestinationPicker
 ├── res/layout/
 │   ├── activity_main.xml       # Main screen UI
 │   └── activity_map.xml        # Map screen UI
 ├── java/com/example/mini46/
 │   ├── MainActivity.java       # Handles random pick + navigation
 │   └── MapActivity.java        # Loads Google Maps with WebView
 └── AndroidManifest.xml
```

## 🧠 Code Logic (Summary)

- A **2D array** stores destinations:  
  `{"Name", "Description", "Latitude", "Longitude"}`
- A random index is picked on button click
- Latitude & longitude are passed to `MapActivity`
- WebView loads:

```
https://www.google.com/maps/search/?api=1&query=<lat>,<long>
```

## 📸 Screenshots (Optional)

_Add screenshots here if you have them_

```
![Home Screen](screenshot1.png)
![Map View](screenshot2.png)
```

## 🛠️ Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Java |
| UI | XML Layouts |
| Platform | Android |
| Maps | Google Maps via WebView |

## 📌 Future Enhancements

- ⭐ Save favorite destinations  
- 🎚️ Filter by category or distance  
- 📤 Share destination with friends  

## 🤝 Contributing

Pull requests are welcome! Feel free to **add more locations** or expand features.

## 📄 License

This project is free to use and modify. Add a license here if needed.

---

Made with ❤️ for explorers!
