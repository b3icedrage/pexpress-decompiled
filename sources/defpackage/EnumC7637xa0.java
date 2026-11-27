package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xa0[], still in use, count: 1, list:
  (r0v1 xa0[]) from 0x0048: INVOKE (r0v1 xa0[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:73)
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
/* JADX INFO: renamed from: xa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7637xa0 {
    /* JADX INFO: Fake field, exist only in values array */
    AA_TEST("AA-test-for-checking-Metrics-System"),
    /* JADX INFO: Fake field, exist only in values array */
    LOSS_LIMIT_V2("AB-losslimit-disable"),
    CUSTOM_INDICATORS("AB-Test-Indicators-Improvement"),
    /* JADX INFO: Fake field, exist only in values array */
    STRATEGIES_IMPROVEMENT("ABC-Test-Martingale-vs-Reverse-Martingale"),
    KNOWLEDGE_BASE("AB-Test-Support-Tab-as-Knowledge-Base"),
    TELEMETRY_ENABLED("AB-Test-Trading-Telemetry-Rollout");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(enumC7637xa0Arr);
    }

    public EnumC7637xa0(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC7637xa0 valueOf(String str) {
        return (EnumC7637xa0) Enum.valueOf(EnumC7637xa0.class, str);
    }

    public static EnumC7637xa0[] values() {
        return (EnumC7637xa0[]) i.clone();
    }
}
