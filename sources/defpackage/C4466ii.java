package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4466ii implements InterfaceC7527x20, InterfaceC4550iv0, InterfaceC6867tt1 {

    @NotNull
    public static final Object[] d = new Object[0];
    public static final C4466ii e = new C4466ii();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object A(@NotNull InterfaceC3208ci interfaceC3208ci, @NotNull LM lm) {
        C3418di frame;
        if (lm instanceof C3418di) {
            frame = (C3418di) lm;
            int i = frame.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.e = i - Integer.MIN_VALUE;
            } else {
                frame = new C3418di(lm);
            }
        } else {
            frame = new C3418di(lm);
        }
        Object objQ = frame.d;
        MN mn = MN.d;
        int i2 = frame.e;
        if (i2 == 0) {
            C1795Pt1.b(objQ);
            Task<C2999bi> appUpdateInfo = interfaceC3208ci.c();
            Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "appUpdateInfo");
            frame.e = 1;
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            c6251qy.u(new C3837fi(C3627ei.d, 0));
            if (!appUpdateInfo.isComplete()) {
                appUpdateInfo.addOnSuccessListener(new C4047gi(c6251qy));
                appUpdateInfo.addOnFailureListener(new C4257hi(c6251qy));
            } else if (appUpdateInfo.isSuccessful()) {
                C2999bi result = appUpdateInfo.getResult();
                C1717Ot1.a aVar = C1717Ot1.e;
                c6251qy.resumeWith(result);
            } else {
                Exception exception = appUpdateInfo.getException();
                Intrinsics.checkNotNull(exception);
                C1717Ot1.b bVarA = C1795Pt1.a(exception);
                C1717Ot1.a aVar2 = C1717Ot1.e;
                c6251qy.resumeWith(bVarA);
            }
            objQ = c6251qy.q();
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objQ);
        }
        Intrinsics.checkNotNullExpressionValue(objQ, "runTask(appUpdateInfo)");
        return objQ;
    }

    public static final Object B(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set setH0;
        Enum r1;
        if (!z) {
            if (r4 != null && (setH0 = CollectionsKt.h0(C5907pJ1.e(set, r4))) != null) {
                set = setH0;
            }
            return CollectionsKt.V(set);
        }
        if (set.contains(r2)) {
            r1 = r2;
        } else {
            r1 = set.contains(r3) ? r3 : null;
        }
        if (Intrinsics.a(r1, r2) && Intrinsics.a(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    public static final void C(@NotNull Z72 z72, @NotNull String value) {
        List<String> listF0;
        Intrinsics.checkNotNullParameter(z72, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.I(value)) {
            listF0 = C5653o60.d;
        } else {
            listF0 = value.equals("/") ? C3512e82.a : CollectionsKt.f0(StringsKt.R(value, new char[]{'/'}));
        }
        z72.getClass();
        Intrinsics.checkNotNullParameter(listF0, "<set-?>");
        z72.h = listF0;
    }

    @NotNull
    public static final C1621Nn1 D(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull KN kn, @NotNull IK1 ik1) {
        HK1 hk1A = C3830fg0.a(interfaceC6396rf0);
        C6120qK1 c6120qK1G = C1589Ne.g(1, hk1A.b, hk1A.c);
        return new C1621Nn1(c6120qK1G, C5189lv.j(kn, hk1A.d, ik1.equals(IK1.a.a) ? ON.d : ON.h, new C3620eg0(ik1, hk1A.a, c6120qK1G, C1589Ne.g, null)));
    }

    @NotNull
    public static final C1699On1 E(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull KN kn, @NotNull IK1 ik1, Object obj) {
        HK1 hk1A = C3830fg0.a(interfaceC6396rf0);
        GP1 gp1I = C1589Ne.i(obj);
        return new C1699On1(gp1I, C5189lv.j(kn, hk1A.d, ik1.equals(IK1.a.a) ? ON.d : ON.h, new C3620eg0(ik1, hk1A.a, gp1I, obj, null)));
    }

    @NotNull
    public static final Object[] F(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        Object[] objArr = d;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    @NotNull
    public static final Object[] G(@NotNull Collection collection, @Nullable Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void d(Z72 z72, StringBuilder sb) {
        List listC;
        sb.append(z72.a.a);
        String str = z72.a.a;
        if (Intrinsics.a(str, "file")) {
            CharSequence charSequence = z72.b;
            String strU = u(z72);
            sb.append("://");
            sb.append(charSequence);
            if (!StringsKt.T(strU, '/')) {
                sb.append('/');
            }
            sb.append((CharSequence) strU);
            return;
        }
        if (Intrinsics.a(str, "mailto")) {
            Intrinsics.checkNotNullParameter(z72, "<this>");
            StringBuilder sb2 = new StringBuilder();
            String str2 = z72.e;
            String str3 = z72.f;
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            CharSequence charSequence2 = z72.b;
            sb.append(":");
            sb.append(string);
            sb.append(charSequence2);
            return;
        }
        sb.append("://");
        sb.append(s(z72));
        String encodedPath = u(z72);
        C2291Wb1 encodedQueryParameters = z72.i;
        boolean z = z72.d;
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.I(encodedPath) && !d.o(encodedPath, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) encodedPath);
        if (!encodedQueryParameters.a.isEmpty() || z) {
            sb.append("?");
        }
        Set<Map.Entry<String, List<String>>> setA = encodedQueryParameters.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listC = VE.c(new Pair(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it2.next()));
                }
                listC = arrayList2;
            }
            C2904bF.o(arrayList, listC);
        }
        CollectionsKt.I(arrayList, sb, "&", null, null, C3932g82.d, 60);
        if (z72.g.length() > 0) {
            sb.append('#');
            sb.append(z72.g);
        }
    }

    @NotNull
    public static final C1621Nn1 e(@NotNull C6120qK1 c6120qK1) {
        return new C1621Nn1(c6120qK1, null);
    }

    @NotNull
    public static final C1699On1 f(@NotNull GP1 gp1) {
        return new C1699On1(gp1, null);
    }

    public static InterfaceC6396rf0 g(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        EnumC1796Pu enumC1796Pu = EnumC1796Pu.d;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(EK.e(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            enumC1796Pu = EnumC1796Pu.e;
            i = 0;
        }
        return interfaceC6396rf0 instanceof InterfaceC4475ik0 ? ((InterfaceC4475ik0) interfaceC6396rf0).f(e.d, i, enumC1796Pu) : new C2465Xz(i, enumC1796Pu, interfaceC6396rf0, e.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Serializable h(@NotNull LM lm, @NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull InterfaceC6606sf0 interfaceC6606sf0) throws Throwable {
        C1360Kf0 c1360Kf0;
        C3027bp1 c3027bp1;
        Throwable th;
        XF0 xf0;
        CancellationException cancellationExceptionC;
        if (lm instanceof C1360Kf0) {
            c1360Kf0 = (C1360Kf0) lm;
            int i = c1360Kf0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1360Kf0.g = i - Integer.MIN_VALUE;
            } else {
                c1360Kf0 = new C1360Kf0(lm);
            }
        } else {
            c1360Kf0 = new C1360Kf0(lm);
        }
        Object obj = c1360Kf0.e;
        MN mn = MN.d;
        int i2 = c1360Kf0.g;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            try {
                C1438Lf0 c1438Lf0 = new C1438Lf0(interfaceC6606sf0, c3027bp1B);
                c1360Kf0.d = c3027bp1B;
                c1360Kf0.g = 1;
                if (interfaceC6396rf0.c(c1438Lf0, c1360Kf0) == mn) {
                    return mn;
                }
                return null;
            } catch (Throwable th2) {
                c3027bp1 = c3027bp1B;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = c1360Kf0.d;
            try {
                C1795Pt1.b(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) c3027bp1.d;
        if ((th4 != null && th4.equals(th)) || ((xf0 = (XF0) c1360Kf0.getContext().p(XF0.a.d)) != null && xf0.isCancelled() && (cancellationExceptionC = xf0.C()) != null && cancellationExceptionC.equals(th))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            J90.a(th4, th);
            throw th4;
        }
        J90.a(th, th4);
        throw th;
    }

    @Nullable
    public static final Object i(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull AW1 aw1) {
        Object objC = interfaceC6396rf0.c(D51.d, aw1);
        return objC == MN.d ? objC : Unit.a;
    }

    @Nullable
    public static final Object j(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull Function2 function2, @NotNull AW1 aw1) {
        int i = C2220Vf0.a;
        Object objI = i(g(new C2543Yz(new C2142Uf0(function2, null), interfaceC6396rf0, e.d, -2, EnumC1796Pu.d), 0), aw1);
        return objI == MN.d ? objI : Unit.a;
    }

    @NotNull
    public static final C5561ng0 k(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull InterfaceC6396rf0 interfaceC6396rf1, @NotNull InterfaceC6396rf0 interfaceC6396rf2, @NotNull InterfaceC1138Hj0 interfaceC1138Hj0) {
        return new C5561ng0(new InterfaceC6396rf0[]{interfaceC6396rf0, interfaceC6396rf1, interfaceC6396rf2}, interfaceC1138Hj0);
    }

    @NotNull
    public static final C5981pg0 l(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull InterfaceC6396rf0 interfaceC6396rf1, @NotNull InterfaceC6396rf0 interfaceC6396rf2, @NotNull InterfaceC6396rf0 interfaceC6396rf3, @NotNull InterfaceC1216Ij0 interfaceC1216Ij0) {
        return new C5981pg0(new InterfaceC6396rf0[]{interfaceC6396rf0, interfaceC6396rf1, interfaceC6396rf2, interfaceC6396rf3}, interfaceC1216Ij0);
    }

    @NotNull
    public static final InterfaceC6396rf0 m(@NotNull InterfaceC6396rf0 interfaceC6396rf0) {
        C0970Ff0.b bVar = C0970Ff0.a;
        if (interfaceC6396rf0 instanceof FP1) {
            return interfaceC6396rf0;
        }
        C0970Ff0.b bVar2 = C0970Ff0.a;
        C0970Ff0.a aVar = C0970Ff0.b;
        if (interfaceC6396rf0 instanceof F20) {
            F20 f20 = (F20) interfaceC6396rf0;
            if (f20.e == bVar2 && f20.g == aVar) {
                return (F20) interfaceC6396rf0;
            }
        }
        return new F20(interfaceC6396rf0, bVar2, aVar);
    }

    @Nullable
    public static final Object n(@NotNull LM lm, @NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull InterfaceC6606sf0 interfaceC6606sf0) throws Throwable {
        if (interfaceC6606sf0 instanceof TY1) {
            throw ((TY1) interfaceC6606sf0).d;
        }
        Object objC = interfaceC6396rf0.c(interfaceC6606sf0, lm);
        return objC == MN.d ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [GW1, T] */
    @Nullable
    public static final Object o(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull JM jm) {
        C2484Yf0 c2484Yf0;
        C3027bp1 c3027bp1;
        C7306w e2;
        C2302Wf0 c2302Wf0;
        if (jm instanceof C2484Yf0) {
            c2484Yf0 = (C2484Yf0) jm;
            int i = c2484Yf0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2484Yf0.h = i - Integer.MIN_VALUE;
            } else {
                c2484Yf0 = new C2484Yf0(jm);
            }
        } else {
            c2484Yf0 = new C2484Yf0(jm);
        }
        Object obj = c2484Yf0.g;
        Object obj2 = MN.d;
        int i2 = c2484Yf0.h;
        ?? r3 = C5208m0.h;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            c3027bp1B.d = r3;
            C2302Wf0 c2302Wf1 = new C2302Wf0(c3027bp1B);
            try {
                c2484Yf0.d = c3027bp1B;
                c2484Yf0.e = c2302Wf1;
                c2484Yf0.h = 1;
                if (interfaceC6396rf0.c(c2302Wf1, c2484Yf0) == obj2) {
                    return obj2;
                }
                c3027bp1 = c3027bp1B;
            } catch (C7306w e3) {
                c3027bp1 = c3027bp1B;
                e2 = e3;
                c2302Wf0 = c2302Wf1;
                if (e2.d != c2302Wf0) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2302Wf0 = c2484Yf0.e;
            c3027bp1 = c2484Yf0.d;
            try {
                C1795Pt1.b(obj);
            } catch (C7306w e4) {
                e2 = e4;
                if (e2.d != c2302Wf0) {
                    throw e2;
                }
            }
        }
        Object obj3 = c3027bp1.d;
        if (obj3 != r3) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [GW1, T] */
    @Nullable
    public static final Object p(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull Function2 function2, @NotNull JM jm) {
        C2562Zf0 c2562Zf0;
        Function2 function3;
        C3027bp1 c3027bp1;
        C7306w e2;
        C2406Xf0 c2406Xf0;
        if (jm instanceof C2562Zf0) {
            c2562Zf0 = (C2562Zf0) jm;
            int i = c2562Zf0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2562Zf0.i = i - Integer.MIN_VALUE;
            } else {
                c2562Zf0 = new C2562Zf0(jm);
            }
        } else {
            c2562Zf0 = new C2562Zf0(jm);
        }
        Object obj = c2562Zf0.h;
        Object obj2 = MN.d;
        int i2 = c2562Zf0.i;
        ?? r3 = C5208m0.h;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            c3027bp1B.d = r3;
            C2406Xf0 c2406Xf1 = new C2406Xf0(function2, c3027bp1B);
            try {
                c2562Zf0.d = function2;
                c2562Zf0.e = c3027bp1B;
                c2562Zf0.g = c2406Xf1;
                c2562Zf0.i = 1;
                if (interfaceC6396rf0.c(c2406Xf1, c2562Zf0) == obj2) {
                    return obj2;
                }
                function3 = function2;
                c3027bp1 = c3027bp1B;
            } catch (C7306w e3) {
                function3 = function2;
                c3027bp1 = c3027bp1B;
                e2 = e3;
                c2406Xf0 = c2406Xf1;
                if (e2.d != c2406Xf0) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2406Xf0 = c2562Zf0.g;
            c3027bp1 = c2562Zf0.e;
            function3 = c2562Zf0.d;
            try {
                C1795Pt1.b(obj);
            } catch (C7306w e4) {
                e2 = e4;
                if (e2.d != c2406Xf0) {
                    throw e2;
                }
            }
        }
        Object obj3 = c3027bp1.d;
        if (obj3 != r3) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + function3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object q(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull LM lm) {
        C3201cg0 c3201cg0;
        C3027bp1 c3027bp1;
        C7306w e2;
        C2768ag0 c2768ag0;
        if (lm instanceof C3201cg0) {
            c3201cg0 = (C3201cg0) lm;
            int i = c3201cg0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3201cg0.h = i - Integer.MIN_VALUE;
            } else {
                c3201cg0 = new C3201cg0(lm);
            }
        } else {
            c3201cg0 = new C3201cg0(lm);
        }
        Object obj = c3201cg0.g;
        Object obj2 = MN.d;
        int i2 = c3201cg0.h;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            C2768ag0 c2768ag1 = new C2768ag0(c3027bp1B);
            try {
                c3201cg0.d = c3027bp1B;
                c3201cg0.e = c2768ag1;
                c3201cg0.h = 1;
                if (interfaceC6396rf0.c(c2768ag1, c3201cg0) == obj2) {
                    return obj2;
                }
                c3027bp1 = c3027bp1B;
            } catch (C7306w e3) {
                c3027bp1 = c3027bp1B;
                e2 = e3;
                c2768ag0 = c2768ag1;
                if (e2.d != c2768ag0) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2768ag0 = c3201cg0.e;
            c3027bp1 = c3201cg0.d;
            try {
                C1795Pt1.b(obj);
            } catch (C7306w e4) {
                e2 = e4;
                if (e2.d != c2768ag0) {
                    throw e2;
                }
            }
        }
        return c3027bp1.d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object r(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull Function2 function2, @NotNull LM lm) {
        C3411dg0 c3411dg0;
        C3027bp1 c3027bp1;
        C7306w e2;
        C2992bg0 c2992bg0;
        if (lm instanceof C3411dg0) {
            c3411dg0 = (C3411dg0) lm;
            int i = c3411dg0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3411dg0.h = i - Integer.MIN_VALUE;
            } else {
                c3411dg0 = new C3411dg0(lm);
            }
        } else {
            c3411dg0 = new C3411dg0(lm);
        }
        Object obj = c3411dg0.g;
        Object obj2 = MN.d;
        int i2 = c3411dg0.h;
        if (i2 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            C2992bg0 c2992bg1 = new C2992bg0(function2, c3027bp1B);
            try {
                c3411dg0.d = c3027bp1B;
                c3411dg0.e = c2992bg1;
                c3411dg0.h = 1;
                if (interfaceC6396rf0.c(c2992bg1, c3411dg0) == obj2) {
                    return obj2;
                }
                c3027bp1 = c3027bp1B;
            } catch (C7306w e3) {
                c3027bp1 = c3027bp1B;
                e2 = e3;
                c2992bg0 = c2992bg1;
                if (e2.d != c2992bg0) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2992bg0 = c3411dg0.e;
            c3027bp1 = c3411dg0.d;
            try {
                C1795Pt1.b(obj);
            } catch (C7306w e4) {
                e2 = e4;
                if (e2.d != c2992bg0) {
                    throw e2;
                }
            }
        }
        return c3027bp1.d;
    }

    @NotNull
    public static final String s(@NotNull Z72 z72) {
        Intrinsics.checkNotNullParameter(z72, "<this>");
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullParameter(z72, "<this>");
        StringBuilder sb2 = new StringBuilder();
        String str = z72.e;
        String str2 = z72.f;
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        sb.append(string);
        sb.append(z72.b);
        int i = z72.c;
        if (i != 0 && i != z72.a.b) {
            sb.append(":");
            sb.append(String.valueOf(z72.c));
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @NotNull
    public static final String t(@NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (Intrinsics.a(currencyCode, "DEMO")) {
            return "Đ";
        }
        try {
            return Currency.getInstance(currencyCode).getSymbol();
        } catch (IllegalArgumentException unused) {
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    @NotNull
    public static final String u(@NotNull Z72 z72) {
        Intrinsics.checkNotNullParameter(z72, "<this>");
        List<String> list = z72.h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) CollectionsKt.F(list)).length() == 0 ? "/" : (String) CollectionsKt.F(list);
        }
        return CollectionsKt.J(list, "/", null, null, null, 62);
    }

    @NotNull
    public static final C2936bP1 v(@NotNull KN kn, @NotNull InterfaceC6396rf0 interfaceC6396rf0) {
        return C5189lv.k(kn, null, new C0814Df0(interfaceC6396rf0, null), 3);
    }

    public static final void w(@Nullable String str) {
        if (str.length() == 0) {
            return;
        }
        for (String str2 : KS1.x(4000, str)) {
        }
    }

    @NotNull
    public static final C3098cA x(@NotNull InterfaceC6396rf0... interfaceC6396rf0Arr) {
        int i = C2220Vf0.a;
        return new C3098cA(C1526Mj.h(interfaceC6396rf0Arr), e.d, -2, EnumC1796Pu.d);
    }

    public static JsonElement y(C7790yH0 c7790yH0) {
        boolean z = c7790yH0.e;
        c7790yH0.e = true;
        try {
            try {
                try {
                    JsonElement jsonElementL = C3057c.l(c7790yH0);
                    c7790yH0.e = z;
                    return jsonElementL;
                } catch (StackOverflowError e2) {
                    throw new C6529sH0("Failed parsing JSON source: " + c7790yH0 + " to Json", e2);
                }
            } catch (OutOfMemoryError e3) {
                throw new C6529sH0("Failed parsing JSON source: " + c7790yH0 + " to Json", e3);
            }
        } catch (Throwable th) {
            c7790yH0.e = z;
            throw th;
        }
    }

    public static JsonElement z(String str) {
        try {
            C7790yH0 c7790yH0 = new C7790yH0(new StringReader(str));
            JsonElement jsonElementY = y(c7790yH0);
            jsonElementY.getClass();
            if (!(jsonElementY instanceof JsonNull) && c7790yH0.G() != JH0.n) {
                throw new HH0("Did not consume the entire document.");
            }
            return jsonElementY;
        } catch (C3584eW0 e2) {
            throw new HH0(e2);
        } catch (IOException e3) {
            throw new C2911bH0(e3);
        } catch (NumberFormatException e4) {
            throw new HH0(e4);
        }
    }

    @Override // defpackage.InterfaceC6867tt1
    public InterfaceC3667et1 a(@NonNull InterfaceC3667et1 interfaceC3667et1, @NonNull C4227ha1 c4227ha1) {
        Picture pictureC;
        XB1.c0 c0Var;
        XB1.C2378o c2378o;
        XB1 xb1 = (XB1) interfaceC3667et1.get();
        XB1.E e2 = xb1.a;
        XB1.C2364a c2364a = e2.o;
        XB1.C2378o c2378o2 = e2.r;
        if (c2378o2 != null && c2378o2.e != (c0Var = XB1.c0.g) && (c2378o = e2.s) != null && c2378o.e != c0Var) {
            pictureC = xb1.c((int) Math.ceil(c2378o2.a(96.0f)), (int) Math.ceil(xb1.a.s.a(96.0f)));
        } else if (c2378o2 == null || c2364a == null) {
            XB1.C2378o c2378o3 = e2.s;
            if (c2378o3 == null || c2364a == null) {
                pictureC = xb1.c(UserVerificationMethods.USER_VERIFY_NONE, UserVerificationMethods.USER_VERIFY_NONE);
            } else {
                float fA = c2378o3.a(96.0f);
                pictureC = xb1.c((int) Math.ceil((c2364a.c * fA) / c2364a.d), (int) Math.ceil(fA));
            }
        } else {
            float fA2 = c2378o2.a(96.0f);
            pictureC = xb1.c((int) Math.ceil(fA2), (int) Math.ceil((c2364a.d * fA2) / c2364a.c));
        }
        return new C5073lM1(new PictureDrawable(pictureC));
    }

    @Override // defpackage.InterfaceC4550iv0
    @Nullable
    public C1136Hi1 c(@NotNull C7581xH1 c7581xH1, @Nullable List list, @NotNull C2688aH1 c2688aH1) {
        return null;
    }

    @Override // defpackage.InterfaceC4550iv0
    public boolean isRunning() {
        return false;
    }

    @Override // defpackage.InterfaceC4550iv0
    public void close() {
    }

    @Override // defpackage.InterfaceC4550iv0
    public void start() {
    }

    @Override // defpackage.InterfaceC4550iv0
    public void b(@NotNull InterfaceC4302hv0 interfaceC4302hv0) {
    }
}
