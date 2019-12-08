import string
def count_words(sentence):
    words = sentence.replace(string.punctuation, "")

    words = [word.lower() for word in words]
    for word in set(words):
        print(word)
    pass
