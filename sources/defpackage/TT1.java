package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TT1 {
    public static final TT1 d;
    public static final TT1 e;
    public static final /* synthetic */ TT1[] g;

    static {
        TT1 tt1 = new TT1("WIN", 0);
        d = tt1;
        TT1 tt2 = new TT1("LOSE", 1);
        e = tt2;
        TT1[] tt1Arr = {tt1, tt2};
        g = tt1Arr;
        C1952Ru.i(tt1Arr);
    }

    public TT1() {
        throw null;
    }

    public static TT1 valueOf(String str) {
        return (TT1) Enum.valueOf(TT1.class, str);
    }

    public static TT1[] values() {
        return (TT1[]) g.clone();
    }
}
