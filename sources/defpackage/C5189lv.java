package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5189lv implements Z10 {

    @NotNull
    public static final byte[] a = new byte[0];

    public static final Bitmap c(VU1 vu1) {
        Drawable drawable = vu1.a;
        if (!(drawable instanceof BitmapDrawable)) {
            drawable = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    @NotNull
    public static final C7624xW d(@NotNull KN kn, @NotNull CoroutineContext coroutineContext, @NotNull ON on, @NotNull Function2 function2) {
        CoroutineContext coroutineContextB = AN.b(kn, coroutineContext);
        on.getClass();
        C7624xW c4658jO0 = on == ON.e ? new C4658jO0(coroutineContextB, function2) : new C7624xW(coroutineContextB, true, true);
        c4658jO0.s0(on, c4658jO0, function2);
        return c4658jO0;
    }

    public static /* synthetic */ C7624xW e(KN kn, CoroutineContext coroutineContext, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = e.d;
        }
        return d(kn, coroutineContext, ON.d, function2);
    }

    public static final void f(@NotNull AbstractC7769yA0 abstractC7769yA0, @NotNull C2895bC current) {
        Intrinsics.checkNotNullParameter(abstractC7769yA0, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == abstractC7769yA0) {
            return;
        }
        int i = current.c;
        int i2 = current.b;
        if (i <= i2) {
            abstractC7769yA0.g(current);
            return;
        }
        if (current.f - current.e >= 8) {
            abstractC7769yA0.h = i2;
            return;
        }
        abstractC7769yA0.getClass();
        Intrinsics.checkNotNullParameter(current, "current");
        C2895bC c2895bCG = current.g();
        if (c2895bCG == null) {
            abstractC7769yA0.p(current);
            return;
        }
        int i3 = current.c - current.b;
        int i4 = current.e;
        int i5 = current.f;
        int iMin = Math.min(i3, 8 - (i5 - i4));
        if (c2895bCG.d < iMin) {
            abstractC7769yA0.p(current);
            return;
        }
        Intrinsics.checkNotNullParameter(c2895bCG, "<this>");
        c2895bCG.d(c2895bCG.b - iMin);
        if (i3 > iMin) {
            current.e = i5;
            abstractC7769yA0.i = current.c;
            abstractC7769yA0.D(abstractC7769yA0.j + ((long) iMin));
        } else {
            abstractC7769yA0.G(c2895bCG);
            abstractC7769yA0.D(abstractC7769yA0.j - ((long) ((c2895bCG.c - c2895bCG.b) - iMin)));
            current.f();
            current.i(abstractC7769yA0.d);
        }
    }

    @NonNull
    public static C7621xV g(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C7621xV(httpURLConnection);
    }

    public static Class h(Type type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static boolean i(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (i(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return i(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    @NotNull
    public static final C2936bP1 j(@NotNull KN kn, @NotNull CoroutineContext coroutineContext, @NotNull ON on, @NotNull Function2 function2) {
        CoroutineContext coroutineContextB = AN.b(kn, coroutineContext);
        on.getClass();
        C2936bP1 c2935bP0 = on == ON.e ? new C2935bP0(coroutineContextB, function2) : new C2936bP1(coroutineContextB, true, true);
        c2935bP0.s0(on, c2935bP0, function2);
        return c2935bP0;
    }

    public static /* synthetic */ C2936bP1 k(KN kn, CoroutineContext coroutineContext, Function2 function2, int i) {
        ON on = ON.h;
        if ((i & 1) != 0) {
            coroutineContext = e.d;
        }
        if ((i & 2) != 0) {
            on = ON.d;
        }
        return j(kn, coroutineContext, on, function2);
    }

    @Nullable
    public static final C2895bC l(@NotNull AbstractC7769yA0 abstractC7769yA0, int i) {
        Intrinsics.checkNotNullParameter(abstractC7769yA0, "<this>");
        return abstractC7769yA0.A(i, abstractC7769yA0.t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final C2895bC m(@NotNull AbstractC7769yA0 abstractC7769yA0, @NotNull C2895bC current) {
        Intrinsics.checkNotNullParameter(abstractC7769yA0, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current != abstractC7769yA0) {
            abstractC7769yA0.getClass();
            Intrinsics.checkNotNullParameter(current, "current");
            return abstractC7769yA0.g(current);
        }
        if (abstractC7769yA0.h == abstractC7769yA0.i && abstractC7769yA0.j == 0) {
            return null;
        }
        return (C2895bC) abstractC7769yA0;
    }

    @NotNull
    public static final C2895bC n(@NotNull C0864Dw c0864Dw, int i, @Nullable C2895bC c2895bC) {
        Intrinsics.checkNotNullParameter(c0864Dw, "<this>");
        if (c2895bC != null) {
            c0864Dw.c();
        }
        return c0864Dw.u(i);
    }

    public static Object o(Function2 function2) throws Throwable {
        e eVar = e.d;
        Thread threadCurrentThread = Thread.currentThread();
        d.a aVar = d.f;
        eVar.p(aVar);
        A80 context = EY1.a();
        Intrinsics.checkNotNullParameter(context, "context");
        CoroutineContext coroutineContextA = AN.a(eVar, context, true);
        RV rv = C6266r20.a;
        if (coroutineContextA != rv && coroutineContextA.p(aVar) == null) {
            coroutineContextA = coroutineContextA.t(rv);
        }
        C3875ft c3875ft = new C3875ft(coroutineContextA, threadCurrentThread, context);
        c3875ft.s0(ON.d, c3875ft, function2);
        A80 a80 = c3875ft.i;
        if (a80 != null) {
            int i = A80.j;
            a80.u1(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jV1 = a80 != null ? a80.v1() : Long.MAX_VALUE;
                if (c3875ft.S0()) {
                    if (a80 != null) {
                        int i2 = A80.j;
                        a80.s1(false);
                    }
                    Object objO = C3787fU.o(c3875ft.S());
                    OG og = objO instanceof OG ? (OG) objO : null;
                    if (og == null) {
                        return objO;
                    }
                    throw og.a;
                }
                LockSupport.parkNanos(c3875ft, jV1);
            } catch (Throwable th) {
                if (a80 != null) {
                    int i3 = A80.j;
                    a80.s1(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c3875ft.B(interruptedException);
        throw interruptedException;
    }

    @Nullable
    public static final Object p(@NotNull CoroutineContext coroutineContext, @NotNull Function2 function2, @NotNull JM frame) throws Throwable {
        Object objO;
        CoroutineContext context = frame.getContext();
        CoroutineContext coroutineContextT = !((Boolean) coroutineContext.R0(Boolean.FALSE, BN.d)).booleanValue() ? context.t(coroutineContext) : AN.a(context, coroutineContext, false);
        ED.h(coroutineContextT);
        if (coroutineContextT == context) {
            ND1 nd1 = new ND1(frame, coroutineContextT);
            objO = C3057c.r(nd1, nd1, function2);
        } else {
            d.a aVar = d.f;
            if (Intrinsics.a(coroutineContextT.p(aVar), context.p(aVar))) {
                C7973z82 c7973z82 = new C7973z82(frame, coroutineContextT);
                CoroutineContext coroutineContext2 = c7973z82.g;
                Object objC = CY1.c(coroutineContext2, null);
                try {
                    Object objR = C3057c.r(c7973z82, c7973z82, function2);
                    CY1.a(coroutineContext2, objC);
                    objO = objR;
                } catch (Throwable th) {
                    CY1.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                C5217m20 c5217m20 = new C5217m20(frame, coroutineContextT);
                C6880ty.b(function2, c5217m20, c5217m20);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5217m20.i;
                    int i = atomicIntegerFieldUpdater.get(c5217m20);
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objO = C3787fU.o(c5217m20.S());
                        if (!(objO instanceof OG)) {
                            break;
                        }
                        throw ((OG) objO).a;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(c5217m20, 0, 1)) {
                        objO = MN.d;
                        break;
                    }
                }
            }
        }
        if (objO == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objO;
    }

    @Override // defpackage.Z10
    public File a(InterfaceC3129cK0 interfaceC3129cK0) {
        return null;
    }

    @Override // defpackage.Z10
    public void b(InterfaceC3129cK0 interfaceC3129cK0, U31 u31) {
    }
}
