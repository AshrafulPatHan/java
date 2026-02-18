# 📘 Java অ্যাপকে JAR ফাইলে কনভার্ট করার ডকুমেন্টেশন (বাংলা)

## ১. **প্রয়োজনীয় জিনিসপত্র**

1. **Java Development Kit (JDK)** ইনস্টল থাকতে হবে।

   * কমান্ড দিয়ে চেক করতে:

     ```bash
     java -version
     javac -version
     ```
2. তোমার Java অ্যাপের `.java` ফাইল (যার মধ্যে `main()` method আছে)।

---

## ২. **Java ফাইল কম্পাইল করা**

Terminal বা Command Prompt খুলে, যেখানে `.java` ফাইল আছে সেখানে:

```bash
javac CountApp.java
```

* এই কমান্ডের পরে `.class` ফাইল তৈরি হবে, যেমন:

  ```
  CountApp.class
  CountApp$1.class  (যদি কোনো anonymous inner class থাকে)
  ```

---

## ৩. **Manifest ফাইল তৈরি করা**

JAR ফাইলকে বলতে হবে কোন ক্লাসের **main() method** রান করবে।

**manifest.txt** নামে একটি ফাইল তৈরি করো এবং লিখো:

```
Main-Class: CountApp

```

⚠ **ফাঁকা লাইন অবশ্যই শেষে রাখতে হবে।**

---

## ৪. **JAR ফাইল তৈরি করা**

Terminal/Command Prompt থেকে:

```bash
jar cfm CountApp.jar manifest.txt *.class
```

* `c` → create
* `f` → file name specify
* `m` → include manifest
* `*.class` → সব class ফাইল অন্তর্ভুক্ত করবে

✅ এতে তৈরি হবে **CountApp.jar**

---

## ৫. **JAR ফাইল চালানো**

### Windows / Linux / macOS

```bash
java -jar CountApp.jar
```

* নিশ্চিত হও Java system-এ installed আছে।

### ডাবল ক্লিক (GUI অ্যাপ হলে)

* Windows: double-click করলে রান হবে
* Linux/macOS: executable করতে হবে

  ```bash
  chmod +x CountApp.jar
  ```

---

## ৬. **সাধারণ সমস্যা এবং সমাধান**

| সমস্যা                              | কারণ                  | সমাধান                                                                   |
| ----------------------------------- | --------------------- | ------------------------------------------------------------------------ |
| `no main manifest attribute`        | Main-Class ঠিকমতো নেই | manifest.txt চেক করো, ফাঁকা লাইন আছে কি নিশ্চিত হও                       |
| `Could not find or load main class` | Class name mismatch   | manifest.txt-এ Main-Class ঠিক লিখেছো কি এবং case-sensitive মিলছে কি দেখো |
| Button/Label দেখাচ্ছে না            | Layout সমস্যা         | JFrame.setLayout(new FlowLayout()) বা BorderLayout ব্যবহার করো           |

---

## ৭. **Optional: Standalone App (Java না থাকলেও চলবে)**

Java 14+ থেকে **jpackage** ব্যবহার করে native apps বানানো যায়:

### Windows:

```bash
jpackage --input . --name CountApp --main-jar CountApp.jar --main-class CountApp
```

### Linux / macOS:

```bash
jpackage --input . --name CountApp --main-jar CountApp.jar --main-class CountApp
```

* এতে exe / deb / dmg / app বানানো যায়

---

## ৮. **সারসংক্ষেপ**

1. `.java` ফাইল কম্পাইল করো → `.class`
2. manifest.txt বানাও (Main-Class)
3. `jar cfm` দিয়ে JAR বানাও
4. `java -jar` দিয়ে চালাও

এভাবে তোমার **Java GUI বা Console অ্যাপ JAR ফাইলে রূপান্তরিত হবে** এবং Windows, Linux, macOS-এ চলবে।


