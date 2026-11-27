package defpackage;

import android.content.Context;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class LE implements C2943bS.b {
    public static InterfaceC6246qw0 d;

    @NotNull
    public static final LE e = new LE();
    public static final LE g = new LE();

    @NotNull
    public static final LE h = new LE();

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object c(List list, InterfaceC6089qA0 interfaceC6089qA0, LM lm) throws Throwable {
        C7612xS c7612xS;
        List list2;
        C3027bp1 c3027bp1;
        Iterator it;
        Throwable th;
        Function1 function1;
        if (lm instanceof C7612xS) {
            c7612xS = (C7612xS) lm;
            int i = c7612xS.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7612xS.h = i - Integer.MIN_VALUE;
            } else {
                c7612xS = new C7612xS(lm);
            }
        } else {
            c7612xS = new C7612xS(lm);
        }
        Object obj = c7612xS.g;
        Object obj2 = MN.d;
        int i2 = c7612xS.h;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = (List) c7612xS.d;
                C1795Pt1.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c7612xS.e;
                c3027bp1 = (C3027bp1) c7612xS.d;
                try {
                    C1795Pt1.b(obj);
                } catch (Throwable th2) {
                    Object obj3 = c3027bp1.d;
                    if (obj3 == null) {
                        c3027bp1.d = th2;
                    } else {
                        Intrinsics.checkNotNull(obj3);
                        J90.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                c7612xS.d = c3027bp1;
                c7612xS.e = it;
                c7612xS.h = 2;
                if (function1.invoke(c7612xS) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) c3027bp1.d;
            if (th == null) {
                return Unit.a;
            }
            throw th;
        }
        C1795Pt1.b(obj);
        ArrayList arrayList = new ArrayList();
        C7822yS c7822yS = new C7822yS(list, arrayList, null);
        c7612xS.d = arrayList;
        c7612xS.h = 1;
        if (interfaceC6089qA0.a(c7822yS, c7612xS) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        c3027bp1 = new C3027bp1();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            c7612xS.d = c3027bp1;
            c7612xS.e = it;
            c7612xS.h = 2;
            if (function1.invoke(c7612xS) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) c3027bp1.d;
        if (th == null) {
            return Unit.a;
        }
        throw th;
    }

    public static final N62 d(N62 typeProjection, H62 h62) {
        if (h62 == null || typeProjection.b() == EnumC3610ed2.INVARIANT) {
            return typeProjection;
        }
        if (h62.S() != typeProjection.b()) {
            Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
            C2618Zy c2618Zy = new C2618Zy(typeProjection);
            C5655o62.e.getClass();
            return new P62(new C2198Uy(typeProjection, c2618Zy, false, C5655o62.g));
        }
        if (!typeProjection.c()) {
            return new P62(typeProjection.getType());
        }
        C2720aS0.a NO_LOCKS = C2720aS0.e;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new P62(new C4661jP0(NO_LOCKS, new S(typeProjection, 1)));
    }

    @Nullable
    public static final Object e(@NotNull WebView webView, @NotNull String str, @NotNull LM frame) {
        C3525eC1 c3525eC1 = new C3525eC1(C5885pC0.b(frame));
        webView.evaluateJavascript(str, new C3002bi2(c3525eC1));
        Object objA = c3525eC1.a();
        if (objA == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    @Nullable
    public static final Object f(@NotNull WebView webView, @NotNull String str, @NotNull Object[] objArr, @NotNull LM lm) {
        return e(webView, C1526Mj.x(objArr, null, str.concat("("), ");", null, 57), lm);
    }

    @Nullable
    public static final Object g(@NotNull Function2 function2, @NotNull JM frame) {
        C6816tf0 c6816tf0 = new C6816tf0(frame, frame.getContext());
        Object objR = C3057c.r(c6816tf0, c6816tf0, function2);
        if (objR == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    public static String h(String str, String str2) {
        return BX.c("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    @NotNull
    public static final InterfaceC6246qw0 i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC6246qw0 interfaceC6246qw0 = d;
        if (interfaceC6246qw0 != null) {
            return interfaceC6246qw0;
        }
        synchronized (e) {
            try {
                InterfaceC6246qw0 interfaceC6246qw1 = d;
                if (interfaceC6246qw1 != null) {
                    return interfaceC6246qw1;
                }
                Object applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof InterfaceC6455rw0)) {
                    applicationContext = null;
                }
                InterfaceC6455rw0 interfaceC6455rw0 = (InterfaceC6455rw0) applicationContext;
                InterfaceC6246qw0 interfaceC6246qw0A = interfaceC6455rw0 != null ? interfaceC6455rw0.a() : null;
                if (interfaceC6246qw0A == null) {
                    interfaceC6246qw0A = InterfaceC6246qw0.b.a(context);
                }
                d = interfaceC6246qw0A;
                return interfaceC6246qw0A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void k(@NotNull WebView webView, @NotNull String script) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(script, "script");
        webView.loadUrl("javascript: " + script);
    }

    @NotNull
    public static final Pair l(String str) {
        return new Pair("phase", str);
    }

    public static T62 m(T62 t62) {
        Intrinsics.checkNotNullParameter(t62, "<this>");
        if (!(t62 instanceof C1258Ix0)) {
            return new C2845az(t62);
        }
        C1258Ix0 c1258Ix0 = (C1258Ix0) t62;
        H62[] h62Arr = c1258Ix0.b;
        ArrayList<Pair> arrayListI = C1526Mj.I(c1258Ix0.c, h62Arr);
        ArrayList arrayList = new ArrayList(XE.m(arrayListI, 10));
        for (Pair pair : arrayListI) {
            arrayList.add(d((N62) pair.d, (H62) pair.e));
        }
        return new C1258Ix0(h62Arr, (N62[]) arrayList.toArray(new N62[0]), true);
    }

    public void j(int i) {
        synchronized (this) {
        }
    }

    @Override // defpackage.C2943bS.b
    public Iterable r(Object obj) {
        int i = TO0.p;
        Collection<AbstractC4649jL0> collectionA = ((FC) obj).p().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        C7439wd0 c7439wd0N = JH1.n(CollectionsKt.y(collectionA), C7928yx.h);
        Intrinsics.checkNotNullParameter(c7439wd0N, "<this>");
        return new HH1(c7439wd0N);
    }
}
