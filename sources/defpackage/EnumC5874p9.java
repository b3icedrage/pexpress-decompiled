package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5874p9 {
    public static final EnumC5874p9 d;
    public static final EnumC5874p9 e;
    public static final EnumC5874p9 g;
    public static final EnumC5874p9 h;
    public static final EnumC5874p9 i;
    public static final /* synthetic */ EnumC5874p9[] j;

    static {
        EnumC5874p9 enumC5874p9 = new EnumC5874p9("NOT_FOUND", 0);
        d = enumC5874p9;
        EnumC5874p9 enumC5874p10 = new EnumC5874p9("AS_BASIC_PROPERTY", 1);
        e = enumC5874p10;
        EnumC5874p9 enumC5874p11 = new EnumC5874p9("AS_COMPLEX_PROPERTY", 2);
        g = enumC5874p11;
        EnumC5874p9 enumC5874p12 = new EnumC5874p9("AS_BASIC_PROPERTY_COLLECTION", 3);
        h = enumC5874p12;
        EnumC5874p9 enumC5874p13 = new EnumC5874p9("AS_COMPLEX_PROPERTY_COLLECTION", 4);
        i = enumC5874p13;
        j = new EnumC5874p9[]{enumC5874p9, enumC5874p10, enumC5874p11, enumC5874p12, enumC5874p13};
    }

    public EnumC5874p9() {
        throw null;
    }

    public static EnumC5874p9 valueOf(String str) {
        return (EnumC5874p9) Enum.valueOf(EnumC5874p9.class, str);
    }

    public static EnumC5874p9[] values() {
        return (EnumC5874p9[]) j.clone();
    }
}
