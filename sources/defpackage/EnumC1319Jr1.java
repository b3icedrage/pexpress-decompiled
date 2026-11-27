package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Jr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1319Jr1 {
    public static final EnumC1319Jr1 d;
    public static final EnumC1319Jr1 e;
    public static final EnumC1319Jr1 g;
    public static final /* synthetic */ EnumC1319Jr1[] h;

    static {
        EnumC1319Jr1 enumC1319Jr1 = new EnumC1319Jr1("AUTOMATIC", 0);
        d = enumC1319Jr1;
        EnumC1319Jr1 enumC1319Jr2 = new EnumC1319Jr1("HARDWARE", 1);
        e = enumC1319Jr2;
        EnumC1319Jr1 enumC1319Jr3 = new EnumC1319Jr1("SOFTWARE", 2);
        g = enumC1319Jr3;
        h = new EnumC1319Jr1[]{enumC1319Jr1, enumC1319Jr2, enumC1319Jr3};
    }

    public EnumC1319Jr1() {
        throw null;
    }

    public static EnumC1319Jr1 valueOf(String str) {
        return (EnumC1319Jr1) Enum.valueOf(EnumC1319Jr1.class, str);
    }

    public static EnumC1319Jr1[] values() {
        return (EnumC1319Jr1[]) h.clone();
    }
}
