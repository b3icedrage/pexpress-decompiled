package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.onesignal.common.AndroidUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ei2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 M2\u00020\u0001:\u0003NOPB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010!J\u0013\u0010+\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010!J\u001d\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010'H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u0010\u0012J\u0019\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0010H\u0002¢\u0006\u0004\b7\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lei2;", "LTr0;", "LQw0;", "message", "Landroid/app/Activity;", "activity", "LVw0;", "messageContent", "LNs0;", "_lifecycle", "LWr0;", "_applicationService", "LVs0;", "_promptFactory", "<init>", "(LQw0;Landroid/app/Activity;LVw0;LNs0;LWr0;LVs0;)V", "", "onActivityAvailable", "(Landroid/app/Activity;)V", "onActivityStopped", "currentActivity", "", "base64Message", "", "isFullScreen", "setupWebView", "(Landroid/app/Activity;Ljava/lang/String;ZLJM;)Ljava/lang/Object;", C3630ei2.IAM_DRAG_TO_DISMISS_DISABLED_KEY, "createNewInAppMessageView", "(Z)V", "backgroundDismissAndAwaitNextMessage", "()V", "dismissAndAwaitNextMessage", "(LJM;)Ljava/lang/Object;", "content", "setContentSafeAreaInsets", "(LVw0;Landroid/app/Activity;)V", "Lorg/json/JSONObject;", "jsonObject", "", "pageRectToViewHeight", "(Landroid/app/Activity;Lorg/json/JSONObject;)I", "updateSafeAreaInsets", "calculateHeightAndShowWebViewAfterNewActivity", "newHeight", "showMessageView", "(Ljava/lang/Integer;LJM;)Ljava/lang/Object;", "setWebViewToMaxSize", "Ljx0;", Promotion.ACTION_VIEW, "setMessageView", "(Ljx0;)V", "getWebViewMaxSizeX", "(Landroid/app/Activity;)I", "getWebViewMaxSizeY", "enableWebViewRemoteDebugging", "LQw0;", "Landroid/app/Activity;", "LVw0;", "LNs0;", "LWr0;", "LVs0;", "Lh21;", "messageViewMutex", "Lh21;", "LH71;", "webView", "LH71;", "messageView", "Ljx0;", "currentActivityName", "Ljava/lang/String;", "lastPageHeight", "Ljava/lang/Integer;", "dismissFired", "Z", "closing", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "c", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3630ei2 implements InterfaceC2100Tr0 {

    @NotNull
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";

    @NotNull
    public static final String EVENT_TYPE_KEY = "type";

    @NotNull
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";

    @NotNull
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";

    @NotNull
    public static final String EVENT_TYPE_RESIZE = "resize";

    @NotNull
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";

    @NotNull
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";

    @NotNull
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";

    @NotNull
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";

    @NotNull
    public static final String JS_OBJ_NAME = "OSAndroid";

    @NotNull
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";

    @NotNull
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";

    @NotNull
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC1635Ns0 _lifecycle;

    @NotNull
    private final InterfaceC2259Vs0 _promptFactory;

    @NotNull
    private Activity activity;
    private boolean closing;

    @Nullable
    private String currentActivityName;
    private boolean dismissFired;

    @Nullable
    private Integer lastPageHeight;

    @NotNull
    private final C1881Qw0 message;

    @NotNull
    private final C2271Vw0 messageContent;

    @Nullable
    private C4776jx0 messageView;

    @NotNull
    private final InterfaceC4117h21 messageViewMutex;

    @Nullable
    private H71 webView;
    private static final int MARGIN_PX_SIZE = Ie2.INSTANCE.dpToPx(24);

    /* JADX INFO: renamed from: ei2$b */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lei2$b;", "", "<init>", "(Lei2;)V", "Lorg/json/JSONObject;", "jsonObject", "", "handleRenderComplete", "(Lorg/json/JSONObject;)V", "", "getPageHeightData", "(Lorg/json/JSONObject;)I", "Lei2$c;", "getDisplayLocation", "(Lorg/json/JSONObject;)Lei2$c;", "", "getDragToDismissDisabled", "(Lorg/json/JSONObject;)Z", "handleActionTaken", "handlePageChange", "", "message", "postMessage", "(Ljava/lang/String;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jsonObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (jsonObject.has(C3630ei2.IAM_DISPLAY_LOCATION_KEY) && !Intrinsics.a(jsonObject.get(C3630ei2.IAM_DISPLAY_LOCATION_KEY), "")) {
                    String strOptString = jsonObject.optString(C3630ei2.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\n  …                        )");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    String upperCase = strOptString.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    return c.valueOf(upperCase);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return cVar;
        }

        private final boolean getDragToDismissDisabled(JSONObject jsonObject) {
            try {
                return jsonObject.getBoolean(C3630ei2.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jsonObject) {
            try {
                C3630ei2 c3630ei2 = C3630ei2.this;
                Activity activity = c3630ei2.activity;
                JSONObject jSONObject = jsonObject.getJSONObject(C3630ei2.IAM_PAGE_META_DATA_KEY);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.getJSONObject(IAM_PAGE_META_DATA_KEY)");
                return c3630ei2.pageRectToViewHeight(activity, jSONObject);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jsonObject) throws JSONException {
            JSONObject body = jsonObject.getJSONObject("body");
            Intrinsics.checkNotNullExpressionValue(body, "body");
            String strSafeString = JD0.safeString(body, "id");
            C3630ei2.this.closing = body.getBoolean("close");
            if (C3630ei2.this.message.getIsPreview()) {
                C3630ei2.this._lifecycle.messageActionOccurredOnPreview(C3630ei2.this.message, new C2193Uw0(body, C3630ei2.this._promptFactory));
            } else if (strSafeString != null) {
                C3630ei2.this._lifecycle.messageActionOccurredOnMessage(C3630ei2.this.message, new C2193Uw0(body, C3630ei2.this._promptFactory));
            }
            if (C3630ei2.this.closing) {
                C3630ei2.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jsonObject) {
            C3630ei2.this._lifecycle.messagePageChanged(C3630ei2.this.message, new C2840ax0(jsonObject));
        }

        private final void handleRenderComplete(JSONObject jsonObject) {
            c displayLocation = getDisplayLocation(jsonObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jsonObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jsonObject);
            C3630ei2.this.messageContent.setDisplayLocation(displayLocation);
            C3630ei2.this.messageContent.setPageHeight(pageHeightData);
            C3630ei2.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        @JavascriptInterface
        public final void postMessage(@NotNull String message) {
            C4776jx0 c4776jx0;
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                NS0.debug$default("OSJavaScriptInterface:postMessage: " + message, null, 2, null);
                JSONObject jSONObject = new JSONObject(message);
                String string = jSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (string.equals(C3630ei2.EVENT_TYPE_PAGE_CHANGE)) {
                                handlePageChange(jSONObject);
                            }
                            break;
                        case -934437708:
                            string.equals(C3630ei2.EVENT_TYPE_RESIZE);
                            break;
                        case 42998156:
                            if (string.equals(C3630ei2.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                            }
                            break;
                        case 1851145598:
                            if (string.equals(C3630ei2.EVENT_TYPE_ACTION_TAKEN) && (c4776jx0 = C3630ei2.this.messageView) != null && !c4776jx0.getIsDragging()) {
                                handleActionTaken(jSONObject);
                            }
                            break;
                        default:
                            break;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: ei2$c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lei2$c;", "", "<init>", "(Ljava/lang/String;I)V", "", "isBanner", "()Z", "TOP_BANNER", "BOTTOM_BANNER", "CENTER_MODAL", "FULL_SCREEN", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum c {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        /* JADX INFO: renamed from: ei2$c$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.TOP_BANNER.ordinal()] = 1;
                iArr[c.BOTTOM_BANNER.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final boolean isBanner() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            return i == 1 || i == 2;
        }
    }

    /* JADX INFO: renamed from: ei2$d */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$backgroundDismissAndAwaitNextMessage$1", f = "WebViewManager.kt", l = {387}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C3630ei2.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((d) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C3630ei2 c3630ei2 = C3630ei2.this;
                this.label = 1;
                if (c3630ei2.dismissAndAwaitNextMessage(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: ei2$e */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", l = {219, 224, 230}, m = "calculateHeightAndShowWebViewAfterNewActivity")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(JM<? super e> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C3630ei2.this.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    /* JADX INFO: renamed from: ei2$f */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1", f = "WebViewManager.kt", l = {238}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ int $pagePxHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, JM<? super f> jm) {
            super(1, jm);
            this.$pagePxHeight = i;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C3630ei2.this.new f(this.$pagePxHeight, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((f) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C3630ei2 c3630ei2 = C3630ei2.this;
                Integer num = new Integer(this.$pagePxHeight);
                this.label = 1;
                if (c3630ei2.showMessageView(num, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: ei2$g */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"ei2$g", "Ljx0$b;", "", "onMessageWasDisplayed", "()V", "onMessageWillDismiss", "onMessageWasDismissed", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class g implements C4776jx0.b {
        final /* synthetic */ C3630ei2 $self;

        public g(C3630ei2 c3630ei2) {
            this.$self = c3630ei2;
        }

        @Override // defpackage.C4776jx0.b
        public void onMessageWasDismissed() {
            C3630ei2.this._lifecycle.messageWasDismissed(C3630ei2.this.message);
            C3630ei2.this._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        @Override // defpackage.C4776jx0.b
        public void onMessageWasDisplayed() {
            C3630ei2.this._lifecycle.messageWasDisplayed(C3630ei2.this.message);
        }

        @Override // defpackage.C4776jx0.b
        public void onMessageWillDismiss() {
            C3630ei2.this._lifecycle.messageWillDismiss(C3630ei2.this.message);
        }
    }

    /* JADX INFO: renamed from: ei2$h */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", l = {403}, m = "dismissAndAwaitNextMessage")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(JM<? super h> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C3630ei2.this.dismissAndAwaitNextMessage(this);
        }
    }

    /* JADX INFO: renamed from: ei2$i */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$onActivityAvailable$1", f = "WebViewManager.kt", l = {254, 261, 265}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class i extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ C3630ei2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, C3630ei2 c3630ei2, JM<? super i> jm) {
            super(1, jm);
            this.$lastActivityName = str;
            this.this$0 = c3630ei2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new i(this.$lastActivityName, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((i) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r6.showMessageView(null, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r6.showMessageView(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r6.calculateHeightAndShowWebViewAfterNewActivity(r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            return r0;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                goto L18
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                defpackage.C1795Pt1.b(r6)
                goto L71
            L1c:
                defpackage.C1795Pt1.b(r6)
                java.lang.String r6 = r5.$lastActivityName
                if (r6 != 0) goto L2f
                ei2 r6 = r5.this$0
                r5.label = r4
                r1 = 0
                java.lang.Object r6 = defpackage.C3630ei2.access$showMessageView(r6, r1, r5)
                if (r6 != r0) goto L71
                goto L70
            L2f:
                ei2 r1 = r5.this$0
                java.lang.String r1 = defpackage.C3630ei2.access$getCurrentActivityName$p(r1)
                boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r1)
                if (r6 != 0) goto L66
                ei2 r6 = r5.this$0
                boolean r6 = defpackage.C3630ei2.access$getClosing$p(r6)
                if (r6 != 0) goto L71
                ei2 r6 = r5.this$0
                jx0 r6 = defpackage.C3630ei2.access$getMessageView$p(r6)
                if (r6 == 0) goto L57
                ei2 r6 = r5.this$0
                jx0 r6 = defpackage.C3630ei2.access$getMessageView$p(r6)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                r6.removeAllViews()
            L57:
                ei2 r6 = r5.this$0
                java.lang.Integer r1 = defpackage.C3630ei2.access$getLastPageHeight$p(r6)
                r5.label = r3
                java.lang.Object r6 = defpackage.C3630ei2.access$showMessageView(r6, r1, r5)
                if (r6 != r0) goto L71
                goto L70
            L66:
                ei2 r6 = r5.this$0
                r5.label = r2
                java.lang.Object r6 = defpackage.C3630ei2.access$calculateHeightAndShowWebViewAfterNewActivity(r6, r5)
                if (r6 != r0) goto L71
            L70:
                return r0
            L71:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C3630ei2.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ei2$j */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", l = {327}, m = "setupWebView")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(JM<? super j> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C3630ei2.this.setupWebView(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: ei2$k */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", l = {469, 294, 297, 298}, m = "showMessageView")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class k extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public k(JM<? super k> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C3630ei2.this.showMessageView(null, this);
        }
    }

    /* JADX INFO: renamed from: ei2$l */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$updateSafeAreaInsets$2", f = "WebViewManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class l extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        public l(JM<? super l> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C3630ei2.this.new l(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((l) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            int[] cutoutAndStatusBarInsets = Ie2.INSTANCE.getCutoutAndStatusBarInsets(C3630ei2.this.activity);
            String str = String.format(C3630ei2.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{new Integer(cutoutAndStatusBarInsets[0]), new Integer(cutoutAndStatusBarInsets[1]), new Integer(cutoutAndStatusBarInsets[2]), new Integer(cutoutAndStatusBarInsets[3])}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            String str2 = String.format(C3630ei2.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            H71 h71 = C3630ei2.this.webView;
            Intrinsics.checkNotNull(h71);
            h71.evaluateJavascript(str2, null);
            return Unit.a;
        }
    }

    public C3630ei2(@NotNull C1881Qw0 message, @NotNull Activity activity, @NotNull C2271Vw0 messageContent, @NotNull InterfaceC1635Ns0 _lifecycle, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC2259Vs0 _promptFactory) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_promptFactory, "_promptFactory");
        this.message = message;
        this.activity = activity;
        this.messageContent = messageContent;
        this._lifecycle = _lifecycle;
        this._applicationService = _applicationService;
        this._promptFactory = _promptFactory;
        this.messageViewMutex = ED.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (showMessageView(null, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object calculateHeightAndShowWebViewAfterNewActivity(defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C3630ei2.e
            if (r0 == 0) goto L13
            r0 = r8
            ei2$e r0 = (defpackage.C3630ei2.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ei2$e r0 = new ei2$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L46
            if (r2 == r4) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.L$0
            ei2 r0 = (defpackage.C3630ei2) r0
            defpackage.C1795Pt1.b(r8)
            goto L9c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.L$0
            ei2 r2 = (defpackage.C3630ei2) r2
            defpackage.C1795Pt1.b(r8)
            goto L83
        L42:
            defpackage.C1795Pt1.b(r8)
            goto L6d
        L46:
            defpackage.C1795Pt1.b(r8)
            jx0 r8 = r7.messageView
            if (r8 != 0) goto L50
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L50:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            ei2$c r8 = r8.getDisplayPosition()
            ei2$c r2 = defpackage.C3630ei2.c.FULL_SCREEN
            r6 = 0
            if (r8 != r2) goto L70
            Vw0 r8 = r7.messageContent
            boolean r8 = r8.getIsFullBleed()
            if (r8 != 0) goto L70
            r0.label = r4
            java.lang.Object r8 = r7.showMessageView(r6, r0)
            if (r8 != r1) goto L6d
            goto L9a
        L6d:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L70:
            java.lang.String r8 = "In app message new activity, calculate height and show "
            defpackage.NS0.debug$default(r8, r6, r5, r6)
            Wr0 r8 = r7._applicationService
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.waitUntilActivityReady(r0)
            if (r8 != r1) goto L82
            goto L9a
        L82:
            r2 = r7
        L83:
            android.app.Activity r8 = r2.activity
            r2.setWebViewToMaxSize(r8)
            Vw0 r8 = r2.messageContent
            boolean r8 = r8.getIsFullBleed()
            if (r8 == 0) goto L9d
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r2.updateSafeAreaInsets(r0)
            if (r8 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r0 = r2
        L9c:
            r2 = r0
        L9d:
            H71 r8 = r2.webView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            di2 r0 = new di2
            r0.<init>()
            java.lang.String r1 = "getPageMetaData()"
            r8.evaluateJavascript(r1, r0)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3630ei2.calculateHeightAndShowWebViewAfterNewActivity(JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeightAndShowWebViewAfterNewActivity$lambda-0, reason: not valid java name */
    public static final void m17calculateHeightAndShowWebViewAfterNewActivity$lambda0(C3630ei2 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            LY1.suspendifyOnThread$default(0, this$0.new f(this$0.pageRectToViewHeight(this$0.activity, new JSONObject(str)), null), 1, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (NS0.atLogLevel(EnumC5513nS0.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.getIsFullBleed()) {
            return Ie2.INSTANCE.getFullbleedWindowWidth(activity);
        }
        return Ie2.INSTANCE.getWindowWidth(activity) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity) {
        return Ie2.INSTANCE.getWindowHeight(activity) - (this.messageContent.getIsFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity, JSONObject jsonObject) {
        try {
            int iDpToPx = Ie2.INSTANCE.dpToPx(jsonObject.getJSONObject("rect").getInt("height"));
            NS0.debug$default("getPageHeightData:pxHeight: " + iDpToPx, null, 2, null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity);
            if (iDpToPx <= webViewMaxSizeY) {
                return iDpToPx;
            }
            NS0.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, null, 2, null);
            return webViewMaxSizeY;
        } catch (JSONException e2) {
            NS0.error("pageRectToViewHeight could not get page height", e2);
            return -1;
        }
    }

    private final void setMessageView(C4776jx0 view) {
        this.messageView = view;
    }

    private final void setWebViewToMaxSize(Activity activity) {
        H71 h71 = this.webView;
        Intrinsics.checkNotNull(h71);
        h71.layout(0, 0, getWebViewMaxSizeX(activity), getWebViewMaxSizeY(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:57:0x00f3, B:22:0x004b, B:52:0x00e0, B:54:0x00e4, B:25:0x0058, B:47:0x00cb, B:49:0x00cf, B:32:0x0085, B:34:0x0089, B:37:0x0094, B:39:0x00a7, B:41:0x00b1, B:43:0x00b7), top: B:64:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0 A[Catch: all -> 0x0038, PHI: r0 r10
      0x00e0: PHI (r0v5 ei2) = (r0v4 ei2), (r0v4 ei2), (r0v9 ei2) binds: [B:48:0x00cd, B:50:0x00dd, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r10v4 h21) = (r10v3 h21), (r10v3 h21), (r10v12 h21) binds: [B:48:0x00cd, B:50:0x00dd, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:57:0x00f3, B:22:0x004b, B:52:0x00e0, B:54:0x00e4, B:25:0x0058, B:47:0x00cb, B:49:0x00cf, B:32:0x0085, B:34:0x0089, B:37:0x0094, B:39:0x00a7, B:41:0x00b1, B:43:0x00b7), top: B:64:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:57:0x00f3, B:22:0x004b, B:52:0x00e0, B:54:0x00e4, B:25:0x0058, B:47:0x00cb, B:49:0x00cf, B:32:0x0085, B:34:0x0089, B:37:0x0094, B:39:0x00a7, B:41:0x00b1, B:43:0x00b7), top: B:64:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r11.checkIfShouldDismiss(r1) == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showMessageView(java.lang.Integer r10, defpackage.JM<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3630ei2.showMessageView(java.lang.Integer, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSafeAreaInsets(JM<? super Unit> jm) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new l(null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        LY1.suspendifyOnThread$default(0, new d(null), 1, null);
    }

    public final void createNewInAppMessageView(boolean dragToDismissDisabled) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        boolean manifestMetaBoolean = AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), "com.onesignal.inAppMessageHideGrayOverlay");
        H71 h71 = this.webView;
        Intrinsics.checkNotNull(h71);
        setMessageView(new C4776jx0(h71, this.messageContent, dragToDismissDisabled, manifestMetaBoolean));
        C4776jx0 c4776jx0 = this.messageView;
        Intrinsics.checkNotNull(c4776jx0);
        c4776jx0.setMessageController(new g(this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object dismissAndAwaitNextMessage(@NotNull JM<? super Unit> jm) {
        h hVar;
        C3630ei2 c3630ei2;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        Object obj = hVar.result;
        MN mn = MN.d;
        int i3 = hVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            C4776jx0 c4776jx0 = this.messageView;
            if (c4776jx0 == null || this.dismissFired) {
                return Unit.a;
            }
            this.dismissFired = true;
            this._lifecycle.messageWillDismiss(this.message);
            hVar.L$0 = this;
            hVar.label = 1;
            if (c4776jx0.dismissAndAwaitNextMessage(hVar) == mn) {
                return mn;
            }
            c3630ei2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3630ei2 = (C3630ei2) hVar.L$0;
            C1795Pt1.b(obj);
        }
        c3630ei2.dismissFired = false;
        c3630ei2.setMessageView(null);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC2100Tr0
    public void onActivityAvailable(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        NS0.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, null, 2, null);
        LY1.suspendifyOnMain(new i(str, this, null));
    }

    @Override // defpackage.InterfaceC2100Tr0
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NS0.debug$default(DS1.b("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), null, 2, null);
        if (this.messageView == null || !Intrinsics.a(activity.getLocalClassName(), this.currentActivityName)) {
            return;
        }
        C4776jx0 c4776jx0 = this.messageView;
        Intrinsics.checkNotNull(c4776jx0);
        c4776jx0.removeAllViews();
    }

    public final void setContentSafeAreaInsets(@NotNull C2271Vw0 content, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String contentHtml = content.getContentHtml();
        int[] cutoutAndStatusBarInsets = Ie2.INSTANCE.getCutoutAndStatusBarInsets(activity);
        String str = String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        String str2 = String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        content.setContentHtml(contentHtml + str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    @Nullable
    public final Object setupWebView(@NotNull Activity activity, @NotNull String str, boolean z, @NotNull JM<? super Unit> jm) {
        j jVar;
        C3630ei2 c3630ei2;
        if (jm instanceof j) {
            jVar = (j) jm;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(jm);
            }
        } else {
            jVar = new j(jm);
        }
        Object obj = jVar.result;
        MN mn = MN.d;
        int i3 = jVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            enableWebViewRemoteDebugging();
            H71 h71 = new H71(activity);
            this.webView = h71;
            Intrinsics.checkNotNull(h71);
            h71.setOverScrollMode(2);
            H71 h72 = this.webView;
            Intrinsics.checkNotNull(h72);
            h72.setVerticalScrollBarEnabled(false);
            H71 h73 = this.webView;
            Intrinsics.checkNotNull(h73);
            h73.setHorizontalScrollBarEnabled(false);
            H71 h74 = this.webView;
            Intrinsics.checkNotNull(h74);
            h74.getSettings().setJavaScriptEnabled(true);
            H71 h75 = this.webView;
            Intrinsics.checkNotNull(h75);
            h75.addJavascriptInterface(new b(), JS_OBJ_NAME);
            if (z) {
                H71 h76 = this.webView;
                Intrinsics.checkNotNull(h76);
                h76.setSystemUiVisibility(3074);
                if (Build.VERSION.SDK_INT >= 30) {
                    H71 h77 = this.webView;
                    Intrinsics.checkNotNull(h77);
                    h77.setFitsSystemWindows(false);
                }
            }
            this._lifecycle.messageWillDisplay(this.message);
            InterfaceC2338Wr0 interfaceC2338Wr0 = this._applicationService;
            jVar.L$0 = this;
            jVar.L$1 = activity;
            jVar.L$2 = str;
            jVar.label = 1;
            if (interfaceC2338Wr0.waitUntilActivityReady(jVar) == mn) {
                return mn;
            }
            c3630ei2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) jVar.L$2;
            activity = (Activity) jVar.L$1;
            c3630ei2 = (C3630ei2) jVar.L$0;
            C1795Pt1.b(obj);
        }
        c3630ei2.setWebViewToMaxSize(activity);
        H71 h78 = c3630ei2.webView;
        Intrinsics.checkNotNull(h78);
        h78.loadData(str, "text/html; charset=utf-8", "base64");
        return Unit.a;
    }
}
