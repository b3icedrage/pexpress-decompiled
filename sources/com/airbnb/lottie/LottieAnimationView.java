package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.pexpress.tool.R;
import defpackage.C1911Rg0;
import defpackage.C1989Sg0;
import defpackage.C3159cU0;
import defpackage.C3346dM1;
import defpackage.C3436dm1;
import defpackage.C3788fU0;
import defpackage.C4553iw0;
import defpackage.C5279mK0;
import defpackage.C5491nL;
import defpackage.C5729oU0;
import defpackage.C6333rM;
import defpackage.C6358rU0;
import defpackage.C6389rd1;
import defpackage.C7099v01;
import defpackage.C7829yU0;
import defpackage.C7857yc2;
import defpackage.CallableC2950bU0;
import defpackage.CallableC4418iU0;
import defpackage.CallableC5519nU0;
import defpackage.DU0;
import defpackage.EnumC1319Jr1;
import defpackage.GU0;
import defpackage.HU0;
import defpackage.IU0;
import defpackage.InterfaceC4305hw0;
import defpackage.KU0;
import defpackage.LH;
import defpackage.MU0;
import defpackage.NU0;
import defpackage.VX1;
import io.sentry.instrumentation.file.f;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final C3159cU0 v = new C3159cU0();
    public final GU0<C3788fU0> h;
    public final a i;
    public GU0<Throwable> j;
    public int k;
    public final DU0 l;
    public String m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final HashSet r;
    public final HashSet s;
    public KU0<C3788fU0> t;
    public C3788fU0 u;

    public class a implements GU0<Throwable> {
        public a() {
        }

        @Override // defpackage.GU0
        public final void a(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.k;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            GU0 gu0 = lottieAnimationView.j;
            if (gu0 == null) {
                gu0 = LottieAnimationView.v;
            }
            gu0.a(th2);
        }
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public String d;
        public int e;
        public float g;
        public boolean h;
        public String i;
        public int j;
        public int k;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                b bVar = new b(parcel);
                bVar.d = parcel.readString();
                bVar.g = parcel.readFloat();
                bVar.h = parcel.readInt() == 1;
                bVar.i = parcel.readString();
                bVar.j = parcel.readInt();
                bVar.k = parcel.readInt();
                return bVar;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.d);
            parcel.writeFloat(this.g);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeString(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final c g;
        public static final c h;
        public static final c i;
        public static final c j;
        public static final /* synthetic */ c[] k;

        static {
            c cVar = new c("SET_ANIMATION", 0);
            d = cVar;
            c cVar2 = new c("SET_PROGRESS", 1);
            e = cVar2;
            c cVar3 = new c("SET_REPEAT_MODE", 2);
            g = cVar3;
            c cVar4 = new c("SET_REPEAT_COUNT", 3);
            h = cVar4;
            c cVar5 = new c("SET_IMAGE_ASSETS", 4);
            i = cVar5;
            c cVar6 = new c("PLAY_OPTION", 5);
            j = cVar6;
            k = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) k.clone();
        }
    }

    public LottieAnimationView(Context context) {
        super(context, null);
        this.h = new GU0() { // from class: eU0
            @Override // defpackage.GU0
            public final void a(Object obj) {
                this.a.setComposition((C3788fU0) obj);
            }
        };
        this.i = new a();
        this.k = 0;
        this.l = new DU0();
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = new HashSet();
        this.s = new HashSet();
        d(null);
    }

    private void setCompositionTask(KU0<C3788fU0> ku0) {
        this.r.add(c.d);
        this.u = null;
        this.l.f();
        c();
        ku0.b(this.h);
        ku0.a(this.i);
        this.t = ku0;
    }

    public final void c() {
        KU0<C3788fU0> ku0 = this.t;
        if (ku0 != null) {
            GU0<C3788fU0> gu0 = this.h;
            synchronized (ku0) {
                ku0.a.remove(gu0);
            }
            KU0<C3788fU0> ku1 = this.t;
            a aVar = this.i;
            synchronized (ku1) {
                ku1.b.remove(aVar);
            }
        }
    }

    public final void d(AttributeSet attributeSet) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3436dm1.a, R.attr.lottieAnimationViewStyle, 0);
        this.q = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(12);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(7);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(17);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(7);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(17)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(6, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.p = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        DU0 du0 = this.l;
        if (z) {
            du0.e.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(15, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(14, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(2, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(4));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(9));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(11);
        float f = typedArrayObtainStyledAttributes.getFloat(11, 0.0f);
        if (zHasValue4) {
            this.r.add(c.e);
        }
        du0.u(f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (du0.q != z2) {
            du0.q = z2;
            if (du0.d != null) {
                du0.e();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            du0.b(new C5279mK0("**"), IU0.F, new NU0(new C3346dM1(C6333rM.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(3, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            int i = typedArrayObtainStyledAttributes.getInt(13, 0);
            if (i >= EnumC1319Jr1.values().length) {
                i = 0;
            }
            setRenderMode(EnumC1319Jr1.values()[i]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(8, false));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(18, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        C7857yc2.a aVar = C7857yc2.a;
        du0.g = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public boolean getClipToCompositionBounds() {
        return this.l.s;
    }

    public C3788fU0 getComposition() {
        return this.u;
    }

    public long getDuration() {
        C3788fU0 c3788fU0 = this.u;
        if (c3788fU0 != null) {
            return (long) c3788fU0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.l.e.l;
    }

    public String getImageAssetsFolder() {
        return this.l.m;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.l.r;
    }

    public float getMaxFrame() {
        return this.l.e.e();
    }

    public float getMinFrame() {
        return this.l.e.g();
    }

    public C6389rd1 getPerformanceTracker() {
        C3788fU0 c3788fU0 = this.l.d;
        if (c3788fU0 != null) {
            return c3788fU0.a;
        }
        return null;
    }

    public float getProgress() {
        return this.l.e.d();
    }

    public EnumC1319Jr1 getRenderMode() {
        return this.l.z ? EnumC1319Jr1.g : EnumC1319Jr1.e;
    }

    public int getRepeatCount() {
        return this.l.e.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.l.e.getRepeatMode();
    }

    public float getSpeed() {
        return this.l.e.h;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof DU0) {
            boolean z = ((DU0) drawable).z;
            EnumC1319Jr1 enumC1319Jr1 = EnumC1319Jr1.g;
            if ((z ? enumC1319Jr1 : EnumC1319Jr1.e) == enumC1319Jr1) {
                this.l.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        DU0 du0 = this.l;
        if (drawable2 == du0) {
            super.invalidateDrawable(du0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.p) {
            return;
        }
        this.l.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.m = bVar.d;
        c cVar = c.d;
        HashSet hashSet = this.r;
        if (!hashSet.contains(cVar) && !TextUtils.isEmpty(this.m)) {
            setAnimation(this.m);
        }
        this.n = bVar.e;
        if (!hashSet.contains(cVar) && (i = this.n) != 0) {
            setAnimation(i);
        }
        boolean zContains = hashSet.contains(c.e);
        DU0 du0 = this.l;
        if (!zContains) {
            du0.u(bVar.g);
        }
        c cVar2 = c.j;
        if (!hashSet.contains(cVar2) && bVar.h) {
            hashSet.add(cVar2);
            du0.l();
        }
        if (!hashSet.contains(c.i)) {
            setImageAssetsFolder(bVar.i);
        }
        if (!hashSet.contains(c.g)) {
            setRepeatMode(bVar.j);
        }
        if (hashSet.contains(c.h)) {
            return;
        }
        setRepeatCount(bVar.k);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        b bVar = new b(super.onSaveInstanceState());
        bVar.d = this.m;
        bVar.e = this.n;
        DU0 du0 = this.l;
        bVar.g = du0.e.d();
        boolean zIsVisible = du0.isVisible();
        MU0 mu0 = du0.e;
        if (zIsVisible) {
            z = mu0.q;
        } else {
            DU0.c cVar = du0.j;
            z = cVar == DU0.c.e || cVar == DU0.c.g;
        }
        bVar.h = z;
        bVar.i = du0.m;
        bVar.j = mu0.getRepeatMode();
        bVar.k = mu0.getRepeatCount();
        return bVar;
    }

    public void setAnimation(final int i) {
        KU0<C3788fU0> ku0A;
        this.n = i;
        this.m = null;
        if (isInEditMode()) {
            ku0A = new KU0<>(new Callable() { // from class: dU0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.d;
                    boolean z = lottieAnimationView.q;
                    int i2 = i;
                    if (!z) {
                        return C5729oU0.e(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return C5729oU0.e(context, i2, C5729oU0.i(context, i2));
                }
            }, true);
        } else if (this.q) {
            Context context = getContext();
            String strI = C5729oU0.i(context, i);
            ku0A = C5729oU0.a(strI, new CallableC5519nU0(new WeakReference(context), context.getApplicationContext(), i, strI));
        } else {
            Context context2 = getContext();
            HashMap map = C5729oU0.a;
            ku0A = C5729oU0.a(null, new CallableC5519nU0(new WeakReference(context2), context2.getApplicationContext(), i, null));
        }
        setCompositionTask(ku0A);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(C5729oU0.a(null, new CallableC4418iU0(new ByteArrayInputStream(str.getBytes()), 0)));
    }

    public void setAnimationFromUrl(final String str) {
        KU0<C3788fU0> ku0A;
        if (this.q) {
            final Context context = getContext();
            HashMap map = C5729oU0.a;
            final String strC = C5491nL.c("url_", str);
            ku0A = C5729oU0.a(strC, new Callable() { // from class: hU0
                /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C3788fU0 c3788fU0;
                    JU0 ju0;
                    JU0 ju1;
                    Object obj;
                    Pair pair;
                    C5009l31 c5009l31;
                    Context context2 = context;
                    String str2 = str;
                    String str3 = strC;
                    C5642o31 c5642o31 = C0564Aa.c;
                    if (c5642o31 == null) {
                        synchronized (C5642o31.class) {
                            try {
                                c5642o31 = C0564Aa.c;
                                if (c5642o31 == null) {
                                    Context applicationContext = context2.getApplicationContext();
                                    C5009l31 c5009l32 = C0564Aa.d;
                                    if (c5009l32 == null) {
                                        synchronized (C5009l31.class) {
                                            try {
                                                c5009l31 = C0564Aa.d;
                                                if (c5009l31 == null) {
                                                    c5009l31 = new C5009l31(new C7175vM1(applicationContext));
                                                    C0564Aa.d = c5009l31;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        c5009l32 = c5009l31;
                                    }
                                    c5642o31 = new C5642o31(c5009l32, new C5189lv());
                                    C0564Aa.c = c5642o31;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    EnumC1665Oc0 enumC1665Oc0 = EnumC1665Oc0.ZIP;
                    boolean z = false;
                    AutoCloseable autoCloseable = null;
                    if (str3 != null) {
                        C5009l31 c5009l33 = (C5009l31) c5642o31.d;
                        try {
                            File fileB = c5009l33.b();
                            EnumC1665Oc0 enumC1665Oc1 = EnumC1665Oc0.JSON;
                            File file = new File(fileB, C5009l31.a(str2, enumC1665Oc1, false));
                            if (!file.exists()) {
                                file = new File(c5009l33.b(), C5009l31.a(str2, enumC1665Oc0, false));
                                if (!file.exists()) {
                                    file = null;
                                }
                            }
                            if (file == null) {
                                pair = null;
                            } else {
                                FileInputStream fileInputStreamA = f.a.a(file, new FileInputStream(file));
                                if (file.getAbsolutePath().endsWith(".zip")) {
                                    enumC1665Oc1 = enumC1665Oc0;
                                }
                                file.getAbsolutePath();
                                CS0.a();
                                pair = new Pair(enumC1665Oc1, fileInputStreamA);
                            }
                        } catch (FileNotFoundException unused) {
                        }
                        if (pair == null) {
                            c3788fU0 = null;
                        } else {
                            EnumC1665Oc0 enumC1665Oc2 = (EnumC1665Oc0) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            C3788fU0 c3788fU1 = (enumC1665Oc2 == enumC1665Oc0 ? C5729oU0.f(context2, new ZipInputStream(inputStream), str3) : C5729oU0.c(inputStream, str3)).a;
                            if (c3788fU1 != null) {
                                c3788fU0 = c3788fU1;
                            } else {
                                c3788fU0 = null;
                            }
                        }
                    } else {
                        c3788fU0 = null;
                    }
                    if (c3788fU0 != null) {
                        ju1 = new JU0(c3788fU0);
                    } else {
                        CS0.a();
                        CS0.a();
                        try {
                            try {
                                C7621xV c7621xVG = C5189lv.g(str2);
                                HttpURLConnection httpURLConnection = c7621xVG.d;
                                try {
                                    if (httpURLConnection.getResponseCode() / 100 == 2) {
                                        z = true;
                                    }
                                } catch (IOException unused2) {
                                }
                                if (z) {
                                    ju0 = c5642o31.H0(context2, str2, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str3);
                                    Object obj2 = ju0.a;
                                    CS0.a();
                                    try {
                                        c7621xVG.close();
                                    } catch (IOException e) {
                                        e = e;
                                        CS0.c("LottieFetchResult close failed ", e);
                                    }
                                } else {
                                    ju0 = new JU0((Throwable) new IllegalArgumentException(c7621xVG.c()));
                                    try {
                                        c7621xVG.close();
                                    } catch (IOException e2) {
                                        e = e2;
                                        CS0.c("LottieFetchResult close failed ", e);
                                    }
                                }
                            } catch (Throwable th3) {
                                if (0 == 0) {
                                    throw th3;
                                }
                                try {
                                    autoCloseable.close();
                                    throw th3;
                                } catch (IOException e3) {
                                    CS0.c("LottieFetchResult close failed ", e3);
                                    throw th3;
                                }
                            }
                        } catch (Exception e4) {
                            ju0 = new JU0((Throwable) e4);
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException e5) {
                                    e = e5;
                                    CS0.c("LottieFetchResult close failed ", e);
                                }
                            }
                        }
                        ju1 = ju0;
                    }
                    if (str3 != null && (obj = ju1.a) != null) {
                        C3998gU0.b.a.put(str3, (C3788fU0) obj);
                    }
                    return ju1;
                }
            });
        } else {
            final Context context2 = getContext();
            final String str2 = null;
            ku0A = C5729oU0.a(null, new Callable() { // from class: hU0
                /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C3788fU0 c3788fU0;
                    JU0 ju0;
                    JU0 ju1;
                    Object obj;
                    Pair pair;
                    C5009l31 c5009l31;
                    Context context3 = context2;
                    String str3 = str;
                    String str4 = str2;
                    C5642o31 c5642o31 = C0564Aa.c;
                    if (c5642o31 == null) {
                        synchronized (C5642o31.class) {
                            try {
                                c5642o31 = C0564Aa.c;
                                if (c5642o31 == null) {
                                    Context applicationContext = context3.getApplicationContext();
                                    C5009l31 c5009l32 = C0564Aa.d;
                                    if (c5009l32 == null) {
                                        synchronized (C5009l31.class) {
                                            try {
                                                c5009l31 = C0564Aa.d;
                                                if (c5009l31 == null) {
                                                    c5009l31 = new C5009l31(new C7175vM1(applicationContext));
                                                    C0564Aa.d = c5009l31;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        c5009l32 = c5009l31;
                                    }
                                    c5642o31 = new C5642o31(c5009l32, new C5189lv());
                                    C0564Aa.c = c5642o31;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    EnumC1665Oc0 enumC1665Oc0 = EnumC1665Oc0.ZIP;
                    boolean z = false;
                    AutoCloseable autoCloseable = null;
                    if (str4 != null) {
                        C5009l31 c5009l33 = (C5009l31) c5642o31.d;
                        try {
                            File fileB = c5009l33.b();
                            EnumC1665Oc0 enumC1665Oc1 = EnumC1665Oc0.JSON;
                            File file = new File(fileB, C5009l31.a(str3, enumC1665Oc1, false));
                            if (!file.exists()) {
                                file = new File(c5009l33.b(), C5009l31.a(str3, enumC1665Oc0, false));
                                if (!file.exists()) {
                                    file = null;
                                }
                            }
                            if (file == null) {
                                pair = null;
                            } else {
                                FileInputStream fileInputStreamA = f.a.a(file, new FileInputStream(file));
                                if (file.getAbsolutePath().endsWith(".zip")) {
                                    enumC1665Oc1 = enumC1665Oc0;
                                }
                                file.getAbsolutePath();
                                CS0.a();
                                pair = new Pair(enumC1665Oc1, fileInputStreamA);
                            }
                        } catch (FileNotFoundException unused) {
                        }
                        if (pair == null) {
                            c3788fU0 = null;
                        } else {
                            EnumC1665Oc0 enumC1665Oc2 = (EnumC1665Oc0) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            C3788fU0 c3788fU1 = (enumC1665Oc2 == enumC1665Oc0 ? C5729oU0.f(context3, new ZipInputStream(inputStream), str4) : C5729oU0.c(inputStream, str4)).a;
                            if (c3788fU1 != null) {
                                c3788fU0 = c3788fU1;
                            } else {
                                c3788fU0 = null;
                            }
                        }
                    } else {
                        c3788fU0 = null;
                    }
                    if (c3788fU0 != null) {
                        ju1 = new JU0(c3788fU0);
                    } else {
                        CS0.a();
                        CS0.a();
                        try {
                            try {
                                C7621xV c7621xVG = C5189lv.g(str3);
                                HttpURLConnection httpURLConnection = c7621xVG.d;
                                try {
                                    if (httpURLConnection.getResponseCode() / 100 == 2) {
                                        z = true;
                                    }
                                } catch (IOException unused2) {
                                }
                                if (z) {
                                    ju0 = c5642o31.H0(context3, str3, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str4);
                                    Object obj2 = ju0.a;
                                    CS0.a();
                                    try {
                                        c7621xVG.close();
                                    } catch (IOException e) {
                                        e = e;
                                        CS0.c("LottieFetchResult close failed ", e);
                                    }
                                } else {
                                    ju0 = new JU0((Throwable) new IllegalArgumentException(c7621xVG.c()));
                                    try {
                                        c7621xVG.close();
                                    } catch (IOException e2) {
                                        e = e2;
                                        CS0.c("LottieFetchResult close failed ", e);
                                    }
                                }
                            } catch (Throwable th3) {
                                if (0 == 0) {
                                    throw th3;
                                }
                                try {
                                    autoCloseable.close();
                                    throw th3;
                                } catch (IOException e3) {
                                    CS0.c("LottieFetchResult close failed ", e3);
                                    throw th3;
                                }
                            }
                        } catch (Exception e4) {
                            ju0 = new JU0((Throwable) e4);
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException e5) {
                                    e = e5;
                                    CS0.c("LottieFetchResult close failed ", e);
                                }
                            }
                        }
                        ju1 = ju0;
                    }
                    if (str4 != null && (obj = ju1.a) != null) {
                        C3998gU0.b.a.put(str4, (C3788fU0) obj);
                    }
                    return ju1;
                }
            });
        }
        setCompositionTask(ku0A);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.l.x = z;
    }

    public void setCacheComposition(boolean z) {
        this.q = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        DU0 du0 = this.l;
        if (z != du0.s) {
            du0.s = z;
            LH lh = du0.t;
            if (lh != null) {
                lh.H = z;
            }
            du0.invalidateSelf();
        }
    }

    public void setComposition(@NonNull C3788fU0 c3788fU0) {
        DU0 du0 = this.l;
        du0.setCallback(this);
        this.u = c3788fU0;
        boolean z = true;
        this.o = true;
        C3788fU0 c3788fU1 = du0.d;
        MU0 mu0 = du0.e;
        if (c3788fU1 == c3788fU0) {
            z = false;
        } else {
            du0.M = true;
            du0.f();
            du0.d = c3788fU0;
            du0.e();
            boolean z2 = mu0.p == null;
            mu0.p = c3788fU0;
            if (z2) {
                mu0.k(Math.max(mu0.n, c3788fU0.k), Math.min(mu0.o, c3788fU0.l));
            } else {
                mu0.k((int) c3788fU0.k, (int) c3788fU0.l);
            }
            float f = mu0.l;
            mu0.l = 0.0f;
            mu0.k = 0.0f;
            mu0.j((int) f);
            mu0.b();
            du0.u(mu0.getAnimatedFraction());
            ArrayList<DU0.b> arrayList = du0.k;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                DU0.b bVar = (DU0.b) it.next();
                if (bVar != null) {
                    bVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            c3788fU0.a.a = du0.v;
            du0.g();
            Drawable.Callback callback = du0.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(du0);
            }
        }
        this.o = false;
        if (getDrawable() != du0 || z) {
            if (!z) {
                boolean z3 = mu0 != null ? mu0.q : false;
                setImageDrawable(null);
                setImageDrawable(du0);
                if (z3) {
                    du0.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.s.iterator();
            while (it2.hasNext()) {
                ((HU0) it2.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        DU0 du0 = this.l;
        du0.p = str;
        C1989Sg0 c1989Sg0J = du0.j();
        if (c1989Sg0J != null) {
            c1989Sg0J.e = str;
        }
    }

    public void setFailureListener(GU0<Throwable> gu0) {
        this.j = gu0;
    }

    public void setFallbackResource(int i) {
        this.k = i;
    }

    public void setFontAssetDelegate(C1911Rg0 c1911Rg0) {
        C1989Sg0 c1989Sg0 = this.l.n;
    }

    public void setFontMap(Map<String, Typeface> map) {
        DU0 du0 = this.l;
        if (map == du0.o) {
            return;
        }
        du0.o = map;
        du0.invalidateSelf();
    }

    public void setFrame(int i) {
        this.l.o(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.l.h = z;
    }

    public void setImageAssetDelegate(InterfaceC4305hw0 interfaceC4305hw0) {
        C4553iw0 c4553iw0 = this.l.l;
    }

    public void setImageAssetsFolder(String str) {
        this.l.m = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.l.r = z;
    }

    public void setMaxFrame(int i) {
        this.l.p(i);
    }

    public void setMaxProgress(float f) {
        DU0 du0 = this.l;
        C3788fU0 c3788fU0 = du0.d;
        if (c3788fU0 == null) {
            du0.k.add(new C6358rU0(du0, f));
            return;
        }
        float fD = C7099v01.d(c3788fU0.k, c3788fU0.l, f);
        MU0 mu0 = du0.e;
        mu0.k(mu0.n, fD);
    }

    public void setMinAndMaxFrame(String str) {
        this.l.r(str);
    }

    public void setMinFrame(int i) {
        this.l.s(i);
    }

    public void setMinProgress(float f) {
        DU0 du0 = this.l;
        C3788fU0 c3788fU0 = du0.d;
        if (c3788fU0 == null) {
            du0.k.add(new C7829yU0(du0, f));
        } else {
            du0.s((int) C7099v01.d(c3788fU0.k, c3788fU0.l, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        DU0 du0 = this.l;
        if (du0.w == z) {
            return;
        }
        du0.w = z;
        LH lh = du0.t;
        if (lh != null) {
            lh.s(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        DU0 du0 = this.l;
        du0.v = z;
        C3788fU0 c3788fU0 = du0.d;
        if (c3788fU0 != null) {
            c3788fU0.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.r.add(c.e);
        this.l.u(f);
    }

    public void setRenderMode(EnumC1319Jr1 enumC1319Jr1) {
        DU0 du0 = this.l;
        du0.y = enumC1319Jr1;
        du0.g();
    }

    public void setRepeatCount(int i) {
        this.r.add(c.h);
        this.l.e.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.r.add(c.g);
        this.l.e.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.l.i = z;
    }

    public void setSpeed(float f) {
        this.l.e.h = f;
    }

    public void setTextDelegate(VX1 vx1) {
        this.l.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.l.e.r = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        DU0 du0;
        MU0 mu0;
        DU0 du1;
        boolean z = this.o;
        if (!z && drawable == (du1 = this.l)) {
            MU0 mu1 = du1.e;
            if (mu1 == null ? false : mu1.q) {
                this.p = false;
                du1.k();
            } else if (!z) {
                du0 = (DU0) drawable;
                mu0 = du0.e;
                if (mu0 != null ? mu0.q : false) {
                    du0.k();
                }
            }
        } else if (!z && (drawable instanceof DU0)) {
            du0 = (DU0) drawable;
            mu0 = du0.e;
            if (mu0 != null ? mu0.q : false) {
                du0.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.l.q(str);
    }

    public void setMinFrame(String str) {
        this.l.t(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new GU0() { // from class: eU0
            @Override // defpackage.GU0
            public final void a(Object obj) {
                this.a.setComposition((C3788fU0) obj);
            }
        };
        this.i = new a();
        this.k = 0;
        this.l = new DU0();
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = new HashSet();
        this.s = new HashSet();
        d(attributeSet);
    }

    public void setAnimation(final String str) {
        KU0<C3788fU0> ku0A;
        this.m = str;
        int i = 0;
        this.n = 0;
        if (isInEditMode()) {
            ku0A = new KU0<>(new CallableC2950bU0(i, this, str), true);
        } else if (this.q) {
            Context context = getContext();
            HashMap map = C5729oU0.a;
            final String strC = C5491nL.c("asset_", str);
            final Context applicationContext = context.getApplicationContext();
            ku0A = C5729oU0.a(strC, new Callable() { // from class: jU0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C5729oU0.b(applicationContext, str, strC);
                }
            });
        } else {
            Context context2 = getContext();
            HashMap map2 = C5729oU0.a;
            final Context applicationContext2 = context2.getApplicationContext();
            final String str2 = null;
            ku0A = C5729oU0.a(null, new Callable() { // from class: jU0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C5729oU0.b(applicationContext2, str, str2);
                }
            });
        }
        setCompositionTask(ku0A);
    }
}
