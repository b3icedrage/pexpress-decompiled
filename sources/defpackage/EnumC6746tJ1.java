package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6746tJ1 {
    public static final EnumC6746tJ1 d;
    public static final EnumC6746tJ1 e;
    public static final EnumC6746tJ1 g;
    public static final /* synthetic */ EnumC6746tJ1[] h;

    static {
        EnumC6746tJ1 enumC6746tJ1 = new EnumC6746tJ1("USE_CACHE", 0);
        d = enumC6746tJ1;
        EnumC6746tJ1 enumC6746tJ2 = new EnumC6746tJ1("SKIP_CACHE_LOOKUP", 1);
        e = enumC6746tJ2;
        EnumC6746tJ1 enumC6746tJ3 = new EnumC6746tJ1("IGNORE_CACHE_EXPIRATION", 2);
        g = enumC6746tJ3;
        h = new EnumC6746tJ1[]{enumC6746tJ1, enumC6746tJ2, enumC6746tJ3};
    }

    public EnumC6746tJ1() {
        throw null;
    }

    public static EnumC6746tJ1 valueOf(String str) {
        return (EnumC6746tJ1) Enum.valueOf(EnumC6746tJ1.class, str);
    }

    public static EnumC6746tJ1[] values() {
        return (EnumC6746tJ1[]) h.clone();
    }
}
