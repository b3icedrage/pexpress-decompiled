package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"LNw0;", "LLs0;", "LWr0;", "_applicationService", "LNs0;", "_lifecycle", "LVs0;", "_promptFactory", "LKs0;", "_backend", "Lct0;", "_influenceManager", "LxI;", "_configModelStore", "Let0;", "_languageContext", "Lgv0;", "_time", "<init>", "(LWr0;LNs0;LVs0;LKs0;Lct0;LxI;Let0;Lgv0;)V", "LQw0;", "message", "LVw0;", "content", "", "showMessageContent", "(LQw0;LVw0;LJM;)Ljava/lang/Object;", "Landroid/app/Activity;", "currentActivity", "initInAppMessage", "(Landroid/app/Activity;LQw0;LVw0;LJM;)Ljava/lang/Object;", "", "displayMessage", "(LQw0;LJM;)Ljava/lang/Object;", "", "previewUUID", "displayPreviewMessage", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "dismissCurrentInAppMessage", "()V", "LWr0;", "LNs0;", "LVs0;", "LKs0;", "Lct0;", "LxI;", "Let0;", "Lgv0;", "Lei2;", "lastInstance", "Lei2;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
@TargetApi(19)
public final class C1647Nw0 implements InterfaceC1476Ls0 {
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC1399Ks0 _backend;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC3247ct0 _influenceManager;

    @NotNull
    private final InterfaceC3666et0 _languageContext;

    @NotNull
    private final InterfaceC1635Ns0 _lifecycle;

    @NotNull
    private final InterfaceC2259Vs0 _promptFactory;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @Nullable
    private C3630ei2 lastInstance;

