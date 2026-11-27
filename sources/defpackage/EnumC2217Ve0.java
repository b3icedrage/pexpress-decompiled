package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 Ve0[], still in use, count: 1, list:
  (r0v1 Ve0[]) from 0x0077: INVOKE (r0v1 Ve0[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:120)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Ve0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2217Ve0 {
    /* JADX INFO: Fake field, exist only in values array */
    BB("bb"),
    /* JADX INFO: Fake field, exist only in values array */
    BB_STUB("bs"),
    /* JADX INFO: Fake field, exist only in values array */
    EB("eb"),
    /* JADX INFO: Fake field, exist only in values array */
    EB_STUB("es"),
    /* JADX INFO: Fake field, exist only in values array */
    IQ("iq"),
    /* JADX INFO: Fake field, exist only in values array */
    IQ_STUB("is"),
    /* JADX INFO: Fake field, exist only in values array */
    OB("ob"),
    /* JADX INFO: Fake field, exist only in values array */
    OB_STUB("os"),
    /* JADX INFO: Fake field, exist only in values array */
    OB_HUAWEI("obHuawei"),
    /* JADX INFO: Fake field, exist only in values array */
    PB("pb"),
    /* JADX INFO: Fake field, exist only in values array */
    PB_STUB("ps");


    @NotNull
    public static final a e;

    @NotNull
    public final String d;

    /* JADX INFO: renamed from: Ve0$a */
    public static final class a {
    }

    static {
        C1952Ru.i(enumC2217Ve0Arr);
        e = new a();
    }

    public EnumC2217Ve0(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC2217Ve0 valueOf(String str) {
        return (EnumC2217Ve0) Enum.valueOf(EnumC2217Ve0.class, str);
    }

    public static EnumC2217Ve0[] values() {
        return (EnumC2217Ve0[]) g.clone();
    }
}
