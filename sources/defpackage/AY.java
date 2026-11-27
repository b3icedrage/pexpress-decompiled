package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AY {
    public static final AY d;
    public static final /* synthetic */ AY[] e;

    /* JADX INFO: Fake field, exist only in values array */
    AY EF0;

    static {
        AY ay = new AY("WARNING", 0);
        AY ay2 = new AY("ERROR", 1);
        d = ay2;
        AY[] ayArr = {ay, ay2, new AY("HIDDEN", 2)};
        e = ayArr;
        C1952Ru.i(ayArr);
    }

    public AY() {
        throw null;
    }

    public static AY valueOf(String str) {
        return (AY) Enum.valueOf(AY.class, str);
    }

    public static AY[] values() {
        return (AY[]) e.clone();
    }
}
