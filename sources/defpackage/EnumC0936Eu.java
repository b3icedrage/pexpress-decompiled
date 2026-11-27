package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0936Eu {
    public static final EnumC0936Eu d;
    public static final EnumC0936Eu e;
    public static final /* synthetic */ EnumC0936Eu[] g;

    static {
        EnumC0936Eu enumC0936Eu = new EnumC0936Eu("INFO", 0);
        d = enumC0936Eu;
        EnumC0936Eu enumC0936Eu2 = new EnumC0936Eu("WARNING", 1);
        e = enumC0936Eu2;
        EnumC0936Eu[] enumC0936EuArr = {enumC0936Eu, enumC0936Eu2, new EnumC0936Eu("ERROR", 2)};
        g = enumC0936EuArr;
        C1952Ru.i(enumC0936EuArr);
    }

    public EnumC0936Eu() {
        throw null;
    }

    public static EnumC0936Eu valueOf(String str) {
        return (EnumC0936Eu) Enum.valueOf(EnumC0936Eu.class, str);
    }

    public static EnumC0936Eu[] values() {
        return (EnumC0936Eu[]) g.clone();
    }
}
