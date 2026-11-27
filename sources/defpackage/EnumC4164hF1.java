package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hF1[], still in use, count: 1, list:
  (r0v1 hF1[]) from 0x001e: INVOKE (r0v1 hF1[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:31)
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
/* JADX INFO: renamed from: hF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4164hF1 {
    g("DEMO", "demo"),
    h("REAL", "real");


    @NotNull
    public final String d;
    public final int e;

    static {
        C1952Ru.i(enumC4164hF1Arr);
    }

    public EnumC4164hF1(String str, String str2) {
        super(str, i);
        this.d = str2;
        this.e = i;
    }

    public static EnumC4164hF1 valueOf(String str) {
        return (EnumC4164hF1) Enum.valueOf(EnumC4164hF1.class, str);
    }

    public static EnumC4164hF1[] values() {
        return (EnumC4164hF1[]) i.clone();
    }
}
