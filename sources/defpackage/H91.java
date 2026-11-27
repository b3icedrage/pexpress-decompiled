package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v20 H91[], still in use, count: 1, list:
  (r0v20 H91[]) from 0x011e: INVOKE (r0v20 H91[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:287)
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
public final class H91 {
    PLATFORM("platform"),
    REGISTRATION_TIME("registration"),
    LOGIN_RIGHT_ACCOUNT_TIME("login_right_account"),
    LOGIN_WRONG_ACCOUNT_TIME("login_wrong_account"),
    ACTIVATION("activation"),
    TRY_DEMO_TIME("try_demo"),
    TRY_DEMO("try_demo_count"),
    DEPOSIT_SCREEN_TIME("deposit_screen"),
    MAKE_DEPOSIT("deposit_count"),
    TRY_REAL_TIME("try_real"),
    TRY_REAL("try_real_count"),
    LOSE_DEMO_TIME("lose_demo"),
    LOSE_DEMO("lose_demo_count"),
    LOSE_REAL_TIME("lose_real"),
    LOSE_REAL("lose_real_count"),
    WIN_DEMO_TIME("win_demo"),
    WIN_DEMO("win_demo_count"),
    WIN_REAL_TIME("win_real"),
    WIN_REAL("win_real_count"),
    /* JADX INFO: Fake field, exist only in values array */
    IN_APP_MESSAGES_TRIGGER("trigger_inapp");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(h91Arr);
    }

    public H91(String str) {
        super(str, i);
        this.d = str;
    }

    public static H91 valueOf(String str) {
        return (H91) Enum.valueOf(H91.class, str);
    }

    public static H91[] values() {
        return (H91[]) y.clone();
    }
}
