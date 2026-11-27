package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hR1[], still in use, count: 1, list:
  (r0v1 hR1[]) from 0x0026: INVOKE (r0v1 hR1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:39)
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
/* JADX INFO: renamed from: hR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4200hR1 {
    CONTROL_OLD_STRATEGY_LIST('A'),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_OPTIMAL_DEFAULT('B'),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_CONSERVATIVE_REVERSE_MARTINGALE_DEFAULT('C');

    public final char d;

    static {
        C1952Ru.i(enumC4200hR1Arr);
    }

    public EnumC4200hR1(char c) {
        super(str, i);
        this.d = c;
    }

    public static EnumC4200hR1 valueOf(String str) {
        return (EnumC4200hR1) Enum.valueOf(EnumC4200hR1.class, str);
    }

    public static EnumC4200hR1[] values() {
        return (EnumC4200hR1[]) g.clone();
    }
}
