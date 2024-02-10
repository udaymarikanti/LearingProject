package Marks;

public class Marks {
    Subject teluguSubject;
    Subject hindiSubject;
    Subject englishSubject;
    Subject mathsSubject;
    Subject scienceSubject;
    Subject socialSubject;

    public Marks(Subject teluguSubject,Subject hindiSubject,Subject englishSubject,Subject mathsSubject,Subject scienceSubject,Subject socialSubject){
        this.teluguSubject = teluguSubject;
        this.hindiSubject = hindiSubject;
        this.englishSubject = englishSubject;
        this.mathsSubject = mathsSubject;
        this.scienceSubject = scienceSubject;
        this.socialSubject = socialSubject;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "teluguSubject=" + teluguSubject +
                ", hindiSubject=" + hindiSubject +
                ", englishSubject=" + englishSubject +
                ", mathsSubject=" + mathsSubject +
                ", scienceSubject=" + scienceSubject +
                ", socialSubject=" + socialSubject +
                '}';
    }
}
