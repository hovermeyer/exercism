# Checks to see if a word or phrase has any repeated letters
class Isogram
  def self.isogram?(phrase)
    !phrase.downcase.match(/(\w).*\1/)
  end
end
