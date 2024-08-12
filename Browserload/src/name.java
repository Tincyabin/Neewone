Element Locators
Locator is an address that identifies a web element uniquely with in the web page. Locators tell
selenium ide which GUI elements its need to operate on.[eg of GUI elements are textbox,
buittons, checkbox etc.
ID
Syntax:-id=id of the element
Eg:-id=identifierId(gmail email id textbox)
Name
Syntax:-name=name of the element
Eg:-name= identifier(gmail email id textbox)
Linktext
Syntax:-link=link text of the element
Eg:-link= Help (help link in gmail login page)
Classname
Syntax:-class=class name of the element
Eg:-class= RveJvd snByac (gmail email id next button)
Xpath
Xpath can be created in two ways:
1. Relative Xpath
Relative Xpath begins from the current location and is prefixed with a “//”.
Syntax:- xpath=//*[@attributename=’value of attribute’]
For example: //span[@class=’Email’]
Relative Xpath: A relative xpath is one where the path starts from the node of your
choise – it doesn’t need to start from the root node.
This is more like starting simply by referencing the element you want and go from the
particular location.
You use always the Relative Path for testing of an element. The reason behind that is if
you make any architectural change in the website the change won't effect the testing or
selecting of the element.
2. Absolute Xpath
Absolute Xpath begins with a root path and is prefixed with a “/”.
Syntax:- xpath = //html/body/div/div/……
For example: /HTML/body/div/div[@id=’Email’]
Absolute Xpath: It contains the complete path from the Root Element to the desire element