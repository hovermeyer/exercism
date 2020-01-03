# Calculates the hamming distance between two equal sized strings. 
class Hamming
  def self.compute(string1, string2)
    if string1.length != string2.length
      raise ArgumentError, 'Strings must be same size'
    end

    string1.chars.zip(string2.chars).reject { |row| row[0] == row[1] }.length
  end
end
