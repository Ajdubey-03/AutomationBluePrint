package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public interface TVRemote {
	void volUp();
	void volDown();
	void changeChanel();
	void prevChanel();
	default boolean range(int distance) {
		if(distance>=0 && distance<=10) 
		{
			return true;
		}else 
		{
			return false;
		}
	}

}
