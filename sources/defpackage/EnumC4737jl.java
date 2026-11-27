package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4737jl {
    public static final EnumC4737jl d;
    public static final EnumC4737jl e;
    public static final EnumC4737jl g;
    public static final /* synthetic */ EnumC4737jl[] h;

    static {
        EnumC4737jl enumC4737jl = new EnumC4737jl("SUCCESS", 0);
        d = enumC4737jl;
        EnumC4737jl enumC4737jl2 = new EnumC4737jl("FAILED", 1);
        e = enumC4737jl2;
        EnumC4737jl enumC4737jl3 = new EnumC4737jl("CANCELLED", 2);
        g = enumC4737jl3;
        EnumC4737jl[] enumC4737jlArr = {enumC4737jl, enumC4737jl2, enumC4737jl3};
        h = enumC4737jlArr;
        C1952Ru.i(enumC4737jlArr);
    }

    public EnumC4737jl() {
        throw null;
    }

    public static EnumC4737jl valueOf(String str) {
        return (EnumC4737jl) Enum.valueOf(EnumC4737jl.class, str);
    }

    public static EnumC4737jl[] values() {
        return (EnumC4737jl[]) h.clone();
    }
}
