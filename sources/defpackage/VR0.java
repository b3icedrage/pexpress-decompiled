package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.common.AndroidUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"LVR0;", "Lkt0;", "LYu0;", "Llt0;", "LWr0;", "_applicationService", "Lit0;", "_capturer", "Ljt0;", "_locationController", "LWR0;", "_locationPermissionController", "Lsu0;", "_prefs", "<init>", "(LWr0;Lit0;Ljt0;LWR0;Lsu0;)V", "", "fallbackToSettings", "backgroundLocationPermissionLogic", "(ZLJM;)Ljava/lang/Object;", "", "startGetLocation", "(LJM;)Ljava/lang/Object;", "start", "()V", "enabled", "onLocationPermissionChanged", "(Z)V", "requestPermission", "LWr0;", "Lit0;", "Ljt0;", "LWR0;", "Lsu0;", "_isShared", "Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isShared", "()Z", "setShared", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VR0 implements InterfaceC4974kt0, InterfaceC2529Yu0, InterfaceC5184lt0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC4544it0 _capturer;
    private boolean _isShared;

    @NotNull
    private final InterfaceC4764jt0 _locationController;

    @NotNull
    private final WR0 _locationPermissionController;

    @NotNull
    private final InterfaceC6659su0 _prefs;

    @InterfaceC3368dU(c = "com.onesignal.location.internal.LocationManager$onLocationPermissionChanged$1", f = "LocationManager.kt", l = {53}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public a(JM<? super a> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return VR0.this.new a(jm);
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
                VR0 vr0 = VR0.this;
                this.label = 1;
                if (vr0.startGetLocation(this) == mn) {
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

    @InterfaceC3368dU(c = "com.onesignal.location.internal.LocationManager", f = "LocationManager.kt", l = {79}, m = "requestPermission")
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
            return VR0.this.requestPermission(this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.location.internal.LocationManager$requestPermission$2", f = "LocationManager.kt", l = {109, 150, 155, 158}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends AW1 implements Function2<KN, JM<? super Object>, Object> {
        final /* synthetic */ C2512Yo1 $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2512Yo1 c2512Yo1, JM<? super c> jm) {
            super(2, jm);
            this.$result = c2512Yo1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return VR0.this.new c(this.$result, jm);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull KN kn, @Nullable JM<Object> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L58;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: VR0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(KN kn, JM<? super Object> jm) {
            return invoke2(kn, (JM<Object>) jm);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.location.internal.LocationManager$start$1", f = "LocationManager.kt", l = {45}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public d(JM<? super d> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return VR0.this.new d(jm);
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
                VR0 vr0 = VR0.this;
                this.label = 1;
                if (vr0.startGetLocation(this) == mn) {
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

    @InterfaceC3368dU(c = "com.onesignal.location.internal.LocationManager", f = "LocationManager.kt", l = {195}, m = "startGetLocation")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
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
            return VR0.this.startGetLocation(this);
        }
    }

    public VR0(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC4544it0 _capturer, @NotNull InterfaceC4764jt0 _locationController, @NotNull WR0 _locationPermissionController, @NotNull InterfaceC6659su0 _prefs) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_locationController, "_locationController");
        Intrinsics.checkNotNullParameter(_locationPermissionController, "_locationPermissionController");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool("OneSignal", "OS_LOCATION_SHARED", Boolean.FALSE);
        Intrinsics.checkNotNull(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z, JM<? super Boolean> jm) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z, "android.permission.ACCESS_BACKGROUND_LOCATION", jm) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startGetLocation(JM<? super Unit> jm) {
        e eVar;
        if (jm instanceof e) {
            eVar = (e) jm;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(jm);
            }
        } else {
            eVar = new e(jm);
        }
        Object objStart = eVar.result;
        MN mn = MN.d;
        int i2 = eVar.label;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objStart);
                if (!get_isShared()) {
                    return Unit.a;
                }
                NS0.debug$default("LocationManager.startGetLocation()", null, 2, null);
                InterfaceC4764jt0 interfaceC4764jt0 = this._locationController;
                eVar.label = 1;
                objStart = interfaceC4764jt0.start(eVar);
                if (objStart == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objStart);
            }
            if (!((Boolean) objStart).booleanValue()) {
                NS0.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
            }
        } catch (Throwable th) {
            NS0.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", th);
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC4974kt0
    /* JADX INFO: renamed from: isShared, reason: from getter */
    public boolean get_isShared() {
        return this._isShared;
    }

    @Override // defpackage.InterfaceC5184lt0
    public void onLocationPermissionChanged(boolean enabled) {
        if (enabled) {
            LY1.suspendifyOnThread$default(0, new a(null), 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4974kt0
    @Nullable
    public Object requestPermission(@NotNull JM<? super Boolean> jm) {
        b bVar;
        C2512Yo1 c2512Yo1;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object obj = bVar.result;
        MN mn = MN.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            NS0.log(EnumC5513nS0.DEBUG, "LocationManager.requestPermission()");
            C2512Yo1 c2512Yo2 = new C2512Yo1();
            RV rv = C6266r20.a;
            AbstractC8109zn0 abstractC8109zn0 = QV0.a;
            c cVar = new c(c2512Yo2, null);
            bVar.L$0 = c2512Yo2;
            bVar.label = 1;
            if (C5189lv.p(abstractC8109zn0, cVar, bVar) == mn) {
                return mn;
            }
            c2512Yo1 = c2512Yo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2512Yo1 = (C2512Yo1) bVar.L$0;
            C1795Pt1.b(obj);
        }
        return Boolean.valueOf(c2512Yo1.d);
    }

    @Override // defpackage.InterfaceC4974kt0
    public void setShared(boolean z) {
        NS0.debug$default("LocationManager.setIsShared(value: " + z + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", "OS_LOCATION_SHARED", Boolean.valueOf(z));
        this._isShared = z;
        onLocationPermissionChanged(z);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._locationPermissionController.subscribe((InterfaceC5184lt0) this);
        if (ZR0.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            LY1.suspendifyOnThread$default(0, new d(null), 1, null);
        }
    }
}
