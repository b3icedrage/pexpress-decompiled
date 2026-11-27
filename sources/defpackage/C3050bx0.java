package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lbx0;", "Lcs0;", "LMt0;", "LLs0;", "_iamDisplayer", "LWr0;", "_applicationService", "LJt0;", "_notificationDisplayer", "LCt0;", "_notificationActivityOpener", "LOt0;", "_notificationLifeCycle", "Lpx0;", "_state", "Lgv0;", "_time", "<init>", "(LLs0;LWr0;LJt0;LCt0;LOt0;Lpx0;Lgv0;)V", "Lorg/json/JSONObject;", "payload", "", "inAppPreviewPushUUID", "(Lorg/json/JSONObject;)Ljava/lang/String;", "", "bootstrap", "()V", "jsonPayload", "", "canReceiveNotification", "(Lorg/json/JSONObject;LJM;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "jsonData", "canOpenNotification", "(Landroid/app/Activity;Lorg/json/JSONObject;LJM;)Ljava/lang/Object;", "LLs0;", "LWr0;", "LJt0;", "LCt0;", "LOt0;", "Lpx0;", "Lgv0;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3050bx0 implements InterfaceC3244cs0, InterfaceC1557Mt0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC1476Ls0 _iamDisplayer;

    @NotNull
    private final InterfaceC0778Ct0 _notificationActivityOpener;

    @NotNull
    private final InterfaceC1324Jt0 _notificationDisplayer;

    @NotNull
    private final InterfaceC1716Ot0 _notificationLifeCycle;

    @NotNull
    private final C6039px0 _state;

    @NotNull
    private final InterfaceC4092gv0 _time;

    /* JADX INFO: renamed from: bx0$a */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler", f = "InAppMessagePreviewHandler.kt", l = {58, 61}, m = "canOpenNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C3050bx0.this.canOpenNotification(null, null, this);
        }
    }

    /* JADX INFO: renamed from: bx0$b */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler", f = "InAppMessagePreviewHandler.kt", l = {RequestError.NETWORK_FAILURE, 46}, m = "canReceiveNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C3050bx0.this.canReceiveNotification(null, this);
        }
    }

    public C3050bx0(@NotNull InterfaceC1476Ls0 _iamDisplayer, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1324Jt0 _notificationDisplayer, @NotNull InterfaceC0778Ct0 _notificationActivityOpener, @NotNull InterfaceC1716Ot0 _notificationLifeCycle, @NotNull C6039px0 _state, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_iamDisplayer, "_iamDisplayer");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationActivityOpener, "_notificationActivityOpener");
        Intrinsics.checkNotNullParameter(_notificationLifeCycle, "_notificationLifeCycle");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._iamDisplayer = _iamDisplayer;
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._notificationActivityOpener = _notificationActivityOpener;
        this._notificationLifeCycle = _notificationLifeCycle;
        this._state = _state;
        this._time = _time;
    }

    private final String inAppPreviewPushUUID(JSONObject payload) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject customJSONObject = C6913u61.INSTANCE.getCustomJSONObject(payload);
            if (customJSONObject.has(R51.PUSH_ADDITIONAL_DATA_KEY) && (jSONObjectOptJSONObject = customJSONObject.optJSONObject(R51.PUSH_ADDITIONAL_DATA_KEY)) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // defpackage.InterfaceC3244cs0
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // defpackage.InterfaceC1557Mt0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object canOpenNotification(@org.jetbrains.annotations.NotNull android.app.Activity r8, @org.jetbrains.annotations.NotNull org.json.JSONObject r9, @org.jetbrains.annotations.NotNull defpackage.JM<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C3050bx0.a
            if (r0 == 0) goto L13
            r0 = r10
            bx0$a r0 = (defpackage.C3050bx0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bx0$a r0 = new bx0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r8 = r0.L$0
            bx0 r8 = (defpackage.C3050bx0) r8
            defpackage.C1795Pt1.b(r10)
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            bx0 r9 = (defpackage.C3050bx0) r9
            defpackage.C1795Pt1.b(r10)
            r10 = r8
            r8 = r9
            goto L6f
        L45:
            defpackage.C1795Pt1.b(r10)
            java.lang.String r10 = r7.inAppPreviewPushUUID(r9)
            if (r10 != 0) goto L51
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L51:
            Ct0 r2 = r7._notificationActivityOpener
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONArray r9 = r6.put(r9)
            java.lang.String r6 = "JSONArray().put(jsonData)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r8 = r2.openDestinationActivity(r8, r9, r0)
            if (r8 != r1) goto L6e
            goto L82
        L6e:
            r8 = r7
        L6f:
            px0 r9 = r8._state
            r9.setInAppMessageIdShowing(r10)
            Ls0 r9 = r8._iamDisplayer
            r0.L$0 = r8
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r10 = r9.displayPreviewMessage(r10, r0)
            if (r10 != r1) goto L83
        L82:
            return r1
        L83:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L90
            px0 r8 = r8._state
            r8.setInAppMessageIdShowing(r3)
        L90:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3050bx0.canOpenNotification(android.app.Activity, org.json.JSONObject, JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    @Override // defpackage.InterfaceC1557Mt0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object canReceiveNotification(@org.jetbrains.annotations.NotNull org.json.JSONObject r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C3050bx0.b
            if (r0 == 0) goto L13
            r0 = r7
            bx0$b r0 = (defpackage.C3050bx0.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bx0$b r0 = new bx0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L82
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            bx0 r6 = (defpackage.C3050bx0) r6
            defpackage.C1795Pt1.b(r7)
            goto L61
        L3a:
            defpackage.C1795Pt1.b(r7)
            java.lang.String r7 = r5.inAppPreviewPushUUID(r6)
            if (r7 != 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L46:
            Wr0 r2 = r5._applicationService
            boolean r2 = r2.isInForeground()
            if (r2 == 0) goto L70
            px0 r6 = r5._state
            r6.setInAppMessageIdShowing(r7)
            Ls0 r6 = r5._iamDisplayer
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r6.displayPreviewMessage(r7, r0)
            if (r7 != r1) goto L60
            goto L81
        L60:
            r6 = r5
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L82
            px0 r6 = r6._state
            r7 = 0
            r6.setInAppMessageIdShowing(r7)
            goto L82
        L70:
            r61 r7 = new r61
            gv0 r2 = r5._time
            r7.<init>(r6, r2)
            Jt0 r6 = r5._notificationDisplayer
            r0.label = r3
            java.lang.Object r6 = r6.displayNotification(r7, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3050bx0.canReceiveNotification(org.json.JSONObject, JM):java.lang.Object");
    }
}
