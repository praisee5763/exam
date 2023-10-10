function reverseWords(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });
  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}


const inputSentence = "Hello World";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); 
