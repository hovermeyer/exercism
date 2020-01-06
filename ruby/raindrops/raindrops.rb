# Converts to raindrop language
class Raindrops
  def self.convert(number)
    conversion = { 3 => 'Pling', 5 => 'Plang', 7 => 'Plong' }
    raindrops = ''
    conversion.each{ |factor, word|
      raindrops += word if (number % factor) == 0
    }
    raindrops = number.to_s if raindrops == ''
    raindrops
  end
end
