package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7428wa1 {
    public static final EnumC7428wa1 d;
    public static final EnumC7428wa1 e;
    public static final /* synthetic */ EnumC7428wa1[] g;

    static {
        EnumC7428wa1 enumC7428wa1 = new EnumC7428wa1("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        d = enumC7428wa1;
        EnumC7428wa1 enumC7428wa2 = new EnumC7428wa1("DROP_WORK_REQUEST", 1);
        e = enumC7428wa2;
        g = new EnumC7428wa1[]{enumC7428wa1, enumC7428wa2};
    }

    public EnumC7428wa1() {
        throw null;
    }

    public static EnumC7428wa1 valueOf(String str) {
        return (EnumC7428wa1) Enum.valueOf(EnumC7428wa1.class, str);
    }

    public static EnumC7428wa1[] values() {
        return (EnumC7428wa1[]) g.clone();
    }
}
