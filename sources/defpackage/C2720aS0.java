package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2720aS0 implements OQ1 {
    public static final String d = StringsKt.Z(C2720aS0.class.getCanonicalName(), ".", "");
    public static final a e = new a("NO_LOCKS", C3057c.e);
    public final InterfaceC4185hM1 a;
    public final d.a b;
    public final String c;

    /* JADX INFO: renamed from: aS0$a */
    public static class a extends C2720aS0 {
        @Override // defpackage.C2720aS0
        @NotNull
        public final m h(Object obj, @NotNull String str) {
            return new m(true, null);
        }
    }

    /* JADX INFO: renamed from: aS0$b */
    public static class b<K, V> extends c<K, V> implements InterfaceC5618nx<K, V> {
        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }
    }

    /* JADX INFO: renamed from: aS0$c */
    public static class c<K, V> extends j<e<K, V>, V> {
    }

    /* JADX INFO: renamed from: aS0$d */
    public interface d {
        public static final a a = new a();

        /* JADX INFO: renamed from: aS0$d$a */
        public static class a implements d {
            @NotNull
            public final RuntimeException a(@NotNull Throwable e) throws Throwable {
                Intrinsics.checkNotNullParameter(e, "e");
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: aS0$e */
    public static class e<K, V> {
        public final C1758Ph0 a;
        public final Function0<? extends V> b;

        public e(C1758Ph0 c1758Ph0, Function0 function0) {
            this.a = c1758Ph0;
            this.b = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && e.class == obj.getClass() && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: renamed from: aS0$g */
    public static abstract class g<T> extends f<T> {

        @Nullable
        public volatile FM1<T> h;

        @Override // defpackage.C2720aS0.f
        public final void b(T t) {
            this.h = new FM1<>(t);
            try {
                C3153cS0 c3153cS0 = (C3153cS0) this;
                if (t == null) {
                    C3153cS0.a(2);
                    throw null;
                }
                c3153cS0.i.invoke(t);
                this.h = null;
            } catch (Throwable th) {
                this.h = null;
                throw th;
            }
        }

        @Override // defpackage.C2720aS0.f, kotlin.jvm.functions.Function0
        public T invoke() {
            FM1<T> fm1 = this.h;
            if (fm1 == null || fm1.b != Thread.currentThread()) {
                return (T) super.invoke();
            }
            if (fm1.b == Thread.currentThread()) {
                return fm1.a;
            }
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
    }

    /* JADX INFO: renamed from: aS0$h */
    public static class h<T> extends f<T> implements I51<T> {
        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // defpackage.C2720aS0.f, kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            a(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: aS0$i */
    public static abstract class i<T> extends g<T> implements I51<T> {
        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // defpackage.C2720aS0.g, defpackage.C2720aS0.f, kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            a(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: aS0$j */
    public static class j<K, V> implements VY0<K, V> {
        public final C2720aS0 d;
        public final ConcurrentHashMap e;
        public final Function1<? super K, ? extends V> g;

        public j(@NotNull C2720aS0 c2720aS0, @NotNull ConcurrentHashMap concurrentHashMap, @NotNull Function1 function1) {
            if (c2720aS0 == null) {
                a(0);
                throw null;
            }
            this.d = c2720aS0;
            this.e = concurrentHashMap;
            this.g = function1;
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError b(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + l.e + " is expected, was: " + obj + ", most probably race condition detected on input " + k + " under " + this.d);
            C2720aS0.i(assertionError);
            return assertionError;
        }

        @NotNull
        public final AssertionError d(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.d);
            C2720aS0.i(assertionError);
            return assertionError;
        }

        public final AssertionError e(K k, Throwable th) {
            AssertionError assertionError = new AssertionError("Unable to remove " + k + " under " + this.d, th);
            C2720aS0.i(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k) throws Throwable {
            AssertionError assertionErrorD;
            ConcurrentHashMap concurrentHashMap = this.e;
            V v = (V) concurrentHashMap.get(k);
            l lVar = l.e;
            Object obj = C3433dl2.a;
            V v2 = null;
            if (v != null && v != lVar) {
                C3433dl2.a(v);
                if (v == obj) {
                    return null;
                }
                return v;
            }
            C2720aS0 c2720aS0 = this.d;
            InterfaceC4185hM1 interfaceC4185hM1 = c2720aS0.a;
            InterfaceC4185hM1 interfaceC4185hM2 = c2720aS0.a;
            interfaceC4185hM1.lock();
            try {
                Object obj2 = concurrentHashMap.get(k);
                l lVar2 = l.g;
                if (obj2 == lVar) {
                    m mVarH = c2720aS0.h(k, "");
                    if (mVarH == null) {
                        a(3);
                        throw null;
                    }
                    if (!mVarH.b) {
                        V v3 = (V) mVarH.a;
                        interfaceC4185hM2.unlock();
                        return v3;
                    }
                    obj2 = lVar2;
                }
                if (obj2 == lVar2) {
                    m mVarH2 = c2720aS0.h(k, "");
                    if (mVarH2 == null) {
                        a(3);
                        throw null;
                    }
                    if (!mVarH2.b) {
                        V v4 = (V) mVarH2.a;
                        interfaceC4185hM2.unlock();
                        return v4;
                    }
                }
                if (obj2 != null) {
                    C3433dl2.a(obj2);
                    if (obj2 != obj) {
                        v2 = (V) obj2;
                    }
                    interfaceC4185hM2.unlock();
                    return v2;
                }
                try {
                    concurrentHashMap.put(k, lVar);
                    V vInvoke = this.g.invoke(k);
                    if (vInvoke != null) {
                        obj = vInvoke;
                    }
                    Object objPut = concurrentHashMap.put(k, obj);
                    if (objPut == lVar) {
                        interfaceC4185hM2.unlock();
                        return vInvoke;
                    }
                    assertionErrorD = d(k, objPut);
                    try {
                        throw assertionErrorD;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    assertionErrorD = null;
                }
                if (C7279vr.k(th)) {
                    try {
                        Object objRemove = concurrentHashMap.remove(k);
                        if (objRemove != lVar) {
                            throw b(k, objRemove);
                        }
                        throw th;
                    } catch (Throwable th3) {
                        throw e(k, th3);
                    }
                }
                d.a aVar = c2720aS0.b;
                if (th != assertionErrorD) {
                    Object objPut2 = concurrentHashMap.put(k, new C3433dl2.b(th));
                    if (objPut2 != lVar) {
                        throw d(k, objPut2);
                    }
                    aVar.a(th);
                    throw null;
                }
                try {
                    concurrentHashMap.remove(k);
                    aVar.a(th);
                    throw null;
                } catch (Throwable th4) {
                    throw e(k, th4);
                }
                interfaceC4185hM2.unlock();
                throw th;
            } catch (Throwable th5) {
                interfaceC4185hM2.unlock();
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: aS0$k */
    public static class k<K, V> extends j<K, V> implements UY0<K, V> {
        @Override // defpackage.C2720aS0.j, kotlin.jvm.functions.Function1
        @NotNull
        public final V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v != null) {
                return v;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: aS0$l */
    public static final class l {
        public static final l d;
        public static final l e;
        public static final l g;
        public static final /* synthetic */ l[] h;

        static {
            l lVar = new l("NOT_COMPUTED", 0);
            d = lVar;
            l lVar2 = new l("COMPUTING", 1);
            e = lVar2;
            l lVar3 = new l("RECURSION_WAS_DETECTED", 2);
            g = lVar3;
            h = new l[]{lVar, lVar2, lVar3};
        }

        public l() {
            throw null;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) h.clone();
        }
    }

    /* JADX INFO: renamed from: aS0$m */
    public static class m<T> {
        public final T a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public m(boolean z, Object obj) {
            this.a = obj;
            this.b = z;
        }

        public final String toString() {
            return this.b ? "FALL_THROUGH" : String.valueOf(this.a);
        }
    }

    public C2720aS0() {
        throw null;
    }

    public C2720aS0(String str) {
        this(str, new YV(0));
    }

    @NotNull
    public static void i(@NotNull AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            if (!stackTrace[i2].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i2, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i2++;
        }
        i2 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i2, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    @Override // defpackage.OQ1
    @NotNull
    public final h a(@NotNull Function0 function0) {
        return new h(this, function0);
    }

    @Override // defpackage.OQ1
    @NotNull
    public final f b(@NotNull Function0 function0) {
        return new f(this, function0);
    }

    @Override // defpackage.OQ1
    @NotNull
    public final C3153cS0 c(@NotNull C7522x1 c7522x1, @NotNull C7732y1 c7732y1) {
        return new C3153cS0(this, c7522x1, c7732y1);
    }

    @NotNull
    public final b d() {
        return new b(this, new ConcurrentHashMap(3, 1.0f, 2), new C3363dS0());
    }

    @NotNull
    public final k e(@NotNull Function1 function1) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    @NotNull
    public final j f(@NotNull Function1 function1) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    @NotNull
    public final C2944bS0 g(@NotNull Function0 function0, @NotNull C5653o60 c5653o60) {
        if (c5653o60 != null) {
            return new C2944bS0(this, function0, c5653o60);
        }
        Object[] objArr = new Object[3];
        switch (27) {
            case 8:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 9:
            case 11:
            case 14:
            case 16:
            case 19:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "compute";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 25:
            case 27:
                objArr[0] = "onRecursiveCall";
                break;
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 22:
                objArr[0] = "map";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 26:
            case 28:
            case 30:
            case 31:
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 34:
                objArr[0] = "computable";
                break;
            case 29:
            case 33:
                objArr[0] = "postCompute";
                break;
            case 35:
                objArr[0] = Payload.SOURCE;
                break;
            case 36:
                objArr[0] = "throwable";
                break;
            default:
                objArr[0] = "debugText";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        switch (27) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @NotNull
    public m h(Object obj, @NotNull String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : FK.c(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        i(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return C5807oq.b(sb, this.c, ")");
    }

    public C2720aS0(@NotNull String str, @NotNull InterfaceC4185hM1 interfaceC4185hM1) {
        d.a aVar = d.a;
        this.a = interfaceC4185hM1;
        this.b = aVar;
        this.c = str;
    }

    /* JADX INFO: renamed from: aS0$f */
    public static class f<T> implements InterfaceC5868p71<T> {
        public final C2720aS0 d;
        public final Function0<? extends T> e;

        @Nullable
        public volatile Object g;

        public f(@NotNull C2720aS0 c2720aS0, @NotNull Function0<? extends T> function0) {
            if (c2720aS0 == null) {
                a(0);
                throw null;
            }
            this.g = l.d;
            this.d = c2720aS0;
            this.e = function0;
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @NotNull
        public m<T> d(boolean z) {
            m<T> mVarH = this.d.h(null, "in a lazy value");
            if (mVarH != null) {
                return mVarH;
            }
            a(2);
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0038 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        @Override // kotlin.jvm.functions.Function0
        public T invoke() throws Throwable {
            m<T> mVarD;
            T t = (T) this.g;
            if (!(t instanceof l)) {
                C3433dl2.a(t);
                return t;
            }
            this.d.a.lock();
            try {
                T tInvoke = (T) this.g;
                if (tInvoke instanceof l) {
                    l lVar = l.e;
                    l lVar2 = l.g;
                    if (tInvoke == lVar) {
                        this.g = lVar2;
                        m<T> mVarD2 = d(true);
                        if (!mVarD2.b) {
                            tInvoke = mVarD2.a;
                        } else if (tInvoke == lVar2) {
                            mVarD = d(false);
                            if (mVarD.b) {
                                this.g = lVar;
                                try {
                                    tInvoke = this.e.invoke();
                                    b(tInvoke);
                                    this.g = tInvoke;
                                } catch (Throwable th) {
                                    if (C7279vr.k(th)) {
                                        this.g = l.d;
                                        throw th;
                                    }
                                    if (this.g == lVar) {
                                        this.g = new C3433dl2.b(th);
                                    }
                                    this.d.b.a(th);
                                    throw null;
                                }
                            } else {
                                tInvoke = mVarD.a;
                            }
                        } else {
                            this.g = lVar;
                            tInvoke = this.e.invoke();
                            b(tInvoke);
                            this.g = tInvoke;
                        }
                    } else if (tInvoke == lVar2) {
                        mVarD = d(false);
                        if (mVarD.b) {
                            tInvoke = mVarD.a;
                        } else {
                            this.g = lVar;
                            tInvoke = this.e.invoke();
                            b(tInvoke);
                            this.g = tInvoke;
                        }
                    } else {
                        this.g = lVar;
                        tInvoke = this.e.invoke();
                        b(tInvoke);
                        this.g = tInvoke;
                    }
                } else {
                    C3433dl2.a(tInvoke);
                }
                this.d.a.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                this.d.a.unlock();
                throw th2;
            }
        }

        public void b(T t) {
        }
    }
}
