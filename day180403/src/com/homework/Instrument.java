package com.homework;

/*
악기를 연주하는 프로그램을 만들어 피아노, 플롯 등을연주하려고 한다. 추상클래스를 이용해 이를 구현하라.

1.  Instrument 클래스를추상 클래스로 정의한다.

2. play, volumeUp, volumeDown 메소드를 추상 메소드로 정의한다.

3.  Instrument 클래스를상속받는 Piano클래스와 Flute클래스를만든다.

4.  추상 메소드를 실제로구현한다(System.out.println( )을 이용해

                                                                간단한 메시지를 출력하도록 한다).

- 출력결과는 첨부파일과 같음

*/
public abstract class Instrument {
	
	abstract void play();
	abstract void volumeUp();
	abstract void volumeDown();
	

}
