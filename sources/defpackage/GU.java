package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 GU[], still in use, count: 1, list:
  (r0v1 GU[]) from 0x0080: INVOKE (r0v1 GU[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:129)
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
public final class GU {
    NAVIGATE_TO_ASSET_SELECTION("navigate_asset_selection"),
    NAVIGATE_TO_ROBOT_TRADING_OPTIONS_DESCRIPTION("navigate_robot_trading_options_description"),
    NAVIGATE_TO_ROBOT("navigate_robot"),
    NAVIGATE_TO_SUPPORT_CHAT("navigate_to_support_chat"),
    NAVIGATE_TO_PLATFORM_SHOW_PROMO_CODE("navigate_platform_show_promo_code"),
    NAVIGATE_TO_DEPOSIT("navigate_deposit"),
    NAVIGATE_TO_PLATFORM("navigate_platform"),
    NAVIGATE_TO_RE_REGISTRATION("navigate_re_registration"),
    NAVIGATE_TO_ACCOUNT_ACTIVATION("navigate_account_activation"),
    CUSTOM_INDICATORS_ENABLE_DEEPLINK("custom_indicators_enable_deeplink");


    @NotNull
    public final String d;

    static {
        C1952Ru.i(guArr);
    }

    public GU(String str) {
        super(str, i);
        this.d = str;
    }

    public static GU valueOf(String str) {
        return (GU) Enum.valueOf(GU.class, str);
    }

    public static GU[] values() {
        return (GU[]) p.clone();
    }
}
