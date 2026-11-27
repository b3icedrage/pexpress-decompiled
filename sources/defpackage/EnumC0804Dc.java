package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0804Dc {
    public static final EnumC0804Dc d;
    public static final EnumC0804Dc e;
    public static final EnumC0804Dc g;
    public static final EnumC0804Dc h;
    public static final /* synthetic */ EnumC0804Dc[] i;

    static {
        EnumC0804Dc enumC0804Dc = new EnumC0804Dc("FUNCTION", 0);
        d = enumC0804Dc;
        EnumC0804Dc enumC0804Dc2 = new EnumC0804Dc("PROPERTY", 1);
        e = enumC0804Dc2;
        EnumC0804Dc enumC0804Dc3 = new EnumC0804Dc("PROPERTY_GETTER", 2);
        g = enumC0804Dc3;
        EnumC0804Dc enumC0804Dc4 = new EnumC0804Dc("PROPERTY_SETTER", 3);
        h = enumC0804Dc4;
        i = new EnumC0804Dc[]{enumC0804Dc, enumC0804Dc2, enumC0804Dc3, enumC0804Dc4};
    }

    public EnumC0804Dc() {
        throw null;
    }

    public static EnumC0804Dc valueOf(String str) {
        return (EnumC0804Dc) Enum.valueOf(EnumC0804Dc.class, str);
    }

    public static EnumC0804Dc[] values() {
        return (EnumC0804Dc[]) i.clone();
    }
}
