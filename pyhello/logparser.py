if __name__ == "__main__":
    f = open("/Users/Geonu/Desktop/logdata/20180824/ap1.daouoffice.com_access_2018-08-24.txt", "r")
    buffer = f.readline()
    bracket = "\0"
    field = list()
    start = 0
    end = 0
    print(buffer)
    for i in range(len(buffer)):
        char = buffer[i]
        if char == " ":
            if bracket == "\0":
                end = i
                field.append(buffer[start:end])
                start = i+1
        elif char == "[":
            bracket = char
        elif char == "]":
            bracket = "\0"
        elif char == "\"":
            if bracket == "\0":
                bracket = char
            elif bracket == "\"":
                bracket = "\0"
        elif char == "\n":
            field.append(buffer[start:i])
            break
    print(field)
    f.close()