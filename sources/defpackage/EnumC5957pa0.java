package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5957pa0 {
    public static final EnumC5957pa0 d;
    public static final EnumC5957pa0 e;
    public static final EnumC5957pa0 g;
    public static final EnumC5957pa0 h;
    public static final /* synthetic */ EnumC5957pa0[] i;

    static {
        EnumC5957pa0 enumC5957pa0 = new EnumC5957pa0("REPLACE", 0);
        d = enumC5957pa0;
        EnumC5957pa0 enumC5957pa1 = new EnumC5957pa0("KEEP", 1);
        e = enumC5957pa1;
        EnumC5957pa0 enumC5957pa2 = new EnumC5957pa0("APPEND", 2);
        g = enumC5957pa2;
        EnumC5957pa0 enumC5957pa3 = new EnumC5957pa0("APPEND_OR_REPLACE", 3);
        h = enumC5957pa3;
        i = new EnumC5957pa0[]{enumC5957pa0, enumC5957pa1, enumC5957pa2, enumC5957pa3};
    }

    public EnumC5957pa0() {
        throw null;
    }

    public static EnumC5957pa0 valueOf(String str) {
        return (EnumC5957pa0) Enum.valueOf(EnumC5957pa0.class, str);
    }

    public static EnumC5957pa0[] values() {
        return (EnumC5957pa0[]) i.clone();
    }
}
