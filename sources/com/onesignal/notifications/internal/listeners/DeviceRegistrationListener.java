package com.onesignal.notifications.internal.listeners;

import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C6212ql1;
import defpackage.C7371wI;
import defpackage.C7582xI;
import defpackage.GU1;
import defpackage.H01;
import defpackage.InterfaceC1012Ft0;
import defpackage.InterfaceC2109Tu0;
import defpackage.InterfaceC2529Yu0;
import defpackage.InterfaceC2607Zu0;
import defpackage.InterfaceC3044bv0;
import defpackage.InterfaceC3250cu0;
import defpackage.InterfaceC3253cv0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC6240qu0;
import defpackage.InterfaceC7920yu0;
import defpackage.JM;
import defpackage.LY1;
import defpackage.MN;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.¨\u0006/"}, d2 = {"Lcom/onesignal/notifications/internal/listeners/DeviceRegistrationListener;", "LYu0;", "LTu0;", "LwI;", "Lqu0;", "Lbv0;", "LxI;", "_configModelStore", "LFt0;", "_channelManager", "Lyu0;", "_pushTokenManager", "Lcu0;", "_notificationsManager", "Lcv0;", "_subscriptionManager", "<init>", "(LxI;LFt0;Lyu0;Lcu0;Lcv0;)V", "", "retrievePushTokenAndUpdateSubscription", "()V", "start", "model", "", "tag", "onModelReplaced", "(LwI;Ljava/lang/String;)V", "LH01;", "args", "onModelUpdated", "(LH01;Ljava/lang/String;)V", "", "permission", "onNotificationPermissionChange", "(Z)V", "LZu0;", "subscription", "onSubscriptionRemoved", "(LZu0;)V", "onSubscriptionAdded", "onSubscriptionChanged", "(LZu0;LH01;)V", "LxI;", "LFt0;", "Lyu0;", "Lcu0;", "Lcv0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceRegistrationListener implements InterfaceC2529Yu0, InterfaceC2109Tu0<C7371wI>, InterfaceC6240qu0, InterfaceC3044bv0 {

    @NotNull
    private final InterfaceC1012Ft0 _channelManager;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC3250cu0 _notificationsManager;

    @NotNull
    private final InterfaceC7920yu0 _pushTokenManager;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$onSubscriptionChanged$2", f = "DeviceRegistrationListener.kt", l = {92}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return DeviceRegistrationListener.this.new a(jm);
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
                InterfaceC3250cu0 interfaceC3250cu0 = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (interfaceC3250cu0.requestPermission(true, this) == mn) {
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

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.listeners.DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1", f = "DeviceRegistrationListener.kt", l = {71}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public b(JM<? super b> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return DeviceRegistrationListener.this.new b(jm);
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
                InterfaceC7920yu0 interfaceC7920yu0 = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = interfaceC7920yu0.retrievePushToken(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C6212ql1 c6212ql1 = (C6212ql1) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(c6212ql1.getToken(), DeviceRegistrationListener.this._notificationsManager.mo33getPermission() ? c6212ql1.getStatus() : GU1.NO_PERMISSION);
            return Unit.a;
        }
    }

    public DeviceRegistrationListener(@NotNull C7582xI _configModelStore, @NotNull InterfaceC1012Ft0 _channelManager, @NotNull InterfaceC7920yu0 _pushTokenManager, @NotNull InterfaceC3250cu0 _notificationsManager, @NotNull InterfaceC3253cv0 _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_channelManager, "_channelManager");
        Intrinsics.checkNotNullParameter(_pushTokenManager, "_pushTokenManager");
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._channelManager = _channelManager;
        this._pushTokenManager = _pushTokenManager;
        this._notificationsManager = _notificationsManager;
        this._subscriptionManager = _subscriptionManager;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        LY1.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelUpdated(@NotNull H01 args, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // defpackage.InterfaceC6240qu0
    public void onNotificationPermissionChange(boolean permission) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // defpackage.InterfaceC3044bv0
    public void onSubscriptionAdded(@NotNull InterfaceC2607Zu0 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // defpackage.InterfaceC3044bv0
    public void onSubscriptionChanged(@NotNull InterfaceC2607Zu0 subscription, @NotNull H01 args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if (Intrinsics.a(args.getPath(), "optedIn") && Intrinsics.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo33getPermission()) {
            LY1.suspendifyOnThread$default(0, new a(null), 1, null);
        }
    }

    @Override // defpackage.InterfaceC3044bv0
    public void onSubscriptionRemoved(@NotNull InterfaceC2607Zu0 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._configModelStore.subscribe((InterfaceC2109Tu0) this);
        this._notificationsManager.mo30addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
    }

    @Override // defpackage.InterfaceC2109Tu0
    public void onModelReplaced(@NotNull C7371wI model, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
