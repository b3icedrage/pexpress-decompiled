package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1712Os {
    public static final EnumC1712Os g;
    public static final EnumC1712Os h;
    public static final EnumC1712Os i;
    public static final /* synthetic */ EnumC1712Os[] j;

    @NotNull
    public final NG1 d;
    public final boolean e;

    static {
        NG1 ng1 = NG1.INFO;
        EnumC1712Os enumC1712Os = new EnumC1712Os("BREADCRUMB", 0, ng1, false);
        g = enumC1712Os;
        EnumC1712Os enumC1712Os2 = new EnumC1712Os("INFO_EVENT", 1, ng1, true);
        h = enumC1712Os2;
        EnumC1712Os enumC1712Os3 = new EnumC1712Os("WARNING_EVENT", 2, NG1.WARNING, true);
        i = enumC1712Os3;
        EnumC1712Os[] enumC1712OsArr = {enumC1712Os, enumC1712Os2, enumC1712Os3};
        j = enumC1712OsArr;
        C1952Ru.i(enumC1712OsArr);
    }

    public EnumC1712Os(String str, int i2, NG1 ng1, boolean z) {
        super(str, i2);
        this.d = ng1;
        this.e = z;
    }

    public static EnumC1712Os valueOf(String str) {
        return (EnumC1712Os) Enum.valueOf(EnumC1712Os.class, str);
    }

    public static EnumC1712Os[] values() {
        return (EnumC1712Os[]) j.clone();
    }
}
