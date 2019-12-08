def convert(number):
    #adjusted for a list comprehension.
    speak = [s for f, s in [(3, 'Pling'),(5,'Plang'),(7,"Plong")] if number % f ==0]
    return "".join(speak) or str(number)
    
