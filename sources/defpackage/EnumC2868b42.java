package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2868b42 {
    public static final EnumC2868b42 d;
    public static final EnumC2868b42 e;
    public static final /* synthetic */ EnumC2868b42[] g;

    static {
        EnumC2868b42 enumC2868b42 = new EnumC2868b42("PRO", 0);
        d = enumC2868b42;
        EnumC2868b42 enumC2868b43 = new EnumC2868b42("FREE", 1);
        e = enumC2868b43;
        EnumC2868b42[] enumC2868b42Arr = {enumC2868b42, enumC2868b43};
        g = enumC2868b42Arr;
        C1952Ru.i(enumC2868b42Arr);
    }

    public EnumC2868b42() {
        throw null;
    }

    public static EnumC2868b42 valueOf(String str) {
        return (EnumC2868b42) Enum.valueOf(EnumC2868b42.class, str);
    }

    public static EnumC2868b42[] values() {
        return (EnumC2868b42[]) g.clone();
    }
}
