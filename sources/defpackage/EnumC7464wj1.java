package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7464wj1 {
    public static final EnumC7464wj1 d;
    public static final EnumC7464wj1 e;
    public static final /* synthetic */ EnumC7464wj1[] g;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7464wj1 EF0;

    static {
        EnumC7464wj1 enumC7464wj1 = new EnumC7464wj1("PRETTY", 0);
        EnumC7464wj1 enumC7464wj2 = new EnumC7464wj1("DEBUG", 1);
        d = enumC7464wj2;
        EnumC7464wj1 enumC7464wj3 = new EnumC7464wj1("NONE", 2);
        e = enumC7464wj3;
        EnumC7464wj1[] enumC7464wj1Arr = {enumC7464wj1, enumC7464wj2, enumC7464wj3};
        g = enumC7464wj1Arr;
        C1952Ru.i(enumC7464wj1Arr);
    }

    public EnumC7464wj1() {
        throw null;
    }

    public static EnumC7464wj1 valueOf(String str) {
        return (EnumC7464wj1) Enum.valueOf(EnumC7464wj1.class, str);
    }

    public static EnumC7464wj1[] values() {
        return (EnumC7464wj1[]) g.clone();
    }
}
