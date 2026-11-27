package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5238m71 {
    public static final EnumC5238m71 d;
    public static final EnumC5238m71 e;
    public static final EnumC5238m71 g;
    public static final /* synthetic */ EnumC5238m71[] h;

    static {
        EnumC5238m71 enumC5238m71 = new EnumC5238m71("FORCE_FLEXIBILITY", 0);
        d = enumC5238m71;
        EnumC5238m71 enumC5238m72 = new EnumC5238m71("NULLABLE", 1);
        e = enumC5238m72;
        EnumC5238m71 enumC5238m73 = new EnumC5238m71("NOT_NULL", 2);
        g = enumC5238m73;
        EnumC5238m71[] enumC5238m71Arr = {enumC5238m71, enumC5238m72, enumC5238m73};
        h = enumC5238m71Arr;
        C1952Ru.i(enumC5238m71Arr);
    }

    public EnumC5238m71() {
        throw null;
    }

    public static EnumC5238m71 valueOf(String str) {
        return (EnumC5238m71) Enum.valueOf(EnumC5238m71.class, str);
    }

    public static EnumC5238m71[] values() {
        return (EnumC5238m71[]) h.clone();
    }
}
