using System;

class wish
{
    public static void Main()
    {
        string lang;
        Console.WriteLine("Enter Programming Language Name : ");
        lang = Console.ReadLine();
        Console.WriteLine("-----------------------{0}-------------------------", lang);
        switch (lang)
        {
            case "PHP":
                Console.WriteLine("PHP is a general-purpose scripting language geared towards web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994. The PHP reference implementation is now produced by The PHP Group.");
                break;

            case "Python":
                Console.WriteLine("Python is an interpreted high-level general-purpose programming language. Its design philosophy emphasizes code readability with its use of significant indentation.");
                break;

            case "C++":
                Console.WriteLine("C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or 'C with Classes'.");
                break;

            case "C#":
                Console.WriteLine("C# is a general-purpose, multi-paradigm programming language. C# encompasses static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented, and component-oriented programming disciplines.");
                break;

            case "Javascript":
                Console.WriteLine("JavaScript, often abbreviated JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. Over 97% of websites use JavaScript on the client side for web page behavior, often incorporating third-party libraries.");
                break;

            case "Java":
                Console.WriteLine("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
                break;

            default:
                Console.WriteLine("We will Update More Languages Soon.....");
                break;
        }
    }
}