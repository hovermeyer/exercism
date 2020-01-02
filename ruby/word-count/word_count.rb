# Phrase takes a provided phrase and returns the count of each word
class Phrase
  def initialize(phrase)
    @words = phrase.scan(/\b\w+'\w+|\b\w+/).map(&:downcase)
  end

  def word_count
    counts = Hash.new(0)
    @words.each{|word|
      counts[word] += 1
    }
    counts
  end
end
