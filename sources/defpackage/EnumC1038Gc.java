package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 Gc[], still in use, count: 1, list:
  (r0v1 Gc[]) from 0x0021: INVOKE (r0v1 Gc[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:34)
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
/* JADX INFO: renamed from: Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1038Gc {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF24("ALWAYS_PARENTHESIZED", 2);

    public final boolean d;
    public final boolean e;

    static {
        C1952Ru.i(enumC1038GcArr);
    }

    public /* synthetic */ EnumC1038Gc(int i) {
        this(str, i);
    }

    public static EnumC1038Gc valueOf(String str) {
        return (EnumC1038Gc) Enum.valueOf(EnumC1038Gc.class, str);
    }

    public static EnumC1038Gc[] values() {
        return (EnumC1038Gc[]) h.clone();
    }

    public EnumC1038Gc(String str, int i) {
        super(str, i);
        this.d = z;
        this.e = z;
    }
}
