📱 Mobile Test Automation with Appium & TestNG

Bu repo, Appium ve TestNG kullanılarak oluşturulmuş mobil otomasyon örneklerini içerir.
Bu proje içinde farklı Android uygulamaları için hazırlanmış test senaryoları bulunmaktadır.

🧪 Proje: MobileTestAutomationWithAppiumAndTestNG

Bu proje, Android cihazlarda çalışan mobil uygulamaların otomasyonunu amaçlayan bir test projesidir.
Proje içinde; Kiwi, All Currency Converter, Arabam, ToDoList ve Hesap Makinesi gibi uygulamalar için hazırlanmış testler yer alır.

Bu otomasyon projesinde:
APK yükleme
Uygulama açma
Uygulama içi adımları test etme
Page Object Model yapısıyla locator ve aksiyon yönetimi
TestNG ile senaryo çalıştırma
Driver yönetimi
Konfigürasyon dosyası ile paket/activity bilgisi okuma
işlemleri yapılır.

📲 Test Senaryoları

day01
Hesap Makinesi otomasyonu

day02
Arabam uygulaması otomasyonu
ToDo List uygulaması otomasyonu

day03
Kiwi uçuş arama otomasyonu

day04
All Currency Converter otomasyonu

Diğer:
APK yükleme otomasyonu

🛠 Teknolojiler

Dil: Java
Framework: TestNG
Mobil Otomasyon: Appium
Bağımlılık Yönetimi: Maven
IDE: IntelliJ IDEA
Önerilen JDK: 11+

📁 Proje Dosya Yapısı
```MobileTestAutomationWithAppiumAndTestNG/
├─ Apps/                                 # Test edilen APK dosyaları
├─ src/
│  └─ test/
│     └─ java/
│        ├─ pages/                       # Page Object sınıfları
│        ├─ utilities/                   # Driver, ConfigReader, ReusableMethods
│        ├─ tests/
│        │   ├─ day01
│        │   ├─ day02
│        │   ├─ day03
│        │   └─ day04
│        └─ ApkYukleme.java              # APK yükleme testi
├─ configuration.properties               # App package/activity bilgileri
├─ pom.xml                                # Maven bağımlılık dosyası
└─ .gitignore
```

---

📱 Mobile Test Automation (EN)

This repository contains mobile automation examples written in Java using Appium and TestNG.
It includes automated test scenarios for several Android applications.

🧪 Project: MobileTestAutomationWithAppiumAndTestNG

This project is designed to automate mobile applications running on Android devices.
It includes test scenarios for apps such as Kiwi, All Currency Converter, Arabam, ToDoList, and Calculator.

The automation covers:
Installing APKs
Opening mobile applications
Executing in-app test steps
Using Page Object Model for structured element management
Running scenarios with TestNG
Managing driver lifecycle
Reading package/activity names from configuration

📲 Test Scenarios

day01 – Calculator automation
day02 – Arabam app automation, ToDo List automation
day03 – Kiwi flight search automation
day04 – All Currency Converter automation
Other – APK installation automation

🛠 Technologies

Language: Java
Framework: TestNG
Mobile Automation: Appium
Build Tool: Maven
IDE: IntelliJ IDEA
Recommended JDK: 11+

📁 Project Structure
```MobileTestAutomationWithAppiumAndTestNG/
├─ Apps/                                 # APK files under test
├─ src/
│  └─ test/
│     └─ java/
│        ├─ pages/                       # Page Object files
│        ├─ utilities/                   # Driver, ConfigReader, ReusableMethods
│        ├─ tests/
│        │   ├─ day01
│        │   ├─ day02
│        │   ├─ day03
│        │   └─ day04
│        └─ ApkYukleme.java              # APK installation test
├─ configuration.properties
├─ pom.xml
└─ .gitignore
```
