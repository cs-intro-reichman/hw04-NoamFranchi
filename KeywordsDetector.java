public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            // keep the original sentence for printing, use lowercase for comparison
            String sentenceOriginal = sentences[i];
            String sentenceLower = sentenceOriginal.toLowerCase();
            for (int j = 0; j < keywords.length; j++) {
                String keywordLower = keywords[j].toLowerCase();
                if (MyString.contains(sentenceLower, keywordLower)) {
                    System.out.println(sentenceOriginal);
                    // print each sentence only once
                    break;
                }
            }
        }

    }

    /**
     * Utility instance method used by unit tests: returns true if the given token
     * is a (programming) keyword. This implementation uses a small list of common
     * Java keywords for the tests (case-insensitive). Empty or null input -> false.
     */
    public boolean isKeyword(String token) {
        if (token == null || token.length() == 0) return false;
        String t = token.toLowerCase();
        String[] kw = {"public", "class", "static", "void", "int", "boolean", "if", "else", "for", "while"};
        for (String k : kw) {
            if (k.equals(t)) return true;
        }
        return false;
    }
}
