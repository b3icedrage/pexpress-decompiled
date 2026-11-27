package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6357rU {
    public static final EnumC6357rU d;
    public static final EnumC6357rU e;
    public static final EnumC6357rU g;
    public static final /* synthetic */ EnumC6357rU[] h;

    static {
        EnumC6357rU enumC6357rU = new EnumC6357rU("PREFER_ARGB_8888", 0);
        d = enumC6357rU;
        EnumC6357rU enumC6357rU2 = new EnumC6357rU("PREFER_RGB_565", 1);
        e = enumC6357rU2;
        h = new EnumC6357rU[]{enumC6357rU, enumC6357rU2};
        g = enumC6357rU;
    }

    public EnumC6357rU() {
        throw null;
    }

    public static EnumC6357rU valueOf(String str) {
        return (EnumC6357rU) Enum.valueOf(EnumC6357rU.class, str);
    }

    public static EnumC6357rU[] values() {
        return (EnumC6357rU[]) h.clone();
    }
}
