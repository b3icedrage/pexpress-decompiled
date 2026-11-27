package defpackage;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ap0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lap0;", "Ljt0;", "LWr0;", "_applicationService", "<init>", "(LWr0;)V", "", "start", "(LJM;)Ljava/lang/Object;", "", "stop", "Landroid/location/Location;", "getLastLocation", "()Landroid/location/Location;", "Lnt0;", "handler", "subscribe", "(Lnt0;)V", "unsubscribe", "LWr0;", "Lap0$a;", "locationHandlerThread", "Lap0$a;", "Lh21;", "startStopMutex", "Lh21;", "LO80;", "event", "LO80;", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "hmsFusedLocationClient", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "Lap0$b;", "locationUpdateListener", "Lap0$b;", "lastLocation", "Landroid/location/Location;", "getHasSubscribers", "()Z", "hasSubscribers", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2816ap0 implements InterfaceC4764jt0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final O80<InterfaceC5607nt0> event;

    @Nullable
    private FusedLocationProviderClient hmsFusedLocationClient;

    @Nullable
    private Location lastLocation;

    @NotNull
    private final a locationHandlerThread;

    @Nullable
    private b locationUpdateListener;

    @NotNull
    private final InterfaceC4117h21 startStopMutex;

    /* JADX INFO: renamed from: ap0$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lap0$a;", "Landroid/os/HandlerThread;", "<init>", "()V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a extends HandlerThread {

        @NotNull
        private Handler mHandler;

        public a() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        @NotNull
        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(@NotNull Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    /* JADX INFO: renamed from: ap0$b */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lap0$b;", "Lcom/huawei/hms/location/LocationCallback;", "LVr0;", "Ljava/io/Closeable;", "Lap0;", "_parent", "LWr0;", "_applicationService", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "huaweiFusedLocationProviderClient", "<init>", "(Lap0;LWr0;Lcom/huawei/hms/location/FusedLocationProviderClient;)V", "", "refreshRequest", "()V", "", "firedOnSubscribe", "onFocus", "(Z)V", "onUnfocused", "close", "Lcom/huawei/hms/location/LocationResult;", "locationResult", "onLocationResult", "(Lcom/huawei/hms/location/LocationResult;)V", "Lap0;", "LWr0;", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "hasExistingRequest", "Z", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LocationCallback implements InterfaceC2256Vr0, Closeable {

        @NotNull
        private final InterfaceC2338Wr0 _applicationService;

        @NotNull
        private final C2816ap0 _parent;
        private boolean hasExistingRequest;

        @NotNull
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(@NotNull C2816ap0 _parent, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = _parent;
            this._applicationService = _applicationService;
            this.huaweiFusedLocationProviderClient = huaweiFusedLocationProviderClient;
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            NS0.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        @Override // defpackage.InterfaceC2256Vr0
        public void onFocus(boolean firedOnSubscribe) {
            NS0.log(EnumC5513nS0.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(@NotNull LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            NS0.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // defpackage.InterfaceC2256Vr0
        public void onUnfocused() {
            NS0.log(EnumC5513nS0.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* JADX INFO: renamed from: ap0$c */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.HmsLocationController$getLastLocation$1", f = "HmsLocationController.kt", l = {139}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ C3027bp1<Location> $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, C3027bp1<Location> c3027bp1, JM<? super c> jm) {
            super(1, jm);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = c3027bp1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m11invokeSuspend$lambda0(C3027bp1 c3027bp1, C3027bp1 c3027bp2, Location location) {
            NS0.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == 0) {
                ((C7659xf2) c3027bp1.d).wake();
            } else {
                c3027bp2.d = location;
                ((C7659xf2) c3027bp1.d).wake();
            }
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        private static final void m12invokeSuspend$lambda1(C3027bp1 c3027bp1, Exception exc) {
            NS0.error("Huawei LocationServices getLastLocation failed!", exc);
            ((C7659xf2) c3027bp1.d).wake();
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new c(this.$locationClient, this.$retVal, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, xf2] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C3027bp1 c3027bp1B = C4564j.b(obj);
                c3027bp1B.d = new C7659xf2();
                this.$locationClient.getLastLocation().addOnSuccessListener(new C3026bp0()).addOnFailureListener(new C3235cp0());
                C7659xf2 c7659xf2 = (C7659xf2) c3027bp1B.d;
                this.label = 1;
                if (c7659xf2.waitForWake(this) == mn) {
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

    /* JADX INFO: renamed from: ap0$d */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.HmsLocationController", f = "HmsLocationController.kt", l = {46}, m = "start")
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
            return C2816ap0.this.start(this);
        }
    }

    /* JADX INFO: renamed from: ap0$e */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.HmsLocationController$start$2", f = "HmsLocationController.kt", l = {229, 81}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<C2816ap0> $self;
        final /* synthetic */ C2512Yo1 $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX INFO: renamed from: ap0$e$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnt0;", "it", "", "invoke", "(Lnt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5607nt0, Unit> {
            final /* synthetic */ C2816ap0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2816ap0 c2816ap0) {
                super(1);
                this.this$0 = c2816ap0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5607nt0 interfaceC5607nt0) {
                invoke2(interfaceC5607nt0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5607nt0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Location location = this.this$0.lastLocation;
                Intrinsics.checkNotNull(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX INFO: renamed from: ap0$e$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnt0;", "it", "", "invoke", "(Lnt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class b extends ML0 implements Function1<InterfaceC5607nt0, Unit> {
            final /* synthetic */ C2816ap0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C2816ap0 c2816ap0) {
                super(1);
                this.this$0 = c2816ap0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5607nt0 interfaceC5607nt0) {
                invoke2(interfaceC5607nt0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5607nt0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Location location = this.this$0.lastLocation;
                Intrinsics.checkNotNull(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2512Yo1 c2512Yo1, C3027bp1<C2816ap0> c3027bp1, JM<? super e> jm) {
            super(2, jm);
            this.$wasSuccessful = c2512Yo1;
            this.$self = c3027bp1;
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-2$lambda-0, reason: not valid java name */
        private static final void m13invokeSuspend$lambda2$lambda0(C3027bp1 c3027bp1, C2816ap0 c2816ap0, Location location) {
            NS0.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((C8079zf2) c3027bp1.d).wake(Boolean.FALSE);
            } else {
                c2816ap0.lastLocation = location;
                ((C8079zf2) c3027bp1.d).wake(Boolean.TRUE);
            }
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-2$lambda-1, reason: not valid java name */
        private static final void m14invokeSuspend$lambda2$lambda1(C3027bp1 c3027bp1, Exception exc) {
            NS0.error("Huawei LocationServices getLastLocation failed!", exc);
            ((C8079zf2) c3027bp1.d).wake(Boolean.FALSE);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C2816ap0.this.new e(this.$wasSuccessful, this.$self, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:18:0x006c, B:20:0x0072, B:27:0x009d, B:29:0x00a3, B:30:0x00b0, B:25:0x0088), top: B:43:0x006c, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:18:0x006c, B:20:0x0072, B:27:0x009d, B:29:0x00a3, B:30:0x00b0, B:25:0x0088), top: B:43:0x006c, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:36:0x0101 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:7:0x0023, B:34:0x00f5, B:36:0x0101, B:38:0x0127), top: B:44:0x0023 }] */
        /* JADX WARN: Type inference failed for: r7v5, types: [T, zf2] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            InterfaceC4117h21 interfaceC4117h21;
            C2512Yo1 c2512Yo1;
            C2816ap0 c2816ap0;
            C3027bp1<C2816ap0> c3027bp1;
            InterfaceC4117h21 interfaceC4117h22;
            Throwable th;
            Object objWaitForWake;
            C3027bp1<C2816ap0> c3027bp2;
            C2512Yo1 c2512Yo2;
            C2512Yo1 c2512Yo3;
            C2816ap0 c2816ap1;
            MN mn = MN.d;
            int i = this.label;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    interfaceC4117h21 = C2816ap0.this.startStopMutex;
                    C2816ap0 c2816ap2 = C2816ap0.this;
                    C2512Yo1 c2512Yo4 = this.$wasSuccessful;
                    C3027bp1<C2816ap0> c3027bp3 = this.$self;
                    this.L$0 = interfaceC4117h21;
                    this.L$1 = c2816ap2;
                    this.L$2 = c2512Yo4;
                    this.L$3 = c3027bp3;
                    this.label = 1;
                    if (interfaceC4117h21.a(this) != mn) {
                        c2512Yo1 = c2512Yo4;
                        c2816ap0 = c2816ap2;
                        c3027bp1 = c3027bp3;
                    }
                    return mn;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2512Yo2 = (C2512Yo1) this.L$4;
                    c3027bp2 = (C3027bp1) this.L$3;
                    c2512Yo3 = (C2512Yo1) this.L$2;
                    c2816ap1 = (C2816ap0) this.L$1;
                    interfaceC4117h22 = (InterfaceC4117h21) this.L$0;
                    try {
                        C1795Pt1.b(obj);
                        c2512Yo2.d = ((Boolean) obj).booleanValue();
                        if (c2512Yo3.d) {
                            c2816ap1.event.fire(new b(c2816ap1));
                            C2816ap0 c2816ap3 = c3027bp2.d;
                            InterfaceC2338Wr0 interfaceC2338Wr0 = c2816ap1._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = c2816ap1.hmsFusedLocationClient;
                            Intrinsics.checkNotNull(fusedLocationProviderClient);
                            c2816ap1.locationUpdateListener = new b(c2816ap3, interfaceC2338Wr0, fusedLocationProviderClient);
                        }
                        interfaceC4117h21 = interfaceC4117h22;
                        interfaceC4117h22 = interfaceC4117h21;
                        Unit unit = Unit.a;
                        interfaceC4117h22.b(null);
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC4117h22.b(null);
                        throw th;
                    }
                }
                c3027bp1 = (C3027bp1) this.L$3;
                c2512Yo1 = (C2512Yo1) this.L$2;
                c2816ap0 = (C2816ap0) this.L$1;
                InterfaceC4117h21 interfaceC4117h23 = (InterfaceC4117h21) this.L$0;
                C1795Pt1.b(obj);
                interfaceC4117h21 = interfaceC4117h23;
                if (c2816ap0.hmsFusedLocationClient == null) {
                    try {
                        c2816ap0.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(c2816ap0._applicationService.getAppContext());
                        if (c2816ap0.lastLocation != null) {
                            C3027bp1 c3027bp4 = new C3027bp1();
                            c3027bp4.d = new C8079zf2();
                            FusedLocationProviderClient fusedLocationProviderClient2 = c2816ap0.hmsFusedLocationClient;
                            Intrinsics.checkNotNull(fusedLocationProviderClient2);
                            fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new C3026bp0()).addOnFailureListener(new C3235cp0());
                            C8079zf2 c8079zf2 = (C8079zf2) c3027bp4.d;
                            this.L$0 = interfaceC4117h21;
                            this.L$1 = c2816ap0;
                            this.L$2 = c2512Yo1;
                            this.L$3 = c3027bp1;
                            this.L$4 = c2512Yo1;
                            this.label = 2;
                            objWaitForWake = c8079zf2.waitForWake(this);
                            if (objWaitForWake != mn) {
                                interfaceC4117h22 = interfaceC4117h21;
                                obj = objWaitForWake;
                                c3027bp2 = c3027bp1;
                                c2512Yo2 = c2512Yo1;
                                c2512Yo3 = c2512Yo2;
                                c2816ap1 = c2816ap0;
                                c2512Yo2.d = ((Boolean) obj).booleanValue();
                                if (c2512Yo3.d) {
                                    c2816ap1.event.fire(new b(c2816ap1));
                                    C2816ap0 c2816ap4 = c3027bp2.d;
                                    InterfaceC2338Wr0 interfaceC2338Wr1 = c2816ap1._applicationService;
                                    FusedLocationProviderClient fusedLocationProviderClient3 = c2816ap1.hmsFusedLocationClient;
                                    Intrinsics.checkNotNull(fusedLocationProviderClient3);
                                    c2816ap1.locationUpdateListener = new b(c2816ap4, interfaceC2338Wr1, fusedLocationProviderClient3);
                                }
                                interfaceC4117h21 = interfaceC4117h22;
                            }
                            return mn;
                        }
                        c2816ap0.event.fire(new a(c2816ap0));
                    } catch (Exception e) {
                        NS0.error$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e, null, 2, null);
                        c2512Yo1.d = false;
                    }
                } else {
                    if (c2816ap0.lastLocation != null) {
                        C3027bp1 c3027bp5 = new C3027bp1();
                        c3027bp5.d = new C8079zf2();
                        FusedLocationProviderClient fusedLocationProviderClient4 = c2816ap0.hmsFusedLocationClient;
                        Intrinsics.checkNotNull(fusedLocationProviderClient4);
                        fusedLocationProviderClient4.getLastLocation().addOnSuccessListener(new C3026bp0()).addOnFailureListener(new C3235cp0());
                        C8079zf2 c8079zf3 = (C8079zf2) c3027bp5.d;
                        this.L$0 = interfaceC4117h21;
                        this.L$1 = c2816ap0;
                        this.L$2 = c2512Yo1;
                        this.L$3 = c3027bp1;
                        this.L$4 = c2512Yo1;
                        this.label = 2;
                        objWaitForWake = c8079zf3.waitForWake(this);
                        if (objWaitForWake != mn) {
                            interfaceC4117h22 = interfaceC4117h21;
                            obj = objWaitForWake;
                            c3027bp2 = c3027bp1;
                            c2512Yo2 = c2512Yo1;
                            c2512Yo3 = c2512Yo2;
                            c2816ap1 = c2816ap0;
                            c2512Yo2.d = ((Boolean) obj).booleanValue();
                            if (c2512Yo3.d) {
                                c2816ap1.event.fire(new b(c2816ap1));
                                C2816ap0 c2816ap5 = c3027bp2.d;
                                InterfaceC2338Wr0 interfaceC2338Wr2 = c2816ap1._applicationService;
                                FusedLocationProviderClient fusedLocationProviderClient5 = c2816ap1.hmsFusedLocationClient;
                                Intrinsics.checkNotNull(fusedLocationProviderClient5);
                                c2816ap1.locationUpdateListener = new b(c2816ap5, interfaceC2338Wr2, fusedLocationProviderClient5);
                            }
                            interfaceC4117h21 = interfaceC4117h22;
                        }
                        return mn;
                    }
                    c2816ap0.event.fire(new a(c2816ap0));
                }
                interfaceC4117h22 = interfaceC4117h21;
                Unit unit2 = Unit.a;
                interfaceC4117h22.b(null);
                return Unit.a;
            } catch (Throwable th3) {
                interfaceC4117h22 = interfaceC4117h21;
                th = th3;
                interfaceC4117h22.b(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ap0$f */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.HmsLocationController", f = "HmsLocationController.kt", l = {229}, m = "stop")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        Object L$1;
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
            return C2816ap0.this.stop(this);
        }
    }

    public C2816ap0(@NotNull InterfaceC2338Wr0 _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new a();
        this.startStopMutex = ED.c();
        this.event = new O80<>();
    }

    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        C3027bp1 c3027bp1 = new C3027bp1();
        LY1.suspendifyOnThread$default(0, new c(fusedLocationProviderClient, c3027bp1, null), 1, null);
        return (Location) c3027bp1.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Object start(@NotNull JM<? super Boolean> jm) {
        d dVar;
        C2512Yo1 c2512Yo1;
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
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            c3027bp1B.d = this;
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            e eVar = new e(c2512Yo2, c3027bp1B, null);
            dVar.L$0 = c2512Yo2;
            dVar.label = 1;
            if (C5189lv.p(executorC7200vV, eVar, dVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) dVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Object stop(@NotNull JM<? super Unit> jm) {
        f fVar;
        C2816ap0 c2816ap0;
        InterfaceC4117h21 interfaceC4117h21;
        if (jm instanceof f) {
            fVar = (f) jm;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(jm);
            }
        } else {
            fVar = new f(jm);
        }
        Object obj = fVar.result;
        MN mn = MN.d;
        int i2 = fVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            InterfaceC4117h21 interfaceC4117h22 = this.startStopMutex;
            fVar.L$0 = this;
            fVar.L$1 = interfaceC4117h22;
            fVar.label = 1;
            if (interfaceC4117h22.a(fVar) == mn) {
                return mn;
            }
            c2816ap0 = this;
            interfaceC4117h21 = interfaceC4117h22;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4117h21 = (InterfaceC4117h21) fVar.L$1;
            c2816ap0 = (C2816ap0) fVar.L$0;
            C1795Pt1.b(obj);
        }
        try {
            b bVar = c2816ap0.locationUpdateListener;
            if (bVar != null) {
                Intrinsics.checkNotNull(bVar);
                bVar.close();
                c2816ap0.locationUpdateListener = null;
            }
            if (c2816ap0.hmsFusedLocationClient != null) {
                c2816ap0.hmsFusedLocationClient = null;
            }
            c2816ap0.lastLocation = null;
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            interfaceC4117h21.b(null);
        }
    }

    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC5607nt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC5607nt0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
