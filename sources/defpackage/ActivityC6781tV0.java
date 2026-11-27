package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.v;
import com.api.core.ActivityStateProvider;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.app.services.WebSocketService;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import defpackage.ActivityC6781tV0;
import defpackage.FP0;
import io.sentry.android.core.b0;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LtV0;", "Lrq;", "LzV0;", "<init>", "()V", "AppBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ActivityC6781tV0 extends AbstractActivityC6436rq implements InterfaceC8042zV0 {
    public static final /* synthetic */ int Q = 0;
    public FV0 A;
    public AbstractC5045lD0 B;
    public F91 C;
    public C2702aM0 D;
    public C1952Ru E;
    public AbstractC8015zM0 F;
    public C1949Rt G;

    @Nullable
    public C3086c7 H;
    public boolean I;
    public boolean J;
    public int L;
    public long M;
    public C3733fC<C5673oB1> g;
    public C4701jc h;
    public InterfaceC3951gE1 i;
    public androidx.fragment.app.i j;
    public InterfaceC0967Fe0 k;
    public C3296d7 l;
    public C4923kf m;
    public InterfaceC3560eO0<C2525Yt> n;
    public C4612j90 o;
    public InterfaceC6168qa1 p;
    public InterfaceC0859Du0 q;
    public InterfaceC3706f42 r;
    public D32 s;
    public I31 t;
    public C6355rT0 u;
    public Y12 v;
    public ZA1 w;
    public ActivityStateProvider x;
    public ReporterApi y;
    public LU z;
    public boolean K = true;

    @NotNull
    public final KW1 N = XO0.b(new C7946z2(this, 3));

    @NotNull
    public final v O = new v(C2017Sp1.a.b(NV0.class), new h(), new C8141zy(this, 1), new i());

    @NotNull
    public final KW1 P = XO0.b(new C4333i4(this, 1));

    /* JADX INFO: renamed from: tV0$a */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$onCreate$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ActivityC6781tV0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            ActivityC6781tV0.this.w().w();
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: tV0$b */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$onCreate$2", f = "MainActivity.kt", l = {248}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ ActivityC6781tV0 e;
        public final /* synthetic */ Bundle g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JM jm, ActivityC6781tV0 activityC6781tV0, Bundle bundle) {
            super(2, jm);
            this.e = activityC6781tV0;
            this.g = bundle;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(jm, this.e, this.g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Intent launchIntentForPackage;
            int i = 2;
            int i2 = 0;
            int i3 = 1;
            MN mn = MN.d;
            int i4 = this.d;
            if (i4 == 0) {
                C1795Pt1.b(obj);
                final ActivityC6781tV0 activity = this.e;
                C3296d7 c3296d7 = activity.l;
                if (c3296d7 == null) {
                    Intrinsics.l("activityOnBackPressedProvider");
                    throw null;
                }
                Q2 q2 = new Q2(activity, 6);
                Intrinsics.checkNotNullParameter(q2, "<set-?>");
                c3296d7.b = q2;
                if (activity.t().getY()) {
                    activity.t().d(false);
                    ReporterApi.a.b(activity.v(), EnumC5028l80.g, null, null, 14);
                }
                ReporterApi.a.b(activity.v(), EnumC5028l80.h, null, null, 14);
                activity.w().v(false);
                C5942pV0 listener = new C5942pV0(activity.w());
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(listener, "listener");
                Window window = activity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                if ((window.getAttributes().softInputMode & 48) == 48) {
                    throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
                }
                Intrinsics.checkNotNullParameter(activity, "activity");
                View viewFindViewById = activity.findViewById(R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(android.R.id.content)");
                View rootView = ((ViewGroup) viewFindViewById).getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getContentRoot(activity).rootView");
                ViewTreeObserverOnGlobalLayoutListenerC7168vK0 viewTreeObserverOnGlobalLayoutListenerC7168vK0 = new ViewTreeObserverOnGlobalLayoutListenerC7168vK0(activity, listener);
                rootView.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC7168vK0);
                activity.getApplication().registerActivityLifecycleCallbacks(new C7379wK0(new UO(activity, viewTreeObserverOnGlobalLayoutListenerC7168vK0), activity));
                C4701jc c4701jc = activity.h;
                if (c4701jc == null) {
                    Intrinsics.l("animatedAppNavigator");
                    throw null;
                }
                C4250hg0 c4250hg0 = new C4250hg0(new C5099lV0(c4701jc.j, activity), 0);
                activity.w().y(c4250hg0);
                activity.w().x();
                D32 d32 = activity.s;
                if (d32 == null) {
                    Intrinsics.l("tradingNotificationController");
                    throw null;
                }
                if (((Boolean) d32.c.y.d.getValue()).booleanValue()) {
                    d32.i();
                    d32.g = C5189lv.k(C3286d41.a, C6266r20.a, new C7533x32(d32, null), 2);
                }
                C3086c7 c3086c7 = activity.H;
                Intrinsics.checkNotNull(c3086c7);
                C3086c7 c3086c8 = activity.H;
                Intrinsics.checkNotNull(c3086c8);
                c3086c8.e.setItemIconTintList(null);
                MenuItem menuItemFindItem = c3086c8.e.getMenu().findItem(com.pexpress.tool.R.id.main_platform_fragment);
                Intrinsics.c(menuItemFindItem, "null cannot be cast to non-null type androidx.core.internal.view.SupportMenuItem");
                ((HV1) menuItemFindItem).setIconTintList(null);
                C3733fC<C5673oB1> c3733fCU = activity.u();
                InterfaceC3951gE1 interfaceC3951gE1 = activity.i;
                if (interfaceC3951gE1 == null) {
                    Intrinsics.l("screensProvider");
                    throw null;
                }
                BottomNavigationView bottomNavigation = c3086c7.e;
                Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
                ReporterApi reporterApiV = activity.v();
                KW1 kw1B = XO0.b(new C5770og(activity, i));
                AbstractC5045lD0 abstractC5045lD0 = activity.B;
                if (abstractC5045lD0 == null) {
                    Intrinsics.l("isShowUseCaseApi");
                    throw null;
                }
                activity.G = new C1949Rt(c3733fCU.a, interfaceC3951gE1, bottomNavigation, c4250hg0, reporterApiV, kw1B, abstractC5045lD0);
                C7652xe.f(activity).d(new C5522nV0(activity, null));
                activity.w().n().e(activity, new g(new C5984ph(activity, i3)));
                C5189lv.k(C7652xe.f(activity), null, new C5732oV0(activity, activity.w().m(), null, activity), 3);
                C3086c7 c3086c9 = activity.H;
                Intrinsics.checkNotNull(c3086c9);
                BottomNavigationView bottomNavigation2 = c3086c9.e;
                Intrinsics.checkNotNullExpressionValue(bottomNavigation2, "bottomNavigation");
                activity.w().u().e(activity, new g(new C4211hV0(i2, bottomNavigation2, activity)));
                activity.w().s().e(activity, new g(new C4717jg(i3, bottomNavigation2, activity)));
                activity.w().r().e(activity, new g(new C4421iV0(activity, i2)));
                I31 i31 = activity.t;
                if (i31 == null) {
                    Intrinsics.l("networkManager");
                    throw null;
                }
                i31.a(activity);
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = C7652xe.f(activity);
                RV rv = C6266r20.a;
                AbstractC8109zn0 abstractC8109zn0 = QV0.a;
                C5189lv.k(lifecycleCoroutineScopeImplF, abstractC8109zn0, new C6152qV0(activity, null), 2);
                C5189lv.k(C7652xe.f(activity), abstractC8109zn0, new C6571sV0(activity, null), 2);
                activity.w().o().e(activity, new g(new KA(activity, i)));
                activity.w().q().e(activity, new g(new C3767fN0(activity, i3)));
                activity.getLifecycle().a(new k() { // from class: com.base.app.activities.main.MainActivity$initOnDestroyListener$1
                    @Override // androidx.lifecycle.k
                    public final void b(FP0 source, g.a event) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(event, "event");
                        int i5 = ActivityC6781tV0.Q;
                        ActivityC6781tV0 activityC6781tV0 = activity;
                        if (event == g.a.ON_DESTROY && activityC6781tV0.isFinishing()) {
                            activityC6781tV0.a();
                        }
                    }
                });
                InterfaceC2523Ys0 inAppMessages = C7766y91.a().getInAppMessages();
                F91 f91 = activity.C;
                if (f91 == null) {
                    Intrinsics.l("oneSignalInAppClickHandler");
                    throw null;
                }
                inAppMessages.mo19addClickListener(f91);
                Bundle bundle = this.g;
                if (bundle != null && !Intrinsics.a(String.valueOf(Process.myPid()), bundle.getString("ProcessPid")) && (launchIntentForPackage = activity.getBaseContext().getPackageManager().getLaunchIntentForPackage(activity.getBaseContext().getPackageName())) != null) {
                    launchIntentForPackage.setFlags(268468224);
                    C5189lv.k(C7652xe.f(activity), null, new C7201vV0(activity, launchIntentForPackage, null), 3);
                }
                C5189lv.k(C7652xe.f(activity), null, new C5312mV0(null, activity, bundle), 3);
                if (bundle == null) {
                    CookieManager.getInstance().removeAllCookies(null);
                }
                C5189lv.k(C7652xe.f(activity), null, new C7832yV0(activity, null), 3);
                activity.w().t();
                this.d = 1;
                InterfaceC0967Fe0 interfaceC0967Fe0 = activity.k;
                if (interfaceC0967Fe0 == null) {
                    Intrinsics.l("firstScreenStarterImpl");
                    throw null;
                }
                Object objA = interfaceC0967Fe0.a(activity.w(), new C5560ng(activity, 5), this);
                if (objA != mn) {
                    objA = Unit.a;
                }
                if (objA == mn) {
                    return mn;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: tV0$c */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$onCreate$3", f = "MainActivity.kt", l = {252}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: tV0$c$a */
        @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$onCreate$3$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function1<JM<? super Long>, Object> {
            public a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new a(1, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super Long> jm) {
                return ((a) create(jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return new Long(System.currentTimeMillis());
            }
        }

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ActivityC6781tV0.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC8015zM0 abstractC8015zM0 = ActivityC6781tV0.this.F;
                if (abstractC8015zM0 == null) {
                    Intrinsics.l("lastSessionStartTimeMillisUseCase");
                    throw null;
                }
                a aVar = new a(1, null);
                this.d = 1;
                if (abstractC8015zM0.l(aVar, this) == mn) {
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

    /* JADX INFO: renamed from: tV0$d */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$onResume$1", f = "MainActivity.kt", l = {323}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ActivityC6781tV0.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1949Rt c1949Rt = ActivityC6781tV0.this.G;
                if (c1949Rt == null) {
                    Intrinsics.l("bottomNavigationListener");
                    throw null;
                }
                this.d = 1;
                if (c1949Rt.b(this) == mn) {
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

    /* JADX INFO: renamed from: tV0$e */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$onStop$1", f = "MainActivity.kt", l = {343}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public e(JM<? super e> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ActivityC6781tV0.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                ReporterApi reporterApiV = ActivityC6781tV0.this.v();
                EnumC5028l80 enumC5028l80 = EnumC5028l80.e0;
                this.d = 1;
                if (reporterApiV.k(enumC5028l80, null) == mn) {
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

    /* JADX INFO: renamed from: tV0$f */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$processIntent$1", f = "MainActivity.kt", l = {308}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ Bundle e;
        public final /* synthetic */ ActivityC6781tV0 g;
        public final /* synthetic */ Intent h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Bundle bundle, ActivityC6781tV0 activityC6781tV0, Intent intent, JM<? super f> jm) {
            super(2, jm);
            this.e = bundle;
            this.g = activityC6781tV0;
            this.h = intent;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new f(this.e, this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                Bundle bundle = this.e;
                if (bundle == null || !bundle.getBoolean("WAS_LANGUAGE_CHANGED")) {
                    LU lu = this.g.z;
                    if (lu == null) {
                        Intrinsics.l("deepLinkManager");
                        throw null;
                    }
                    this.d = 1;
                    RV rv = C6266r20.a;
                    Object objP = C5189lv.p(QV0.a, new IU(lu, this.h, null), this);
                    if (objP != obj2) {
                        objP = Unit.a;
                    }
                    if (objP == obj2) {
                        return obj2;
                    }
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

    /* JADX INFO: renamed from: tV0$g */
    public static final class g implements InterfaceC4819k81, InterfaceC1686Oj0 {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // defpackage.InterfaceC1686Oj0
        @NotNull
        public final Function<?> a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC4819k81
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof InterfaceC4819k81) && (obj instanceof InterfaceC1686Oj0)) {
                return this.a.equals(((InterfaceC1686Oj0) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: renamed from: tV0$h */
    public static final class h extends ML0 implements Function0<Vd2> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Vd2 invoke() {
            return ActivityC6781tV0.this.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: tV0$i */
    public static final class i extends ML0 implements Function0<VP> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final VP invoke() {
            return ActivityC6781tV0.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: tV0$j */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$stopWebSocketService$1", f = "MainActivity.kt", l = {667}, m = "invokeSuspend")
    public static final class j extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public j(JM<? super j> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ActivityC6781tV0.this.new j(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((j) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6355rT0 c6355rT0 = ActivityC6781tV0.this.u;
                if (c6355rT0 == null) {
                    Intrinsics.l("logoutManager");
                    throw null;
                }
                this.d = 1;
                if (c6355rT0.b(false, this) == mn) {
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

    @Override // defpackage.InterfaceC8042zV0
    public final void a() {
        this.K = false;
        C5189lv.k(C7652xe.f(this), null, new j(null), 3);
        InterfaceC0859Du0 interfaceC0859Du0 = this.q;
        if (interfaceC0859Du0 == null) {
            Intrinsics.l("robotNotificationManager");
            throw null;
        }
        interfaceC0859Du0.b();
        try {
            unbindService(t().getB());
        } catch (IllegalArgumentException unused) {
        }
        try {
            stopService(new Intent(this, (Class<?>) WebSocketService.class));
        } catch (RuntimeException e2) {
            b0.f("SERVICE", "stopService failed", e2);
        }
        t().a();
    }

    @Override // defpackage.InterfaceC8042zV0
    public final void b(@NotNull WebSocketService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        InterfaceC0859Du0 interfaceC0859Du0 = this.q;
        if (interfaceC0859Du0 != null) {
            interfaceC0859Du0.a(service);
        } else {
            Intrinsics.l("robotNotificationManager");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC8042zV0
    @NotNull
    public final C3086c7 c() {
        C3086c7 c3086c7 = this.H;
        Intrinsics.checkNotNull(c3086c7);
        return c3086c7;
    }

    @Override // defpackage.InterfaceC8042zV0
    @NotNull
    public final LifecycleCoroutineScopeImpl d() {
        return C7652xe.f(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = C6333rM.getSystemService(this, InputMethodManager.class);
            if (systemService == null) {
                throw new IllegalStateException("The class is not a supported system service.");
            }
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1014 && this.E == null) {
            Intrinsics.l("geolocationPermissionUseCase");
            throw null;
        }
    }

    @Override // defpackage.AbstractActivityC6436rq, androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.ActivityC2686aH, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(null);
        Locale locale = AbstractC2759ae.g().a.a.get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C5189lv.k(C3784fT.a, C6266r20.c, new C7412wV0(null, this, locale), 2);
        if (Build.VERSION.SDK_INT < 33) {
            Locale.setDefault(locale);
        }
        EP0 ep0 = this.x;
        if (ep0 == null) {
            Intrinsics.l("activityStateProvider");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "activity");
        getLifecycle().a(ep0);
        C5189lv.k(C7652xe.f(this), C6266r20.a, new a(null), 2);
        overridePendingTransition(0, 0);
        View viewInflate = getLayoutInflater().inflate(com.pexpress.tool.R.layout.activity_main, (ViewGroup) null, false);
        int i2 = com.pexpress.tool.R.id.bottomNavigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) C3476e.h(viewInflate, com.pexpress.tool.R.id.bottomNavigation);
        if (bottomNavigationView != null) {
            i2 = com.pexpress.tool.R.id.container;
            if (((FragmentContainerView) C3476e.h(viewInflate, com.pexpress.tool.R.id.container)) != null) {
                i2 = com.pexpress.tool.R.id.lock_click_view;
                if (C3476e.h(viewInflate, com.pexpress.tool.R.id.lock_click_view) != null) {
                    i2 = com.pexpress.tool.R.id.lock_view_with_progress;
                    View viewH = C3476e.h(viewInflate, com.pexpress.tool.R.id.lock_view_with_progress);
                    if (viewH != null) {
                        if (((SpinKitView) C3476e.h(viewH, com.pexpress.tool.R.id.loadingProgressBarStub)) == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(viewH.getResources().getResourceName(com.pexpress.tool.R.id.loadingProgressBarStub)));
                        }
                        C4412iS0 c4412iS0 = new C4412iS0((ConstraintLayout) viewH);
                        if (((FragmentContainerView) C3476e.h(viewInflate, com.pexpress.tool.R.id.preloaded_container)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            C3086c7 c3086c7 = new C3086c7(constraintLayout, bottomNavigationView, c4412iS0, constraintLayout);
                            this.H = c3086c7;
                            Intrinsics.checkNotNull(c3086c7);
                            setContentView(constraintLayout);
                            C4612j90 c4612j90 = this.o;
                            if (c4612j90 == null) {
                                Intrinsics.l("events");
                                throw null;
                            }
                            c4612j90.a();
                            C5189lv.k(C7652xe.f(this), null, new b(null, this, bundle), 3);
                            Intent intent = getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                            x(intent, bundle);
                            C5189lv.k(C7652xe.f(this), null, new c(null), 3);
                            return;
                        }
                        i2 = com.pexpress.tool.R.id.preloaded_container;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        x(intent, null);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPause() {
        u().a.a.a = null;
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        s("on_resume");
        C7652xe.f(this).d(new d(null));
    }

    @Override // androidx.fragment.app.g
    public final void onResumeFragments() {
        super.onResumeFragments();
        C5473nF c5473nF = u().a.a;
        C4701jc c4701jc = this.h;
        if (c4701jc != null) {
            c5473nF.a(c4701jc);
        } else {
            Intrinsics.l("animatedAppNavigator");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, defpackage.ActivityC2686aH, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        bundle.putString("ProcessPid", String.valueOf(Process.myPid()));
        bundle.putBoolean("WAS_LANGUAGE_CHANGED", this.I);
    }

    @Override // defpackage.ActivityC1745Pd, androidx.fragment.app.g, android.app.Activity
    public final void onStart() {
        super.onStart();
        s("on_start");
        C4612j90 c4612j90 = this.o;
        if (c4612j90 == null) {
            Intrinsics.l("events");
            throw null;
        }
        Boolean bool = Boolean.TRUE;
        GP1 gp1 = c4612j90.a;
        gp1.getClass();
        gp1.m(null, bool);
        InterfaceC6168qa1 interfaceC6168qa1 = this.p;
        if (interfaceC6168qa1 == null) {
            Intrinsics.l("ourAnalyticsReporter");
            throw null;
        }
        interfaceC6168qa1.c();
        ReporterApi.a.b(v(), EnumC5028l80.S0, null, VE.c(EnumC5326ma.e), 10);
    }

    @Override // defpackage.ActivityC1745Pd, androidx.fragment.app.g, android.app.Activity
    public final void onStop() {
        super.onStop();
        InterfaceC6168qa1 interfaceC6168qa1 = this.p;
        if (interfaceC6168qa1 == null) {
            Intrinsics.l("ourAnalyticsReporter");
            throw null;
        }
        interfaceC6168qa1.f();
        C4612j90 c4612j90 = this.o;
        if (c4612j90 == null) {
            Intrinsics.l("events");
            throw null;
        }
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = c4612j90.a;
        gp1.getClass();
        gp1.m(null, bool);
        Y12 y12 = this.v;
        if (y12 == null) {
            Intrinsics.l("trader");
            throw null;
        }
        if (((Boolean) y12.y.d.getValue()).booleanValue()) {
            C5189lv.k(C3784fT.a, C6266r20.a, new e(null), 2);
        }
        ReporterApi.a.b(v(), EnumC5028l80.R0, null, VE.c(EnumC5326ma.e), 10);
    }

    @Override // defpackage.AbstractActivityC6436rq
    public final void r() {
        ((AV0) this.N.getValue()).a(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.i iVar = this.j;
        if (iVar == null) {
            Intrinsics.l("fragmentFactory");
            throw null;
        }
        supportFragmentManager.y = iVar;
        Intrinsics.checkNotNullParameter(this, "<this>");
        (Build.VERSION.SDK_INT >= 31 ? new BO1(this) : new CO1(this)).a();
        C5189lv.k(C3784fT.a, C6266r20.c, new C7622xV0(this, null), 2);
    }

    public final void s(final String str) {
        if (isFinishing()) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WebSocketService.class);
        if (this.K) {
            boolean z = false;
            try {
                C6333rM.startForegroundService(this, intent);
                final int i2 = this.L;
                if (i2 != 0) {
                    final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.M;
                    C5189lv.k(C3784fT.a, C6266r20.a, new C6991uV0(new Function1() { // from class: kV0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            InterfaceC3706f42 reportOffMain = (InterfaceC3706f42) obj;
                            int i3 = ActivityC6781tV0.Q;
                            Intrinsics.checkNotNullParameter(reportOffMain, "$this$reportOffMain");
                            reportOffMain.c(str, i2, jElapsedRealtime);
                            return Unit.a;
                        }
                    }, this, null), 2);
                    this.L = 0;
                }
                z = true;
            } catch (IllegalStateException e2) {
                if (Build.VERSION.SDK_INT < 31 || !OL.c(e2)) {
                    throw e2;
                }
                b0.f("SERVICE", "Foreground start not allowed, retry on next onStart/onResume", e2);
                if (this.L == 0) {
                    this.M = SystemClock.elapsedRealtime();
                    C5189lv.k(C3784fT.a, C6266r20.a, new C6991uV0(new Function1() { // from class: jV0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            InterfaceC3706f42 reportOffMain = (InterfaceC3706f42) obj;
                            int i3 = ActivityC6781tV0.Q;
                            Intrinsics.checkNotNullParameter(reportOffMain, "$this$reportOffMain");
                            reportOffMain.F(str);
                            return Unit.a;
                        }
                    }, this, null), 2);
                }
                this.L++;
            }
            this.K = !z;
        }
        if (this.J) {
            return;
        }
        this.J = true;
        bindService(intent, t().getB(), 1);
    }

    public final InterfaceC1041Gd t() {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.c(application, "null cannot be cast to non-null type com.api.feature.app.app.AppApi");
        return (InterfaceC1041Gd) application;
    }

    @NotNull
    public final C3733fC<C5673oB1> u() {
        C3733fC<C5673oB1> c3733fC = this.g;
        if (c3733fC != null) {
            return c3733fC;
        }
        Intrinsics.l("cicerone");
        throw null;
    }

    @NotNull
    public final ReporterApi v() {
        ReporterApi reporterApi = this.y;
        if (reporterApi != null) {
            return reporterApi;
        }
        Intrinsics.l("reporter");
        throw null;
    }

    @NotNull
    public final NV0 w() {
        return (NV0) this.O.getValue();
    }

    public final void x(Intent intent, Bundle bundle) {
        String string;
        C7652xe.f(this).e(new f(bundle, this, intent, null));
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("NOTIFICATION")) == null) {
            return;
        }
        ReporterApi.a.b(v(), EnumC5028l80.t0, new C1510Md1(string), WE.f(EnumC5326ma.g, EnumC5326ma.e), 8);
    }
}
