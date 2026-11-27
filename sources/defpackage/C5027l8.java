package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import io.sentry.android.core.b0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5027l8 implements S31, InterfaceC5398mt1, J71 {

    @NotNull
    public static final C5027l8 d = new C5027l8();

    @NotNull
    public static final C5027l8 e = new C5027l8();

    public C5027l8() {
    }

    public static final void b(Throwable th) throws Throwable {
        Throwable thB;
        try {
            thB = I90.b(th, th);
        } catch (Throwable unused) {
            thB = null;
        }
        if (thB != null) {
            throw thB;
        }
    }

    public static void c(@NotNull WebView webView, @NotNull ViewGroup holder) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (webView.getParent() != null) {
            ViewParent parent = webView.getParent();
            Intrinsics.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup holder2 = (ViewGroup) parent;
            Intrinsics.checkNotNullParameter(holder2, "holder");
            holder2.removeAllViews();
        }
        holder.addView(webView, -1, -1);
    }

    public static void g(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    @NotNull
    public static final LinkedHashSet h(@NotNull byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i = objectInputStream.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            Uri uri = Uri.parse(objectInputStream.readUTF());
                            boolean z = objectInputStream.readBoolean();
                            Intrinsics.checkNotNullExpressionValue(uri, "uri");
                            linkedHashSet.add(new VK.a(uri, z));
                        }
                        Unit unit = Unit.a;
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C6621sj.b(objectInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        C6621sj.b(byteArrayInputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            Unit unit2 = Unit.a;
            byteArrayInputStream.close();
        }
        return linkedHashSet;
    }

    public static final void i(@NotNull InterfaceC2548Za1 interfaceC2548Za1, @NotNull C1758Ph0 fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(interfaceC2548Za1, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (interfaceC2548Za1 instanceof InterfaceC2973bb1) {
            ((InterfaceC2973bb1) interfaceC2548Za1).c(fqName, packageFragments);
        } else {
            packageFragments.addAll(interfaceC2548Za1.a(fqName));
        }
    }

    public static C6821tg1 j(C1867Qr1 c1867Qr1, List migrations, Function0 produceFile, int i) {
        C1867Qr1 c1867Qr2 = c1867Qr1;
        if ((i & 1) != 0) {
            c1867Qr2 = null;
        }
        if ((i & 2) != 0) {
            migrations = C5653o60.d;
        }
        ExecutorC7200vV executorC7200vV = C6266r20.c;
        C4002gV1 c4002gV1A = C0564Aa.a();
        executorC7200vV.getClass();
        EM scope = LN.a(CoroutineContext.Element.a.c(executorC7200vV, c4002gV1A));
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        C3608ed0 storage = new C3608ed0(new B3(produceFile, 1));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        WN c6621sj = c1867Qr2;
        if (c1867Qr2 == null) {
            c6621sj = new C6621sj();
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new C6821tg1(new C6821tg1(new IS(storage, VE.c(new C7402wS(migrations, null)), c6621sj, scope)));
    }

    public static final RJ0 k(Collection collection, G1 g1) {
        Collection collection2 = collection;
        ArrayList arrayListD = CollectionsKt.D(collection2);
        ArrayList arrayList = new ArrayList(XE.m(arrayListD, 10));
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            arrayList.add(m(it.next(), g1));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((RJ0) obj).c().a())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(XE.m(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((RJ0) it2.next()).c().a());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        RJ0 rj0 = (RJ0) CollectionsKt.W(arrayList2);
        if (rj0 == null) {
            C1173Hv.d(C4881kS1.a);
            rj0 = C6144qS1.a;
        }
        if (!rj0.c().c() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    return C1173Hv.c(rj0);
                }
            }
        }
        return rj0;
    }

    @NotNull
    public static final b l(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        char cCharAt = locale.getDisplayName().charAt(0);
        b.a aVar = b.e;
        byte directionality = Character.getDirectionality(cCharAt);
        aVar.getClass();
        b bVar = (b) ((Map) b.g.getValue()).get(Integer.valueOf(directionality));
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(C1332Jw.a(directionality, "Directionality #", " is not defined."));
    }

    @NotNull
    public static final RJ0 m(@Nullable Object obj, @NotNull G1 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        if (obj == null) {
            C1173Hv.d(C4881kS1.a);
            return C1173Hv.c(C6144qS1.a);
        }
        if (obj instanceof List) {
            return C1173Hv.a(k((Collection) obj, module));
        }
        if (obj instanceof Object[]) {
            Object objR = C1526Mj.r((Object[]) obj);
            if (objR != null) {
                return m(objR, module);
            }
            C1173Hv.d(C4881kS1.a);
            return C1173Hv.a(C6144qS1.a);
        }
        if (obj instanceof Set) {
            RJ0 elementSerializer = k((Collection) obj, module);
            Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
            return new C7186vQ0(elementSerializer);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return C1173Hv.b(k(map.keySet(), module), k(map.values(), module));
        }
        Class<?> cls = obj.getClass();
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        RJ0 rj0F = module.f(c2251Vp1.b(cls), C5653o60.d);
        if (rj0F != null) {
            return rj0F;
        }
        RI0 ri0B = c2251Vp1.b(obj.getClass());
        Intrinsics.checkNotNullParameter(ri0B, "<this>");
        RJ0 rj0T = C1589Ne.t(ri0B);
        if (rj0T != null) {
            return rj0T;
        }
        LL.k(ri0B);
        throw null;
    }

    public static final int n(@NotNull MH1 mh1, @NotNull MH1[] typeParams) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (mh1.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        int iE = mh1.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strA = mh1.i(mh1.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = mh1.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            VH1 vh1H = mh1.i(mh1.e() - iE2).h();
            iHashCode3 = i5 + (vh1H != null ? vh1H.hashCode() : 0);
            iE2 = i4;
        }
    }

    @NotNull
    public static final EnumC1544Mp o(int i) {
        if (i == 0) {
            return EnumC1544Mp.d;
        }
        if (i == 1) {
            return EnumC1544Mp.e;
        }
        throw new IllegalArgumentException(C1332Jw.a(i, "Could not convert ", " to BackoffPolicy"));
    }

    @NotNull
    public static final EnumC4593j41 p(int i) {
        if (i == 0) {
            return EnumC4593j41.d;
        }
        if (i == 1) {
            return EnumC4593j41.e;
        }
        if (i == 2) {
            return EnumC4593j41.g;
        }
        if (i == 3) {
            return EnumC4593j41.h;
        }
        if (i == 4) {
            return EnumC4593j41.i;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Could not convert ", " to NetworkType"));
        }
        return EnumC4593j41.j;
    }

    @NotNull
    public static final EnumC7428wa1 q(int i) {
        if (i == 0) {
            return EnumC7428wa1.d;
        }
        if (i == 1) {
            return EnumC7428wa1.e;
        }
        throw new IllegalArgumentException(C1332Jw.a(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    @NotNull
    public static final EnumC3638ek2 r(int i) {
        if (i == 0) {
            return EnumC3638ek2.d;
        }
        if (i == 1) {
            return EnumC3638ek2.e;
        }
        if (i == 2) {
            return EnumC3638ek2.g;
        }
        if (i == 3) {
            return EnumC3638ek2.h;
        }
        if (i == 4) {
            return EnumC3638ek2.i;
        }
        if (i == 5) {
            return EnumC3638ek2.j;
        }
        throw new IllegalArgumentException(C1332Jw.a(i, "Could not convert ", " to State"));
    }

    public static final boolean s(@NotNull InterfaceC2548Za1 interfaceC2548Za1, @NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(interfaceC2548Za1, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return interfaceC2548Za1 instanceof InterfaceC2973bb1 ? ((InterfaceC2973bb1) interfaceC2548Za1).b(fqName) : v(interfaceC2548Za1, fqName).isEmpty();
    }

    @NotNull
    public static final C7793yI0 t(@NotNull Nm2 nm2) {
        Intrinsics.checkNotNullParameter(nm2, "<this>");
        nm2.getClass();
        return C7793yI0.g;
    }

    public static final void u(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            AS0 as0C = AS0.c();
            String str = Xj2.a;
            as0C.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(C3188cd.a.a(context), "androidx.work.workdb");
            String[] strArr = Xj2.b;
            int iA = OW0.a(strArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
            }
            for (Map.Entry entry : PW0.h(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        AS0.c().e(Xj2.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    AS0 as0C2 = AS0.c();
                    String str3 = Xj2.a;
                    as0C2.getClass();
                }
            }
        }
    }

    @NotNull
    public static final ArrayList v(@NotNull InterfaceC2548Za1 interfaceC2548Za1, @NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(interfaceC2548Za1, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        i(interfaceC2548Za1, fqName, arrayList);
        return arrayList;
    }

    @NotNull
    public static final RJ0 w(@NotNull G1 g1, @NotNull A62 typeInfo) {
        Intrinsics.checkNotNullParameter(g1, "<this>");
        Intrinsics.checkNotNullParameter(typeInfo, "typeInfo");
        SJ0 sj0 = typeInfo.c;
        if (sj0 != null) {
            RJ0 rj0S = sj0.f().isEmpty() ? null : C1589Ne.s(g1, sj0);
            if (rj0S != null) {
                return rj0S;
            }
        }
        C5653o60 c5653o60 = C5653o60.d;
        RI0<?> ri0 = typeInfo.a;
        RJ0 rj0F = g1.f(ri0, c5653o60);
        SJ0 sj1 = typeInfo.c;
        if (rj0F != null) {
            return (sj1 == null || !sj1.a()) ? rj0F : C1173Hv.c(rj0F);
        }
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        RJ0 rj0T = C1589Ne.t(ri0);
        if (rj0T != null) {
            return (sj1 == null || !sj1.a()) ? rj0T : C1173Hv.c(rj0T);
        }
        LL.k(ri0);
        throw null;
    }

    public static final int x(@NotNull EnumC3638ek2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new C6489s51();
                    }
                }
            }
        }
        return i;
    }

    @Nullable
    public static final String y(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) C1526Mj.r(stackTrace);
        if (stackTraceElement == null) {
            return null;
        }
        return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }

    @NotNull
    public static final void z(@NotNull CommonResult commonResult, @NotNull C7698xq0 recorder) {
        Intrinsics.checkNotNullParameter(commonResult, "<this>");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        if (commonResult instanceof ResultError) {
            CommonError error = ((ResultError) commonResult).getError();
            ConcurrentHashMap<String, Object> concurrentHashMap = recorder.d;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            error.setHttp(new TreeMap(concurrentHashMap));
        }
    }

    @Override // defpackage.S31
    public boolean a() {
        return true;
    }

    @Override // defpackage.InterfaceC5398mt1
    @NonNull
    public A60 d(@NonNull C4227ha1 c4227ha1) {
        return A60.d;
    }

    @Override // defpackage.J71
    public Object e() {
        return new ArrayDeque();
    }

    @Override // defpackage.E60
    public boolean f(@NonNull Object obj, @NonNull File file, @NonNull C4227ha1 c4227ha1) {
        try {
            C6035pw.d(((C0988Fl0) ((InterfaceC3667et1) obj).get()).d.a.a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            b0.f("GifEncoder", "Failed to encode GIF drawable data", e2);
            return false;
        }
    }

    public C5027l8(@NotNull C2720aS0 storageManager, @NotNull C5653o60 samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // defpackage.S31
    public void shutdown() {
    }
}
