package com.kivitool.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.kivitool.kotlinlearning.models.LanguageItem

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView
    var items: ArrayList<LanguageItem> = ArrayList()
    var adapterView: com.kivitool.kotlinlearning.listview.ListView?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listview)

        items.add(LanguageItem("Java", "Java Is the Language of Possibilities. Java is powering the innovation behind our digital world. Harness this potential with Java resources for student coders...", "Java uses an automatic garbage collector to manage memory in the object lifecycle. The programmer determines when objects are created, and the Java runtime is responsible for recovering the memory once objects are no longer in use. Once no references to an object remain, the unreachable memory becomes eligible to be freed automatically by the garbage collector. Something similar to a memory leak may still occur if a programmer's code holds a reference to an object that is no longer needed, typically when objects that are no longer needed are stored in containers that are still in use. If methods for a non-existent object are called, a null pointer exception is thrown." +
                "One of the ideas behind Java's automatic memory management model is that programmers can be spared the burden of having to perform manual memory management. In some languages, memory for the creation of objects is implicitly allocated on the stack or explicitly allocated and deallocated from the heap. In the latter case, the responsibility of managing memory resides with the programmer. If the program does not deallocate an object, a memory leak occurs. If the program attempts to access or deallocate memory that has already been deallocated, the result is undefined and difficult to predict, and the program is likely to become unstable or crash. This can be partially remedied by the use of smart pointers, but these add overhead and complexity. Note that garbage collection does not prevent logical memory leaks, i.e. those where the memory is still referenced but never used.", R.drawable.java_logo))

        items.add(LanguageItem("Python", "Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.", "Python was conceived in the late 1980s by Guido van Rossum at Centrum Wiskunde & Informatica (CWI) in the Netherlands as a successor to ABC programming language, which was inspired by SETL, capable of exception handling and interfacing with the Amoeba operating system. Its implementation began in December 1989. Van Rossum shouldered sole responsibility for the project, as the lead developer, until 12 July 2018, when he announced his \"permanent vacation\" from his responsibilities as Python's " +
                "Benevolent Dictator For Life, a title the Python community bestowed upon him to reflect his long-term commitment as the project's chief decision-maker.[42] He now shares his leadership as a member of a five-person steering council. In January 2019, active Python core developers elected Brett Cannon, Nick Coghlan, Barry Warsaw, Carol Willing and Van Rossum to a five-member \"Steering Council\" to lead the project. Guido van Rossum has since then withdrawn his nomination for the 2020 Steering council"+ "Python 3.9.2 and 3.8.8 were expedited as all versions of Python (including 2.7) had security issues, leading to possible remote code execution and web cache poisoning.", R.drawable.python_logo))

        items.add(LanguageItem("Dart", "Dart is a programming language designed for client development, such as for the web and mobile apps. It is developed by Google and can also be used to build server and desktop applications...", "Dart was unveiled at the GOTO conference in Aarhus, Denmark, October 10–12, 2011 The project was founded by Lars Bak and Kasper Lund. Dart 1.0 was released on November 14, 2013. Dart 2.6 introduced a new extension, dart2native. The feature extends native compilation to the Linux, macOS, and Windows desktop platforms. Earlier developers were able to create new tools only using Android or iOS devices. Moreover, with this extension it becomes possible to compose a Dart program into self-contained executables. Thus, according to the company representatives, it’s not obligatory now to have Dart SDK installed, " +
                "the self-contained executables can now start running in a few seconds. The new extension is also integrated with Flutter toolkit, thus making it possible to use the compiler on small services (backend supporting for example).", R.drawable.dart_logo))

        items.add(LanguageItem("Kotlin", "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library...", "Development lead Andrey Breslav has said that Kotlin is designed to be an industrial-strength object-oriented language, and a \"better language\" than Java, but still be fully interoperable with Java code, allowing companies to make a gradual migration from Java to Kotlin." +
                "Semicolons are optional as a statement terminator; in most cases a newline is sufficient for the compiler to deduce that the statement has ended." +
                "Kotlin variable declarations and parameter lists have the data type come after the variable name (and with a colon separator), similar to BASIC, Pascal and TypeScript." +
                "Variables in Kotlin can be read-only, declared with the val keyword, or mutable, declared with the var keyword." +
                "Class members are public by default, and classes themselves are final by default, meaning that creating a derived class is disabled unless the base class is declared with the open keyword.", R.drawable.kotlin_logo))

        items.add(LanguageItem("C#", "C# (pronounced see sharp, like the musical note C♯, but written with the number sign)[b] is a general-purpose, multi-paradigm programming language encompassing static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.",
            "During the development of the .NET Framework, the class libraries were originally written using a managed code compiler system called \"Simple Managed C\" (SMC). In January 1999, Anders Hejlsberg formed a team to build a new language at the time called Cool, which stood for \"C-like Object Oriented Language\". Microsoft had considered keeping the name \"Cool\" as the final name of the language, but chose not to do so for trademark reasons. By the time the .NET project was publicly announced at the July 2000 Professional Developers Conference, the language had been renamed C#, and the class libraries and ASP.NET runtime had been ported to C#.", R.drawable.csharp_logo))

        items.add(LanguageItem("Swift", "Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. and the open-source community, first released in 2014. Swift was developed as a replacement for Apple's earlier programming language Objective-C, as Objective-C had been largely unchanged since the early 1980s and lacked modern language features...",
            "Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. and the open-source community, first released in 2014. Swift was developed as a replacement for Apple's earlier programming language Objective-C, as Objective-C had been largely unchanged since the early 1980s and lacked modern language features. Swift works with Apple's Cocoa and Cocoa Touch frameworks, and a key aspect of Swift's design was the ability to interoperate with the huge body of existing Objective-C code developed for Apple products over the previous decades. It is built with the open source LLVM compiler framework and has been included in Xcode since version 6, released in 2014. On Apple platforms, it uses the Objective-C runtime library which allows C, Objective-C, C++ and Swift code to run within one program.", R.drawable.swift_logo))

        items.add(LanguageItem("JavaScript", "JavaScript (/ˈdʒɑːvəˌskrɪpt/), often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions...",
            "JavaScript (/ˈdʒɑːvəˌskrɪpt/), often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions." +
                    "Alongside HTML and CSS, JavaScript is one of the core technologies of the World Wide Web. Over 97% of websites use it client-side for web page behavior, often incorporating third-party libraries. All major web browsers have a dedicated JavaScript engine to execute the code on the user's device." +
                    "As a multi-paradigm language, JavaScript supports event-driven, functional, and imperative programming styles. It has application programming interfaces (APIs) for working with text, dates, regular expressions, standard data structures, and the Document Object Model (DOM).", R.drawable.javas_logo))

        adapterView = com.kivitool.kotlinlearning.listview.ListView(this, items)

        listView.adapter = adapterView

    }

}