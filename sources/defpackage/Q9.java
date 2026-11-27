package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Q9 {
    public static final Q9 d;
    public static final /* synthetic */ Q9[] e;

    /* JADX INFO: Fake field, exist only in values array */
    Q9 EF0;

    static {
        Q9 q9 = new Q9("AM", 0);
        Q9 q10 = new Q9("PM", 1);
        d = q10;
        Q9[] q9Arr = {q9, q10};
        e = q9Arr;
        C1952Ru.i(q9Arr);
    }

    public Q9() {
        throw null;
    }

    public static Q9 valueOf(String str) {
        return (Q9) Enum.valueOf(Q9.class, str);
    }

    public static Q9[] values() {
        return (Q9[]) e.clone();
    }
}
