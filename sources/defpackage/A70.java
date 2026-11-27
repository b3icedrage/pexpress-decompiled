package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class A70 {
    public static final /* synthetic */ A70[] d;

    /* JADX INFO: Fake field, exist only in values array */
    A70 EF5;

    static {
        A70[] a70Arr = {new A70("ERROR_CLASS", 0), new A70("ERROR_FUNCTION", 1), new A70("ERROR_SCOPE", 2), new A70("ERROR_MODULE", 3), new A70("ERROR_PROPERTY", 4), new A70("ERROR_TYPE", 5), new A70("PARENT_OF_ERROR_SCOPE", 6)};
        d = a70Arr;
        C1952Ru.i(a70Arr);
    }

    public static A70 valueOf(String str) {
        return (A70) Enum.valueOf(A70.class, str);
    }

    public static A70[] values() {
        return (A70[]) d.clone();
    }
}
