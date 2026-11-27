package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class S11 {
    public static final S11 d;
    public static final S11 e;
    public static final /* synthetic */ S11[] g;

    static {
        S11 s11 = new S11("READ_ONLY", 0);
        d = s11;
        S11 s12 = new S11("MUTABLE", 1);
        e = s12;
        S11[] s11Arr = {s11, s12};
        g = s11Arr;
        C1952Ru.i(s11Arr);
    }

    public S11() {
        throw null;
    }

    public static S11 valueOf(String str) {
        return (S11) Enum.valueOf(S11.class, str);
    }

    public static S11[] values() {
        return (S11[]) g.clone();
    }
}
