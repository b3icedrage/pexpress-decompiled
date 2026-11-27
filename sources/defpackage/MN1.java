package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MN1 {
    public static final MN1 d;
    public static final MN1 e;
    public static final MN1 g;
    public static final /* synthetic */ MN1[] h;

    static {
        MN1 mn1 = new MN1("NOT_READY", 0);
        d = mn1;
        MN1 mn2 = new MN1("READY", 1);
        e = mn2;
        MN1 mn3 = new MN1("FAILED", 2);
        g = mn3;
        MN1[] mn1Arr = {mn1, mn2, mn3};
        h = mn1Arr;
        C1952Ru.i(mn1Arr);
    }

    public MN1() {
        throw null;
    }

    public static MN1 valueOf(String str) {
        return (MN1) Enum.valueOf(MN1.class, str);
    }

    public static MN1[] values() {
        return (MN1[]) h.clone();
    }
}
