package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 PQ[], still in use, count: 1, list:
  (r0v1 PQ[]) from 0x0038: INVOKE (r0v1 PQ[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:57)
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
/* JADX INFO: loaded from: classes.dex */
public final class PQ {
    NOT_VISIBLE,
    SEARCHING_FOR_SIGNALS,
    LOADING,
    TRADING,
    TRADING_WITHOUT_CHART;

    public boolean d;
    public boolean e;

    static {
        C1952Ru.i(pqArr);
    }

    public PQ() {
        super(str, i);
        this.e = true;
    }

    public static PQ valueOf(String str) {
        return (PQ) Enum.valueOf(PQ.class, str);
    }

    public static PQ[] values() {
        return (PQ[]) l.clone();
    }
}
