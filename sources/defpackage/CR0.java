package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 CR0[], still in use, count: 1, list:
  (r0v16 CR0[]) from 0x00da: INVOKE (r0v16 CR0[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:219)
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
public final class CR0 {
    /* JADX INFO: Fake field, exist only in values array */
    ClosePrice("close_price"),
    ADX("adx"),
    Aroon("aroon"),
    BBands("bb"),
    CCI("cci"),
    Ema("ema"),
    MACD("macd"),
    MOM("mom"),
    Roc("roc"),
    Rsi("rsi"),
    SAR("sar"),
    Sma("sma"),
    Stochastic("stoch"),
    UltOscillator("uo"),
    WillR("wpr"),
    Summary("summary");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(cr0Arr);
    }

    public CR0(String str) {
        super(str, i);
        this.d = str;
    }

    public static CR0 valueOf(String str) {
        return (CR0) Enum.valueOf(CR0.class, str);
    }

    public static CR0[] values() {
        return (CR0[]) u.clone();
    }
}
