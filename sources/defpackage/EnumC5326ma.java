package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5326ma {
    public static final EnumC5326ma d;
    public static final EnumC5326ma e;
    public static final EnumC5326ma g;
    public static final /* synthetic */ EnumC5326ma[] h;
    public static final /* synthetic */ C4814k70 i;

    static {
        EnumC5326ma enumC5326ma = new EnumC5326ma("MIXPANEL", 0);
        d = enumC5326ma;
        EnumC5326ma enumC5326ma2 = new EnumC5326ma("AMPLITUDE", 1);
        e = enumC5326ma2;
        EnumC5326ma enumC5326ma3 = new EnumC5326ma("OurAnalytics", 2);
        g = enumC5326ma3;
        EnumC5326ma[] enumC5326maArr = {enumC5326ma, enumC5326ma2, enumC5326ma3};
        h = enumC5326maArr;
        i = C1952Ru.i(enumC5326maArr);
    }

    public EnumC5326ma() {
        throw null;
    }

    public static EnumC5326ma valueOf(String str) {
        return (EnumC5326ma) Enum.valueOf(EnumC5326ma.class, str);
    }

    public static EnumC5326ma[] values() {
        return (EnumC5326ma[]) h.clone();
    }
}
