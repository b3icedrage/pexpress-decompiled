package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 Sc[], still in use, count: 1, list:
  (r0v1 Sc[]) from 0x0045: INVOKE (r0v1 Sc[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:70)
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
/* JADX INFO: renamed from: Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1976Sc {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(enumC1976ScArr);
    }

    public EnumC1976Sc(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC1976Sc valueOf(String str) {
        return (EnumC1976Sc) Enum.valueOf(EnumC1976Sc.class, str);
    }

    public static EnumC1976Sc[] values() {
        return (EnumC1976Sc[]) k.clone();
    }
}
