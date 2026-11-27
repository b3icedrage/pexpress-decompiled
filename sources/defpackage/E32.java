package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E32 {
    public static final E32 d;
    public static final E32 e;
    public static final E32 g;
    public static final E32 h;
    public static final /* synthetic */ E32[] i;

    static {
        E32 e32 = new E32("AMOUNT", 0);
        d = e32;
        E32 e33 = new E32("PROFIT", 1);
        e = e33;
        E32 e34 = new E32("LOSS", 2);
        g = e34;
        E32 e35 = new E32("CLEAR", 3);
        h = e35;
        E32[] e32Arr = {e32, e33, e34, e35};
        i = e32Arr;
        C1952Ru.i(e32Arr);
    }

    public E32() {
        throw null;
    }

    public static E32 valueOf(String str) {
        return (E32) Enum.valueOf(E32.class, str);
    }

    public static E32[] values() {
        return (E32[]) i.clone();
    }
}
