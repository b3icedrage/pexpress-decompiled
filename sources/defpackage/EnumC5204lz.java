package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v37 lz[], still in use, count: 1, list:
  (r0v37 lz[]) from 0x0246: INVOKE (r0v37 lz[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:583)
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
/* JADX INFO: renamed from: lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5204lz {
    LAUNCH("Launch"),
    INTRO("Intro"),
    LOADING("Loading"),
    LANGUAGE("Language"),
    REGISTRATION("Registration"),
    LOGIN("Login"),
    REGISTRATION_OR_LOGIN("Registration or Login"),
    FORGOT_PASSWORD("Forgot password"),
    VPN("VPN"),
    PLATFORM("Platform"),
    TUTORIAL("Tutorial"),
    ROBOT("Robot"),
    TRADING("Trading"),
    WV_DEPOSIT("WV Deposit"),
    ACCOUNT("Account"),
    FAQ("FAQ"),
    DIALOGS("Dialogs"),
    NOTIFICATION("Notification"),
    PUSH("Push"),
    WEB_VIEW_IQ("WebViewIQBot"),
    SELECTION("Selection"),
    ACTIVATION("Activation"),
    PROMOCODE("Promocode"),
    STORIES("Stories"),
    INSTRUCTION("Instruction"),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING("Indicator manual config"),
    TERMS("Terms"),
    WV_WITHDRAW("WV Withdraw"),
    WV_VERIFICATION("WV Verefication"),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING("Onboarding"),
    TRANSITION("Transition"),
    WEB_VIEW("WV"),
    PUSHES("Pushes"),
    ONE_SIGNAL("One Signal"),
    AB("AB"),
    CRM("CRM"),
    RATE_US_SCREEN("Rate us Screen"),
    RATE("Rate");


    @InterfaceC2691aI1("text")
    @NotNull
    public final String d;

    static {
        C1952Ru.i(enumC5204lzArr);
    }

    public EnumC5204lz(String str) {
        super(str, i);
        this.d = str;
    }

    public static EnumC5204lz valueOf(String str) {
        return (EnumC5204lz) Enum.valueOf(EnumC5204lz.class, str);
    }

    public static EnumC5204lz[] values() {
        return (EnumC5204lz[]) P.clone();
    }
}
