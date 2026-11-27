package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C3192ce extends AbstractC2759ae implements androidx.appcompat.view.menu.f.a, LayoutInflater.Factory2 {
    public static final C2703aM1<String, Integer> m0 = new C2703aM1<>();
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean p0 = true;
    public PopupWindow A;
    public RunnableC3611ee B;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public k[] Q;
    public k R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public i b0;
    public g c0;
    public boolean d0;
    public int e0;
    public boolean g0;
    public Rect h0;
    public Rect i0;
    public C1278Je j0;
    public OnBackInvokedDispatcher k0;
    public OnBackInvokedCallback l0;
    public final Object n;
    public final Context o;
    public Window p;
    public f q;
    public final Object r;
    public AbstractC6068q5 s;
    public GV1 t;
    public CharSequence u;
    public AU v;
    public b w;
    public l x;
    public AbstractC6907u5 y;
    public ActionBarContextView z;
    public C5345me2 C = null;
    public final boolean D = true;
    public final a f0 = new a();

    /* JADX INFO: renamed from: ce$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            if ((layoutInflaterFactory2C3192ce.e0 & 1) != 0) {
                layoutInflaterFactory2C3192ce.G(0);
            }
            if ((layoutInflaterFactory2C3192ce.e0 & 4096) != 0) {
                layoutInflaterFactory2C3192ce.G(108);
            }
            layoutInflaterFactory2C3192ce.d0 = false;
            layoutInflaterFactory2C3192ce.e0 = 0;
        }
    }

    /* JADX INFO: renamed from: ce$b */
    public final class b implements androidx.appcompat.view.menu.j.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            LayoutInflaterFactory2C3192ce.this.C(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(@NonNull androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = LayoutInflaterFactory2C3192ce.this.p.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: ce$c */
    public class c {
        public final C4212hV1.a a;

        /* JADX INFO: renamed from: ce$c$a */
        public class a extends C2432Xo {
            public a() {
            }

            @Override // defpackage.InterfaceC5765oe2
            public final void b() {
                c cVar = c.this;
                LayoutInflaterFactory2C3192ce.this.z.setVisibility(8);
                LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
                PopupWindow popupWindow = layoutInflaterFactory2C3192ce.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C3192ce.z.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C3192ce.z.getParent();
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    Cd2.c.c(view);
                }
                layoutInflaterFactory2C3192ce.z.h();
                layoutInflaterFactory2C3192ce.C.d(null);
                layoutInflaterFactory2C3192ce.C = null;
                ViewGroup viewGroup = layoutInflaterFactory2C3192ce.F;
                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                Cd2.c.c(viewGroup);
            }
        }

        public c(C4212hV1.a aVar) {
            this.a = aVar;
        }

        public final void a(AbstractC6907u5 abstractC6907u5) {
            C4212hV1.a aVar = this.a;
            aVar.a.onDestroyActionMode(aVar.a(abstractC6907u5));
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            if (layoutInflaterFactory2C3192ce.A != null) {
                layoutInflaterFactory2C3192ce.p.getDecorView().removeCallbacks(layoutInflaterFactory2C3192ce.B);
            }
            if (layoutInflaterFactory2C3192ce.z != null) {
                C5345me2 c5345me2 = layoutInflaterFactory2C3192ce.C;
                if (c5345me2 != null) {
                    c5345me2.b();
                }
                C5345me2 c5345me2A = Cd2.a(layoutInflaterFactory2C3192ce.z);
                c5345me2A.a(0.0f);
                layoutInflaterFactory2C3192ce.C = c5345me2A;
                c5345me2A.d(new a());
            }
            layoutInflaterFactory2C3192ce.y = null;
            ViewGroup viewGroup = layoutInflaterFactory2C3192ce.F;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.c.c(viewGroup);
            layoutInflaterFactory2C3192ce.T();
        }

        public final boolean b(AbstractC6907u5 abstractC6907u5, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = LayoutInflaterFactory2C3192ce.this.F;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.c.c(viewGroup);
            C4212hV1.a aVar = this.a;
            C4212hV1 c4212hV1A = aVar.a(abstractC6907u5);
            C2703aM1<Menu, Menu> c2703aM1 = aVar.d;
            Menu orDefault = c2703aM1.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new MenuC5534nZ0(aVar.b, fVar);
                c2703aM1.put(fVar, orDefault);
            }
            return aVar.a.onPrepareActionMode(c4212hV1A, orDefault);
        }
    }

    /* JADX INFO: renamed from: ce$d */
    public static class d {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static OR0 b(Configuration configuration) {
            return OR0.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(OR0 or0) {
            LocaleList.setDefault(LocaleList.forLanguageTags(or0.a.a.toLanguageTags()));
        }

        public static void d(Configuration configuration, OR0 or0) {
            configuration.setLocales(LocaleList.forLanguageTags(or0.a.a.toLanguageTags()));
        }
    }

    /* JADX INFO: renamed from: ce$e */
    public static class e {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, ke] */
        public static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce) {
            Objects.requireNonNull(layoutInflaterFactory2C3192ce);
            ?? r0 = new OnBackInvokedCallback() { // from class: ke
                public final void onBackInvoked() {
                    layoutInflaterFactory2C3192ce.O();
                }
            };
            C4031ge.a(obj).registerOnBackInvokedCallback(1000000, r0);
            return r0;
        }

        public static void c(Object obj, Object obj2) {
            C4031ge.a(obj).unregisterOnBackInvokedCallback(C4439ib.b(obj2));
        }
    }

    /* JADX INFO: renamed from: ce$g */
    public class g extends h {
        public final PowerManager c;

        public g(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // defpackage.LayoutInflaterFactory2C3192ce.h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // defpackage.LayoutInflaterFactory2C3192ce.h
        public final int c() {
            return this.c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // defpackage.LayoutInflaterFactory2C3192ce.h
        public final void d() {
            LayoutInflaterFactory2C3192ce.this.y(true, true);
        }
    }

    /* JADX INFO: renamed from: ce$h */
    public abstract class h {
        public a a;

        /* JADX INFO: renamed from: ce$h$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                h.this.d();
            }
        }

        public h() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                try {
                    LayoutInflaterFactory2C3192ce.this.o.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            LayoutInflaterFactory2C3192ce.this.o.registerReceiver(this.a, intentFilterB);
        }
    }

    /* JADX INFO: renamed from: ce$i */
    public class i extends h {
        public final R52 c;

        public i(R52 r52) {
            super();
            this.c = r52;
        }

        @Override // defpackage.LayoutInflaterFactory2C3192ce.h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        @Override // defpackage.LayoutInflaterFactory2C3192ce.h
        public final int c() {
            Location lastKnownLocation;
            boolean z;
            long j;
            R52 r52 = this.c;
            R52.a aVar = r52.c;
            if (aVar.b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Context context = r52.a;
                int iB = C6772tS0.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation2 = null;
                LocationManager locationManager = r52.b;
                if (iB == 0) {
                    try {
                        if (locationManager.isProviderEnabled("network")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("network");
                        } else {
                            lastKnownLocation = null;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    lastKnownLocation = null;
                }
                if (C6772tS0.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
                z = false;
                if (lastKnownLocation != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (Q52.d == null) {
                        Q52.d = new Q52();
                    }
                    Q52 q52 = Q52.d;
                    q52.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                    q52.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                    z = q52.c == 1;
                    long j2 = q52.b;
                    long j3 = q52.a;
                    q52.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                    long j4 = q52.b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j3) {
                            j2 = j4;
                        } else if (jCurrentTimeMillis > j2) {
                            j2 = j3;
                        }
                        j = j2 + 60000;
                    }
                    aVar.a = z;
                    aVar.b = j;
                } else {
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }

        @Override // defpackage.LayoutInflaterFactory2C3192ce.h
        public final void d() {
            LayoutInflaterFactory2C3192ce.this.y(true, true);
        }
    }

    /* JADX INFO: renamed from: ce$j */
    public class j extends ContentFrameLayout {
        public j(HM hm) {
            super(hm, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C3192ce.this.F(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
                    layoutInflaterFactory2C3192ce.D(layoutInflaterFactory2C3192ce.K(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C7652xe.d(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: ce$k */
    public static final class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public j e;
        public View f;
        public View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public HM j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Bundle p;
    }

    /* JADX INFO: renamed from: ce$l */
    public final class l implements androidx.appcompat.view.menu.j.a {
        public l() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            k kVar;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i = 0;
            boolean z2 = fVarK != fVar;
            if (z2) {
                fVar = fVarK;
            }
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            k[] kVarArr = layoutInflaterFactory2C3192ce.Q;
            int length = kVarArr != null ? kVarArr.length : 0;
            while (true) {
                if (i < length) {
                    kVar = kVarArr[i];
                    if (kVar != null && kVar.h == fVar) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    kVar = null;
                    break;
                }
            }
            if (kVar != null) {
                if (!z2) {
                    layoutInflaterFactory2C3192ce.D(kVar, z);
                } else {
                    layoutInflaterFactory2C3192ce.B(kVar.a, kVar, fVarK);
                    layoutInflaterFactory2C3192ce.D(kVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(@NonNull androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            if (!layoutInflaterFactory2C3192ce.K || (callback = layoutInflaterFactory2C3192ce.p.getCallback()) == null || layoutInflaterFactory2C3192ce.V) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public LayoutInflaterFactory2C3192ce(Context context, Window window, InterfaceC2057Td interfaceC2057Td, Object obj) {
        C2703aM1<String, Integer> c2703aM1;
        Integer orDefault;
        ActivityC1745Pd activityC1745Pd;
        this.X = -100;
        this.o = context;
        this.r = interfaceC2057Td;
        this.n = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ActivityC1745Pd) {
                        activityC1745Pd = (ActivityC1745Pd) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                activityC1745Pd = null;
                break;
            }
            if (activityC1745Pd != null) {
                this.X = activityC1745Pd.o().i();
            }
        }
        if (this.X == -100 && (orDefault = (c2703aM1 = m0).getOrDefault(this.n.getClass().getName(), null)) != null) {
            this.X = orDefault.intValue();
            c2703aM1.remove(this.n.getClass().getName());
        }
        if (window != null) {
            z(window);
        }
        C5552ne.d();
    }

    public static OR0 A(@NonNull Context context) {
        OR0 or0;
        OR0 or1;
        if (Build.VERSION.SDK_INT >= 33 || (or0 = AbstractC2759ae.g) == null) {
            return null;
        }
        OR0 or0B = d.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = or0.a.a;
        if (localeList.isEmpty()) {
            or1 = OR0.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < or0B.a.a.size() + localeList.size()) {
                Locale locale = i2 < localeList.size() ? localeList.get(i2) : or0B.a.a.get(i2 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            or1 = new OR0(new QR0(OR0.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return or1.a.a.isEmpty() ? or0B : or1;
    }

    @NonNull
    public static Configuration E(@NonNull Context context, int i2, OR0 or0, Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (or0 != null) {
            d.d(configuration2, or0);
        }
        return configuration2;
    }

    public final void B(int i2, k kVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (kVar == null && i2 >= 0) {
                k[] kVarArr = this.Q;
                if (i2 < kVarArr.length) {
                    kVar = kVarArr[i2];
                }
            }
            if (kVar != null) {
                fVar = kVar.h;
            }
        }
        if ((kVar == null || kVar.m) && !this.V) {
            f fVar2 = this.q;
            Window.Callback callback = this.p.getCallback();
            fVar2.getClass();
            try {
                fVar2.i = true;
                callback.onPanelClosed(i2, fVar);
            } finally {
                fVar2.i = false;
            }
        }
    }

    public final void C(@NonNull androidx.appcompat.view.menu.f fVar) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.v.i();
        Window.Callback callback = this.p.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, fVar);
        }
        this.P = false;
    }

    public final void D(k kVar, boolean z) {
        j jVar;
        AU au;
        if (z && kVar.a == 0 && (au = this.v) != null && au.a()) {
            C(kVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.o.getSystemService("window");
        if (windowManager != null && kVar.m && (jVar = kVar.e) != null) {
            windowManager.removeView(jVar);
            if (z) {
                B(kVar.a, kVar, null);
            }
        }
        kVar.k = false;
        kVar.l = false;
        kVar.m = false;
        kVar.f = null;
        kVar.n = true;
        if (this.R == kVar) {
            this.R = null;
        }
        if (kVar.a == 0) {
            T();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[RETURN] */
    public final boolean F(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        k kVarK;
        AU au;
        Context context;
        boolean z;
        boolean zF;
        boolean zR;
        AudioManager audioManager;
        k kVarK2;
        Object obj = this.n;
        if ((!(obj instanceof C4388iK0.a) && !(obj instanceof DialogC5342me)) || (decorView = this.p.getDecorView()) == null || !C4388iK0.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                f fVar = this.q;
                Window.Callback callback = this.p.getCallback();
                fVar.getClass();
                try {
                    fVar.h = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    fVar.h = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.S = (keyEvent.getFlags() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    kVarK2 = K(0);
                                    if (!kVarK2.m) {
                                        R(kVarK2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.y == null) {
                                    kVarK = K(0);
                                    au = this.v;
                                    context = this.o;
                                    if (au != null || !au.c() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = kVarK.m;
                                        if (!z || kVarK.l) {
                                            D(kVarK, true);
                                            zF = z;
                                        } else if (kVarK.k) {
                                            if (kVarK.o) {
                                                kVarK.k = false;
                                                zR = R(kVarK, keyEvent);
                                            } else {
                                                zR = true;
                                            }
                                            if (zR) {
                                                P(kVarK, keyEvent);
                                                zF = true;
                                            } else {
                                                zF = false;
                                            }
                                        } else {
                                            zF = false;
                                        }
                                    } else if (this.v.a()) {
                                        zF = this.v.f();
                                    } else if (this.V || !R(kVarK, keyEvent)) {
                                        zF = false;
                                    } else {
                                        zF = this.v.g();
                                    }
                                    if (zF) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        b0.e("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (O()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    fVar.h = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.S = (keyEvent.getFlags() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            kVarK2 = K(0);
                            if (!kVarK2.m) {
                                R(kVarK2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.y == null) {
                            kVarK = K(0);
                            au = this.v;
                            context = this.o;
                            if (au != null) {
                                z = kVarK.m;
                                if (z) {
                                    D(kVarK, true);
                                    zF = z;
                                } else {
                                    D(kVarK, true);
                                    zF = z;
                                }
                            } else {
                                z = kVarK.m;
                                if (z) {
                                    D(kVarK, true);
                                    zF = z;
                                } else {
                                    D(kVarK, true);
                                    zF = z;
                                }
                            }
                            if (zF) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                b0.e("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (O()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void G(int i2) {
        k kVarK = K(i2);
        if (kVarK.h != null) {
            Bundle bundle = new Bundle();
            kVarK.h.t(bundle);
            if (bundle.size() > 0) {
                kVarK.p = bundle;
            }
            kVarK.h.w();
            kVarK.h.clear();
        }
        kVarK.o = true;
        kVarK.n = true;
        if ((i2 == 108 || i2 == 0) && this.v != null) {
            k kVarK2 = K(0);
            kVarK2.k = false;
            R(kVarK2, null);
        }
    }

    public final void H() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        int[] iArr = C3855fm1.j;
        Context context = this.o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            r(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            r(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            r(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            r(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        I();
        this.p.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(com.pexpress.tool.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.pexpress.tool.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.pexpress.tool.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.pexpress.tool.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new HM(context, typedValue.resourceId) : context).inflate(com.pexpress.tool.R.layout.abc_screen_toolbar, (ViewGroup) null);
            AU au = (AU) viewGroup.findViewById(com.pexpress.tool.R.id.decor_content_parent);
            this.v = au;
            au.setWindowCallback(this.p.getCallback());
            if (this.L) {
                this.v.h(109);
            }
            if (this.I) {
                this.v.h(2);
            }
            if (this.J) {
                this.v.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.K);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.L);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.N);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.M);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(C2983be.b(sb, this.O, " }"));
        }
        C5642o31 c5642o31 = new C5642o31(this);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        Cd2.d.u(viewGroup, c5642o31);
        if (this.v == null) {
            this.G = (TextView) viewGroup.findViewById(com.pexpress.tool.R.id.title);
        }
        Method method = Je2.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.pexpress.tool.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.p.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.p.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C3402de(this));
        this.F = viewGroup;
        Object obj = this.n;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            AU au2 = this.v;
            if (au2 != null) {
                au2.setWindowTitle(title);
            } else {
                AbstractC6068q5 abstractC6068q5 = this.s;
                if (abstractC6068q5 != null) {
                    abstractC6068q5.p(title);
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.p.getDecorView();
        contentFrameLayout2.k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.E = true;
        k kVarK = K(0);
        if (this.V || kVarK.h != null) {
            return;
        }
        M(108);
    }

    public final void I() {
        if (this.p == null) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                z(((Activity) obj).getWindow());
            }
        }
        if (this.p == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final h J(@NonNull Context context) {
        if (this.b0 == null) {
            if (R52.d == null) {
                Context applicationContext = context.getApplicationContext();
                R52.d = new R52(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new i(R52.d);
        }
        return this.b0;
    }

    public final k K(int i2) {
        k[] kVarArr = this.Q;
        if (kVarArr == null || kVarArr.length <= i2) {
            k[] kVarArr2 = new k[i2 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.Q = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i2];
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k();
        kVar2.a = i2;
        kVar2.n = false;
        kVarArr[i2] = kVar2;
        return kVar2;
    }

    public final void L() {
        H();
        if (this.K && this.s == null) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                this.s = new Ti2((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.s = new Ti2((Dialog) obj);
            }
            AbstractC6068q5 abstractC6068q5 = this.s;
            if (abstractC6068q5 != null) {
                abstractC6068q5.l(this.g0);
            }
        }
    }

    public final void M(int i2) {
        this.e0 = (1 << i2) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.p.getDecorView();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final int N(@NonNull Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.c0 == null) {
                            this.c0 = new g(context);
                        }
                        return this.c0.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return J(context).c();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean O() {
        boolean z = this.S;
        this.S = false;
        k kVarK = K(0);
        if (!kVarK.m) {
            AbstractC6907u5 abstractC6907u5 = this.y;
            if (abstractC6907u5 != null) {
                abstractC6907u5.c();
                return true;
            }
            L();
            AbstractC6068q5 abstractC6068q5 = this.s;
            if (abstractC6068q5 == null || !abstractC6068q5.b()) {
                return false;
            }
        } else if (!z) {
            D(kVarK, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r3.j.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.LayoutInflaterFactory2C3192ce.k r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C3192ce.P(ce$k, android.view.KeyEvent):void");
    }

    public final boolean Q(k kVar, int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.k || R(kVar, keyEvent)) && (fVar = kVar.h) != null) {
            return fVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    public final boolean R(k kVar, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        AU au;
        AU au2;
        Resources.Theme themeNewTheme;
        AU au3;
        AU au4;
        if (!this.V) {
            if (kVar.k) {
                return true;
            }
            k kVar2 = this.R;
            if (kVar2 != null && kVar2 != kVar) {
                D(kVar2, false);
            }
            Window.Callback callback = this.p.getCallback();
            int i2 = kVar.a;
            if (callback != null) {
                kVar.g = callback.onCreatePanelView(i2);
            }
            boolean z = i2 == 0 || i2 == 108;
            if (z && (au4 = this.v) != null) {
                au4.b();
            }
            if (kVar.g == null && (!z || !(this.s instanceof C5211m02))) {
                androidx.appcompat.view.menu.f fVar2 = kVar.h;
                if (fVar2 == null || kVar.o) {
                    if (fVar2 == null) {
                        Context context = this.o;
                        if ((i2 == 0 || i2 == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.pexpress.tool.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.pexpress.tool.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.pexpress.tool.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                HM hm = new HM(context, 0);
                                hm.getTheme().setTo(themeNewTheme);
                                context = hm;
                            }
                        }
                        androidx.appcompat.view.menu.f fVar3 = new androidx.appcompat.view.menu.f(context);
                        fVar3.e = this;
                        androidx.appcompat.view.menu.f fVar4 = kVar.h;
                        if (fVar3 != fVar4) {
                            if (fVar4 != null) {
                                fVar4.r(kVar.i);
                            }
                            kVar.h = fVar3;
                            androidx.appcompat.view.menu.d dVar = kVar.i;
                            if (dVar != null) {
                                fVar3.b(dVar, fVar3.a);
                            }
                        }
                        if (kVar.h != null) {
                            if (z && (au2 = this.v) != null) {
                                if (this.w == null) {
                                    this.w = new b();
                                }
                                au2.d(kVar.h, this.w);
                            }
                            kVar.h.w();
                            if (callback.onCreatePanelMenu(i2, kVar.h)) {
                                kVar.o = false;
                            } else {
                                fVar = kVar.h;
                                if (fVar != null) {
                                    if (fVar != null) {
                                        fVar.r(kVar.i);
                                    }
                                    kVar.h = null;
                                }
                                if (z && (au = this.v) != null) {
                                    au.d(null, this.w);
                                }
                            }
                        }
                    } else {
                        if (z) {
                            if (this.w == null) {
                                this.w = new b();
                            }
                            au2.d(kVar.h, this.w);
                        }
                        kVar.h.w();
                        if (callback.onCreatePanelMenu(i2, kVar.h)) {
                            fVar = kVar.h;
                            if (fVar != null) {
                                if (fVar != null) {
                                    fVar.r(kVar.i);
                                }
                                kVar.h = null;
                            }
                            if (z) {
                                au.d(null, this.w);
                            }
                        } else {
                            kVar.o = false;
                        }
                    }
                }
                kVar.h.w();
                Bundle bundle = kVar.p;
                if (bundle != null) {
                    kVar.h.s(bundle);
                    kVar.p = null;
                }
                if (!callback.onPreparePanel(0, kVar.g, kVar.h)) {
                    if (z && (au3 = this.v) != null) {
                        au3.d(null, this.w);
                    }
                    kVar.h.v();
                    return false;
                }
                kVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                kVar.h.v();
            }
            kVar.k = true;
            kVar.l = false;
            this.R = kVar;
            return true;
        }
        return false;
    }

    public final void S() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void T() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.k0 != null && (K(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.l0 == null) {
                this.l0 = e.b(this.k0, this);
            } else {
                if (z || (onBackInvokedCallback = this.l0) == null) {
                    return;
                }
                e.c(this.k0, onBackInvokedCallback);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
        k kVar;
        Window.Callback callback = this.p.getCallback();
        if (callback != null && !this.V) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            k[] kVarArr = this.Q;
            int length = kVarArr != null ? kVarArr.length : 0;
            for (int i2 = 0; i2 < length; i2++) {
                kVar = kVarArr[i2];
                if (kVar != null && kVar.h == fVarK) {
                    if (kVar != null) {
                        return callback.onMenuItemSelected(kVar.a, menuItem);
                    }
                }
            }
            kVar = null;
            if (kVar != null) {
                return callback.onMenuItemSelected(kVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(@NonNull androidx.appcompat.view.menu.f fVar) {
        AU au = this.v;
        if (au == null || !au.c() || (ViewConfiguration.get(this.o).hasPermanentMenuKey() && !this.v.e())) {
            k kVarK = K(0);
            kVarK.n = true;
            D(kVarK, false);
            P(kVarK, null);
            return;
        }
        Window.Callback callback = this.p.getCallback();
        if (this.v.a()) {
            this.v.f();
            if (this.V) {
                return;
            }
            callback.onPanelClosed(108, K(0).h);
            return;
        }
        if (callback == null || this.V) {
            return;
        }
        if (this.d0 && (1 & this.e0) != 0) {
            View decorView = this.p.getDecorView();
            a aVar = this.f0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        k kVarK2 = K(0);
        androidx.appcompat.view.menu.f fVar2 = kVarK2.h;
        if (fVar2 == null || kVarK2.o || !callback.onPreparePanel(0, kVarK2.g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, kVarK2.h);
        this.v.g();
    }

    @Override // defpackage.AbstractC2759ae
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        ((ViewGroup) this.F.findViewById(R.id.content)).addView(view, layoutParams);
        this.q.a(this.p.getCallback());
    }

    @Override // defpackage.AbstractC2759ae
    public final void d() {
        OR0 or0;
        Context context = this.o;
        if (AbstractC2759ae.m(context) && (or0 = AbstractC2759ae.g) != null && !or0.equals(AbstractC2759ae.h)) {
            AbstractC2759ae.d.execute(new RunnableC2555Zd(context, 0));
        }
        y(true, true);
    }

    @Override // defpackage.AbstractC2759ae
    public final boolean e() {
        return y(true, true);
    }

    @Override // defpackage.AbstractC2759ae
    public final <T extends View> T f(int i2) {
        H();
        return (T) this.p.findViewById(i2);
    }

    @Override // defpackage.AbstractC2759ae
    public final Context h() {
        return this.o;
    }

    @Override // defpackage.AbstractC2759ae
    public final int i() {
        return this.X;
    }

    @Override // defpackage.AbstractC2759ae
    public final void k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.o);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C3192ce;
        }
    }

    @Override // defpackage.AbstractC2759ae
    public final void l() {
        if (this.s != null) {
            L();
            if (this.s.f()) {
                return;
            }
            M(0);
        }
    }

    @Override // defpackage.AbstractC2759ae
    public final void n() {
        String strC;
        this.T = true;
        y(false, true);
        I();
        Object obj = this.n;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = A21.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC6068q5 abstractC6068q5 = this.s;
                if (abstractC6068q5 == null) {
                    this.g0 = true;
                } else {
                    abstractC6068q5.l(true);
                }
            }
            synchronized (AbstractC2759ae.l) {
                AbstractC2759ae.q(this);
                AbstractC2759ae.k.add(new WeakReference<>(this));
            }
        }
        this.W = new Configuration(this.o.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.AbstractC2759ae
    public final void o() {
        if (this.n instanceof Activity) {
            synchronized (AbstractC2759ae.l) {
                AbstractC2759ae.q(this);
            }
        }
        if (this.d0) {
            this.p.getDecorView().removeCallbacks(this.f0);
        }
        this.V = true;
        if (this.X != -100) {
            Object obj = this.n;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                m0.put(this.n.getClass().getName(), Integer.valueOf(this.X));
            } else {
                m0.remove(this.n.getClass().getName());
            }
        } else {
            m0.remove(this.n.getClass().getName());
        }
        AbstractC6068q5 abstractC6068q5 = this.s;
        if (abstractC6068q5 != null) {
            abstractC6068q5.h();
        }
        i iVar = this.b0;
        if (iVar != null) {
            iVar.a();
        }
        g gVar = this.c0;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c7231ve;
        if (this.j0 == null) {
            int[] iArr = C3855fm1.j;
            Context context2 = this.o;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.j0 = new C1278Je();
            } else {
                try {
                    this.j0 = (C1278Je) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.j0 = new C1278Je();
                }
            }
        }
        C1278Je c1278Je = this.j0;
        int i2 = C4240hd2.a;
        c1278Je.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        Context hm = (resourceId == 0 || ((context instanceof HM) && ((HM) context).a == resourceId)) ? context : new HM(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str) {
            case "RatingBar":
                c7231ve = new C7231ve(hm, attributeSet);
                break;
            case "CheckedTextView":
                c7231ve = new C2213Vd(hm, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c7231ve = new C6391re(hm, attributeSet);
                break;
            case "TextView":
                c7231ve = c1278Je.e(hm, attributeSet);
                break;
            case "ImageButton":
                c7231ve = new AppCompatImageButton(hm, attributeSet);
                break;
            case "SeekBar":
                c7231ve = new C7862ye(hm, attributeSet);
                break;
            case "Spinner":
                c7231ve = new C0654Be(hm, attributeSet, com.pexpress.tool.R.attr.spinnerStyle);
                break;
            case "RadioButton":
                c7231ve = c1278Je.d(hm, attributeSet);
                break;
            case "ToggleButton":
                c7231ve = new C1200Ie(hm, attributeSet);
                break;
            case "ImageView":
                c7231ve = new AppCompatImageView(hm, attributeSet);
                break;
            case "AutoCompleteTextView":
                c7231ve = c1278Je.a(hm, attributeSet);
                break;
            case "CheckBox":
                c7231ve = c1278Je.c(hm, attributeSet);
                break;
            case "EditText":
                c7231ve = new AppCompatEditText(hm, attributeSet);
                break;
            case "Button":
                c7231ve = c1278Je.b(hm, attributeSet);
                break;
            default:
                c7231ve = null;
                break;
        }
        if (c7231ve == null && context != hm) {
            Object[] objArr = c1278Je.a;
            if (str.equals(Promotion.ACTION_VIEW)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = hm;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C1278Je.g;
                        if (i3 < 3) {
                            View viewF = c1278Je.f(hm, str, strArr[i3]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i3++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = c1278Je.f(hm, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            c7231ve = view2;
        }
        if (c7231ve != null) {
            Context context3 = c7231ve.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (c7231ve.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, C1278Je.c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        c7231ve.setOnClickListener(new C1278Je.a(c7231ve, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = hm.obtainStyledAttributes(attributeSet, C1278Je.d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                    new Bd2(com.pexpress.tool.R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(c7231ve, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = hm.obtainStyledAttributes(attributeSet, C1278Je.e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    Cd2.m(c7231ve, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = hm.obtainStyledAttributes(attributeSet, C1278Je.f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                    new C7861yd2(com.pexpress.tool.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(c7231ve, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return c7231ve;
    }

    @Override // defpackage.AbstractC2759ae
    public final void p() {
        L();
        AbstractC6068q5 abstractC6068q5 = this.s;
        if (abstractC6068q5 != null) {
            abstractC6068q5.n(false);
        }
    }

    @Override // defpackage.AbstractC2759ae
    public final boolean r(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.O && i2 == 108) {
            return false;
        }
        if (this.K && i2 == 1) {
            this.K = false;
        }
        if (i2 == 1) {
            S();
            this.O = true;
            return true;
        }
        if (i2 == 2) {
            S();
            this.I = true;
            return true;
        }
        if (i2 == 5) {
            S();
            this.J = true;
            return true;
        }
        if (i2 == 10) {
            S();
            this.M = true;
            return true;
        }
        if (i2 == 108) {
            S();
            this.K = true;
            return true;
        }
        if (i2 != 109) {
            return this.p.requestFeature(i2);
        }
        S();
        this.L = true;
        return true;
    }

    @Override // defpackage.AbstractC2759ae
    public final void s(int i2) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.o).inflate(i2, viewGroup);
        this.q.a(this.p.getCallback());
    }

    @Override // defpackage.AbstractC2759ae
    public final void t(View view) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.q.a(this.p.getCallback());
    }

    @Override // defpackage.AbstractC2759ae
    public final void u(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.q.a(this.p.getCallback());
    }

    @Override // defpackage.AbstractC2759ae
    public final void w(CharSequence charSequence) {
        this.u = charSequence;
        AU au = this.v;
        if (au != null) {
            au.setWindowTitle(charSequence);
            return;
        }
        AbstractC6068q5 abstractC6068q5 = this.s;
        if (abstractC6068q5 != null) {
            abstractC6068q5.p(charSequence);
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y(boolean z, boolean z2) {
        int i2;
        boolean z3;
        Object obj;
        Object obj2;
        int i3 = 0;
        if (this.V) {
            return false;
        }
        int i4 = this.X;
        if (i4 == -100) {
            i4 = AbstractC2759ae.e;
        }
        Context context = this.o;
        int iN = N(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        OR0 or0A = i5 < 33 ? A(context) : null;
        if (!z2 && or0A != null) {
            or0A = d.b(context.getResources().getConfiguration());
        }
        Configuration configurationE = E(context, iN, or0A, null, false);
        boolean z4 = this.a0;
        Object obj3 = this.n;
        boolean z5 = true;
        if (z4 || !(obj3 instanceof Activity)) {
            this.a0 = true;
            i2 = this.Z;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i5 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Z = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.Z = 0;
                }
                this.a0 = true;
                i2 = this.Z;
            }
        }
        Configuration configuration = this.W;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i6 = configuration.uiMode & 48;
        int i7 = configurationE.uiMode & 48;
        OR0 or0B = d.b(configuration);
        OR0 or0B2 = or0A == null ? null : d.b(configurationE);
        int i8 = i6 != i7 ? 512 : 0;
        if (or0B2 != null && !or0B.equals(or0B2)) {
            i8 |= 8196;
        }
        if (((~i2) & i8) != 0 && z && this.T && ((o0 || this.U) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new X6(activity, i3));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i8 == 0) {
            z5 = z3;
        } else {
            i3 = (i8 & i2) == i8 ? 1 : 0;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
            if (or0B2 != null) {
                d.d(configuration2, or0B2);
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (!C0701Bt1.h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        C0701Bt1.g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        b0.d("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                    }
                    C0701Bt1.h = true;
                }
                Field field = C0701Bt1.g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e3) {
                        b0.d("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!C0701Bt1.b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                C0701Bt1.a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e4) {
                                b0.d("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                            }
                            C0701Bt1.b = true;
                        }
                        Field field2 = C0701Bt1.a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e5) {
                                b0.d("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!C0701Bt1.d) {
                                try {
                                    C0701Bt1.c = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e6) {
                                    b0.d("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
                                }
                                C0701Bt1.d = true;
                            }
                            Class<?> cls = C0701Bt1.c;
                            if (cls != null) {
                                if (!C0701Bt1.f) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        C0701Bt1.e = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        b0.d("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
                                    }
                                    C0701Bt1.f = true;
                                }
                                Field field3 = C0701Bt1.e;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e8) {
                                        b0.d("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
                                    }
                                    if (longSparseArray != null) {
                                        C0701Bt1.a.a(longSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i10 = this.Y;
            if (i10 != 0) {
                context.setTheme(i10);
                context.getTheme().applyStyle(this.Y, true);
            }
            if (i3 != 0 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof FP0) {
                    if (((FP0) activity2).getLifecycle().b().b(androidx.lifecycle.g.b.g)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.U && !this.V) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj3 instanceof ActivityC1745Pd)) {
            if ((i8 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                ((ActivityC1745Pd) obj3).getClass();
            }
            if ((i8 & 4) != 0) {
                ((ActivityC1745Pd) obj3).getClass();
            }
        }
        if (z5 && or0B2 != null) {
            d.c(d.b(context.getResources().getConfiguration()));
        }
        if (i4 == 0) {
            J(context).e();
        } else {
            i iVar = this.b0;
            if (iVar != null) {
                iVar.a();
            }
        }
        if (i4 == 3) {
            if (this.c0 == null) {
                this.c0 = new g(context);
            }
            this.c0.e();
        } else {
            g gVar = this.c0;
            if (gVar != null) {
                gVar.a();
            }
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public final void z(@NonNull Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.p != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof f) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        f fVar = new f(callback);
        this.q = fVar;
        window.setCallback(fVar);
        Context context = this.o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            C5552ne c5552neA = C5552ne.a();
            synchronized (c5552neA) {
                drawableD = c5552neA.a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.p = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.k0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.l0) != null) {
            e.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.l0 = null;
        }
        Object obj = this.n;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.k0 = e.a(activity);
            } else {
                this.k0 = null;
            }
        } else {
            this.k0 = null;
        }
        T();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: ce$f */
    public class f extends Ri2 {
        public C5211m02.e e;
        public boolean g;
        public boolean h;
        public boolean i;

        public f(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.g = true;
                callback.onContentChanged();
            } finally {
                this.g = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z = this.h;
            Window.Callback callback = this.d;
            if (z) {
                return callback.dispatchKeyEvent(keyEvent);
            }
            return LayoutInflaterFactory2C3192ce.this.F(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.d.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
                layoutInflaterFactory2C3192ce.L();
                AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
                if (abstractC6068q5 == null || !abstractC6068q5.i(keyCode, keyEvent)) {
                    k kVar = layoutInflaterFactory2C3192ce.R;
                    if (kVar == null || !layoutInflaterFactory2C3192ce.Q(kVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (layoutInflaterFactory2C3192ce.R == null) {
                            k kVarK = layoutInflaterFactory2C3192ce.K(0);
                            layoutInflaterFactory2C3192ce.R(kVarK, keyEvent);
                            boolean zQ = layoutInflaterFactory2C3192ce.Q(kVarK, keyEvent.getKeyCode(), keyEvent);
                            kVarK.k = false;
                            if (zQ) {
                            }
                        }
                        return false;
                    }
                    k kVar2 = layoutInflaterFactory2C3192ce.R;
                    if (kVar2 != null) {
                        kVar2.l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.g) {
                this.d.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.d.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            C5211m02.e eVar = this.e;
            if (eVar != null) {
                View view = i == 0 ? new View(C5211m02.this.a.a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.d.onCreatePanelView(i);
        }

        @Override // defpackage.Ri2, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            if (i == 108) {
                layoutInflaterFactory2C3192ce.L();
                AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
                if (abstractC6068q5 != null) {
                    abstractC6068q5.c(true);
                }
            } else {
                layoutInflaterFactory2C3192ce.getClass();
            }
            return true;
        }

        @Override // defpackage.Ri2, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.i) {
                this.d.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            if (i == 108) {
                layoutInflaterFactory2C3192ce.L();
                AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
                if (abstractC6068q5 != null) {
                    abstractC6068q5.c(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                layoutInflaterFactory2C3192ce.getClass();
                return;
            }
            k kVarK = layoutInflaterFactory2C3192ce.K(i);
            if (kVarK.m) {
                layoutInflaterFactory2C3192ce.D(kVarK, false);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.x = true;
            }
            C5211m02.e eVar = this.e;
            if (eVar != null && i == 0) {
                C5211m02 c5211m02 = C5211m02.this;
                if (!c5211m02.d) {
                    c5211m02.a.l = true;
                    c5211m02.d = true;
                }
            }
            boolean zOnPreparePanel = this.d.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.x = false;
            }
            return zOnPreparePanel;
        }

        @Override // defpackage.Ri2, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = LayoutInflaterFactory2C3192ce.this.K(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:54:0x014e  */
        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            boolean z;
            ViewGroup viewGroup;
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = LayoutInflaterFactory2C3192ce.this;
            if (!layoutInflaterFactory2C3192ce.D || i != 0) {
                return Ri2.a.b(this.d, callback, i);
            }
            C4212hV1.a aVar = new C4212hV1.a(layoutInflaterFactory2C3192ce.o, callback);
            AbstractC6907u5 abstractC6907u5 = layoutInflaterFactory2C3192ce.y;
            if (abstractC6907u5 != null) {
                abstractC6907u5.c();
            }
            c cVar = layoutInflaterFactory2C3192ce.new c(aVar);
            layoutInflaterFactory2C3192ce.L();
            AbstractC6068q5 abstractC6068q5 = layoutInflaterFactory2C3192ce.s;
            Object obj = layoutInflaterFactory2C3192ce.r;
            if (abstractC6068q5 != null) {
                layoutInflaterFactory2C3192ce.y = abstractC6068q5.q(cVar);
            }
            if (layoutInflaterFactory2C3192ce.y == null) {
                C5345me2 c5345me2 = layoutInflaterFactory2C3192ce.C;
                if (c5345me2 != null) {
                    c5345me2.b();
                }
                AbstractC6907u5 abstractC6907u6 = layoutInflaterFactory2C3192ce.y;
                if (abstractC6907u6 != null) {
                    abstractC6907u6.c();
                }
                if (obj != null) {
                    boolean z2 = layoutInflaterFactory2C3192ce.V;
                }
                if (layoutInflaterFactory2C3192ce.z == null) {
                    boolean z3 = layoutInflaterFactory2C3192ce.N;
                    Context context = layoutInflaterFactory2C3192ce.o;
                    if (z3) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.pexpress.tool.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            HM hm = new HM(context, 0);
                            hm.getTheme().setTo(themeNewTheme);
                            context = hm;
                        }
                        layoutInflaterFactory2C3192ce.z = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.pexpress.tool.R.attr.actionModePopupWindowStyle);
                        layoutInflaterFactory2C3192ce.A = popupWindow;
                        C1909Rf1.d(popupWindow, 2);
                        layoutInflaterFactory2C3192ce.A.setContentView(layoutInflaterFactory2C3192ce.z);
                        layoutInflaterFactory2C3192ce.A.setWidth(-1);
                        context.getTheme().resolveAttribute(com.pexpress.tool.R.attr.actionBarSize, typedValue, true);
                        layoutInflaterFactory2C3192ce.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        layoutInflaterFactory2C3192ce.A.setHeight(-2);
                        layoutInflaterFactory2C3192ce.B = new RunnableC3611ee(layoutInflaterFactory2C3192ce);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C3192ce.F.findViewById(com.pexpress.tool.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            layoutInflaterFactory2C3192ce.L();
                            AbstractC6068q5 abstractC6068q6 = layoutInflaterFactory2C3192ce.s;
                            Context contextE = abstractC6068q6 != null ? abstractC6068q6.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            layoutInflaterFactory2C3192ce.z = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (layoutInflaterFactory2C3192ce.z != null) {
                    C5345me2 c5345me3 = layoutInflaterFactory2C3192ce.C;
                    if (c5345me3 != null) {
                        c5345me3.b();
                    }
                    layoutInflaterFactory2C3192ce.z.h();
                    Context context2 = layoutInflaterFactory2C3192ce.z.getContext();
                    ActionBarContextView actionBarContextView = layoutInflaterFactory2C3192ce.z;
                    C2712aP1 c2712aP1 = new C2712aP1();
                    c2712aP1.g = context2;
                    c2712aP1.h = actionBarContextView;
                    c2712aP1.i = cVar;
                    androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
                    fVar.l = 1;
                    c2712aP1.l = fVar;
                    fVar.e = c2712aP1;
                    if (cVar.a.c(c2712aP1, fVar)) {
                        c2712aP1.i();
                        layoutInflaterFactory2C3192ce.z.f(c2712aP1);
                        layoutInflaterFactory2C3192ce.y = c2712aP1;
                        if (layoutInflaterFactory2C3192ce.E && (viewGroup = layoutInflaterFactory2C3192ce.F) != null) {
                            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                            z = viewGroup.isLaidOut();
                        }
                        if (z) {
                            layoutInflaterFactory2C3192ce.z.setAlpha(0.0f);
                            C5345me2 c5345me2A = Cd2.a(layoutInflaterFactory2C3192ce.z);
                            c5345me2A.a(1.0f);
                            layoutInflaterFactory2C3192ce.C = c5345me2A;
                            c5345me2A.d(new C3821fe(layoutInflaterFactory2C3192ce));
                        } else {
                            layoutInflaterFactory2C3192ce.z.setAlpha(1.0f);
                            layoutInflaterFactory2C3192ce.z.setVisibility(0);
                            if (layoutInflaterFactory2C3192ce.z.getParent() instanceof View) {
                                View view = (View) layoutInflaterFactory2C3192ce.z.getParent();
                                WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                                Cd2.c.c(view);
                            }
                        }
                        if (layoutInflaterFactory2C3192ce.A != null) {
                            layoutInflaterFactory2C3192ce.p.getDecorView().post(layoutInflaterFactory2C3192ce.B);
                        }
                    } else {
                        layoutInflaterFactory2C3192ce.y = null;
                    }
                }
                layoutInflaterFactory2C3192ce.T();
                layoutInflaterFactory2C3192ce.y = layoutInflaterFactory2C3192ce.y;
            }
            layoutInflaterFactory2C3192ce.T();
            AbstractC6907u5 abstractC6907u7 = layoutInflaterFactory2C3192ce.y;
            if (abstractC6907u7 != null) {
                return aVar.a(abstractC6907u7);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }
}
