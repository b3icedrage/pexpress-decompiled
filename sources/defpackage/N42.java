package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class N42 {
    public static final N42 d;
    public static final N42 e;
    public static final N42 g;
    public static final N42 h;
    public static final /* synthetic */ N42[] i;

    static {
        N42 n42 = new N42("REGISTRATION", 0);
        d = n42;
        N42 n43 = new N42("LOGIN", 1);
        e = n43;
        N42 n44 = new N42("TRANSITIONING_TO_LOGIN", 2);
        g = n44;
        N42 n45 = new N42("TRANSITIONING_TO_REGISTRATION", 3);
        h = n45;
        N42[] n42Arr = {n42, n43, n44, n45};
        i = n42Arr;
        C1952Ru.i(n42Arr);
    }

    public N42() {
        throw null;
    }

    public static N42 valueOf(String str) {
        return (N42) Enum.valueOf(N42.class, str);
    }

    public static N42[] values() {
        return (N42[]) i.clone();
    }
}
