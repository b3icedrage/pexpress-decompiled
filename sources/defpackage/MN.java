package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MN {
    public static final MN d;
    public static final MN e;
    public static final MN g;
    public static final /* synthetic */ MN[] h;

    static {
        MN mn = new MN("COROUTINE_SUSPENDED", 0);
        d = mn;
        MN mn2 = new MN("UNDECIDED", 1);
        e = mn2;
        MN mn3 = new MN("RESUMED", 2);
        g = mn3;
        MN[] mnArr = {mn, mn2, mn3};
        h = mnArr;
        C1952Ru.i(mnArr);
    }

    public MN() {
        throw null;
    }

    public static MN valueOf(String str) {
        return (MN) Enum.valueOf(MN.class, str);
    }

    public static MN[] values() {
        return (MN[]) h.clone();
    }
}
