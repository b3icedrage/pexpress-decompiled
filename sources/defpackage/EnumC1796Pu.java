package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1796Pu {
    public static final EnumC1796Pu d;
    public static final EnumC1796Pu e;
    public static final EnumC1796Pu g;
    public static final /* synthetic */ EnumC1796Pu[] h;

    static {
        EnumC1796Pu enumC1796Pu = new EnumC1796Pu("SUSPEND", 0);
        d = enumC1796Pu;
        EnumC1796Pu enumC1796Pu2 = new EnumC1796Pu("DROP_OLDEST", 1);
        e = enumC1796Pu2;
        EnumC1796Pu enumC1796Pu3 = new EnumC1796Pu("DROP_LATEST", 2);
        g = enumC1796Pu3;
        EnumC1796Pu[] enumC1796PuArr = {enumC1796Pu, enumC1796Pu2, enumC1796Pu3};
        h = enumC1796PuArr;
        C1952Ru.i(enumC1796PuArr);
    }

    public EnumC1796Pu() {
        throw null;
    }

    public static EnumC1796Pu valueOf(String str) {
        return (EnumC1796Pu) Enum.valueOf(EnumC1796Pu.class, str);
    }

    public static EnumC1796Pu[] values() {
        return (EnumC1796Pu[]) h.clone();
    }
}
