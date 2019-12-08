=begin
ResistorColorDuo allows you to determine the value of a resistor from the colored bands.
=end

class ResistorColorDuo

  COLORS = ["black", "brown", "red","orange","yellow", "green", "blue","violet","grey","white"]

  def self.value(colors)
    #the first color is the tens digit, the second is the ones digit.  All additional colors will be ignored
    COLORS.index(colors[0]) * 10 + COLORS.index(colors[1])
  end
end
