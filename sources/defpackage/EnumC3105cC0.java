package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: cC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3105cC0 {
    public static final EnumC3105cC0 d;
    public static final EnumC3105cC0 e;
    public static final /* synthetic */ EnumC3105cC0[] g;

    static {
        EnumC3105cC0 enumC3105cC0 = new EnumC3105cC0("Failure", 0);
        d = enumC3105cC0;
        EnumC3105cC0 enumC3105cC1 = new EnumC3105cC0("Success", 1);
        e = enumC3105cC1;
        EnumC3105cC0[] enumC3105cC0Arr = {enumC3105cC0, enumC3105cC1};
        g = enumC3105cC0Arr;
        C1952Ru.i(enumC3105cC0Arr);
    }

    public EnumC3105cC0() {
        throw null;
    }

    public static EnumC3105cC0 valueOf(String str) {
        return (EnumC3105cC0) Enum.valueOf(EnumC3105cC0.class, str);
    }

    public static EnumC3105cC0[] values() {
        return (EnumC3105cC0[]) g.clone();
    }
}
