package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: th1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6825th1 {
    public static final EnumC6825th1 d;
    public static final EnumC6825th1 e;
    public static final EnumC6825th1 g;
    public static final /* synthetic */ EnumC6825th1[] h;

    static {
        EnumC6825th1 enumC6825th1 = new EnumC6825th1("DEFAULT", 0);
        d = enumC6825th1;
        EnumC6825th1 enumC6825th2 = new EnumC6825th1("VERY_LOW", 1);
        e = enumC6825th2;
        EnumC6825th1 enumC6825th3 = new EnumC6825th1("HIGHEST", 2);
        g = enumC6825th3;
        h = new EnumC6825th1[]{enumC6825th1, enumC6825th2, enumC6825th3};
    }

    public EnumC6825th1() {
        throw null;
    }

    public static EnumC6825th1 valueOf(String str) {
        return (EnumC6825th1) Enum.valueOf(EnumC6825th1.class, str);
    }

    public static EnumC6825th1[] values() {
        return (EnumC6825th1[]) h.clone();
    }
}
