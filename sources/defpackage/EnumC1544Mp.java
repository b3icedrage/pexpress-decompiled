package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1544Mp {
    public static final EnumC1544Mp d;
    public static final EnumC1544Mp e;
    public static final /* synthetic */ EnumC1544Mp[] g;

    static {
        EnumC1544Mp enumC1544Mp = new EnumC1544Mp("EXPONENTIAL", 0);
        d = enumC1544Mp;
        EnumC1544Mp enumC1544Mp2 = new EnumC1544Mp("LINEAR", 1);
        e = enumC1544Mp2;
        g = new EnumC1544Mp[]{enumC1544Mp, enumC1544Mp2};
    }

    public EnumC1544Mp() {
        throw null;
    }

    public static EnumC1544Mp valueOf(String str) {
        return (EnumC1544Mp) Enum.valueOf(EnumC1544Mp.class, str);
    }

    public static EnumC1544Mp[] values() {
        return (EnumC1544Mp[]) g.clone();
    }
}
