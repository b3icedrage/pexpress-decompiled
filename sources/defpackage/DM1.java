package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class DM1<R> implements InterfaceC4762js1, NM1 {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public final RP1.a a;
    public final Object b;
    public final FutureC0932Es1 c;
    public final Object d;
    public final Context e;
    public final C2082Tl0 f;
    public final Object g;
    public final Class<R> h;
    public final AbstractC1784Pq<?> i;
    public final int j;
    public final int k;
    public final EnumC7035uh1 l;
    public final InterfaceC5529nX1<R> m;
    public final ArrayList n;
    public final I42<? super R> o;
    public final Executor p;
    public InterfaceC3667et1<R> q;
    public Q60.d r;
    public volatile Q60 s;
    public a t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final /* synthetic */ a[] k;

        static {
            a aVar = new a("PENDING", 0);
            d = aVar;
            a aVar2 = new a("RUNNING", 1);
            e = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            g = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            h = aVar4;
            a aVar5 = new a("FAILED", 4);
            i = aVar5;
            a aVar6 = new a("CLEARED", 5);
            j = aVar6;
            k = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) k.clone();
        }
    }

    public DM1(Context context, C2082Tl0 c2082Tl0, @NonNull Object obj, Object obj2, Class cls, AbstractC1784Pq abstractC1784Pq, int i, int i2, EnumC7035uh1 enumC7035uh1, InterfaceC5529nX1 interfaceC5529nX1, FutureC0932Es1 futureC0932Es1, ArrayList arrayList, InterfaceC7284vs1 interfaceC7284vs1, Q60 q60, I42 i42, Executor executor) {
        if (B) {
            String.valueOf(hashCode());
        }
        this.a = new RP1.a();
        this.b = obj;
        this.e = context;
        this.f = c2082Tl0;
        this.g = obj2;
        this.h = cls;
        this.i = abstractC1784Pq;
        this.j = i;
        this.k = i2;
        this.l = enumC7035uh1;
        this.m = interfaceC5529nX1;
        this.c = futureC0932Es1;
        this.n = arrayList;
        this.d = interfaceC7284vs1;
        this.s = q60;
        this.o = i42;
        this.p = executor;
        this.t = a.d;
        if (this.A == null && c2082Tl0.h.a.containsKey(C1926Rl0.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.NM1
    public final void a(int i, int i2) throws Throwable {
        Object obj;
        DM1<R> dm1 = this;
        int iRound = i;
        dm1.a.a();
        Object obj2 = dm1.b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = B;
                    if (z) {
                        int i3 = C6562sS0.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (dm1.t == a.g) {
                        a aVar = a.e;
                        dm1.t = aVar;
                        dm1.i.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        dm1.x = iRound;
                        dm1.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            int i4 = C6562sS0.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        Q60 q60 = dm1.s;
                        try {
                            C2082Tl0 c2082Tl0 = dm1.f;
                            Object obj3 = dm1.g;
                            AbstractC1784Pq<?> abstractC1784Pq = dm1.i;
                            try {
                                InterfaceC3129cK0 interfaceC3129cK0 = abstractC1784Pq.l;
                                int i5 = dm1.x;
                                try {
                                    int i6 = dm1.y;
                                    Class<?> cls = abstractC1784Pq.q;
                                    try {
                                        Class<R> cls2 = dm1.h;
                                        EnumC7035uh1 enumC7035uh1 = dm1.l;
                                        try {
                                            AbstractC2634a20 abstractC2634a20 = abstractC1784Pq.e;
                                            C6667sx c6667sx = abstractC1784Pq.p;
                                            try {
                                                boolean z2 = abstractC1784Pq.m;
                                                boolean z3 = abstractC1784Pq.v;
                                                try {
                                                    C4227ha1 c4227ha1 = abstractC1784Pq.o;
                                                    boolean z4 = abstractC1784Pq.i;
                                                    boolean z5 = abstractC1784Pq.w;
                                                    boolean z6 = abstractC1784Pq.u;
                                                    Executor executor = dm1.p;
                                                    Object obj4 = obj2;
                                                    try {
                                                        dm1.r = q60.a(c2082Tl0, obj3, interfaceC3129cK0, i5, i6, cls, cls2, enumC7035uh1, abstractC2634a20, c6667sx, z2, z3, c4227ha1, z4, z5, z6, dm1, executor);
                                                        if (dm1.t != aVar) {
                                                            dm1.r = null;
                                                        }
                                                        if (z) {
                                                            int i7 = C6562sS0.a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        obj = obj4;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    obj = obj2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj = obj2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj = obj2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj = obj2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj = obj2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj = dm1;
                }
            } catch (Throwable th10) {
                th = th10;
                obj = obj2;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final void b() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.t == a.h;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC4762js1
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                a aVar = this.t;
                a aVar2 = a.j;
                if (aVar == aVar2) {
                    return;
                }
                e();
                InterfaceC3667et1<R> interfaceC3667et1 = this.q;
                if (interfaceC3667et1 != null) {
                    this.q = null;
                } else {
                    interfaceC3667et1 = null;
                }
                ?? r3 = this.d;
                if (r3 == 0 || r3.g(this)) {
                    this.m.k(f());
                }
                this.t = aVar2;
                if (interfaceC3667et1 != null) {
                    this.s.getClass();
                    Q60.e(interfaceC3667et1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean d(InterfaceC4762js1 interfaceC4762js1) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC1784Pq<?> abstractC1784Pq;
        EnumC7035uh1 enumC7035uh1;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        AbstractC1784Pq<?> abstractC1784Pq2;
        EnumC7035uh1 enumC7035uh2;
        int size2;
        boolean zA;
        if (!(interfaceC4762js1 instanceof DM1)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                abstractC1784Pq = this.i;
                enumC7035uh1 = this.l;
                ArrayList arrayList = this.n;
                size = arrayList != null ? arrayList.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        DM1 dm1 = (DM1) interfaceC4762js1;
        synchronized (dm1.b) {
            try {
                i3 = dm1.j;
                i4 = dm1.k;
                obj2 = dm1.g;
                cls2 = dm1.h;
                abstractC1784Pq2 = dm1.i;
                enumC7035uh2 = dm1.l;
                ArrayList arrayList2 = dm1.n;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        char[] cArr = C6177qc2.a;
        if (obj == null) {
            zA = obj2 == null;
        } else {
            zA = obj instanceof E01 ? ((E01) obj).a() : obj.equals(obj2);
        }
        return zA && cls.equals(cls2) && abstractC1784Pq.equals(abstractC1784Pq2) && enumC7035uh1 == enumC7035uh2 && size == size2;
    }

    public final void e() {
        if (this.z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.m.a(this);
        Q60.d dVar = this.r;
        if (dVar != null) {
            synchronized (Q60.this) {
                dVar.a.h(dVar.b);
            }
            this.r = null;
        }
    }

    public final Drawable f() {
        if (this.v == null) {
            AbstractC1784Pq<?> abstractC1784Pq = this.i;
            abstractC1784Pq.getClass();
            this.v = null;
            int i = abstractC1784Pq.h;
            if (i > 0) {
                Resources.Theme theme = abstractC1784Pq.s;
                Context context = this.e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.v = D30.a(context, context, i, theme);
            }
        }
        return this.v;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vs1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, vs1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, vs1] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, vs1] */
    public final void g(C2160Ul0 c2160Ul0, int i) {
        boolean zG;
        Drawable drawableF;
        this.a.a();
        synchronized (this.b) {
            try {
                c2160Ul0.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    b0.f("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", c2160Ul0);
                    if (i2 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C2160Ul0.a(c2160Ul0, arrayList);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            i3 = i4;
                        }
                    }
                }
                this.r = null;
                this.t = a.i;
                ?? r0 = this.d;
                if (r0 != 0) {
                    r0.e(this);
                }
                boolean z = true;
                this.z = true;
                try {
                    ArrayList<InterfaceC1088Gs1> arrayList2 = this.n;
                    if (arrayList2 != null) {
                        zG = false;
                        for (InterfaceC1088Gs1 interfaceC1088Gs1 : arrayList2) {
                            InterfaceC5529nX1<R> interfaceC5529nX1 = this.m;
                            ?? r7 = this.d;
                            if (r7 != 0) {
                                r7.a().c();
                            }
                            zG |= interfaceC1088Gs1.g(c2160Ul0, interfaceC5529nX1);
                        }
                    } else {
                        zG = false;
                    }
                    FutureC0932Es1 futureC0932Es1 = this.c;
                    if (futureC0932Es1 != null) {
                        InterfaceC5529nX1<R> interfaceC5529nX2 = this.m;
                        ?? r6 = this.d;
                        if (r6 != 0) {
                            r6.a().c();
                        }
                        futureC0932Es1.g(c2160Ul0, interfaceC5529nX2);
                    }
                    if (!zG) {
                        ?? r9 = this.d;
                        if (r9 != 0 && !r9.h(this)) {
                            z = false;
                        }
                        if (z) {
                            if (this.g == null) {
                                if (this.w == null) {
                                    this.i.getClass();
                                    this.w = null;
                                }
                                drawableF = this.w;
                            } else {
                                drawableF = null;
                            }
                            if (drawableF == null) {
                                if (this.u == null) {
                                    this.i.getClass();
                                    this.u = null;
                                }
                                drawableF = this.u;
                            }
                            if (drawableF == null) {
                                drawableF = f();
                            }
                            this.m.h(drawableF);
                        }
                    }
                    this.z = false;
                } catch (Throwable th) {
                    this.z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, vs1] */
    public final void h(InterfaceC3667et1<?> interfaceC3667et1, CS cs, boolean z) {
        this.a.a();
        InterfaceC3667et1<?> interfaceC3667et2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.r = null;
                    if (interfaceC3667et1 == null) {
                        g(new C2160Ul0("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC3667et1.get();
                    try {
                        if (obj == null || !this.h.isAssignableFrom(obj.getClass())) {
                            this.q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC3667et1);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            g(new C2160Ul0(sb.toString()), 5);
                        } else {
                            ?? r9 = this.d;
                            if (r9 == 0 || r9.i(this)) {
                                i(interfaceC3667et1, obj, cs);
                                return;
                            } else {
                                this.q = null;
                                this.t = a.h;
                            }
                        }
                        this.s.getClass();
                        Q60.e(interfaceC3667et1);
                    } catch (Throwable th) {
                        interfaceC3667et2 = interfaceC3667et1;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC3667et2 != null) {
                this.s.getClass();
                Q60.e(interfaceC3667et2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vs1] */
    public final void i(InterfaceC3667et1 interfaceC3667et1, Object obj, CS cs) {
        boolean zC;
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.a().c();
        }
        this.t = a.h;
        this.q = interfaceC3667et1;
        if (this.f.i <= 3) {
            Objects.toString(cs);
            Objects.toString(this.g);
            int i = C6562sS0.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (r0 != 0) {
            r0.f(this);
        }
        this.z = true;
        try {
            ArrayList arrayList = this.n;
            InterfaceC5529nX1<R> interfaceC5529nX1 = this.m;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                zC = false;
                while (it.hasNext()) {
                    zC |= ((InterfaceC1088Gs1) it.next()).c(obj, interfaceC5529nX1);
                }
            } else {
                zC = false;
            }
            FutureC0932Es1 futureC0932Es1 = this.c;
            if (futureC0932Es1 != null) {
                futureC0932Es1.c(obj, interfaceC5529nX1);
            }
            if (!zC) {
                interfaceC5529nX1.j(obj, this.o.a(cs));
            }
        } finally {
            this.z = false;
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            try {
                a aVar = this.t;
                z = aVar == a.e || aVar == a.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.t == a.j;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, vs1] */
    @Override // defpackage.InterfaceC4762js1
    public final void k() {
        synchronized (this.b) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = C6562sS0.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (C6177qc2.j(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        this.i.getClass();
                        this.w = null;
                    }
                    g(new C2160Ul0("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                a aVar = this.t;
                if (aVar == a.e) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.h) {
                    h(this.q, CS.i, false);
                    return;
                }
                ArrayList<InterfaceC1088Gs1> arrayList = this.n;
                if (arrayList != null) {
                    for (InterfaceC1088Gs1 interfaceC1088Gs1 : arrayList) {
                        if (interfaceC1088Gs1 instanceof AbstractC8057za0) {
                            ((AbstractC8057za0) interfaceC1088Gs1).getClass();
                        }
                    }
                }
                a aVar2 = a.g;
                this.t = aVar2;
                if (C6177qc2.j(this.j, this.k)) {
                    a(this.j, this.k);
                } else {
                    this.m.b(this);
                }
                a aVar3 = this.t;
                if (aVar3 == a.e || aVar3 == aVar2) {
                    ?? r1 = this.d;
                    if (r1 == 0 || r1.h(this)) {
                        this.m.i(f());
                    }
                }
                if (B) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4762js1
    public final boolean l() {
        boolean z;
        synchronized (this.b) {
            z = this.t == a.h;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
