package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5633o10 {
    public static final EnumC5633o10 d;
    public static final EnumC5633o10 e;
    public static final EnumC5633o10 g;
    public static final /* synthetic */ EnumC5633o10[] h;

    static {
        EnumC5633o10 enumC5633o10 = new EnumC5633o10("Info", 0);
        d = enumC5633o10;
        EnumC5633o10 enumC5633o11 = new EnumC5633o10("Warning", 1);
        e = enumC5633o11;
        EnumC5633o10 enumC5633o12 = new EnumC5633o10("Error", 2);
        g = enumC5633o12;
        EnumC5633o10[] enumC5633o10Arr = {enumC5633o10, enumC5633o11, enumC5633o12};
        h = enumC5633o10Arr;
        C1952Ru.i(enumC5633o10Arr);
    }

    public EnumC5633o10() {
        throw null;
    }

    public static EnumC5633o10 valueOf(String str) {
        return (EnumC5633o10) Enum.valueOf(EnumC5633o10.class, str);
    }

    public static EnumC5633o10[] values() {
        return (EnumC5633o10[]) h.clone();
    }
}
