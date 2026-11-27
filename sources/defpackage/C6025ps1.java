package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ps1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6025ps1<TranscodeType> extends AbstractC1784Pq<C6025ps1<TranscodeType>> {
    public final C2082Tl0 A;

    @NonNull
    public L42<?, ? super TranscodeType> B;
    public Object C;
    public ArrayList D;
    public C6025ps1<TranscodeType> E;
    public C6025ps1<TranscodeType> F;
    public boolean G = true;
    public boolean H;
    public boolean I;
    public final Context x;
    public final ComponentCallbacks2C1166Hs1 y;
    public final Class<TranscodeType> z;

    /* JADX INFO: renamed from: ps1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC7035uh1.values().length];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    @SuppressLint({"CheckResult"})
    public C6025ps1(@NonNull com.bumptech.glide.a aVar, ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1, Class<TranscodeType> cls, Context context) {
        C1400Ks1 c1400Ks1;
        this.y = componentCallbacks2C1166Hs1;
        this.z = cls;
        this.x = context;
        C8092zj c8092zj = componentCallbacks2C1166Hs1.d.g.f;
        L42<?, ? super TranscodeType> l42 = (L42) c8092zj.getOrDefault(cls, null);
        if (l42 == null) {
            for (Map.Entry entry : (AbstractC6155qW0.b) c8092zj.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    l42 = (L42) entry.getValue();
                }
            }
        }
        this.B = l42 == null ? C2082Tl0.k : l42;
        this.A = aVar.g;
        Iterator<InterfaceC1088Gs1<Object>> it = componentCallbacks2C1166Hs1.m.iterator();
        while (it.hasNext()) {
            I((InterfaceC1088Gs1) it.next());
        }
        synchronized (componentCallbacks2C1166Hs1) {
            c1400Ks1 = componentCallbacks2C1166Hs1.n;
        }
        a(c1400Ks1);
    }

    @NonNull
    public C6025ps1<TranscodeType> I(InterfaceC1088Gs1<TranscodeType> interfaceC1088Gs1) {
        if (this.t) {
            return clone().I(interfaceC1088Gs1);
        }
        if (interfaceC1088Gs1 != null) {
            if (this.D == null) {
                this.D = new ArrayList();
            }
            this.D.add(interfaceC1088Gs1);
        }
        x();
        return this;
    }

    @Override // defpackage.AbstractC1784Pq
    @NonNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C6025ps1<TranscodeType> a(@NonNull AbstractC1784Pq<?> abstractC1784Pq) {
        UE.d(abstractC1784Pq);
        return (C6025ps1) super.a(abstractC1784Pq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC4762js1 K(Object obj, InterfaceC5529nX1 interfaceC5529nX1, FutureC0932Es1 futureC0932Es1, InterfaceC7284vs1 interfaceC7284vs1, L42 l42, EnumC7035uh1 enumC7035uh1, int i, int i2, AbstractC1784Pq abstractC1784Pq, Executor executor) {
        InterfaceC7284vs1 interfaceC7284vs2;
        InterfaceC7284vs1 h70;
        AbstractC1784Pq abstractC1784Pq2;
        InterfaceC4762js1 dm1;
        EnumC7035uh1 enumC7035uh2;
        if (this.F != null) {
            h70 = new H70(obj, interfaceC7284vs1);
            interfaceC7284vs2 = h70;
        } else {
            interfaceC7284vs2 = null;
            h70 = interfaceC7284vs1;
        }
        C6025ps1<TranscodeType> c6025ps1 = this.E;
        if (c6025ps1 == null) {
            Object obj2 = this.C;
            ArrayList arrayList = this.D;
            C2082Tl0 c2082Tl0 = this.A;
            abstractC1784Pq2 = abstractC1784Pq;
            dm1 = new DM1(this.x, c2082Tl0, obj, obj2, this.z, abstractC1784Pq2, i, i2, enumC7035uh1, interfaceC5529nX1, futureC0932Es1, arrayList, h70, c2082Tl0.g, l42.d, executor);
        } else {
            if (this.I) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            L42 l43 = c6025ps1.G ? l42 : c6025ps1.B;
            if (AbstractC1784Pq.k(c6025ps1.d, 8)) {
                enumC7035uh2 = this.E.g;
            } else {
                int iOrdinal = enumC7035uh1.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC7035uh2 = EnumC7035uh1.d;
                } else if (iOrdinal == 2) {
                    enumC7035uh2 = EnumC7035uh1.e;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.g);
                    }
                    enumC7035uh2 = EnumC7035uh1.g;
                }
            }
            EnumC7035uh1 enumC7035uh3 = enumC7035uh2;
            C6025ps1<TranscodeType> c6025ps2 = this.E;
            int i3 = c6025ps2.k;
            int i4 = c6025ps2.j;
            if (C6177qc2.j(i, i2)) {
                C6025ps1<TranscodeType> c6025ps3 = this.E;
                if (!C6177qc2.j(c6025ps3.k, c6025ps3.j)) {
                    i3 = abstractC1784Pq.k;
                    i4 = abstractC1784Pq.j;
                }
            }
            int i5 = i4;
            int i6 = i3;
            XY1 xy1 = new XY1(obj, h70);
            Object obj3 = this.C;
            ArrayList arrayList2 = this.D;
            C2082Tl0 c2082Tl1 = this.A;
            DM1 dm2 = new DM1(this.x, c2082Tl1, obj, obj3, this.z, abstractC1784Pq, i, i2, enumC7035uh1, interfaceC5529nX1, futureC0932Es1, arrayList2, xy1, c2082Tl1.g, l42.d, executor);
            this.I = true;
            C6025ps1<TranscodeType> c6025ps4 = this.E;
            InterfaceC4762js1 interfaceC4762js1K = c6025ps4.K(obj, interfaceC5529nX1, futureC0932Es1, xy1, l43, enumC7035uh3, i6, i5, c6025ps4, executor);
            this.I = false;
            xy1.c = dm2;
            xy1.d = interfaceC4762js1K;
            abstractC1784Pq2 = abstractC1784Pq;
            dm1 = xy1;
        }
        if (interfaceC7284vs2 == null) {
            return dm1;
        }
        C6025ps1<TranscodeType> c6025ps5 = this.F;
        int i7 = c6025ps5.k;
        int i8 = c6025ps5.j;
        if (C6177qc2.j(i, i2)) {
            C6025ps1<TranscodeType> c6025ps6 = this.F;
            if (!C6177qc2.j(c6025ps6.k, c6025ps6.j)) {
                i7 = abstractC1784Pq2.k;
                i8 = abstractC1784Pq2.j;
            }
        }
        int i9 = i8;
        C6025ps1<TranscodeType> c6025ps7 = this.F;
        H70 h71 = interfaceC7284vs2;
        InterfaceC4762js1 interfaceC4762js1K2 = c6025ps7.K(obj, interfaceC5529nX1, futureC0932Es1, h71, c6025ps7.B, c6025ps7.g, i7, i9, c6025ps7, executor);
        h71.c = dm1;
        h71.d = interfaceC4762js1K2;
        return h71;
    }

    @Override // defpackage.AbstractC1784Pq
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C6025ps1<TranscodeType> clone() {
        C6025ps1<TranscodeType> c6025ps1 = (C6025ps1) super.clone();
        c6025ps1.B = c6025ps1.B.clone();
        if (c6025ps1.D != null) {
            c6025ps1.D = new ArrayList(c6025ps1.D);
        }
        C6025ps1<TranscodeType> c6025ps2 = c6025ps1.E;
        if (c6025ps2 != null) {
            c6025ps1.E = c6025ps2.clone();
        }
        C6025ps1<TranscodeType> c6025ps3 = c6025ps1.F;
        if (c6025ps3 != null) {
            c6025ps1.F = c6025ps3.clone();
        }
        return c6025ps1;
    }

    public final void M(@NonNull InterfaceC5529nX1 interfaceC5529nX1, FutureC0932Es1 futureC0932Es1, AbstractC1784Pq abstractC1784Pq, Executor executor) {
        UE.d(interfaceC5529nX1);
        if (!this.H) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC4762js1 interfaceC4762js1K = K(new Object(), interfaceC5529nX1, futureC0932Es1, null, this.B, abstractC1784Pq.g, abstractC1784Pq.k, abstractC1784Pq.j, abstractC1784Pq, executor);
        InterfaceC4762js1 interfaceC4762js1D = interfaceC5529nX1.d();
        if (interfaceC4762js1K.d(interfaceC4762js1D) && (abstractC1784Pq.i || !interfaceC4762js1D.l())) {
            UE.e(interfaceC4762js1D, "Argument must not be null");
            if (interfaceC4762js1D.isRunning()) {
                return;
            }
            interfaceC4762js1D.k();
            return;
        }
        this.y.l(interfaceC5529nX1);
        interfaceC5529nX1.e(interfaceC4762js1K);
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1 = this.y;
        synchronized (componentCallbacks2C1166Hs1) {
            componentCallbacks2C1166Hs1.j.d.add(interfaceC5529nX1);
            C2026Ss1 c2026Ss1 = componentCallbacks2C1166Hs1.h;
            c2026Ss1.a.add(interfaceC4762js1K);
            if (c2026Ss1.c) {
                interfaceC4762js1K.clear();
                Log.isLoggable("RequestTracker", 2);
                c2026Ss1.b.add(interfaceC4762js1K);
            } else {
                interfaceC4762js1K.k();
            }
        }
    }

    @NonNull
    public final void N(@NonNull ImageView imageView) {
        AbstractC1784Pq abstractC1784PqN;
        InterfaceC5529nX1 g30;
        C6177qc2.a();
        UE.d(imageView);
        if (!AbstractC1784Pq.k(this.d, 2048) && this.n && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC1784PqN = clone().n();
                    break;
                case 2:
                    abstractC1784PqN = clone().o();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC1784PqN = clone().p();
                    break;
                case 6:
                    abstractC1784PqN = clone().o();
                    break;
                default:
                    abstractC1784PqN = this;
                    break;
            }
        } else {
            abstractC1784PqN = this;
        }
        this.A.c.getClass();
        Class<TranscodeType> cls = this.z;
        if (Bitmap.class.equals(cls)) {
            g30 = new C0852Ds(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            g30 = new G30(imageView);
        }
        M(g30, null, abstractC1784PqN, C3387da0.a);
    }

    @NonNull
    public C6025ps1<TranscodeType> O(InterfaceC1088Gs1<TranscodeType> interfaceC1088Gs1) {
        if (this.t) {
            return clone().O(interfaceC1088Gs1);
        }
        this.D = null;
        return I(interfaceC1088Gs1);
    }

    @NonNull
    public C6025ps1 P(C3774fP1 c3774fP1) {
        return S(c3774fP1);
    }

    @NonNull
    public C6025ps1<TranscodeType> Q(Integer num) {
        PackageInfo packageInfo;
        C6025ps1<TranscodeType> c6025ps1S = S(num);
        Context context = this.x;
        C6025ps1<TranscodeType> c6025ps1B = c6025ps1S.B(context.getTheme());
        ConcurrentHashMap concurrentHashMap = C1760Pi.a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = C1760Pi.a;
        InterfaceC3129cK0 interfaceC3129cK0 = (InterfaceC3129cK0) concurrentHashMap2.get(packageName);
        if (interfaceC3129cK0 == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                b0.d("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            M71 m71 = new M71(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            InterfaceC3129cK0 interfaceC3129cK1 = (InterfaceC3129cK0) concurrentHashMap2.putIfAbsent(packageName, m71);
            interfaceC3129cK0 = interfaceC3129cK1 == null ? m71 : interfaceC3129cK1;
        }
        return c6025ps1B.z(new C7640xb(context.getResources().getConfiguration().uiMode & 48, interfaceC3129cK0));
    }

    @NonNull
    public C6025ps1<TranscodeType> R(String str) {
        return S(str);
    }

    @NonNull
    public final C6025ps1<TranscodeType> S(Object obj) {
        if (this.t) {
            return clone().S(obj);
        }
        this.C = obj;
        this.H = true;
        x();
        return this;
    }

    @NonNull
    public C6025ps1 T(@NonNull M30 m30) {
        if (this.t) {
            return clone().T(m30);
        }
        this.B = m30;
        this.G = false;
        x();
        return this;
    }

    @Override // defpackage.AbstractC1784Pq
    public final boolean equals(Object obj) {
        if (!(obj instanceof C6025ps1)) {
            return false;
        }
        C6025ps1 c6025ps1 = (C6025ps1) obj;
        if (super.equals(c6025ps1)) {
            return Objects.equals(this.z, c6025ps1.z) && this.B.equals(c6025ps1.B) && Objects.equals(this.C, c6025ps1.C) && Objects.equals(this.D, c6025ps1.D) && Objects.equals(this.E, c6025ps1.E) && Objects.equals(this.F, c6025ps1.F) && this.G == c6025ps1.G && this.H == c6025ps1.H;
        }
        return false;
    }

    @Override // defpackage.AbstractC1784Pq
    public final int hashCode() {
        return C6177qc2.g(this.H ? 1 : 0, C6177qc2.g(this.G ? 1 : 0, C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(C6177qc2.h(super.hashCode(), this.z), this.B), this.C), this.D), this.E), this.F), null)));
    }
}
