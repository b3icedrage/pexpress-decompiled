package defpackage;

import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001?B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0018R\u0014\u0010;\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0018R\u0014\u0010=\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"LN61;", "LCu0$a;", "LTt0;", "LWr0;", "_application", "LCu0;", "_requestPermission", "_applicationService", "Lsu0;", "_preferenceService", "LxI;", "_configModelStore", "<init>", "(LWr0;LCu0;LWr0;Lsu0;LxI;)V", "", "registerPollingLifecycleListener", "()V", "pollForPermission", "(LJM;)Ljava/lang/Object;", "", "enabled", "permissionPromptCompleted", "(Z)V", "showFallbackAlertDialog", "()Z", "notificationsEnabled", "fallbackToSettings", "prompt", "(ZLJM;)Ljava/lang/Object;", "LSt0;", "handler", "subscribe", "(LSt0;)V", "unsubscribe", "onAccept", "onReject", "LWr0;", "LCu0;", "Lsu0;", "LxI;", "Lzf2;", "waiter", "Lzf2;", "Lxf2;", "pollingWaiter", "Lxf2;", "", "pollingWaitInterval", "J", "LO80;", "events", "LO80;", "Z", "LKN;", "coroutineScope", "LKN;", "supportsNativePrompt", "getSupportsNativePrompt", "getCanRequestPermission", "canRequestPermission", "getHasSubscribers", "hasSubscribers", "Companion", "b", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class N61 implements InterfaceC0781Cu0.a, InterfaceC2106Tt0 {

    @NotNull
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";

    @NotNull
    private static final String PERMISSION_TYPE = "NOTIFICATION";

    @NotNull
    private final InterfaceC2338Wr0 _application;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC6659su0 _preferenceService;

    @NotNull
    private final InterfaceC0781Cu0 _requestPermission;

    @NotNull
    private final KN coroutineScope;
    private boolean enabled;

    @NotNull
    private final O80<InterfaceC2028St0> events;
    private long pollingWaitInterval;

    @NotNull
    private final C7659xf2 pollingWaiter;
    private final boolean supportsNativePrompt;

    @NotNull
    private final C8079zf2<Boolean> waiter;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1", f = "NotificationPermissionController.kt", l = {83}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return N61.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                N61 n61 = N61.this;
                this.label = 1;
                if (n61.pollForPermission(this) == mn) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSt0;", "it", "", "invoke", "(LSt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC2028St0, Unit> {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(1);
            this.$enabled = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2028St0 interfaceC2028St0) {
            invoke2(interfaceC2028St0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2028St0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController", f = "NotificationPermissionController.kt", l = {112}, m = "pollForPermission")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
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
            return N61.this.pollForPermission(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSt0;", "it", "", "invoke", "(LSt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class e extends ML0 implements Function1<InterfaceC2028St0, Unit> {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.$enabled = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2028St0 interfaceC2028St0) {
            invoke2(interfaceC2028St0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC2028St0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$3", f = "NotificationPermissionController.kt", l = {113}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends AW1 implements Function2<KN, JM<? super Object>, Object> {
        int label;

        public f(JM<? super f> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return N61.this.new f(jm);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull KN kn, @Nullable JM<Object> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            C7659xf2 c7659xf2 = N61.this.pollingWaiter;
            this.label = 1;
            Object objWaitForWake = c7659xf2.waitForWake(this);
            return objWaitForWake == mn ? mn : objWaitForWake;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(KN kn, JM<? super Object> jm) {
            return invoke2(kn, (JM<Object>) jm);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController", f = "NotificationPermissionController.kt", l = {144, 165}, m = "prompt")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends LM {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(JM<? super g> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return N61.this.prompt(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"N61$h", "LGi;", "", "firedOnSubscribe", "", "onFocus", "(Z)V", "onUnfocused", "()V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class h extends C1056Gi {
        public h() {
        }

        @Override // defpackage.C1056Gi, defpackage.InterfaceC2256Vr0
        public void onFocus(boolean firedOnSubscribe) {
            super.onFocus(firedOnSubscribe);
            N61 n61 = N61.this;
            n61.pollingWaitInterval = n61._configModelStore.getModel().getForegroundFetchNotificationPermissionInterval();
            N61.this.pollingWaiter.wake();
        }

        @Override // defpackage.C1056Gi, defpackage.InterfaceC2256Vr0
        public void onUnfocused() {
            super.onUnfocused();
            N61 n61 = N61.this;
            n61.pollingWaitInterval = n61._configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"N61$i", "LA9$a;", "", "onAccept", "()V", "onDecline", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class i implements A9.a {
        final /* synthetic */ Activity $activity;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"N61$i$a", "LGi;", "", "firedOnSubscribe", "", "onFocus", "(Z)V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class a extends C1056Gi {
            final /* synthetic */ N61 this$0;

            public a(N61 n61) {
                this.this$0 = n61;
            }

            @Override // defpackage.C1056Gi, defpackage.InterfaceC2256Vr0
            public void onFocus(boolean firedOnSubscribe) {
                if (firedOnSubscribe) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                this.this$0.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission(N61.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService));
            }
        }

        public i(Activity activity) {
            this.$activity = activity;
        }

        @Override // A9.a
        public void onAccept() {
            N61.this._applicationService.addApplicationLifecycleHandler(new a(N61.this));
            D21.INSTANCE.show(this.$activity);
        }

        @Override // A9.a
        public void onDecline() {
            N61.this.permissionPromptCompleted(false);
        }
    }

    public N61(@NotNull InterfaceC2338Wr0 _application, @NotNull InterfaceC0781Cu0 _requestPermission, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC6659su0 _preferenceService, @NotNull C7582xI _configModelStore) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_requestPermission, "_requestPermission");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_preferenceService, "_preferenceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new C8079zf2<>();
        this.pollingWaiter = new C7659xf2();
        this.events = new O80<>();
        EM emA = LN.a(Cm2.j("NotificationPermissionController"));
        this.coroutineScope = emA;
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = _configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        C5189lv.k(emA, null, new a(null), 3);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return C6913u61.areNotificationsEnabled$default(C6913u61.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean enabled) {
        this.enabled = enabled;
        this.waiter.wake(Boolean.valueOf(enabled));
        this.events.fire(new c(enabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pollForPermission(JM<? super Unit> jm) {
        d dVar;
        N61 n61;
        long j;
        f fVar;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i3 = dVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            n61 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n61 = (N61) dVar.L$0;
            C1795Pt1.b(obj);
        }
        do {
            boolean zNotificationsEnabled = n61.notificationsEnabled();
            if (n61.enabled != zNotificationsEnabled) {
                n61.enabled = zNotificationsEnabled;
                n61.events.fire(new e(zNotificationsEnabled));
            }
            j = n61.pollingWaitInterval;
            fVar = n61.new f(null);
            dVar.L$0 = n61;
            dVar.label = 1;
        } while (OZ1.c(j, fVar, dVar) != mn);
        return mn;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity activity = this._application.get_current();
        if (activity == null) {
            return false;
        }
        A9 a9 = A9.INSTANCE;
        String string = activity.getString(C1693Ol1.notification_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activity.getString(C1693Ol1.notification_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.str…mission_settings_message)");
        a9.show(activity, string, string2, new i(activity));
        return true;
    }

    @Override // defpackage.InterfaceC2106Tt0
    public boolean getCanRequestPermission() {
        Boolean bool = this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE);
        Intrinsics.checkNotNull(bool);
        return !bool.booleanValue();
    }

    @Override // defpackage.InterfaceC2106Tt0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // defpackage.InterfaceC0781Cu0.a
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // defpackage.InterfaceC0781Cu0.a
    public void onReject(boolean fallbackToSettings) {
        if (fallbackToSettings ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2106Tt0
    @Nullable
    public Object prompt(boolean z, @NotNull JM<? super Boolean> jm) {
        g gVar;
        N61 n61;
        if (jm instanceof g) {
            gVar = (g) jm;
            int i2 = gVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.label = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(jm);
            }
        } else {
            gVar = new g(jm);
        }
        Object obj = gVar.result;
        MN mn = MN.d;
        int i3 = gVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            gVar.L$0 = this;
            gVar.Z$0 = z;
            gVar.label = 1;
            if (C8056za.z(gVar) != mn) {
                n61 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        z = gVar.Z$0;
        n61 = (N61) gVar.L$0;
        C1795Pt1.b(obj);
        if (n61.notificationsEnabled()) {
            return Boolean.TRUE;
        }
        if (n61.supportsNativePrompt) {
            n61._requestPermission.startPrompt(z, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, N61.class);
        } else {
            if (!z) {
                return Boolean.FALSE;
            }
            n61.showFallbackAlertDialog();
        }
        C8079zf2<Boolean> c8079zf2 = n61.waiter;
        gVar.L$0 = null;
        gVar.label = 2;
        Object objWaitForWake = c8079zf2.waitForWake(gVar);
        return objWaitForWake == mn ? mn : objWaitForWake;
    }

    @Override // defpackage.InterfaceC2106Tt0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC2028St0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // defpackage.InterfaceC2106Tt0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC2028St0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }
}
