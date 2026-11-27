package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PU {
    public static final /* synthetic */ PU[] d;

    /* JADX INFO: Fake field, exist only in values array */
    PU EF5;

    static {
        PU[] puArr = {new PU("ONE_ACTION", 0), new PU("PROMO_CODE", 1)};
        d = puArr;
        C1952Ru.i(puArr);
    }

    public static PU valueOf(String str) {
        return (PU) Enum.valueOf(PU.class, str);
    }

    public static PU[] values() {
        return (PU[]) d.clone();
    }
}
