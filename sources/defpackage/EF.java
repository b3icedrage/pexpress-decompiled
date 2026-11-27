package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EF {
    public static final /* synthetic */ EF[] d;

    /* JADX INFO: Fake field, exist only in values array */
    EF EF5;

    static {
        EF[] efArr = {new EF("TURBO", 0), new EF("BINARY", 1), new EF("DIGITAL", 2)};
        d = efArr;
        C1952Ru.i(efArr);
    }

    public EF() {
        throw null;
    }

    public static EF valueOf(String str) {
        return (EF) Enum.valueOf(EF.class, str);
    }

    public static EF[] values() {
        return (EF[]) d.clone();
    }
}
