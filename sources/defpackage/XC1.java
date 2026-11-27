package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class XC1 {
    public static final XC1 d;
    public static final XC1 e;
    public static final /* synthetic */ XC1[] g;

    static {
        XC1 xc1 = new XC1("FILL", 0);
        d = xc1;
        XC1 xc2 = new XC1("FIT", 1);
        e = xc2;
        g = new XC1[]{xc1, xc2};
    }

    public XC1() {
        throw null;
    }

    public static XC1 valueOf(String str) {
        return (XC1) Enum.valueOf(XC1.class, str);
    }

    public static XC1[] values() {
        return (XC1[]) g.clone();
    }
}
