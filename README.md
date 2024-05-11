# AnsiPy
> ### *Created by Silent Sky*
---
### What is this?
AnsiPy is a library like repo mainly focused on making some behind stage functions like styling terminal text easier.

 :warning: **Warning:** I'm Norwegian, my English might be bad sometimes
 #### :memo:NOTE: Most terminals support Ansi, but not all, those who don't will return a error message.
 
> - - - > - - - > - - - >

<br>

### Features
#### ANSI colors
* ANSI colors. Usage:
```Kotlin
print(Colors.blue + "Hello, World!" + Colors.resetColor)
```

---

#### styledText
* styledText. Usege:
``` Kotlin
styledText("Hello, World!", Colors.blue)
```
  - Some problems with it geting long when using multiple attributes. <br>
  Like this:
``` Kotlin
styledText("Hello, World!", Colors.blue + Colors.backgroundCyan + Colors.bold + Colors.italic + Colors.underline)
```
<br>
And it lack the functionality of selecting where in the text the colors should apply

> - - - > - - -

<br>

### Stability
The condition is simply 🟩 for working as intended and easy to work with, <br>
🔶 for bit jancky or challenging to work with, but no high security risico, <br>
and 🔴 for broken, not working or hard to work with, and or high security risico.

| Feature | Stability | Condition |
| ----------- | :-----------: | :--: |
| styled_text() | Unstable | 🟩 / 🔶 |
| color_generator | Stable | 🟩 |
| throw_exception() | Unstable | 🟩 |

---

### Todo
- [ ] Refine styledText with better selection compatability and easier implementation of multiple color attributes.
- [ ] Refine the Colors class to be easier to use, and multiple pick using + or something.
- [ ] Make it a library. (Don't know how yet, I'll fix it when I need to)
- [ ] Started project
- [x] Add README.md
