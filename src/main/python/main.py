import Colors

Colors = Colors.Colors()
resetColor = "\u001b[0m"
print("Code: u001b[48;5;number m")
for j in range(0, 240):
    code = 1 * 16 + j
    Code = code.__str__()
    out = "\u001b[48;5;" + Code + "m" + " "
    jOut = 16 + j
    JOut = jOut.__str__()
    print(out + JOut + resetColor)
print("\n\n\n")
print("Code: u001b[number m")
for j in range(0, 92):
    code = 1 * 16 + j
    Code = code.__str__()
    out = "\u001b[" + Code + "m" + " "
    jOut = 16 + j
    JOut = jOut.__str__()
    print(out + JOut + resetColor)
