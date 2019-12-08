def is_isogram(entry_string):
    entry_string = entry_string.upper().replace(' ','').replace('-','')
    for letter in entry_string:
        if entry_string.count(letter)>1:
            return False
    return True
