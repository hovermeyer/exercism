=begin
  Class will take in a sentence and return an acroymn.
  All punctuation counts as a break in the word.
=end

class Acronym
  def self.abbreviate(full_word)
    full_word.scan(/\b\w/).join().upcase
  end
end
