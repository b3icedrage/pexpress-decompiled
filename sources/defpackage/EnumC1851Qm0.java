package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Qm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1851Qm0 {
    public static final EnumC1851Qm0 d;
    public static final EnumC1851Qm0 e;
    public static final /* synthetic */ EnumC1851Qm0[] g;

    static {
        EnumC1851Qm0 enumC1851Qm0 = new EnumC1851Qm0("LINEAR", 0);
        d = enumC1851Qm0;
        EnumC1851Qm0 enumC1851Qm1 = new EnumC1851Qm0("RADIAL", 1);
        e = enumC1851Qm1;
        g = new EnumC1851Qm0[]{enumC1851Qm0, enumC1851Qm1};
    }

    public EnumC1851Qm0() {
        throw null;
    }

    public static EnumC1851Qm0 valueOf(String str) {
        return (EnumC1851Qm0) Enum.valueOf(EnumC1851Qm0.class, str);
    }

    public static EnumC1851Qm0[] values() {
        return (EnumC1851Qm0[]) g.clone();
    }
}
