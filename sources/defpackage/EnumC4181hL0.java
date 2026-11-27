package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4181hL0 {
    public static final EnumC4181hL0 d;
    public static final EnumC4181hL0 e;
    public static final EnumC4181hL0 g;
    public static final /* synthetic */ EnumC4181hL0[] h;

    static {
        EnumC4181hL0 enumC4181hL0 = new EnumC4181hL0("RUNTIME", 0);
        d = enumC4181hL0;
        EnumC4181hL0 enumC4181hL1 = new EnumC4181hL0("BINARY", 1);
        e = enumC4181hL1;
        EnumC4181hL0 enumC4181hL2 = new EnumC4181hL0("SOURCE", 2);
        g = enumC4181hL2;
        EnumC4181hL0[] enumC4181hL0Arr = {enumC4181hL0, enumC4181hL1, enumC4181hL2};
        h = enumC4181hL0Arr;
        C1952Ru.i(enumC4181hL0Arr);
    }

    public EnumC4181hL0() {
        throw null;
    }

    public static EnumC4181hL0 valueOf(String str) {
        return (EnumC4181hL0) Enum.valueOf(EnumC4181hL0.class, str);
    }

    public static EnumC4181hL0[] values() {
        return (EnumC4181hL0[]) h.clone();
    }
}
