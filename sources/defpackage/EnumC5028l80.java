package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5028l80 {
    public static final EnumC5028l80 A;
    public static final EnumC5028l80 A0;
    public static final EnumC5028l80 B;
    public static final EnumC5028l80 B0;
    public static final EnumC5028l80 C;
    public static final EnumC5028l80 C0;
    public static final EnumC5028l80 D;
    public static final EnumC5028l80 D0;
    public static final EnumC5028l80 E;
    public static final EnumC5028l80 E0;
    public static final EnumC5028l80 F;
    public static final EnumC5028l80 F0;
    public static final EnumC5028l80 G;
    public static final EnumC5028l80 G0;
    public static final EnumC5028l80 H;
    public static final EnumC5028l80 H0;
    public static final EnumC5028l80 I;
    public static final EnumC5028l80 I0;
    public static final EnumC5028l80 J;
    public static final EnumC5028l80 J0;
    public static final EnumC5028l80 K;
    public static final EnumC5028l80 K0;
    public static final EnumC5028l80 L;
    public static final EnumC5028l80 L0;
    public static final EnumC5028l80 M;
    public static final EnumC5028l80 M0;
    public static final EnumC5028l80 N;
    public static final EnumC5028l80 N0;
    public static final EnumC5028l80 O;
    public static final EnumC5028l80 O0;
    public static final EnumC5028l80 P;
    public static final EnumC5028l80 P0;
    public static final EnumC5028l80 Q;
    public static final EnumC5028l80 Q0;
    public static final EnumC5028l80 R;
    public static final EnumC5028l80 R0;
    public static final EnumC5028l80 S;
    public static final EnumC5028l80 S0;
    public static final EnumC5028l80 T;
    public static final EnumC5028l80 T0;
    public static final EnumC5028l80 U;
    public static final EnumC5028l80 U0;
    public static final EnumC5028l80 V;
    public static final EnumC5028l80 V0;
    public static final EnumC5028l80 W;
    public static final EnumC5028l80 W0;
    public static final EnumC5028l80 X;
    public static final /* synthetic */ EnumC5028l80[] X0;
    public static final EnumC5028l80 Y;
    public static final EnumC5028l80 Z;
    public static final EnumC5028l80 a0;
    public static final EnumC5028l80 b0;
    public static final EnumC5028l80 c0;
    public static final EnumC5028l80 d0;
    public static final EnumC5028l80 e0;
    public static final EnumC5028l80 f0;
    public static final EnumC5028l80 g;
    public static final EnumC5028l80 g0;
    public static final EnumC5028l80 h;
    public static final EnumC5028l80 h0;
    public static final EnumC5028l80 i;
    public static final EnumC5028l80 i0;
    public static final EnumC5028l80 j;
    public static final EnumC5028l80 j0;
    public static final EnumC5028l80 k;
    public static final EnumC5028l80 k0;
    public static final EnumC5028l80 l;
    public static final EnumC5028l80 l0;
    public static final EnumC5028l80 m;
    public static final EnumC5028l80 m0;
    public static final EnumC5028l80 n;
    public static final EnumC5028l80 n0;
    public static final EnumC5028l80 o;
    public static final EnumC5028l80 o0;
    public static final EnumC5028l80 p;
    public static final EnumC5028l80 p0;
    public static final EnumC5028l80 q;
    public static final EnumC5028l80 q0;
    public static final EnumC5028l80 r;
    public static final EnumC5028l80 r0;
    public static final EnumC5028l80 s;
    public static final EnumC5028l80 s0;
    public static final EnumC5028l80 t;
    public static final EnumC5028l80 t0;
    public static final EnumC5028l80 u;
    public static final EnumC5028l80 u0;
    public static final EnumC5028l80 v;
    public static final EnumC5028l80 v0;
    public static final EnumC5028l80 w;
    public static final EnumC5028l80 w0;
    public static final EnumC5028l80 x;
    public static final EnumC5028l80 x0;
    public static final EnumC5028l80 y;
    public static final EnumC5028l80 y0;
    public static final EnumC5028l80 z;
    public static final EnumC5028l80 z0;

    @InterfaceC2691aI1("text")
    @NotNull
    public final String d;

    @InterfaceC2691aI1("category")
    @Nullable
    public final EnumC5204lz e;

    static {
        EnumC5204lz enumC5204lz = EnumC5204lz.LAUNCH;
        EnumC5028l80 enumC5028l80 = new EnumC5028l80("FIRST_START", 0, "First time", enumC5204lz);
        g = enumC5028l80;
        EnumC5028l80 enumC5028l81 = new EnumC5028l80("SESSION_START", 1, "Session start", enumC5204lz);
        h = enumC5028l81;
        EnumC5028l80 enumC5028l82 = new EnumC5028l80("SLIDES_PASSED", 2, "Slides passed", EnumC5204lz.INTRO);
        i = enumC5028l82;
        EnumC5204lz enumC5204lz2 = EnumC5204lz.LOADING;
        EnumC5028l80 enumC5028l83 = new EnumC5028l80("ERROR_LOADING", 3, "Error", enumC5204lz2);
        j = enumC5028l83;
        EnumC5028l80 enumC5028l84 = new EnumC5028l80("NEW_VERSION_SCREEN", 4, "New version screen", enumC5204lz2);
        k = enumC5028l84;
        EnumC5028l80 enumC5028l85 = new EnumC5028l80("START_LOADING", 5, "Start", enumC5204lz2);
        l = enumC5028l85;
        EnumC5028l80 enumC5028l86 = new EnumC5028l80("FINISHED_LOADING", 6, "Finished", enumC5204lz2);
        m = enumC5028l86;
        EnumC5028l80 enumC5028l87 = new EnumC5028l80("CHANGED", 7, "Changed", EnumC5204lz.LANGUAGE);
        n = enumC5028l87;
        EnumC5204lz enumC5204lz3 = EnumC5204lz.REGISTRATION;
        EnumC5028l80 enumC5028l88 = new EnumC5028l80("SCREEN_REGISTRATION", 8, "Screen", enumC5204lz3);
        o = enumC5028l88;
        EnumC5028l80 enumC5028l89 = new EnumC5028l80("SUCCESS_REGISTRATION", 9, "Success", enumC5204lz3);
        p = enumC5028l89;
        EnumC5028l80 enumC5028l810 = new EnumC5028l80("ERROR_REGISTRATION", 10, "Error", enumC5204lz3);
        q = enumC5028l810;
        EnumC5028l80 enumC5028l811 = new EnumC5028l80("CAPTCHA_ERROR_REGISTRATION", 11, "Captcha error", enumC5204lz3);
        r = enumC5028l811;
        EnumC5028l80 enumC5028l812 = new EnumC5028l80("OPEN_PRIVACY_POLICY", 12, "Open", EnumC5204lz.TERMS);
        s = enumC5028l812;
        EnumC5204lz enumC5204lz4 = EnumC5204lz.LOGIN;
        EnumC5028l80 enumC5028l813 = new EnumC5028l80("SCREEN_LOGIN", 13, "Screen", enumC5204lz4);
        t = enumC5028l813;
        EnumC5028l80 enumC5028l814 = new EnumC5028l80("SUCCESS_LOGIN", 14, "Success", enumC5204lz4);
        u = enumC5028l814;
        EnumC5028l80 enumC5028l815 = new EnumC5028l80("WRONG_ACCOUNT_LOGIN", 15, "Wrong Account", enumC5204lz4);
        v = enumC5028l815;
        EnumC5028l80 enumC5028l816 = new EnumC5028l80("WRONG_ACCOUNT_REGISTRATION_OR_LOGIN", 16, "Wrong Account", EnumC5204lz.REGISTRATION_OR_LOGIN);
        w = enumC5028l816;
        EnumC5028l80 enumC5028l817 = new EnumC5028l80("ERROR_LOGIN", 17, "Error", enumC5204lz4);
        x = enumC5028l817;
        EnumC5028l80 enumC5028l818 = new EnumC5028l80("CAPTCHA_ERROR_LOGIN", 18, "Captcha error", enumC5204lz4);
        y = enumC5028l818;
        EnumC5204lz enumC5204lz5 = EnumC5204lz.FORGOT_PASSWORD;
        EnumC5028l80 enumC5028l819 = new EnumC5028l80("SUCCESS_FORGOT_PASSWORD", 19, "Success", enumC5204lz5);
        z = enumC5028l819;
        EnumC5028l80 enumC5028l820 = new EnumC5028l80("ERROR_FORGOT_PASSWORD", 20, "Error", enumC5204lz5);
        A = enumC5028l820;
        EnumC5028l80 enumC5028l821 = new EnumC5028l80("CAPTCHA_ERROR_FORGOT_PASSWORD", 21, "Captcha error", enumC5204lz5);
        B = enumC5028l821;
        EnumC5204lz enumC5204lz6 = EnumC5204lz.VPN;
        EnumC5028l80 enumC5028l822 = new EnumC5028l80("SCREEN_VPN", 22, "Screen", enumC5204lz6);
        C = enumC5028l822;
        EnumC5028l80 enumC5028l823 = new EnumC5028l80("GO_TO_INSTALL_VPN", 23, "Go to install VPN", enumC5204lz6);
        D = enumC5028l823;
        EnumC5204lz enumC5204lz7 = EnumC5204lz.PLATFORM;
        EnumC5028l80 enumC5028l824 = new EnumC5028l80("OUR_PRIVACY_POLICY_ACCEPTED", 24, "Our Privacy Policy accepted", enumC5204lz7);
        EnumC5028l80 enumC5028l825 = new EnumC5028l80("OPEN_APP", 25, "Open app", enumC5204lz7);
        E = enumC5028l825;
        EnumC5028l80 enumC5028l826 = new EnumC5028l80("OUR_PRIVACY_POLICY_SHOW", 26, "Our Privacy Policy show", enumC5204lz7);
        EnumC5028l80 enumC5028l827 = new EnumC5028l80("GO_TO_INSTALL_PLATFORM_APP", 27, "Go to install platform app", enumC5204lz7);
        F = enumC5028l827;
        EnumC5028l80 enumC5028l828 = new EnumC5028l80("ZOOM_CLICK", 28, "Zoom click", enumC5204lz7);
        EnumC5028l80 enumC5028l829 = new EnumC5028l80("MODE_TYPE", 29, "Mode type", enumC5204lz7);
        EnumC5028l80 enumC5028l830 = new EnumC5028l80("ROBOT_COMPLETED", 30, "Robot completed", EnumC5204lz.TUTORIAL);
        EnumC5204lz enumC5204lz8 = EnumC5204lz.ROBOT;
        EnumC5028l80 enumC5028l831 = new EnumC5028l80("OPEN_INSTRUCTION", 31, "Open instruction", enumC5204lz8);
        G = enumC5028l831;
        EnumC5028l80 enumC5028l832 = new EnumC5028l80("INITIAL_AMOUNT", 32, "Initial amount", enumC5204lz8);
        H = enumC5028l832;
        EnumC5028l80 enumC5028l833 = new EnumC5028l80("DURATION", 33, "Duration", enumC5204lz8);
        I = enumC5028l833;
        EnumC5028l80 enumC5028l834 = new EnumC5028l80("TRADING_ASSET", 34, "Trading Asset", enumC5204lz8);
        J = enumC5028l834;
        EnumC5028l80 enumC5028l835 = new EnumC5028l80("INDICATOR", 35, "Indicator", enumC5204lz8);
        K = enumC5028l835;
        EnumC5028l80 enumC5028l836 = new EnumC5028l80("STRATEGY", 36, "Strategy", enumC5204lz8);
        L = enumC5028l836;
        EnumC5028l80 enumC5028l837 = new EnumC5028l80("LOSS_LIMIT", 37, "Loss Limit", enumC5204lz8);
        M = enumC5028l837;
        EnumC5204lz enumC5204lz9 = EnumC5204lz.TRADING;
        EnumC5028l80 enumC5028l838 = new EnumC5028l80("INDICATORS_SUMMARY", 38, "AI Indicator", enumC5204lz9);
        N = enumC5028l838;
        EnumC5028l80 enumC5028l839 = new EnumC5028l80("SHOW_DETAILS_INDICATORS", 39, "Show details Indicators", enumC5204lz9);
        O = enumC5028l839;
        EnumC5028l80 enumC5028l840 = new EnumC5028l80("SHOW_DETAILS_STRATEGIES", 40, "Show details Strategies", enumC5204lz9);
        P = enumC5028l840;
        EnumC5028l80 enumC5028l841 = new EnumC5028l80("START_DEMO", 41, "Start demo", enumC5204lz9);
        Q = enumC5028l841;
        EnumC5028l80 enumC5028l842 = new EnumC5028l80("START_REAL", 42, "Start real", enumC5204lz9);
        R = enumC5028l842;
        EnumC5028l80 enumC5028l843 = new EnumC5028l80("STOP_DEMO", 43, "Stop demo", enumC5204lz9);
        S = enumC5028l843;
        EnumC5028l80 enumC5028l844 = new EnumC5028l80("START_TOTAL", 44, "Start Total", enumC5204lz9);
        T = enumC5028l844;
        EnumC5028l80 enumC5028l845 = new EnumC5028l80("STOP_REAL", 45, "Stop real", enumC5204lz9);
        U = enumC5028l845;
        EnumC5028l80 enumC5028l846 = new EnumC5028l80("ERROR_TRADING", 46, "Error", enumC5204lz9);
        V = enumC5028l846;
        EnumC5028l80 enumC5028l847 = new EnumC5028l80("FTD", 47, "FTD", enumC5204lz9);
        W = enumC5028l847;
        EnumC5028l80 enumC5028l848 = new EnumC5028l80("SHOW_ON_CHART", 48, "Show on chart", enumC5204lz9);
        X = enumC5028l848;
        EnumC5028l80 enumC5028l849 = new EnumC5028l80("START_ON_PLATFORM", 49, "Start on platform", enumC5204lz9);
        EnumC5028l80 enumC5028l850 = new EnumC5028l80("MAKE_DEPOSIT", 50, "Make deposit", enumC5204lz9);
        Y = enumC5028l850;
        EnumC5028l80 enumC5028l851 = new EnumC5028l80("WIN_DEMO_LIMIT", 51, "Win demo limit", enumC5204lz9);
        Z = enumC5028l851;
        EnumC5028l80 enumC5028l852 = new EnumC5028l80("WIN_PROFIT_FILTER", 52, "Win profit filter", enumC5204lz9);
        a0 = enumC5028l852;
        EnumC5028l80 enumC5028l853 = new EnumC5028l80("LOSE_LIMIT", 53, "Lose limit", enumC5204lz9);
        b0 = enumC5028l853;
        EnumC5028l80 enumC5028l854 = new EnumC5028l80("LOSE_DEMO", 54, "Lose demo", enumC5204lz9);
        c0 = enumC5028l854;
        EnumC5028l80 enumC5028l855 = new EnumC5028l80("LOSE_REAL", 55, "Lose real", enumC5204lz9);
        d0 = enumC5028l855;
        EnumC5028l80 enumC5028l856 = new EnumC5028l80("GO_TO_BACKGROUND", 56, "Go to background", enumC5204lz9);
        e0 = enumC5028l856;
        EnumC5028l80 enumC5028l857 = new EnumC5028l80("SHOW_DEAL_CONFIRM", 57, "Show deal confirm", enumC5204lz9);
        f0 = enumC5028l857;
        EnumC5028l80 enumC5028l858 = new EnumC5028l80("INDICATORS_SCREEN_SHOW", 58, "Indicators Screen Show", enumC5204lz9);
        g0 = enumC5028l858;
        EnumC5028l80 enumC5028l859 = new EnumC5028l80("INDICATOR_SETTINGS_BUTTON_CLICK", 59, "Indicator Settings Button Click", enumC5204lz9);
        h0 = enumC5028l859;
        EnumC5028l80 enumC5028l860 = new EnumC5028l80("SCREEN_WV_DEPOSIT", 60, "Screen", EnumC5204lz.WV_DEPOSIT);
        i0 = enumC5028l860;
        EnumC5204lz enumC5204lz10 = EnumC5204lz.ACCOUNT;
        EnumC5028l80 enumC5028l861 = new EnumC5028l80("RATING_REFRESH", 61, "Rating refresh", enumC5204lz10);
        EnumC5028l80 enumC5028l862 = new EnumC5028l80("NICKNAME_CHANGED", 62, "Nickname changed", enumC5204lz10);
        j0 = enumC5028l862;
        EnumC5028l80 enumC5028l863 = new EnumC5028l80("LOGOUT", 63, "Logout", enumC5204lz10);
        k0 = enumC5028l863;
        EnumC5204lz enumC5204lz11 = EnumC5204lz.FAQ;
        EnumC5028l80 enumC5028l864 = new EnumC5028l80("FAQ_TRANSITION", 64, "Transition", enumC5204lz11);
        l0 = enumC5028l864;
        EnumC5028l80 enumC5028l865 = new EnumC5028l80("FAQ_QUESTION_EXPANDED_CLICK", 65, "Question expand click", enumC5204lz11);
        m0 = enumC5028l865;
        EnumC5204lz enumC5204lz12 = EnumC5204lz.TRANSITION;
        EnumC5028l80 enumC5028l866 = new EnumC5028l80("PLATFORM_TRANSITION", 66, "Platform", enumC5204lz12);
        n0 = enumC5028l866;
        EnumC5028l80 enumC5028l867 = new EnumC5028l80("ROBOT_TRANSITION", 67, "Robot", enumC5204lz12);
        o0 = enumC5028l867;
        EnumC5204lz enumC5204lz13 = EnumC5204lz.DIALOGS;
        EnumC5028l80 enumC5028l868 = new EnumC5028l80("YOU_HAVE_EARNED_SHOW", 68, "You've earned show", enumC5204lz13);
        p0 = enumC5028l868;
        EnumC5028l80 enumC5028l869 = new EnumC5028l80("SHOW_DIALOG", 69, "Show", enumC5204lz13);
        q0 = enumC5028l869;
        EnumC5028l80 enumC5028l870 = new EnumC5028l80("DIALOG_STOP_ROBOT", 70, "Stop robot", enumC5204lz13);
        r0 = enumC5028l870;
        EnumC5028l80 enumC5028l871 = new EnumC5028l80("ONE_SIGNAL_TAG_ERROR", 71, "Tag Edit Error", EnumC5204lz.ONE_SIGNAL);
        EnumC5028l80 enumC5028l872 = new EnumC5028l80("SHOW_STORIES", 72, "Show", EnumC5204lz.STORIES);
        s0 = enumC5028l872;
        EnumC5204lz enumC5204lz14 = EnumC5204lz.PROMOCODE;
        EnumC5028l80 enumC5028l873 = new EnumC5028l80("PROMOCODE_ACTIVATED", 73, "Activated", enumC5204lz14);
        EnumC5028l80 enumC5028l874 = new EnumC5028l80("PROMOCODE_CLOSE", 74, "Close", enumC5204lz14);
        EnumC5028l80 enumC5028l875 = new EnumC5028l80("NOTIFICATION_CLICK", 75, "Click", EnumC5204lz.NOTIFICATION);
        t0 = enumC5028l875;
        EnumC5204lz enumC5204lz15 = EnumC5204lz.PUSH;
        EnumC5028l80 enumC5028l876 = new EnumC5028l80("OPEN_PUSH", 76, "open", enumC5204lz15);
        u0 = enumC5028l876;
        EnumC5028l80 enumC5028l877 = new EnumC5028l80("SEND_PUSH", 77, "send", enumC5204lz15);
        v0 = enumC5028l877;
        EnumC5028l80 enumC5028l878 = new EnumC5028l80("LOW_MEMORY", 78, "Low memory", EnumC5204lz.WEB_VIEW_IQ);
        EnumC5028l80 enumC5028l879 = new EnumC5028l80("QUIZ", 79, "Platform account", EnumC5204lz.SELECTION);
        w0 = enumC5028l879;
        EnumC5204lz enumC5204lz16 = EnumC5204lz.ACTIVATION;
        EnumC5028l80 enumC5028l880 = new EnumC5028l80("ACTIVATION_ERROR", 80, "Error", enumC5204lz16);
        x0 = enumC5028l880;
        EnumC5028l80 enumC5028l881 = new EnumC5028l80("ACTIVATION_ACCOUNT_SHOW", 81, "Account activation show", enumC5204lz16);
        y0 = enumC5028l881;
        EnumC5028l80 enumC5028l882 = new EnumC5028l80("INSTRUCTION_TYPE", 82, "type", EnumC5204lz.INSTRUCTION);
        z0 = enumC5028l882;
        EnumC5028l80 enumC5028l883 = new EnumC5028l80("SCREEN_WV_WITHDRAW", 83, "Screen", EnumC5204lz.WV_WITHDRAW);
        A0 = enumC5028l883;
        EnumC5028l80 enumC5028l884 = new EnumC5028l80("SCREEN_WV_VERIFICATION", 84, "Screen", EnumC5204lz.WV_VERIFICATION);
        B0 = enumC5028l884;
        EnumC5028l80 enumC5028l885 = new EnumC5028l80("ID_COPIED", 85, "ID Copied", enumC5204lz10);
        C0 = enumC5028l885;
        EnumC5028l80 enumC5028l886 = new EnumC5028l80("LOGOUT_SHOW", 86, "Logout show", enumC5204lz10);
        D0 = enumC5028l886;
        EnumC5028l80 enumC5028l887 = new EnumC5028l80("SCREEN_RATING", 87, "Rating screen", enumC5204lz10);
        EnumC5028l80 enumC5028l888 = new EnumC5028l80("ACCOUNT", 88, "Account", enumC5204lz12);
        E0 = enumC5028l888;
        EnumC5204lz enumC5204lz17 = EnumC5204lz.WEB_VIEW;
        EnumC5028l80 enumC5028l889 = new EnumC5028l80("WEB_VIEW_CLOSED", 89, "Close", enumC5204lz17);
        EnumC5028l80 enumC5028l890 = new EnumC5028l80("WEB_VIEW_RELOADED", 90, "Reload", enumC5204lz17);
        F0 = enumC5028l890;
        EnumC5028l80 enumC5028l891 = new EnumC5028l80("SHOW_DIALOG_WIN_DEMO", 91, "Show dialog win demo", enumC5204lz9);
        EnumC5028l80 enumC5028l892 = new EnumC5028l80("PUSHES_DENIED", 92, "Deny", EnumC5204lz.PUSHES);
        G0 = enumC5028l892;
        EnumC5028l80 enumC5028l893 = new EnumC5028l80("AB_REQUEST_ERROR", 93, "Request error", EnumC5204lz.AB);
        H0 = enumC5028l893;
        EnumC5028l80 enumC5028l894 = new EnumC5028l80("IN_APP_TG_SUBSCRIBE_BTN_CLICK", 94, "Inapp Tgsubscribe Btn Click", EnumC5204lz.CRM);
        I0 = enumC5028l894;
        EnumC5204lz enumC5204lz18 = EnumC5204lz.RATE_US_SCREEN;
        EnumC5028l80 enumC5028l895 = new EnumC5028l80("RATE_US_SCREEN_SHOW", 95, "Show", enumC5204lz18);
        J0 = enumC5028l895;
        EnumC5028l80 enumC5028l896 = new EnumC5028l80("RATE_US_SCREEN_CLOSE", 96, "Close", enumC5204lz18);
        K0 = enumC5028l896;
        EnumC5028l80 enumC5028l897 = new EnumC5028l80("RATE_DONE", 97, "Done", EnumC5204lz.RATE);
        L0 = enumC5028l897;
        EnumC5028l80 enumC5028l898 = new EnumC5028l80("PROFIT_LIMIT_POPUP_SHOW", 98, "profit_limit-popup-show", null);
        M0 = enumC5028l898;
        EnumC5028l80 enumC5028l899 = new EnumC5028l80("PROFIT_LIMIT_TOGGLE_CLICK", 99, "profit_limit_toggle_click", null);
        N0 = enumC5028l899;
        EnumC5028l80 enumC5028l8100 = new EnumC5028l80("STRATEGY_SUMMARY_SCREEN_SHOW", 100, "strategy_summary-screen-show", null);
        O0 = enumC5028l8100;
        EnumC5028l80 enumC5028l8101 = new EnumC5028l80("STRATEGY_SELECTION_OVERLAY_SHOW", 101, "strategy_selection-overlay-show", null);
        P0 = enumC5028l8101;
        EnumC5028l80 enumC5028l8102 = new EnumC5028l80("PROFILE_SCREEN_SHOW", 102, "profile-screen-show", null);
        Q0 = enumC5028l8102;
        EnumC5028l80 enumC5028l8103 = new EnumC5028l80("ON_BACKGROUND", 103, "onBackground", null);
        R0 = enumC5028l8103;
        EnumC5028l80 enumC5028l8104 = new EnumC5028l80("ON_FOREGROUND", 104, "onForeground", null);
        S0 = enumC5028l8104;
        EnumC5028l80 enumC5028l8105 = new EnumC5028l80("STORIES_FINiSHED", 105, "stories-finished", null);
        T0 = enumC5028l8105;
        EnumC5028l80 enumC5028l8106 = new EnumC5028l80("CANCEL_BUTTON_CLICK", 106, "cancel-btn-click", null);
        U0 = enumC5028l8106;
        EnumC5028l80 enumC5028l8107 = new EnumC5028l80("LOGIN_CLICK", 107, "Click", enumC5204lz4);
        V0 = enumC5028l8107;
        EnumC5028l80 enumC5028l8108 = new EnumC5028l80("REGISTRATION_CLICK", 108, "Click", enumC5204lz3);
        W0 = enumC5028l8108;
        EnumC5028l80[] enumC5028l80Arr = {enumC5028l80, enumC5028l81, enumC5028l82, enumC5028l83, enumC5028l84, enumC5028l85, enumC5028l86, enumC5028l87, enumC5028l88, enumC5028l89, enumC5028l810, enumC5028l811, enumC5028l812, enumC5028l813, enumC5028l814, enumC5028l815, enumC5028l816, enumC5028l817, enumC5028l818, enumC5028l819, enumC5028l820, enumC5028l821, enumC5028l822, enumC5028l823, enumC5028l824, enumC5028l825, enumC5028l826, enumC5028l827, enumC5028l828, enumC5028l829, enumC5028l830, enumC5028l831, enumC5028l832, enumC5028l833, enumC5028l834, enumC5028l835, enumC5028l836, enumC5028l837, enumC5028l838, enumC5028l839, enumC5028l840, enumC5028l841, enumC5028l842, enumC5028l843, enumC5028l844, enumC5028l845, enumC5028l846, enumC5028l847, enumC5028l848, enumC5028l849, enumC5028l850, enumC5028l851, enumC5028l852, enumC5028l853, enumC5028l854, enumC5028l855, enumC5028l856, enumC5028l857, enumC5028l858, enumC5028l859, enumC5028l860, enumC5028l861, enumC5028l862, enumC5028l863, enumC5028l864, enumC5028l865, enumC5028l866, enumC5028l867, enumC5028l868, enumC5028l869, enumC5028l870, enumC5028l871, enumC5028l872, enumC5028l873, enumC5028l874, enumC5028l875, enumC5028l876, enumC5028l877, enumC5028l878, enumC5028l879, enumC5028l880, enumC5028l881, enumC5028l882, enumC5028l883, enumC5028l884, enumC5028l885, enumC5028l886, enumC5028l887, enumC5028l888, enumC5028l889, enumC5028l890, enumC5028l891, enumC5028l892, enumC5028l893, enumC5028l894, enumC5028l895, enumC5028l896, enumC5028l897, enumC5028l898, enumC5028l899, enumC5028l8100, enumC5028l8101, enumC5028l8102, enumC5028l8103, enumC5028l8104, enumC5028l8105, enumC5028l8106, enumC5028l8107, enumC5028l8108};
        X0 = enumC5028l80Arr;
        C1952Ru.i(enumC5028l80Arr);
    }

    public EnumC5028l80(String str, int i2, String str2, EnumC5204lz enumC5204lz) {
        super(str, i2);
        this.d = str2;
        this.e = enumC5204lz;
    }

    public static EnumC5028l80 valueOf(String str) {
        return (EnumC5028l80) Enum.valueOf(EnumC5028l80.class, str);
    }

    public static EnumC5028l80[] values() {
        return (EnumC5028l80[]) X0.clone();
    }

    @NotNull
    public final String b() {
        StringBuilder sb = new StringBuilder();
        EnumC5204lz enumC5204lz = this.e;
        if (enumC5204lz != null) {
            sb.append(enumC5204lz.d);
            sb.append(" - ");
        }
        sb.append(this.d);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
