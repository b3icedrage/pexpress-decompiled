package defpackage;

import com.google.android.gms.stats.CodePackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2880b72 {
    public static final EnumC2880b72 d;
    public static final EnumC2880b72 e;
    public static final /* synthetic */ EnumC2880b72[] g;

    static {
        EnumC2880b72 enumC2880b72 = new EnumC2880b72("SUPERTYPE", 0);
        d = enumC2880b72;
        EnumC2880b72 enumC2880b73 = new EnumC2880b72(CodePackage.COMMON, 1);
        e = enumC2880b73;
        EnumC2880b72[] enumC2880b72Arr = {enumC2880b72, enumC2880b73};
        g = enumC2880b72Arr;
        C1952Ru.i(enumC2880b72Arr);
    }

    public EnumC2880b72() {
        throw null;
    }

    public static EnumC2880b72 valueOf(String str) {
        return (EnumC2880b72) Enum.valueOf(EnumC2880b72.class, str);
    }

    public static EnumC2880b72[] values() {
        return (EnumC2880b72[]) g.clone();
    }
}
