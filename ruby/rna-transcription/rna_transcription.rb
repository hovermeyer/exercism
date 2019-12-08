=begin
When provided a DNA string, return the RNA complement
=end

class Complement
  #create immutable constants for DNA and the RNA complement
  DNA = "GCAT".freeze
  RNA = "CGUA".freeze

  def self.of_dna(dna_strand)
    #tr will make character replacements of the DNA string with the RNA string
    dna_strand.tr(DNA,RNA)
  end
end
