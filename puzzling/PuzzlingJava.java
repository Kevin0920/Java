import java.util.*;


public class PuzzlingJava {
    public ArrayList<Integer> sumAndGT(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int value : arr){
            sum += value;
            if (value > 10){
                newArr.add(value);
            }
        }
        System.out.println(sum);
        return newArr;
    }

    public ArrayList<String> shuffleAndGT(String[] arr){
        ArrayList<String> shortNameArr = new ArrayList<>();
        ArrayList<String> shuffled = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(shuffled);
        for (String name: arr){
            System.out.println(name);
            if (name.length() <= 5){
                shortNameArr.add(name);
            }
        }
        return shortNameArr;
    }

    public void shuffleDisplay(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] vowels = {"a", "e", "i", "o", "u"};
        ArrayList<String> shuffled = new ArrayList<>(Arrays.asList(alphabet));
        Collections.shuffle(shuffled);

        System.out.println(shuffled.get(shuffled.size() - 1));
        System.out.println(shuffled.get(0));
        if (Arrays.asList(vowels).contains(shuffled.get(0))){
            System.out.println("Yoooooooo! The first letter is a vowel!!");
        }
    }

    public ArrayList<Integer> randomTen(){
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            arr.add(random.nextInt(100 - 55) + 55);
        }
        return arr;
    }

    public void sortedRandomTen(){
        ArrayList<Integer> arr = randomTen();
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(9));
    }

    // helper function
    public static String randomStringHelper() {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> listAlphabet = new ArrayList<String>(Arrays.asList(alphabet));

		Random randomGenerator = new Random();
		String randomString = "";

		for(int i = 0; i < 5; i++) {
			randomString = randomString.concat(listAlphabet.get(randomGenerator.nextInt(listAlphabet.size())));
		}

		return randomString;
	}

	public String genRandomString() {
		return PuzzlingJava.randomStringHelper();
	}

	public ArrayList<String> tenRandString() {
		ArrayList<String> array = new ArrayList<String>();

		for(int i = 0; i < 10; i++){
			array.add(PuzzlingJava.randomStringHelper());
		}

		return array;
	}

}
