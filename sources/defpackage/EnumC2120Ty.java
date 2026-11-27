package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2120Ty {
    public static final EnumC2120Ty d;
    public static final /* synthetic */ EnumC2120Ty[] e;

    static {
        EnumC2120Ty enumC2120Ty = new EnumC2120Ty("FOR_SUBTYPING", 0);
        d = enumC2120Ty;
        EnumC2120Ty[] enumC2120TyArr = {enumC2120Ty, new EnumC2120Ty("FOR_INCORPORATION", 1), new EnumC2120Ty("FROM_EXPRESSION", 2)};
        e = enumC2120TyArr;
        C1952Ru.i(enumC2120TyArr);
    }

    public EnumC2120Ty() {
        throw null;
    }

    public static EnumC2120Ty valueOf(String str) {
        return (EnumC2120Ty) Enum.valueOf(EnumC2120Ty.class, str);
    }

    public static EnumC2120Ty[] values() {
        return (EnumC2120Ty[]) e.clone();
    }
}
