package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A60 {
    public static final A60 d;
    public static final A60 e;
    public static final A60 g;
    public static final /* synthetic */ A60[] h;

    static {
        A60 a60 = new A60("SOURCE", 0);
        d = a60;
        A60 a61 = new A60("TRANSFORMED", 1);
        e = a61;
        A60 a62 = new A60("NONE", 2);
        g = a62;
        h = new A60[]{a60, a61, a62};
    }

    public A60() {
        throw null;
    }

    public static A60 valueOf(String str) {
        return (A60) Enum.valueOf(A60.class, str);
    }

    public static A60[] values() {
        return (A60[]) h.clone();
    }
}
