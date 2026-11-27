package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4105gz1 {
    public static final EnumC4105gz1 d;
    public static final EnumC4105gz1 e;
    public static final EnumC4105gz1 g;
    public static final /* synthetic */ EnumC4105gz1[] h;

    static {
        EnumC4105gz1 enumC4105gz1 = new EnumC4105gz1("DefaultIndicators", 0);
        d = enumC4105gz1;
        EnumC4105gz1 enumC4105gz2 = new EnumC4105gz1("RealAccountActivation", 1);
        e = enumC4105gz2;
        EnumC4105gz1 enumC4105gz3 = new EnumC4105gz1("Trading", 2);
        g = enumC4105gz3;
        EnumC4105gz1[] enumC4105gz1Arr = {enumC4105gz1, enumC4105gz2, enumC4105gz3};
        h = enumC4105gz1Arr;
        C1952Ru.i(enumC4105gz1Arr);
    }

    public EnumC4105gz1() {
        throw null;
    }

    public static EnumC4105gz1 valueOf(String str) {
        return (EnumC4105gz1) Enum.valueOf(EnumC4105gz1.class, str);
    }

    public static EnumC4105gz1[] values() {
        return (EnumC4105gz1[]) h.clone();
    }
}
