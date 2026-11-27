package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 LJ1[], still in use, count: 1, list:
  (r0v1 LJ1[]) from 0x002a: INVOKE (r0v1 LJ1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:43)
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
public final class LJ1 {
    Asset("asset"),
    Indicator("indicator"),
    Start("start");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(lj1Arr);
    }

    public LJ1(String str) {
        super(str, i);
        this.d = str;
    }

    public static LJ1 valueOf(String str) {
        return (LJ1) Enum.valueOf(LJ1.class, str);
    }

    public static LJ1[] values() {
        return (LJ1[]) i.clone();
    }
}
