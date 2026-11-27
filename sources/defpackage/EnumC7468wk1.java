package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7468wk1 {
    public static final EnumC7468wk1 d;
    public static final EnumC7468wk1 e;
    public static final /* synthetic */ EnumC7468wk1[] g;

    static {
        EnumC7468wk1 enumC7468wk1 = new EnumC7468wk1("PROTO2", 0);
        d = enumC7468wk1;
        EnumC7468wk1 enumC7468wk2 = new EnumC7468wk1("PROTO3", 1);
        e = enumC7468wk2;
        g = new EnumC7468wk1[]{enumC7468wk1, enumC7468wk2};
    }

    public EnumC7468wk1() {
        throw null;
    }

    public static EnumC7468wk1 valueOf(String str) {
        return (EnumC7468wk1) Enum.valueOf(EnumC7468wk1.class, str);
    }

    public static EnumC7468wk1[] values() {
        return (EnumC7468wk1[]) g.clone();
    }
}
