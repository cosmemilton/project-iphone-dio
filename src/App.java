
public class App {
    public static void main(String[] args) throws Exception {
        MusicPlay musicPlay = new MusicPlay();
        musicPlay.play();
        musicPlay.pause();
        musicPlay.selectMusic();
        TelephoneHandset telephoneHandset = new TelephoneHandset();
        telephoneHandset.call();
        telephoneHandset.answer();
        telephoneHandset.startVoiceMail();
        Browser browser = new Browser();
        browser.showPage();
        browser.addNewTab();
        browser.updatePage();
    }
}
