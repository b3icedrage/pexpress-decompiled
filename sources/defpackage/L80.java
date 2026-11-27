package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v42 L80[], still in use, count: 1, list:
  (r0v42 L80[]) from 0x024a: INVOKE (r0v42 L80[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:587)
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
public final class L80 {
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Account banner"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNT("Account"),
    /* JADX INFO: Fake field, exist only in values array */
    CURRENT_INVESTMENT("Current investment"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCOUNT_ACTIVATION("Account activation"),
    /* JADX INFO: Fake field, exist only in values array */
    ROBOT("Robot"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADING("Loading"),
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("Platform"),
    /* JADX INFO: Fake field, exist only in values array */
    BET_ON_OPTIONS_APP("Bet on options App"),
    /* JADX INFO: Fake field, exist only in values array */
    OPTION("Option"),
    /* JADX INFO: Fake field, exist only in values array */
    TRADING_OPTIONS("Trading Options"),
    /* JADX INFO: Fake field, exist only in values array */
    ASSET_SELECTION("Asset Selection"),
    /* JADX INFO: Fake field, exist only in values array */
    TRADING_STRATEGY("Trading Strategy"),
    /* JADX INFO: Fake field, exist only in values array */
    RISK_MANAGEMENT("Risk Management"),
    /* JADX INFO: Fake field, exist only in values array */
    SIGNALS("Signals"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS("Indicators"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Insufficient Funds"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("NotOurAccount"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Logout"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Login"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Earn dialog"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Registration"),
    MAX_PROFIT("Max profit"),
    LOSS_LIMIT("Loss limit"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Real account"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Skipped"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Passed"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Amount"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Rating"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Tutorial"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Time"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Strategies"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Trading asset"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Auto selection"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Profit limit"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGRESSIVE_STRATEGY_INSTRUCTION("Aggressive"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATORS_SUMMARY("Indicators:Summary"),
    SYSTEM_SETTINGS("settings"),
    NOTIFICATION_REQUEST_DIALOG("banner"),
    /* JADX INFO: Fake field, exist only in values array */
    ROBOT_REAL_ACCOUNT("robot_real"),
    /* JADX INFO: Fake field, exist only in values array */
    ROBOT_DEMO_ACCOUNT("robot_demo"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORT("support");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(l80Arr);
    }

    public L80(String str) {
        super(str, i);
        this.d = str;
    }

    public static L80 valueOf(String str) {
        return (L80) Enum.valueOf(L80.class, str);
    }

    public static L80[] values() {
        return (L80[]) j.clone();
    }
}
