package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: a71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001b\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010\u0014J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00105\u001a\u00020\u00122\u0006\u00100\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00122\u0006\u00100\u001a\u000204H\u0016¢\u0006\u0004\b7\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\"\u0010>\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0018R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020*0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"La71;", "Lcu0;", "LSt0;", "LVr0;", "LWr0;", "_applicationService", "LTt0;", "_notificationPermissionController", "LXt0;", "_notificationRestoreWorkManager", "LOt0;", "_notificationLifecycleService", "LVt0;", "_notificationDataController", "Lau0;", "_summaryManager", "<init>", "(LWr0;LTt0;LXt0;LOt0;LVt0;Lau0;)V", "", "refreshNotificationState", "()V", "", "isEnabled", "setPermissionStatusAndFire", "(Z)V", "firedOnSubscribe", "onFocus", "onUnfocused", "enabled", "onNotificationPermissionChanged", "fallbackToSettings", "requestPermission", "(ZLJM;)Ljava/lang/Object;", "", "id", "removeNotification", "(I)V", "", "group", "removeGroupedNotifications", "(Ljava/lang/String;)V", "clearAllNotifications", "Lqu0;", "observer", "addPermissionObserver", "(Lqu0;)V", "removePermissionObserver", "LNt0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addForegroundLifecycleListener", "(LNt0;)V", "removeForegroundLifecycleListener", "LGt0;", "addClickListener", "(LGt0;)V", "removeClickListener", "LWr0;", "LTt0;", "LXt0;", "LOt0;", "LVt0;", "Lau0;", "permission", "Z", "getPermission", "()Z", "setPermission", "LO80;", "permissionChangedNotifier", "LO80;", "getCanRequestPermission", "canRequestPermission", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2655a71 implements InterfaceC3250cu0, InterfaceC2028St0, InterfaceC2256Vr0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC2262Vt0 _notificationDataController;

    @NotNull
    private final InterfaceC1716Ot0 _notificationLifecycleService;

    @NotNull
    private final InterfaceC2106Tt0 _notificationPermissionController;

    @NotNull
    private final InterfaceC2448Xt0 _notificationRestoreWorkManager;

    @NotNull
    private final InterfaceC2831au0 _summaryManager;
    private boolean permission;

    @NotNull
    private final O80<InterfaceC6240qu0> permissionChangedNotifier;

    /* JADX INFO: renamed from: a71$a */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.NotificationsManager$1", f = "NotificationsManager.kt", l = {57}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C2655a71.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC2262Vt0 interfaceC2262Vt0 = C2655a71.this._notificationDataController;
                this.label = 1;
                if (interfaceC2262Vt0.deleteExpiredNotifications(this) == mn) {
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

    /* JADX INFO: renamed from: a71$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.NotificationsManager$clearAllNotifications$1", f = "NotificationsManager.kt", l = {126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C2655a71.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC2262Vt0 interfaceC2262Vt0 = C2655a71.this._notificationDataController;
                this.label = 1;
                if (interfaceC2262Vt0.markAsDismissedForOutstanding(this) == mn) {
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

    /* JADX INFO: renamed from: a71$c */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.NotificationsManager$removeGroupedNotifications$1", f = "NotificationsManager.kt", l = {118}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JM<? super c> jm) {
            super(1, jm);
            this.$group = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C2655a71.this.new c(this.$group, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC2262Vt0 interfaceC2262Vt0 = C2655a71.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (interfaceC2262Vt0.markAsDismissedForGroup(str, this) == mn) {
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

    /* JADX INFO: renamed from: a71$d */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.NotificationsManager$removeNotification$1", f = "NotificationsManager.kt", l = {108, 109}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, JM<? super d> jm) {
            super(1, jm);
            this.$id = i;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C2655a71.this.new d(this.$id, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((d) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r1, r4) == r0) goto L17;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                MN r0 = defpackage.MN.d
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r5)
                goto L49
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                defpackage.C1795Pt1.b(r5)
                goto L30
            L1c:
                defpackage.C1795Pt1.b(r5)
                a71 r5 = defpackage.C2655a71.this
                Vt0 r5 = defpackage.C2655a71.access$get_notificationDataController$p(r5)
                int r1 = r4.$id
                r4.label = r3
                java.lang.Object r5 = r5.markAsDismissed(r1, r4)
                if (r5 != r0) goto L30
                goto L48
            L30:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L49
                a71 r5 = defpackage.C2655a71.this
                au0 r5 = defpackage.C2655a71.access$get_summaryManager$p(r5)
                int r1 = r4.$id
                r4.label = r2
                java.lang.Object r5 = r5.updatePossibleDependentSummaryOnDismiss(r1, r4)
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2655a71.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: a71$e */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.NotificationsManager$requestPermission$2", f = "NotificationsManager.kt", l = {90}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)Z"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<KN, JM<? super Boolean>, Object> {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, JM<? super e> jm) {
            super(2, jm);
            this.$fallbackToSettings = z;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2655a71.this.new e(this.$fallbackToSettings, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Boolean> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
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
            InterfaceC2106Tt0 interfaceC2106Tt0 = C2655a71.this._notificationPermissionController;
            boolean z = this.$fallbackToSettings;
            this.label = 1;
            Object objPrompt = interfaceC2106Tt0.prompt(z, this);
            return objPrompt == mn ? mn : objPrompt;
        }
    }

    /* JADX INFO: renamed from: a71$f */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqu0;", "it", "", "invoke", "(Lqu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class f extends ML0 implements Function1<InterfaceC6240qu0, Unit> {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(1);
            this.$isEnabled = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6240qu0 interfaceC6240qu0) {
            invoke2(interfaceC6240qu0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC6240qu0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public C2655a71(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC2106Tt0 _notificationPermissionController, @NotNull InterfaceC2448Xt0 _notificationRestoreWorkManager, @NotNull InterfaceC1716Ot0 _notificationLifecycleService, @NotNull InterfaceC2262Vt0 _notificationDataController, @NotNull InterfaceC2831au0 _summaryManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationPermissionController, "_notificationPermissionController");
        Intrinsics.checkNotNullParameter(_notificationRestoreWorkManager, "_notificationRestoreWorkManager");
        Intrinsics.checkNotNullParameter(_notificationLifecycleService, "_notificationLifecycleService");
        Intrinsics.checkNotNullParameter(_notificationDataController, "_notificationDataController");
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        this._applicationService = _applicationService;
        this._notificationPermissionController = _notificationPermissionController;
        this._notificationRestoreWorkManager = _notificationRestoreWorkManager;
        this._notificationLifecycleService = _notificationLifecycleService;
        this._notificationDataController = _notificationDataController;
        this._summaryManager = _summaryManager;
        this.permission = C6913u61.areNotificationsEnabled$default(C6913u61.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new O80<>();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        LY1.suspendifyOnThread$default(0, new a(null), 1, null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(C6913u61.areNotificationsEnabled$default(C6913u61.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean isEnabled) {
        boolean permission = getPermission();
        setPermission(isEnabled);
        if (permission != isEnabled) {
            this.permissionChangedNotifier.fireOnMain(new f(isEnabled));
        }
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: addClickListener */
    public void mo28addClickListener(@NotNull InterfaceC1090Gt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: addForegroundLifecycleListener */
    public void mo29addForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: addPermissionObserver */
    public void mo30addPermissionObserver(@NotNull InterfaceC6240qu0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        NS0.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: clearAllNotifications */
    public void mo31clearAllNotifications() {
        NS0.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        LY1.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: getCanRequestPermission */
    public boolean mo32getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // defpackage.InterfaceC3250cu0
    public boolean getPermission() {
        return this.permission;
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onFocus(boolean firedOnSubscribe) {
        refreshNotificationState();
    }

    @Override // defpackage.InterfaceC2028St0
    public void onNotificationPermissionChanged(boolean enabled) {
        setPermissionStatusAndFire(enabled);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: removeClickListener */
    public void mo34removeClickListener(@NotNull InterfaceC1090Gt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: removeForegroundLifecycleListener */
    public void mo35removeForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        NS0.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: removeGroupedNotifications */
    public void mo36removeGroupedNotifications(@NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        NS0.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        LY1.suspendifyOnThread$default(0, new c(group, null), 1, null);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: removeNotification */
    public void mo37removeNotification(int id) {
        NS0.debug$default("NotificationsManager.removeNotification(id: " + id + ')', null, 2, null);
        LY1.suspendifyOnThread$default(0, new d(id, null), 1, null);
    }

    @Override // defpackage.InterfaceC3250cu0
    /* JADX INFO: renamed from: removePermissionObserver */
    public void mo38removePermissionObserver(@NotNull InterfaceC6240qu0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        NS0.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // defpackage.InterfaceC3250cu0
    @Nullable
    public Object requestPermission(boolean z, @NotNull JM<? super Boolean> jm) {
        NS0.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        RV rv = C6266r20.a;
        return C5189lv.p(QV0.a, new e(z, null), jm);
    }

    public void setPermission(boolean z) {
        this.permission = z;
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onUnfocused() {
    }
}
