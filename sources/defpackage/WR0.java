package defpackage;

import android.app.Activity;
import com.onesignal.common.AndroidUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 )2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001*B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"LWR0;", "LCu0$a;", "LYu0;", "LCs0;", "Llt0;", "LCu0;", "_requestPermission", "LWr0;", "_applicationService", "<init>", "(LCu0;LWr0;)V", "", "showFallbackAlertDialog", "()Z", "", "start", "()V", "fallbackToSettings", "", "androidPermissionString", "prompt", "(ZLjava/lang/String;LJM;)Ljava/lang/Object;", "onAccept", "onReject", "(Z)V", "handler", "subscribe", "(Llt0;)V", "unsubscribe", "LCu0;", "LWr0;", "Lzf2;", "waiter", "Lzf2;", "LO80;", "events", "LO80;", "currPermission", "Ljava/lang/String;", "getHasSubscribers", "hasSubscribers", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WR0 implements InterfaceC0781Cu0.a, InterfaceC2529Yu0, InterfaceC0775Cs0<InterfaceC5184lt0> {

    @NotNull
    private static final String PERMISSION_TYPE = "LOCATION";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC0781Cu0 _requestPermission;

    @NotNull
    private String currPermission;

    @NotNull
    private final O80<InterfaceC5184lt0> events;

    @NotNull
    private final C8079zf2<Boolean> waiter;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt0;", "it", "", "invoke", "(Llt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC5184lt0, Unit> {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5184lt0 interfaceC5184lt0) {
            invoke2(interfaceC5184lt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5184lt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationPermissionChanged(true);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt0;", "it", "", "invoke", "(Llt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC5184lt0, Unit> {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5184lt0 interfaceC5184lt0) {
            invoke2(interfaceC5184lt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5184lt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationPermissionChanged(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"WR0$d", "LA9$a;", "", "onAccept", "()V", "onDecline", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements A9.a {
        final /* synthetic */ Activity $activity;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"WR0$d$a", "LGi;", "", "firedOnSubscribe", "", "onFocus", "(Z)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class a extends C1056Gi {
            final /* synthetic */ WR0 this$0;

            /* JADX INFO: renamed from: WR0$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt0;", "it", "", "invoke", "(Llt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class C0169a extends ML0 implements Function1<InterfaceC5184lt0, Unit> {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0169a(boolean z) {
                    super(1);
                    this.$hasPermission = z;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5184lt0 interfaceC5184lt0) {
                    invoke2(interfaceC5184lt0);
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5184lt0 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onLocationPermissionChanged(this.$hasPermission);
                }
            }

            public a(WR0 wr0) {
                this.this$0 = wr0;
            }

            @Override // defpackage.C1056Gi, defpackage.InterfaceC2256Vr0
            public void onFocus(boolean firedOnSubscribe) {
                if (firedOnSubscribe) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                boolean zHasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(zHasPermission));
                this.this$0.events.fire(new C0169a(zHasPermission));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt0;", "it", "", "invoke", "(Llt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class b extends ML0 implements Function1<InterfaceC5184lt0, Unit> {
            public static final b INSTANCE = new b();

            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5184lt0 interfaceC5184lt0) {
                invoke2(interfaceC5184lt0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5184lt0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onLocationPermissionChanged(false);
            }
        }

        public d(Activity activity) {
            this.$activity = activity;
        }

        @Override // A9.a
        public void onAccept() {
            WR0.this._applicationService.addApplicationLifecycleHandler(new a(WR0.this));
            C21.INSTANCE.show(this.$activity);
        }

        @Override // A9.a
        public void onDecline() {
            WR0.this.waiter.wake(Boolean.FALSE);
            WR0.this.events.fire(b.INSTANCE);
        }
    }

    public WR0(@NotNull InterfaceC0781Cu0 _requestPermission, @NotNull InterfaceC2338Wr0 _applicationService) {
        Intrinsics.checkNotNullParameter(_requestPermission, "_requestPermission");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this.waiter = new C8079zf2<>();
        this.events = new O80<>();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity activity = this._applicationService.get_current();
        if (activity == null) {
            return false;
        }
        A9 a9 = A9.INSTANCE;
        String string = activity.getString(C1615Nl1.location_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activity.getString(C1615Nl1.location_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.str…mission_settings_message)");
        a9.show(activity, string, string2, new d(activity));
        return true;
    }

    @Override // defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC0781Cu0.a
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(b.INSTANCE);
    }

    @Override // defpackage.InterfaceC0781Cu0.a
    public void onReject(boolean fallbackToSettings) {
        if (fallbackToSettings ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    @Nullable
    public final Object prompt(boolean z, @NotNull String str, @NotNull JM<? super Boolean> jm) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z, "LOCATION", str, WR0.class);
        return this.waiter.waitForWake(jm);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._requestPermission.registerAsCallback("LOCATION", this);
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC5184lt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC5184lt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }
}
