
def recite(start_verse, end_verse):
    by_day =["twelve Drummers Drumming, ",
        "eleven Pipers Piping, ",
        "ten Lords-a-Leaping, ",
        "nine Ladies Dancing, ",
        "eight Maids-a-Milking, ",
        "seven Swans-a-Swimming, ",
        "six Geese-a-Laying, ",
        "five Gold Rings, ",
        "four Calling Birds, ",
        "three French Hens, ",
        "two Turtle Doves, ",
        "and a Partridge in a Pear Tree."]
    name_day = ["first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"]

    full_song = []
    for i in range(start_verse, end_verse+1):
        if i == 1:
            full_song.append("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.")
        else:
            current_day = "".join(by_day[-i:])
            full_song.append(f"On the {name_day[i-1]} day of Christmas my true love gave to me: {current_day}")
    return full_song
