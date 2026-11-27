package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OP0 {
    public static final /* synthetic */ OP0[] d;

    /* JADX INFO: Fake field, exist only in values array */
    OP0 EF5;

    static {
        OP0[] op0Arr = {new OP0("SOURCE", 0), new OP0("BINARY", 1)};
        d = op0Arr;
        C1952Ru.i(op0Arr);
    }

    public OP0() {
        throw null;
    }

    public static OP0 valueOf(String str) {
        return (OP0) Enum.valueOf(OP0.class, str);
    }

    public static OP0[] values() {
        return (OP0[]) d.clone();
    }
}
