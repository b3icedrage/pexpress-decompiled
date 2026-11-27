package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7408wU {
    public static final EnumC7408wU d;
    public static final EnumC7408wU e;
    public static final EnumC7408wU g;
    public static final /* synthetic */ EnumC7408wU[] h;

    static {
        EnumC7408wU enumC7408wU = new EnumC7408wU("WHITESPACE_SEPARATED", 0);
        d = enumC7408wU;
        EnumC7408wU enumC7408wU2 = new EnumC7408wU("ARRAY_WRAPPED", 1);
        e = enumC7408wU2;
        EnumC7408wU enumC7408wU3 = new EnumC7408wU("AUTO_DETECT", 2);
        g = enumC7408wU3;
        EnumC7408wU[] enumC7408wUArr = {enumC7408wU, enumC7408wU2, enumC7408wU3};
        h = enumC7408wUArr;
        C1952Ru.i(enumC7408wUArr);
    }

    public EnumC7408wU() {
        throw null;
    }

    public static EnumC7408wU valueOf(String str) {
        return (EnumC7408wU) Enum.valueOf(EnumC7408wU.class, str);
    }

    public static EnumC7408wU[] values() {
        return (EnumC7408wU[]) h.clone();
    }
}
