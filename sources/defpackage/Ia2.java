package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Ia2 {
    public static final Ia2 d;
    public static final Ia2 e;
    public static final /* synthetic */ Ia2[] g;

    static {
        Ia2 ia2 = new Ia2("COMPLETED", 0);
        d = ia2;
        Ia2 ia3 = new Ia2("THREW", 1);
        e = ia3;
        Ia2[] ia2Arr = {ia2, ia3};
        g = ia2Arr;
        C1952Ru.i(ia2Arr);
    }

    public Ia2() {
        throw null;
    }

    public static Ia2 valueOf(String str) {
        return (Ia2) Enum.valueOf(Ia2.class, str);
    }

    public static Ia2[] values() {
        return (Ia2[]) g.clone();
    }
}
