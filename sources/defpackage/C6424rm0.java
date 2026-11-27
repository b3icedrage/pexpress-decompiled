package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 .2\u00020\u0001:\u0004/012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lrm0;", "Ljt0;", "LWr0;", "_applicationService", "LDs0;", "_fusedLocationApiWrapper", "<init>", "(LWr0;LDs0;)V", "Landroid/location/Location;", "location", "", "setLocationAndFire", "(Landroid/location/Location;)V", "", "start", "(LJM;)Ljava/lang/Object;", "stop", "getLastLocation", "()Landroid/location/Location;", "Lnt0;", "handler", "subscribe", "(Lnt0;)V", "unsubscribe", "LWr0;", "LDs0;", "Lrm0$c;", "locationHandlerThread", "Lrm0$c;", "Lh21;", "startStopMutex", "Lh21;", "LO80;", "event", "LO80;", "LBm0;", "googleApiClient", "LBm0;", "Lrm0$d;", "locationUpdateListener", "Lrm0$d;", "lastLocation", "Landroid/location/Location;", "getHasSubscribers", "()Z", "hasSubscribers", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "c", "d", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6424rm0 implements InterfaceC4764jt0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC0853Ds0 _fusedLocationApiWrapper;

    @NotNull
    private final O80<InterfaceC5607nt0> event;

    @Nullable
    private C0679Bm0 googleApiClient;

    @Nullable
    private Location lastLocation;

    @NotNull
    private final c locationHandlerThread;

    @Nullable
    private d locationUpdateListener;

    @NotNull
    private final InterfaceC4117h21 startStopMutex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int API_FALLBACK_TIME = 30000;

    /* JADX INFO: renamed from: rm0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrm0$a;", "", "<init>", "()V", "", "API_FALLBACK_TIME", "I", "getAPI_FALLBACK_TIME", "()I", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return C6424rm0.API_FALLBACK_TIME;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: rm0$b */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrm0$b;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lrm0;", "_parent", "<init>", "(Lrm0;)V", "Landroid/os/Bundle;", "bundle", "", "onConnected", "(Landroid/os/Bundle;)V", "", "i", "onConnectionSuspended", "(I)V", "Lcom/google/android/gms/common/ConnectionResult;", "connectionResult", "onConnectionFailed", "(Lcom/google/android/gms/common/ConnectionResult;)V", "Lrm0;", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

        @NotNull
        private final C6424rm0 _parent;

        /* JADX INFO: renamed from: rm0$b$a */
        @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$GoogleApiClientListener$onConnectionFailed$1", f = "GmsLocationController.kt", l = {156}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
            int label;

            public a(JM<? super a> jm) {
                super(1, jm);
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@NotNull JM<?> jm) {
                return b.this.new a(jm);
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
                    C6424rm0 c6424rm0 = b.this._parent;
                    this.label = 1;
                    if (c6424rm0.stop(this) == mn) {
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

        public b(@NotNull C6424rm0 _parent) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(@Nullable Bundle bundle) {
            NS0.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(@NotNull ConnectionResult connectionResult) {
            Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
            NS0.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            LY1.suspendifyOnThread$default(0, new a(null), 1, null);
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            NS0.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: rm0$c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrm0$c;", "Landroid/os/HandlerThread;", "<init>", "()V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c extends HandlerThread {

        @NotNull
        private Handler mHandler;

        public c() {
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

    /* JADX INFO: renamed from: rm0$d */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lrm0$d;", "Lcom/google/android/gms/location/LocationListener;", "LVr0;", "Ljava/io/Closeable;", "LWr0;", "_applicationService", "Lrm0;", "_parent", "Lcom/google/android/gms/common/api/GoogleApiClient;", "googleApiClient", "LDs0;", "_fusedLocationApiWrapper", "<init>", "(LWr0;Lrm0;Lcom/google/android/gms/common/api/GoogleApiClient;LDs0;)V", "", "refreshRequest", "()V", "", "firedOnSubscribe", "onFocus", "(Z)V", "onUnfocused", "close", "Landroid/location/Location;", "location", "onLocationChanged", "(Landroid/location/Location;)V", "LWr0;", "Lrm0;", "Lcom/google/android/gms/common/api/GoogleApiClient;", "LDs0;", "hasExistingRequest", "Z", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements LocationListener, InterfaceC2256Vr0, Closeable {

        @NotNull
        private final InterfaceC2338Wr0 _applicationService;

        @NotNull
        private final InterfaceC0853Ds0 _fusedLocationApiWrapper;

        @NotNull
        private final C6424rm0 _parent;

        @NotNull
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull C6424rm0 _parent, @NotNull GoogleApiClient googleApiClient, @NotNull InterfaceC0853Ds0 _fusedLocationApiWrapper) throws Exception {
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
            Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            if (!googleApiClient.isConnected()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.isConnected()) {
                NS0.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest locationRequest = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            NS0.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            InterfaceC0853Ds0 interfaceC0853Ds0 = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            Intrinsics.checkNotNullExpressionValue(locationRequest, "locationRequest");
            interfaceC0853Ds0.requestLocationUpdates(googleApiClient, locationRequest, this);
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
        }

        @Override // defpackage.InterfaceC2256Vr0
        public void onFocus(boolean firedOnSubscribe) {
            NS0.log(EnumC5513nS0.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            NS0.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // defpackage.InterfaceC2256Vr0
        public void onUnfocused() {
            NS0.log(EnumC5513nS0.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* JADX INFO: renamed from: rm0$e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnt0;", "it", "", "invoke", "(Lnt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class e extends ML0 implements Function1<InterfaceC5607nt0, Unit> {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5607nt0 interfaceC5607nt0) {
            invoke2(interfaceC5607nt0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5607nt0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationChanged(this.$location);
        }
    }

    /* JADX INFO: renamed from: rm0$f */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.GmsLocationController", f = "GmsLocationController.kt", l = {48}, m = "start")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
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
            return C6424rm0.this.start(this);
        }
    }

    /* JADX INFO: renamed from: rm0$g */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2", f = "GmsLocationController.kt", l = {250, 62}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<C6424rm0> $self;
        final /* synthetic */ C2512Yo1 $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: renamed from: rm0$g$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnt0;", "it", "", "invoke", "(Lnt0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5607nt0, Unit> {
            final /* synthetic */ C6424rm0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6424rm0 c6424rm0) {
                super(1);
                this.this$0 = c6424rm0;
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

        /* JADX INFO: renamed from: rm0$g$b */
        @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2$1$2", f = "GmsLocationController.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            final /* synthetic */ C3027bp1<C6424rm0> $self;
            final /* synthetic */ C2512Yo1 $wasSuccessful;
            int label;
            final /* synthetic */ C6424rm0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3027bp1<C6424rm0> c3027bp1, C6424rm0 c6424rm0, C2512Yo1 c2512Yo1, JM<? super b> jm) {
                super(2, jm);
                this.$self = c3027bp1;
                this.this$0 = c6424rm0;
                this.$wasSuccessful = c2512Yo1;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new b(this.$self, this.this$0, this.$wasSuccessful, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((b) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Location lastLocation;
                MN mn = MN.d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                b bVar = new b(this.$self.d);
                GoogleApiClient googleApiClient = new GoogleApiClient.Builder(this.this$0._applicationService.getAppContext()).addApi(LocationServices.API).addConnectionCallbacks(bVar).addOnConnectionFailedListener(bVar).setHandler(this.this$0.locationHandlerThread.getMHandler()).build();
                Intrinsics.checkNotNullExpressionValue(googleApiClient, "googleApiClient");
                C0679Bm0 c0679Bm0 = new C0679Bm0(googleApiClient);
                ConnectionResult connectionResultBlockingConnect = c0679Bm0.blockingConnect();
                if (connectionResultBlockingConnect == null || !connectionResultBlockingConnect.isSuccess()) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(connectionResultBlockingConnect != null ? new Integer(connectionResultBlockingConnect.getErrorCode()) : null);
                    sb.append(") ");
                    sb.append(connectionResultBlockingConnect != null ? connectionResultBlockingConnect.getErrorMessage() : null);
                    NS0.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(googleApiClient)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    this.$self.d.locationUpdateListener = new d(this.this$0._applicationService, this.$self.d, c0679Bm0.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    this.$self.d.googleApiClient = c0679Bm0;
                    this.$wasSuccessful.d = true;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C2512Yo1 c2512Yo1, C3027bp1<C6424rm0> c3027bp1, JM<? super g> jm) {
            super(2, jm);
            this.$wasSuccessful = c2512Yo1;
            this.$self = c3027bp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C6424rm0.this.new g(this.$wasSuccessful, this.$self, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        
            if (defpackage.OZ1.b(r7, r3, r10) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [MN, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v11, types: [h21] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [h21] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                MN r0 = defpackage.MN.d
                int r1 = r10.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L36
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r10.L$0
                h21 r0 = (defpackage.InterfaceC4117h21) r0
                defpackage.C1795Pt1.b(r11)     // Catch: java.lang.Throwable -> L16 defpackage.MZ1 -> L9f
                goto La4
            L16:
                r11 = move-exception
                goto Lac
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                java.lang.Object r1 = r10.L$3
                bp1 r1 = (defpackage.C3027bp1) r1
                java.lang.Object r5 = r10.L$2
                Yo1 r5 = (defpackage.C2512Yo1) r5
                java.lang.Object r6 = r10.L$1
                rm0 r6 = (defpackage.C6424rm0) r6
                java.lang.Object r7 = r10.L$0
                h21 r7 = (defpackage.InterfaceC4117h21) r7
                defpackage.C1795Pt1.b(r11)
                r11 = r7
                goto L56
            L36:
                defpackage.C1795Pt1.b(r11)
                rm0 r11 = defpackage.C6424rm0.this
                h21 r11 = defpackage.C6424rm0.access$getStartStopMutex$p(r11)
                rm0 r6 = defpackage.C6424rm0.this
                Yo1 r5 = r10.$wasSuccessful
                bp1<rm0> r1 = r10.$self
                r10.L$0 = r11
                r10.L$1 = r6
                r10.L$2 = r5
                r10.L$3 = r1
                r10.label = r3
                java.lang.Object r7 = r11.a(r10)
                if (r7 != r0) goto L56
                goto L9d
            L56:
                Bm0 r7 = defpackage.C6424rm0.access$getGoogleApiClient$p(r6)     // Catch: java.lang.Throwable -> L6f
                if (r7 == 0) goto L81
                android.location.Location r0 = defpackage.C6424rm0.access$getLastLocation$p(r6)     // Catch: java.lang.Throwable -> L6f
                if (r0 == 0) goto L74
                O80 r0 = defpackage.C6424rm0.access$getEvent$p(r6)     // Catch: java.lang.Throwable -> L6f
                rm0$g$a r1 = new rm0$g$a     // Catch: java.lang.Throwable -> L6f
                r1.<init>(r6)     // Catch: java.lang.Throwable -> L6f
                r0.fire(r1)     // Catch: java.lang.Throwable -> L6f
                goto L7d
            L6f:
                r0 = move-exception
                r9 = r0
                r0 = r11
                r11 = r9
                goto Lac
            L74:
                android.location.Location r0 = r6.getLastLocation()     // Catch: java.lang.Throwable -> L6f
                if (r0 == 0) goto L7d
                defpackage.C6424rm0.access$setLocationAndFire(r6, r0)     // Catch: java.lang.Throwable -> L6f
            L7d:
                r5.d = r3     // Catch: java.lang.Throwable -> L6f
            L7f:
                r0 = r11
                goto La4
            L81:
                rm0$a r3 = defpackage.C6424rm0.INSTANCE     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                int r3 = r3.getAPI_FALLBACK_TIME()     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                long r7 = (long) r3     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                rm0$g$b r3 = new rm0$g$b     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                r3.<init>(r1, r6, r5, r4)     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                r10.L$0 = r11     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                r10.L$2 = r4     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                r10.L$3 = r4     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                r10.label = r2     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                java.lang.Object r1 = defpackage.OZ1.b(r7, r3, r10)     // Catch: java.lang.Throwable -> L6f defpackage.MZ1 -> L9e
                if (r1 != r0) goto L7f
            L9d:
                return r0
            L9e:
                r0 = r11
            L9f:
                java.lang.String r11 = "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions."
                defpackage.NS0.warn$default(r11, r4, r2, r4)     // Catch: java.lang.Throwable -> L16
            La4:
                kotlin.Unit r11 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L16
                r0.b(r4)
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            Lac:
                r0.b(r4)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C6424rm0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rm0$h */
    @InterfaceC3368dU(c = "com.onesignal.location.internal.controller.impl.GmsLocationController", f = "GmsLocationController.kt", l = {250}, m = "stop")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        Object L$1;
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
            return C6424rm0.this.stop(this);
        }
    }

    public C6424rm0(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC0853Ds0 _fusedLocationApiWrapper) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new c();
        this.startStopMutex = ED.c();
        this.event = new O80<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        NS0.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // defpackage.InterfaceC4764jt0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        C0679Bm0 c0679Bm0 = this.googleApiClient;
        if (c0679Bm0 == null || (realInstance = c0679Bm0.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Object start(@NotNull JM<? super Boolean> jm) {
        f fVar;
        C2512Yo1 c2512Yo1;
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
            C3027bp1 c3027bp1B = C4564j.b(obj);
            c3027bp1B.d = this;
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            ExecutorC7200vV executorC7200vV = C6266r20.c;
            g gVar = new g(c2512Yo2, c3027bp1B, null);
            fVar.L$0 = c2512Yo2;
            fVar.label = 1;
            if (C5189lv.p(executorC7200vV, gVar, fVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) fVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4764jt0
    @Nullable
    public Object stop(@NotNull JM<? super Unit> jm) {
        h hVar;
        C6424rm0 c6424rm0;
        InterfaceC4117h21 interfaceC4117h21;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i = hVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.label = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        Object obj = hVar.result;
        MN mn = MN.d;
        int i2 = hVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            InterfaceC4117h21 interfaceC4117h22 = this.startStopMutex;
            hVar.L$0 = this;
            hVar.L$1 = interfaceC4117h22;
            hVar.label = 1;
            if (interfaceC4117h22.a(hVar) == mn) {
                return mn;
            }
            c6424rm0 = this;
            interfaceC4117h21 = interfaceC4117h22;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4117h21 = (InterfaceC4117h21) hVar.L$1;
            c6424rm0 = (C6424rm0) hVar.L$0;
            C1795Pt1.b(obj);
        }
        try {
            d dVar = c6424rm0.locationUpdateListener;
            if (dVar != null) {
                Intrinsics.checkNotNull(dVar);
                dVar.close();
                c6424rm0.locationUpdateListener = null;
            }
            C0679Bm0 c0679Bm0 = c6424rm0.googleApiClient;
            if (c0679Bm0 != null) {
                Intrinsics.checkNotNull(c0679Bm0);
                c0679Bm0.disconnect();
                c6424rm0.googleApiClient = null;
            }
            c6424rm0.lastLocation = null;
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