    /* JADX INFO: renamed from: Nw0$b */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", f = "InAppDisplayer.kt", l = {48, 57}, m = "displayMessage")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        Object L$1;
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
            return C1647Nw0.this.displayMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: Nw0$c */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", f = "InAppDisplayer.kt", l = {73, 79}, m = "displayPreviewMessage")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1647Nw0.this.displayPreviewMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: Nw0$d */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", f = "InAppDisplayer.kt", l = {145}, m = "initInAppMessage")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1647Nw0.this.initInAppMessage(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Nw0$e */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer$initInAppMessage$2", f = "InAppDisplayer.kt", l = {148}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ C2271Vw0 $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ C3630ei2 $webViewManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3630ei2 c3630ei2, Activity activity, String str, C2271Vw0 c2271Vw0, JM<? super e> jm) {
            super(2, jm);
            this.$webViewManager = c3630ei2;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = c2271Vw0;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            MN mn = MN.d;
            int i = this.label;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C3630ei2 c3630ei2 = this.$webViewManager;
                    Activity activity = this.$currentActivity;
                    String base64Str = this.$base64Str;
                    Intrinsics.checkNotNullExpressionValue(base64Str, "base64Str");
                    boolean isFullBleed = this.$content.getIsFullBleed();
                    this.label = 1;
                    if (c3630ei2.setupWebView(activity, base64Str, isFullBleed, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    String message = e.getMessage();
                    Intrinsics.checkNotNull(message);
                    if (StringsKt.C(message, "No WebView installed", false)) {
                        NS0.error("Error setting up WebView: ", e);
                    }
                }
                throw e;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Nw0$f */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", f = "InAppDisplayer.kt", l = {105, 107, 109, 114, 115}, m = "showMessageContent")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1647Nw0.this.showMessageContent(null, null, this);
        }
    }

    public C1647Nw0(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1635Ns0 _lifecycle, @NotNull InterfaceC2259Vs0 _promptFactory, @NotNull InterfaceC1399Ks0 _backend, @NotNull InterfaceC3247ct0 _influenceManager, @NotNull C7582xI _configModelStore, @NotNull InterfaceC3666et0 _languageContext, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_promptFactory, "_promptFactory");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._lifecycle = _lifecycle;
        this._promptFactory = _promptFactory;
        this._backend = _backend;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object initInAppMessage(Activity activity, C1881Qw0 c1881Qw0, C2271Vw0 c2271Vw0, JM<? super Unit> jm) {
        d dVar;
        Activity activity2;
        C2271Vw0 c2271Vw1;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i2 = dVar.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                String contentHtml = c2271Vw0.getContentHtml();
                Intrinsics.checkNotNull(contentHtml);
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = contentHtml.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                C3630ei2 c3630ei2 = new C3630ei2(c1881Qw0, activity, c2271Vw0, this._lifecycle, this._applicationService, this._promptFactory);
                this.lastInstance = c3630ei2;
                if (c2271Vw0.getIsFullBleed()) {
                    activity2 = activity;
                    c2271Vw1 = c2271Vw0;
                    c3630ei2.setContentSafeAreaInsets(c2271Vw1, activity2);
                } else {
                    activity2 = activity;
                    c2271Vw1 = c2271Vw0;
                }
                RV rv = C6266r20.a;
                AbstractC8109zn0 abstractC8109zn0 = QV0.a;
                e eVar = new e(c3630ei2, activity2, strEncodeToString, c2271Vw1, null);
                dVar.label = 1;
                if (C5189lv.p(abstractC8109zn0, eVar, dVar) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
        } catch (UnsupportedEncodingException e2) {
            NS0.error("Catch on initInAppMessage: ", e2);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r3.initInAppMessage(r11, r2, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (initInAppMessage(r13, r11, r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        if (r2.showMessageContent(r11, r12, r0) == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showMessageContent(defpackage.C1881Qw0 r11, defpackage.C2271Vw0 r12, defpackage.JM<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1647Nw0.showMessageContent(Qw0, Vw0, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1476Ls0
    public void dismissCurrentInAppMessage() {
        NS0.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, null, 2, null);
        C3630ei2 c3630ei2 = this.lastInstance;
        if (c3630ei2 != null) {
            Intrinsics.checkNotNull(c3630ei2);
            c3630ei2.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r2.showMessageContent(r9, r10, r0) == r1) goto L24;
     */
    @Override // defpackage.InterfaceC1476Ls0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object displayMessage(@org.jetbrains.annotations.NotNull defpackage.C1881Qw0 r9, @org.jetbrains.annotations.NotNull defpackage.JM<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C1647Nw0.b
            if (r0 == 0) goto L13
            r0 = r10
            Nw0$b r0 = (defpackage.C1647Nw0.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            Nw0$b r0 = new Nw0$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.C1795Pt1.b(r10)
            goto La5
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.L$1
            Qw0 r9 = (defpackage.C1881Qw0) r9
            java.lang.Object r2 = r0.L$0
            Nw0 r2 = (defpackage.C1647Nw0) r2
            defpackage.C1795Pt1.b(r10)
            goto L6a
        L3f:
            defpackage.C1795Pt1.b(r10)
            Ks0 r10 = r8._backend
            xI r2 = r8._configModelStore
            D01 r2 = r2.getModel()
            wI r2 = (defpackage.C7371wI) r2
            java.lang.String r2 = r2.getAppId()
            java.lang.String r5 = r9.getMessageId()
            Ow0 r6 = defpackage.C1725Ow0.INSTANCE
            et0 r7 = r8._languageContext
            java.lang.String r6 = r6.variantIdForMessage(r9, r7)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.getIAMData(r2, r5, r6, r0)
            if (r10 != r1) goto L69
            goto La4
        L69:
            r2 = r8
        L6a:
            fl0 r10 = (defpackage.C3850fl0) r10
            Vw0 r4 = r10.getContent()
            r5 = 0
            if (r4 == 0) goto La8
            Vw0 r4 = r10.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Double r4 = r4.getDisplayDuration()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            double r6 = r4.doubleValue()
            r9.setDisplayDuration(r6)
            ct0 r4 = r2._influenceManager
            java.lang.String r6 = r9.getMessageId()
            r4.onInAppMessageDisplayed(r6)
            Vw0 r10 = r10.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r2.showMessageContent(r9, r10, r0)
            if (r9 != r1) goto La5
        La4:
            return r1
        La5:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        La8:
            boolean r9 = r10.getShouldRetry()
            if (r9 == 0) goto Laf
            return r5
        Laf:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1647Nw0.displayMessage(Qw0, JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r2.showMessageContent(r8, r9, r0) == r1) goto L25;
     */
    @Override // defpackage.InterfaceC1476Ls0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object displayPreviewMessage(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull defpackage.JM<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C1647Nw0.c
            if (r0 == 0) goto L13
            r0 = r9
            Nw0$c r0 = (defpackage.C1647Nw0.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            Nw0$c r0 = new Nw0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L89
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.L$1
            Qw0 r8 = (defpackage.C1881Qw0) r8
            java.lang.Object r2 = r0.L$0
            Nw0 r2 = (defpackage.C1647Nw0) r2
            defpackage.C1795Pt1.b(r9)
            goto L67
        L3e:
            defpackage.C1795Pt1.b(r9)
            Qw0 r9 = new Qw0
            gv0 r2 = r7._time
            r9.<init>(r4, r2)
            Ks0 r2 = r7._backend
            xI r5 = r7._configModelStore
            D01 r5 = r5.getModel()
            wI r5 = (defpackage.C7371wI) r5
            java.lang.String r5 = r5.getAppId()
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r2.getIAMPreviewData(r5, r8, r0)
            if (r8 != r1) goto L63
            goto L88
        L63:
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L67:
            Vw0 r9 = (defpackage.C2271Vw0) r9
            if (r9 != 0) goto L6d
            r4 = 0
            goto L89
        L6d:
            java.lang.Double r5 = r9.getDisplayDuration()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            double r5 = r5.doubleValue()
            r8.setDisplayDuration(r5)
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r2.showMessageContent(r8, r9, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1647Nw0.displayPreviewMessage(java.lang.String, JM):java.lang.Object");
    }
}
