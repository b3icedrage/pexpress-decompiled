package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W61 {
    public static final W61 d;
    public static final W61 e;
    public static final W61 g;
    public static final /* synthetic */ W61[] h;

    static {
        W61 w61 = new W61("ALL", 0);
        d = w61;
        W61 w62 = new W61("PARTIAL", 1);
        e = w62;
        W61 w63 = new W61("NONE", 2);
        g = w63;
        W61[] w61Arr = {w61, w62, w63};
        h = w61Arr;
        C1952Ru.i(w61Arr);
    }

    public W61() {
        throw null;
    }

    public static W61 valueOf(String str) {
        return (W61) Enum.valueOf(W61.class, str);
    }

    public static W61[] values() {
        return (W61[]) h.clone();
    }
}
