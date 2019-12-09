=begin
Given a setence, confirm if it has all 26 letters of the alphabet in it
=end

class Pangram

  def self.pangram?(sentence)
    sentence.downcase.scan(/[a-z]/).uniq().length == 26
  end

end
